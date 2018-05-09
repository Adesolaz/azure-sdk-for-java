/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.scheduler.v2016_03_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The HttpRequest model.
 */
public class HttpRequest {
    /**
     * Gets or sets the authentication method of the request.
     */
    @JsonProperty(value = "authentication")
    private HttpAuthentication authentication;

    /**
     * Gets or sets the URI of the request.
     */
    @JsonProperty(value = "uri")
    private String uri;

    /**
     * Gets or sets the method of the request.
     */
    @JsonProperty(value = "method")
    private String method;

    /**
     * Gets or sets the request body.
     */
    @JsonProperty(value = "body")
    private String body;

    /**
     * Gets or sets the headers.
     */
    @JsonProperty(value = "headers")
    private Map<String, String> headers;

    /**
     * Get the authentication value.
     *
     * @return the authentication value
     */
    public HttpAuthentication authentication() {
        return this.authentication;
    }

    /**
     * Set the authentication value.
     *
     * @param authentication the authentication value to set
     * @return the HttpRequest object itself.
     */
    public HttpRequest withAuthentication(HttpAuthentication authentication) {
        this.authentication = authentication;
        return this;
    }

    /**
     * Get the uri value.
     *
     * @return the uri value
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Set the uri value.
     *
     * @param uri the uri value to set
     * @return the HttpRequest object itself.
     */
    public HttpRequest withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * Get the method value.
     *
     * @return the method value
     */
    public String method() {
        return this.method;
    }

    /**
     * Set the method value.
     *
     * @param method the method value to set
     * @return the HttpRequest object itself.
     */
    public HttpRequest withMethod(String method) {
        this.method = method;
        return this;
    }

    /**
     * Get the body value.
     *
     * @return the body value
     */
    public String body() {
        return this.body;
    }

    /**
     * Set the body value.
     *
     * @param body the body value to set
     * @return the HttpRequest object itself.
     */
    public HttpRequest withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * Get the headers value.
     *
     * @return the headers value
     */
    public Map<String, String> headers() {
        return this.headers;
    }

    /**
     * Set the headers value.
     *
     * @param headers the headers value to set
     * @return the HttpRequest object itself.
     */
    public HttpRequest withHeaders(Map<String, String> headers) {
        this.headers = headers;
        return this;
    }

}
