/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2018_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Input for testing all routes.
 */
public class TestAllRoutesInput {
    /**
     * Routing source. Possible values include: 'Invalid', 'DeviceMessages',
     * 'TwinChangeEvents', 'DeviceLifecycleEvents', 'DeviceJobLifecycleEvents'.
     */
    @JsonProperty(value = "routingSource")
    private RoutingSource routingSource;

    /**
     * Routing message.
     */
    @JsonProperty(value = "message")
    private RoutingMessage message;

    /**
     * Get the routingSource value.
     *
     * @return the routingSource value
     */
    public RoutingSource routingSource() {
        return this.routingSource;
    }

    /**
     * Set the routingSource value.
     *
     * @param routingSource the routingSource value to set
     * @return the TestAllRoutesInput object itself.
     */
    public TestAllRoutesInput withRoutingSource(RoutingSource routingSource) {
        this.routingSource = routingSource;
        return this;
    }

    /**
     * Get the message value.
     *
     * @return the message value
     */
    public RoutingMessage message() {
        return this.message;
    }

    /**
     * Set the message value.
     *
     * @param message the message value to set
     * @return the TestAllRoutesInput object itself.
     */
    public TestAllRoutesInput withMessage(RoutingMessage message) {
        this.message = message;
        return this;
    }

}
