/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.eventgrid.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Metadata information for the properties JSON document.
 */
public class DeviceTwinMetadata {
    /**
     * The ISO8601 timestamp of the last time the properties were updated.
     */
    @JsonProperty(value = "lastUpdated")
    private String lastUpdated;

    /**
     * Get the ISO8601 timestamp of the last time the properties were updated.
     *
     * @return the lastUpdated value
     */
    public String lastUpdated() {
        return this.lastUpdated;
    }

    /**
     * Set the ISO8601 timestamp of the last time the properties were updated.
     *
     * @param lastUpdated the lastUpdated value to set
     * @return the DeviceTwinMetadata object itself.
     */
    public DeviceTwinMetadata withLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
        return this;
    }

}
