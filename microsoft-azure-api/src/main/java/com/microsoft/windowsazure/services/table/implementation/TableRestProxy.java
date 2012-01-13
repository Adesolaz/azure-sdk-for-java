/**
 * Copyright 2011 Microsoft Corporation
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.microsoft.windowsazure.services.table.implementation;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.mail.internet.MimeMultipart;

import com.microsoft.windowsazure.services.blob.implementation.ISO8601DateConverter;
import com.microsoft.windowsazure.services.blob.implementation.RFC1123DateConverter;
import com.microsoft.windowsazure.services.core.ServiceException;
import com.microsoft.windowsazure.services.core.ServiceFilter;
import com.microsoft.windowsazure.services.core.utils.CommaStringBuilder;
import com.microsoft.windowsazure.services.core.utils.DateFactory;
import com.microsoft.windowsazure.services.core.utils.pipeline.ClientFilterAdapter;
import com.microsoft.windowsazure.services.core.utils.pipeline.HttpURLConnectionClient;
import com.microsoft.windowsazure.services.core.utils.pipeline.PipelineHelpers;
import com.microsoft.windowsazure.services.table.TableConfiguration;
import com.microsoft.windowsazure.services.table.TableContract;
import com.microsoft.windowsazure.services.table.models.BatchOperations;
import com.microsoft.windowsazure.services.table.models.BatchOperations.InsertOperation;
import com.microsoft.windowsazure.services.table.models.BatchOperations.Operation;
import com.microsoft.windowsazure.services.table.models.BatchResult;
import com.microsoft.windowsazure.services.table.models.BinaryFilter;
import com.microsoft.windowsazure.services.table.models.ConstantFilter;
import com.microsoft.windowsazure.services.table.models.DeleteEntityOptions;
import com.microsoft.windowsazure.services.table.models.Entity;
import com.microsoft.windowsazure.services.table.models.Filter;
import com.microsoft.windowsazure.services.table.models.GetEntityResult;
import com.microsoft.windowsazure.services.table.models.GetServicePropertiesResult;
import com.microsoft.windowsazure.services.table.models.GetTableResult;
import com.microsoft.windowsazure.services.table.models.InsertEntityResult;
import com.microsoft.windowsazure.services.table.models.ListTablesOptions;
import com.microsoft.windowsazure.services.table.models.LitteralFilter;
import com.microsoft.windowsazure.services.table.models.Query;
import com.microsoft.windowsazure.services.table.models.QueryEntitiesOptions;
import com.microsoft.windowsazure.services.table.models.QueryEntitiesResult;
import com.microsoft.windowsazure.services.table.models.QueryTablesOptions;
import com.microsoft.windowsazure.services.table.models.QueryTablesResult;
import com.microsoft.windowsazure.services.table.models.RawStringFilter;
import com.microsoft.windowsazure.services.table.models.ServiceProperties;
import com.microsoft.windowsazure.services.table.models.TableServiceOptions;
import com.microsoft.windowsazure.services.table.models.UnaryFilter;
import com.microsoft.windowsazure.services.table.models.UpdateEntityResult;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.WebResource.Builder;

public class TableRestProxy implements TableContract {
    private static final String API_VERSION = "2011-08-18";
    private final HttpURLConnectionClient channel;
    private final String url;
    private final RFC1123DateConverter dateMapper;
    private final ISO8601DateConverter iso8601DateConverter;
    private final DateFactory dateFactory;
    private final ServiceFilter[] filters;
    private final SharedKeyFilter filter;
    private final AtomReaderWriter atomReaderWriter;
    private final MimeReaderWriter mimeReaderWriter;

    @Inject
    public TableRestProxy(HttpURLConnectionClient channel, @Named(TableConfiguration.URI) String url,
            SharedKeyFilter filter, DateFactory dateFactory, ISO8601DateConverter iso8601DateConverter,
            AtomReaderWriter atomReaderWriter, MimeReaderWriter mimeReaderWriter) {

        this.channel = channel;
        this.url = url;
        this.filter = filter;
        this.dateMapper = new RFC1123DateConverter();
        this.iso8601DateConverter = iso8601DateConverter;
        this.filters = new ServiceFilter[0];
        this.dateFactory = dateFactory;
        this.atomReaderWriter = atomReaderWriter;
        this.mimeReaderWriter = mimeReaderWriter;
        channel.addFilter(filter);
    }

    public TableRestProxy(HttpURLConnectionClient channel, ServiceFilter[] filters, String url, SharedKeyFilter filter,
            DateFactory dateFactory, AtomReaderWriter atomReaderWriter, MimeReaderWriter mimeReaderWriter,
            RFC1123DateConverter dateMapper, ISO8601DateConverter iso8601DateConverter) {

        this.channel = channel;
        this.filters = filters;
        this.url = url;
        this.filter = filter;
        this.dateFactory = dateFactory;
        this.atomReaderWriter = atomReaderWriter;
        this.mimeReaderWriter = mimeReaderWriter;
        this.dateMapper = dateMapper;
        this.iso8601DateConverter = iso8601DateConverter;
    }

    @Override
    public TableContract withFilter(ServiceFilter filter) {
        ServiceFilter[] newFilters = Arrays.copyOf(filters, filters.length + 1);
        newFilters[filters.length] = filter;
        return new TableRestProxy(this.channel, newFilters, this.url, this.filter, this.dateFactory,
                this.atomReaderWriter, this.mimeReaderWriter, this.dateMapper, this.iso8601DateConverter);
    }

    private void ThrowIfError(ClientResponse r) {
        PipelineHelpers.ThrowIfError(r);
    }

    private String encodeODataURIValue(String value) {
        //TODO: Unclear if OData value in URI's need to be encoded or not
        return value;
    }

    private List<String> encodeODataURIValues(List<String> values) {
        List<String> list = new ArrayList<String>();
        for (String value : values) {
            list.add(encodeODataURIValue(value));
        }
        return list;
    }

    private String getEntityPath(String table, String partitionKey, String rowKey) {
        return table + "(" + "PartitionKey='" + partitionKey + "',RowKey='" + rowKey + "')";
    }

    private WebResource addOptionalQueryParam(WebResource webResource, String key, Object value) {
        return PipelineHelpers.addOptionalQueryParam(webResource, key, value);
    }

    private WebResource addOptionalQuery(WebResource webResource, Query query) {
        if (query == null)
            return webResource;

        if (query.getSelectFields() != null && query.getSelectFields().size() > 0) {
            webResource = addOptionalQueryParam(webResource, "$select",
                    CommaStringBuilder.join(encodeODataURIValues(query.getSelectFields())));
        }

        if (query.getTop() != null) {
            webResource = addOptionalQueryParam(webResource, "$top", encodeODataURIValue(query.getTop().toString()));
        }

        if (query.getFilter() != null) {
            webResource = addOptionalQueryParam(webResource, "$filter", buildFilterExpression(query.getFilter()));
        }

        if (query.getOrderByFields() != null) {
            webResource = addOptionalQueryParam(webResource, "$orderby",
                    CommaStringBuilder.join(encodeODataURIValues(query.getOrderByFields())));
        }

        return webResource;
    }

    private String buildFilterExpression(Filter filter) {
        StringBuilder sb = new StringBuilder();
        buildFilterExpression(filter, sb);
        return sb.toString();
    }

    private void buildFilterExpression(Filter filter, StringBuilder sb) {
        if (filter == null)
            return;

        if (filter instanceof LitteralFilter) {
            sb.append(((LitteralFilter) filter).getLitteral());
        }
        else if (filter instanceof ConstantFilter) {
            sb.append("'");
            sb.append(((ConstantFilter) filter).getValue());
            sb.append("'");
        }
        else if (filter instanceof UnaryFilter) {
            sb.append(((UnaryFilter) filter).getOperator());
            sb.append("(");
            buildFilterExpression(((UnaryFilter) filter).getOperand(), sb);
            sb.append(")");
        }
        else if (filter instanceof BinaryFilter) {
            sb.append("(");
            buildFilterExpression(((BinaryFilter) filter).getLeft(), sb);
            sb.append(" ");
            sb.append(((BinaryFilter) filter).getOperator());
            sb.append(" ");
            buildFilterExpression(((BinaryFilter) filter).getRight(), sb);
            sb.append(")");
        }
        else if (filter instanceof RawStringFilter) {
            sb.append(((RawStringFilter) filter).getRawString());
        }
    }

    private Builder addOptionalHeader(Builder builder, String name, Object value) {
        return PipelineHelpers.addOptionalHeader(builder, name, value);
    }

    private WebResource.Builder addTableRequestHeaders(WebResource.Builder builder) {
        builder = addOptionalHeader(builder, "x-ms-version", API_VERSION);
        builder = addOptionalHeader(builder, "DataServiceVersion", "1.0;NetFx");
        builder = addOptionalHeader(builder, "MaxDataServiceVersion", "2.0;NetFx");
        builder = addOptionalHeader(builder, "Accept", "application/atom+xml,application/xml");
        builder = addOptionalHeader(builder, "Accept-Charset", "UTF-8");
        return builder;
    }

    private WebResource.Builder addIfMatchHeader(WebResource.Builder builder, String eTag) {
        builder = addOptionalHeader(builder, "If-Match", eTag == null ? "*" : eTag);
        return builder;
    }

    private WebResource getResource(TableServiceOptions options) {
        WebResource webResource = channel.resource(url).path("/");
        webResource = addOptionalQueryParam(webResource, "timeout", options.getTimeout());
        for (ServiceFilter filter : filters) {
            webResource.addFilter(new ClientFilterAdapter(filter));
        }

        return webResource;
    }

    @Override
    public GetServicePropertiesResult getServiceProperties() throws ServiceException {
        return getServiceProperties(new TableServiceOptions());
    }

    @Override
    public GetServicePropertiesResult getServiceProperties(TableServiceOptions options) throws ServiceException {
        WebResource webResource = getResource(options).path("/").queryParam("resType", "service")
                .queryParam("comp", "properties");

        WebResource.Builder builder = webResource.header("x-ms-version", API_VERSION);

        GetServicePropertiesResult result = new GetServicePropertiesResult();
        result.setValue(builder.get(ServiceProperties.class));
        return result;
    }

    @Override
    public void setServiceProperties(ServiceProperties serviceProperties) throws ServiceException {
        setServiceProperties(serviceProperties, new TableServiceOptions());
    }

    @Override
    public void setServiceProperties(ServiceProperties serviceProperties, TableServiceOptions options)
            throws ServiceException {
        WebResource webResource = getResource(options).path("/").queryParam("resType", "service")
                .queryParam("comp", "properties");

        WebResource.Builder builder = webResource.header("x-ms-version", API_VERSION);

        builder.put(serviceProperties);
    }

    @Override
    public GetTableResult getTable(String table) throws ServiceException {
        return getTable(table, new TableServiceOptions());
    }

    @Override
    public GetTableResult getTable(String table, TableServiceOptions options) throws ServiceException {
        WebResource webResource = getResource(options).path("Tables" + "('" + table + "')");

        WebResource.Builder builder = webResource.getRequestBuilder();
        builder = addTableRequestHeaders(builder);

        ClientResponse response = builder.get(ClientResponse.class);
        ThrowIfError(response);

        GetTableResult result = new GetTableResult();
        result.setTableEntry(atomReaderWriter.parseTableEntry(response.getEntityInputStream()));
        return result;
    }

    @Override
    public QueryTablesResult listTables() throws ServiceException {
        return listTables(new ListTablesOptions());
    }

    @Override
    public QueryTablesResult listTables(ListTablesOptions options) throws ServiceException {
        // Append Max char to end '{' is 1 + 'z' in AsciiTable ==> uppperBound is prefix + '{'
        Filter filter = Filter.and(Filter.ge(Filter.litteral("TableName"), Filter.constant(options.getPrefix())),
                Filter.le(Filter.litteral("TableName"), Filter.constant(options.getPrefix() + "{")));

        QueryTablesOptions queryTableOptions = new QueryTablesOptions();
        queryTableOptions.setTimeout(options.getTimeout());
        queryTableOptions.setQuery(new Query().setFilter(filter));
        return queryTables(queryTableOptions);
    }

    @Override
    public QueryTablesResult queryTables() throws ServiceException {
        return queryTables(new QueryTablesOptions());
    }

    @Override
    public QueryTablesResult queryTables(QueryTablesOptions options) throws ServiceException {
        WebResource webResource = getResource(options).path("Tables");
        webResource = addOptionalQuery(webResource, options.getQuery());
        webResource = addOptionalQueryParam(webResource, "NextTableName", options.getNextTableName());

        WebResource.Builder builder = webResource.getRequestBuilder();
        builder = addTableRequestHeaders(builder);

        ClientResponse response = builder.get(ClientResponse.class);
        ThrowIfError(response);

        QueryTablesResult result = new QueryTablesResult();
        result.setNextTableName(response.getHeaders().getFirst("x-ms-continuation-NextTableName"));
        result.setTables(atomReaderWriter.parseTableEntries(response.getEntityInputStream()));

        return result;
    }

    @Override
    public void createTable(String table) throws ServiceException {
        createTable(table, new TableServiceOptions());

    }

    @Override
    public void createTable(String table, TableServiceOptions options) throws ServiceException {
        WebResource webResource = getResource(options).path("Tables");

        WebResource.Builder builder = webResource.getRequestBuilder();
        builder = addTableRequestHeaders(builder);

        builder.entity(atomReaderWriter.generateTableEntry(table), "application/atom+xml");

        ClientResponse response = builder.post(ClientResponse.class);
        ThrowIfError(response);
    }

    @Override
    public void deleteTable(String table) throws ServiceException {
        deleteTable(table, new TableServiceOptions());
    }

    @Override
    public void deleteTable(String table, TableServiceOptions options) throws ServiceException {
        WebResource webResource = getResource(options).path("Tables" + "('" + table + "')");

        WebResource.Builder builder = webResource.getRequestBuilder();
        builder = addTableRequestHeaders(builder);
        builder = addOptionalHeader(builder, "Content-Type", "application/atom+xml");

        ClientResponse response = builder.delete(ClientResponse.class);
        ThrowIfError(response);
    }

    @Override
    public InsertEntityResult insertEntity(String table, Entity entity) throws ServiceException {
        return insertEntity(table, entity, new TableServiceOptions());
    }

    @Override
    public InsertEntityResult insertEntity(String table, Entity entity, TableServiceOptions options)
            throws ServiceException {
        WebResource webResource = getResource(options).path(table);

        WebResource.Builder builder = webResource.getRequestBuilder();
        builder = addTableRequestHeaders(builder);

        builder = builder.entity(atomReaderWriter.generateEntityEntry(entity), "application/atom+xml");

        ClientResponse response = builder.post(ClientResponse.class);
        ThrowIfError(response);

        InsertEntityResult result = new InsertEntityResult();
        result.setEntity(atomReaderWriter.parseEntityEntry(response.getEntityInputStream()));

        return result;
    }

    @Override
    public UpdateEntityResult updateEntity(String table, Entity entity) throws ServiceException {
        return updateEntity(table, entity, new TableServiceOptions());
    }

    @Override
    public UpdateEntityResult updateEntity(String table, Entity entity, TableServiceOptions options)
            throws ServiceException {
        return putOrMergeEntityCore(table, entity, "PUT", true/*includeEtag*/, options);
    }

    @Override
    public UpdateEntityResult mergeEntity(String table, Entity entity) throws ServiceException {
        return updateEntity(table, entity, new TableServiceOptions());
    }

    @Override
    public UpdateEntityResult mergeEntity(String table, Entity entity, TableServiceOptions options)
            throws ServiceException {
        return putOrMergeEntityCore(table, entity, "MERGE", true/*includeEtag*/, options);
    }

    @Override
    public UpdateEntityResult insertOrReplaceEntity(String table, Entity entity) throws ServiceException {
        return insertOrReplaceEntity(table, entity, new TableServiceOptions());
    }

    @Override
    public UpdateEntityResult insertOrReplaceEntity(String table, Entity entity, TableServiceOptions options)
            throws ServiceException {
        return putOrMergeEntityCore(table, entity, "PUT", false/*includeEtag*/, options);
    }

    @Override
    public UpdateEntityResult insertOrMergeEntity(String table, Entity entity) throws ServiceException {
        return insertOrReplaceEntity(table, entity, new TableServiceOptions());
    }

    @Override
    public UpdateEntityResult insertOrMergeEntity(String table, Entity entity, TableServiceOptions options)
            throws ServiceException {
        return putOrMergeEntityCore(table, entity, "MERGE", false/*includeEtag*/, options);
    }

    private UpdateEntityResult putOrMergeEntityCore(String table, Entity entity, String verb, boolean includeEtag,
            TableServiceOptions options) throws ServiceException {
        WebResource webResource = getResource(options).path(
                getEntityPath(table, entity.getPartitionKey(), entity.getRowKey()));

        WebResource.Builder builder = webResource.getRequestBuilder();
        builder = addTableRequestHeaders(builder);
        if (includeEtag) {
            builder = addIfMatchHeader(builder, entity.getEtag());
        }

        builder = builder.entity(atomReaderWriter.generateEntityEntry(entity), "application/atom+xml");

        ClientResponse response = builder.method(verb, ClientResponse.class);
        ThrowIfError(response);

        UpdateEntityResult result = new UpdateEntityResult();
        result.setEtag(response.getHeaders().getFirst("ETag"));

        return result;
    }

    @Override
    public void deleteEntity(String table, String partitionKey, String rowKey) throws ServiceException {
        deleteEntity(table, partitionKey, rowKey, new DeleteEntityOptions());
    }

    @Override
    public void deleteEntity(String table, String partitionKey, String rowKey, DeleteEntityOptions options)
            throws ServiceException {
        WebResource webResource = getResource(options).path(getEntityPath(table, partitionKey, rowKey));

        WebResource.Builder builder = webResource.getRequestBuilder();
        builder = addTableRequestHeaders(builder);
        builder = addIfMatchHeader(builder, options.getEtag());

        ClientResponse response = builder.delete(ClientResponse.class);
        ThrowIfError(response);
    }

    @Override
    public GetEntityResult getEntity(String table, String partitionKey, String rowKey) throws ServiceException {
        return getEntity(table, partitionKey, rowKey, new TableServiceOptions());
    }

    @Override
    public GetEntityResult getEntity(String table, String partitionKey, String rowKey, TableServiceOptions options)
            throws ServiceException {
        WebResource webResource = getResource(options).path(getEntityPath(table, partitionKey, rowKey));

        WebResource.Builder builder = webResource.getRequestBuilder();
        builder = addTableRequestHeaders(builder);

        ClientResponse response = builder.get(ClientResponse.class);
        ThrowIfError(response);

        GetEntityResult result = new GetEntityResult();
        result.setEntity(atomReaderWriter.parseEntityEntry(response.getEntityInputStream()));

        return result;
    }

    @Override
    public QueryEntitiesResult queryEntities(String table) throws ServiceException {
        return queryEntities(table, new QueryEntitiesOptions());
    }

    @Override
    public QueryEntitiesResult queryEntities(String table, QueryEntitiesOptions options) throws ServiceException {
        WebResource webResource = getResource(options).path(table);
        webResource = addOptionalQuery(webResource, options.getQuery());
        webResource = addOptionalQueryParam(webResource, "NextPartitionKey",
                encodeODataURIValue(options.getNextPartitionKey()));
        webResource = addOptionalQueryParam(webResource, "NextRowKey", encodeODataURIValue(options.getNextRowKey()));

        WebResource.Builder builder = webResource.getRequestBuilder();
        builder = addTableRequestHeaders(builder);

        ClientResponse response = builder.get(ClientResponse.class);
        ThrowIfError(response);

        QueryEntitiesResult result = new QueryEntitiesResult();
        result.setNextPartitionKey(response.getHeaders().getFirst("x-ms-continuation-NextPartitionKey"));
        result.setNextRowKey(response.getHeaders().getFirst("x-ms-continuation-NextRowKey"));
        result.setEntities(atomReaderWriter.parseEntityEntries(response.getEntityInputStream()));

        return result;
    }

    @Override
    public BatchResult batch(BatchOperations operations) throws ServiceException {
        return batch(operations, new TableServiceOptions());
    }

    @Override
    public BatchResult batch(BatchOperations operations, TableServiceOptions options) throws ServiceException {
        WebResource webResource = getResource(options).path("$batch");

        WebResource.Builder builder = webResource.getRequestBuilder();
        builder = addTableRequestHeaders(builder);

        MimeMultipart entity = createMimeMultipart(operations);
        builder = builder.type(entity.getContentType());

        ClientResponse response = builder.post(ClientResponse.class, entity);
        ThrowIfError(response);

        return null;
    }

    private MimeMultipart createMimeMultipart(BatchOperations operations) {
        try {
            List<String> bodyPartContents = new ArrayList<String>();
            int contentId = 1;
            for (Operation operation : operations.getOperations()) {

                String bodyPartContent = null;
                // INSERT
                if (operation instanceof InsertOperation) {
                    InsertOperation op = (InsertOperation) operation;

                    //TODO: Review code to make sure encoding is correct 
                    InputStream stream = atomReaderWriter.generateEntityEntry(op.getEntity());
                    byte[] bytes = inputStreamToByteArray(stream);
                    String content = new String(bytes, "UTF-8");

                    StringBuilder sb = new StringBuilder();
                    sb.append(String.format("POST %s HTTP/1.1\r\n", channel.resource(url).path(op.getTable()).getURI()));
                    sb.append(String.format("Content-ID: %d\r\n", contentId++));
                    sb.append("Content-Type: application/atom+xml;type=entry\r\n");
                    sb.append(String.format("Content-Length: %d\r\n", content.length()));
                    sb.append("\r\n");
                    sb.append(content);

                    bodyPartContent = sb.toString();
                }

                if (bodyPartContent != null) {
                    bodyPartContents.add(bodyPartContent);
                }
            }

            return mimeReaderWriter.getMimeMultipart(bodyPartContents);
        }
        catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    private byte[] inputStreamToByteArray(InputStream inputStream) {
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

            byte[] buffer = new byte[1024];
            try {
                while (true) {
                    int n = inputStream.read(buffer);
                    if (n == -1)
                        break;
                    outputStream.write(buffer, 0, n);
                }
            }
            finally {
                inputStream.close();
            }
            return outputStream.toByteArray();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
