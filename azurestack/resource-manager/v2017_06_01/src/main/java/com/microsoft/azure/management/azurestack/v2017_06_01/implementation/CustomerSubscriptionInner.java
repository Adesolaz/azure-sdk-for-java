/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azurestack.v2017_06_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Customer subcription.
 */
@JsonFlatten
public class CustomerSubscriptionInner extends ProxyResource {
    /**
     * Tenant Id.
     */
    @JsonProperty(value = "properties.tenantId")
    private String tenantId;

    /**
     * The entity tag used for optimistic concurency when modifying the
     * resource.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Get tenant Id.
     *
     * @return the tenantId value
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set tenant Id.
     *
     * @param tenantId the tenantId value to set
     * @return the CustomerSubscriptionInner object itself.
     */
    public CustomerSubscriptionInner withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the entity tag used for optimistic concurency when modifying the resource.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the entity tag used for optimistic concurency when modifying the resource.
     *
     * @param etag the etag value to set
     * @return the CustomerSubscriptionInner object itself.
     */
    public CustomerSubscriptionInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

}
