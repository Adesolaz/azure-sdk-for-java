/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabricmesh.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Replicas.
 */
public class ReplicasInner {
    /** The Retrofit service to perform REST calls. */
    private ReplicasService service;
    /** The service client containing this operation class. */
    private ServiceFabricMeshManagementClientImpl client;

    /**
     * Initializes an instance of ReplicasInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ReplicasInner(Retrofit retrofit, ServiceFabricMeshManagementClientImpl client) {
        this.service = retrofit.create(ReplicasService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Replicas to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ReplicasService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.servicefabricmesh.Replicas listByServiceName" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ServiceFabricMesh/applications/{applicationName}/services/{serviceName}/replicas")
        Observable<Response<ResponseBody>> listByServiceName(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path(value = "applicationName", encoded = true) String applicationName, @Path(value = "serviceName", encoded = true) String serviceName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.servicefabricmesh.Replicas get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ServiceFabricMesh/applications/{applicationName}/services/{serviceName}/replicas/{replicaName}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path(value = "applicationName", encoded = true) String applicationName, @Path(value = "serviceName", encoded = true) String serviceName, @Path(value = "replicaName", encoded = true) String replicaName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.servicefabricmesh.Replicas listByServiceNameNext" })
        @GET
        Observable<Response<ResponseBody>> listByServiceNameNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets replicas of a given service.
     * Gets the information about all replicas of a given service of an application. The information includes the runtime properties of the replica instance.
     *
     * @param resourceGroupName Azure resource group name
     * @param applicationName The identity of the application.
     * @param serviceName The identity of the service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ServiceReplicaDescriptionInner&gt; object if successful.
     */
    public PagedList<ServiceReplicaDescriptionInner> listByServiceName(final String resourceGroupName, final String applicationName, final String serviceName) {
        ServiceResponse<Page<ServiceReplicaDescriptionInner>> response = listByServiceNameSinglePageAsync(resourceGroupName, applicationName, serviceName).toBlocking().single();
        return new PagedList<ServiceReplicaDescriptionInner>(response.body()) {
            @Override
            public Page<ServiceReplicaDescriptionInner> nextPage(String nextPageLink) {
                return listByServiceNameNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets replicas of a given service.
     * Gets the information about all replicas of a given service of an application. The information includes the runtime properties of the replica instance.
     *
     * @param resourceGroupName Azure resource group name
     * @param applicationName The identity of the application.
     * @param serviceName The identity of the service.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ServiceReplicaDescriptionInner>> listByServiceNameAsync(final String resourceGroupName, final String applicationName, final String serviceName, final ListOperationCallback<ServiceReplicaDescriptionInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByServiceNameSinglePageAsync(resourceGroupName, applicationName, serviceName),
            new Func1<String, Observable<ServiceResponse<Page<ServiceReplicaDescriptionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ServiceReplicaDescriptionInner>>> call(String nextPageLink) {
                    return listByServiceNameNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets replicas of a given service.
     * Gets the information about all replicas of a given service of an application. The information includes the runtime properties of the replica instance.
     *
     * @param resourceGroupName Azure resource group name
     * @param applicationName The identity of the application.
     * @param serviceName The identity of the service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ServiceReplicaDescriptionInner&gt; object
     */
    public Observable<Page<ServiceReplicaDescriptionInner>> listByServiceNameAsync(final String resourceGroupName, final String applicationName, final String serviceName) {
        return listByServiceNameWithServiceResponseAsync(resourceGroupName, applicationName, serviceName)
            .map(new Func1<ServiceResponse<Page<ServiceReplicaDescriptionInner>>, Page<ServiceReplicaDescriptionInner>>() {
                @Override
                public Page<ServiceReplicaDescriptionInner> call(ServiceResponse<Page<ServiceReplicaDescriptionInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets replicas of a given service.
     * Gets the information about all replicas of a given service of an application. The information includes the runtime properties of the replica instance.
     *
     * @param resourceGroupName Azure resource group name
     * @param applicationName The identity of the application.
     * @param serviceName The identity of the service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ServiceReplicaDescriptionInner&gt; object
     */
    public Observable<ServiceResponse<Page<ServiceReplicaDescriptionInner>>> listByServiceNameWithServiceResponseAsync(final String resourceGroupName, final String applicationName, final String serviceName) {
        return listByServiceNameSinglePageAsync(resourceGroupName, applicationName, serviceName)
            .concatMap(new Func1<ServiceResponse<Page<ServiceReplicaDescriptionInner>>, Observable<ServiceResponse<Page<ServiceReplicaDescriptionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ServiceReplicaDescriptionInner>>> call(ServiceResponse<Page<ServiceReplicaDescriptionInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByServiceNameNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets replicas of a given service.
     * Gets the information about all replicas of a given service of an application. The information includes the runtime properties of the replica instance.
     *
    ServiceResponse<PageImpl<ServiceReplicaDescriptionInner>> * @param resourceGroupName Azure resource group name
    ServiceResponse<PageImpl<ServiceReplicaDescriptionInner>> * @param applicationName The identity of the application.
    ServiceResponse<PageImpl<ServiceReplicaDescriptionInner>> * @param serviceName The identity of the service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ServiceReplicaDescriptionInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ServiceReplicaDescriptionInner>>> listByServiceNameSinglePageAsync(final String resourceGroupName, final String applicationName, final String serviceName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (applicationName == null) {
            throw new IllegalArgumentException("Parameter applicationName is required and cannot be null.");
        }
        if (serviceName == null) {
            throw new IllegalArgumentException("Parameter serviceName is required and cannot be null.");
        }
        return service.listByServiceName(this.client.subscriptionId(), resourceGroupName, applicationName, serviceName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ServiceReplicaDescriptionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ServiceReplicaDescriptionInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ServiceReplicaDescriptionInner>> result = listByServiceNameDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ServiceReplicaDescriptionInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ServiceReplicaDescriptionInner>> listByServiceNameDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ServiceReplicaDescriptionInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ServiceReplicaDescriptionInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets a specific replica of a given service.
     * Gets the information about the specified replica of a given service of an application. The information includes the runtime properties of the replica instance.
     *
     * @param resourceGroupName Azure resource group name
     * @param applicationName The identity of the application.
     * @param serviceName The identity of the service.
     * @param replicaName The identity of the service replica.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServiceReplicaDescriptionInner object if successful.
     */
    public ServiceReplicaDescriptionInner get(String resourceGroupName, String applicationName, String serviceName, String replicaName) {
        return getWithServiceResponseAsync(resourceGroupName, applicationName, serviceName, replicaName).toBlocking().single().body();
    }

    /**
     * Gets a specific replica of a given service.
     * Gets the information about the specified replica of a given service of an application. The information includes the runtime properties of the replica instance.
     *
     * @param resourceGroupName Azure resource group name
     * @param applicationName The identity of the application.
     * @param serviceName The identity of the service.
     * @param replicaName The identity of the service replica.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ServiceReplicaDescriptionInner> getAsync(String resourceGroupName, String applicationName, String serviceName, String replicaName, final ServiceCallback<ServiceReplicaDescriptionInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, applicationName, serviceName, replicaName), serviceCallback);
    }

    /**
     * Gets a specific replica of a given service.
     * Gets the information about the specified replica of a given service of an application. The information includes the runtime properties of the replica instance.
     *
     * @param resourceGroupName Azure resource group name
     * @param applicationName The identity of the application.
     * @param serviceName The identity of the service.
     * @param replicaName The identity of the service replica.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServiceReplicaDescriptionInner object
     */
    public Observable<ServiceReplicaDescriptionInner> getAsync(String resourceGroupName, String applicationName, String serviceName, String replicaName) {
        return getWithServiceResponseAsync(resourceGroupName, applicationName, serviceName, replicaName).map(new Func1<ServiceResponse<ServiceReplicaDescriptionInner>, ServiceReplicaDescriptionInner>() {
            @Override
            public ServiceReplicaDescriptionInner call(ServiceResponse<ServiceReplicaDescriptionInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a specific replica of a given service.
     * Gets the information about the specified replica of a given service of an application. The information includes the runtime properties of the replica instance.
     *
     * @param resourceGroupName Azure resource group name
     * @param applicationName The identity of the application.
     * @param serviceName The identity of the service.
     * @param replicaName The identity of the service replica.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServiceReplicaDescriptionInner object
     */
    public Observable<ServiceResponse<ServiceReplicaDescriptionInner>> getWithServiceResponseAsync(String resourceGroupName, String applicationName, String serviceName, String replicaName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (applicationName == null) {
            throw new IllegalArgumentException("Parameter applicationName is required and cannot be null.");
        }
        if (serviceName == null) {
            throw new IllegalArgumentException("Parameter serviceName is required and cannot be null.");
        }
        if (replicaName == null) {
            throw new IllegalArgumentException("Parameter replicaName is required and cannot be null.");
        }
        return service.get(this.client.subscriptionId(), resourceGroupName, applicationName, serviceName, replicaName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ServiceReplicaDescriptionInner>>>() {
                @Override
                public Observable<ServiceResponse<ServiceReplicaDescriptionInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ServiceReplicaDescriptionInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ServiceReplicaDescriptionInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ServiceReplicaDescriptionInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ServiceReplicaDescriptionInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets replicas of a given service.
     * Gets the information about all replicas of a given service of an application. The information includes the runtime properties of the replica instance.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ServiceReplicaDescriptionInner&gt; object if successful.
     */
    public PagedList<ServiceReplicaDescriptionInner> listByServiceNameNext(final String nextPageLink) {
        ServiceResponse<Page<ServiceReplicaDescriptionInner>> response = listByServiceNameNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<ServiceReplicaDescriptionInner>(response.body()) {
            @Override
            public Page<ServiceReplicaDescriptionInner> nextPage(String nextPageLink) {
                return listByServiceNameNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets replicas of a given service.
     * Gets the information about all replicas of a given service of an application. The information includes the runtime properties of the replica instance.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ServiceReplicaDescriptionInner>> listByServiceNameNextAsync(final String nextPageLink, final ServiceFuture<List<ServiceReplicaDescriptionInner>> serviceFuture, final ListOperationCallback<ServiceReplicaDescriptionInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByServiceNameNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<ServiceReplicaDescriptionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ServiceReplicaDescriptionInner>>> call(String nextPageLink) {
                    return listByServiceNameNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets replicas of a given service.
     * Gets the information about all replicas of a given service of an application. The information includes the runtime properties of the replica instance.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ServiceReplicaDescriptionInner&gt; object
     */
    public Observable<Page<ServiceReplicaDescriptionInner>> listByServiceNameNextAsync(final String nextPageLink) {
        return listByServiceNameNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<ServiceReplicaDescriptionInner>>, Page<ServiceReplicaDescriptionInner>>() {
                @Override
                public Page<ServiceReplicaDescriptionInner> call(ServiceResponse<Page<ServiceReplicaDescriptionInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets replicas of a given service.
     * Gets the information about all replicas of a given service of an application. The information includes the runtime properties of the replica instance.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ServiceReplicaDescriptionInner&gt; object
     */
    public Observable<ServiceResponse<Page<ServiceReplicaDescriptionInner>>> listByServiceNameNextWithServiceResponseAsync(final String nextPageLink) {
        return listByServiceNameNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<ServiceReplicaDescriptionInner>>, Observable<ServiceResponse<Page<ServiceReplicaDescriptionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ServiceReplicaDescriptionInner>>> call(ServiceResponse<Page<ServiceReplicaDescriptionInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByServiceNameNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets replicas of a given service.
     * Gets the information about all replicas of a given service of an application. The information includes the runtime properties of the replica instance.
     *
    ServiceResponse<PageImpl<ServiceReplicaDescriptionInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ServiceReplicaDescriptionInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ServiceReplicaDescriptionInner>>> listByServiceNameNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listByServiceNameNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ServiceReplicaDescriptionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ServiceReplicaDescriptionInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ServiceReplicaDescriptionInner>> result = listByServiceNameNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ServiceReplicaDescriptionInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ServiceReplicaDescriptionInner>> listByServiceNameNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ServiceReplicaDescriptionInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ServiceReplicaDescriptionInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
