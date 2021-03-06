/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.trafficmanager;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for EndpointMonitorStatus.
 */
public final class EndpointMonitorStatus {
    /** Static value CheckingEndpoint for EndpointMonitorStatus. */
    public static final EndpointMonitorStatus CHECKING_ENDPOINT = new EndpointMonitorStatus("CheckingEndpoint");

    /** Static value Online for EndpointMonitorStatus. */
    public static final EndpointMonitorStatus ONLINE = new EndpointMonitorStatus("Online");

    /** Static value Degraded for EndpointMonitorStatus. */
    public static final EndpointMonitorStatus DEGRADED = new EndpointMonitorStatus("Degraded");

    /** Static value Disabled for EndpointMonitorStatus. */
    public static final EndpointMonitorStatus DISABLED = new EndpointMonitorStatus("Disabled");

    /** Static value Inactive for EndpointMonitorStatus. */
    public static final EndpointMonitorStatus INACTIVE = new EndpointMonitorStatus("Inactive");

    /** Static value Stopped for EndpointMonitorStatus. */
    public static final EndpointMonitorStatus STOPPED = new EndpointMonitorStatus("Stopped");

    private String value;

    /**
     * Creates a custom value for EndpointMonitorStatus.
     * @param value the custom value
     */
    public EndpointMonitorStatus(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof EndpointMonitorStatus)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        EndpointMonitorStatus rhs = (EndpointMonitorStatus) obj;
        if (value == null) {
            return rhs.value == null;
        } else {
            return value.equals(rhs.value);
        }
    }
}
