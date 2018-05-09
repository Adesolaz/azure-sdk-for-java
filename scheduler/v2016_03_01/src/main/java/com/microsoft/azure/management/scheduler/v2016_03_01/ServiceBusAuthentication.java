/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.scheduler.v2016_03_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ServiceBusAuthentication model.
 */
public class ServiceBusAuthentication {
    /**
     * Gets or sets the SAS key.
     */
    @JsonProperty(value = "sasKey")
    private String sasKey;

    /**
     * Gets or sets the SAS key name.
     */
    @JsonProperty(value = "sasKeyName")
    private String sasKeyName;

    /**
     * Gets or sets the authentication type. Possible values include:
     * 'NotSpecified', 'SharedAccessKey'.
     */
    @JsonProperty(value = "type")
    private ServiceBusAuthenticationType type;

    /**
     * Get the sasKey value.
     *
     * @return the sasKey value
     */
    public String sasKey() {
        return this.sasKey;
    }

    /**
     * Set the sasKey value.
     *
     * @param sasKey the sasKey value to set
     * @return the ServiceBusAuthentication object itself.
     */
    public ServiceBusAuthentication withSasKey(String sasKey) {
        this.sasKey = sasKey;
        return this;
    }

    /**
     * Get the sasKeyName value.
     *
     * @return the sasKeyName value
     */
    public String sasKeyName() {
        return this.sasKeyName;
    }

    /**
     * Set the sasKeyName value.
     *
     * @param sasKeyName the sasKeyName value to set
     * @return the ServiceBusAuthentication object itself.
     */
    public ServiceBusAuthentication withSasKeyName(String sasKeyName) {
        this.sasKeyName = sasKeyName;
        return this;
    }

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public ServiceBusAuthenticationType type() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param type the type value to set
     * @return the ServiceBusAuthentication object itself.
     */
    public ServiceBusAuthentication withType(ServiceBusAuthenticationType type) {
        this.type = type;
        return this;
    }

}
