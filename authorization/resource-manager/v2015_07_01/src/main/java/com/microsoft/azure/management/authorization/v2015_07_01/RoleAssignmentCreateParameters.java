/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.authorization.v2015_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Role assignment create parameters.
 */
public class RoleAssignmentCreateParameters {
    /**
     * Role assignment properties.
     */
    @JsonProperty(value = "properties")
    private RoleAssignmentProperties properties;

    /**
     * Get role assignment properties.
     *
     * @return the properties value
     */
    public RoleAssignmentProperties properties() {
        return this.properties;
    }

    /**
     * Set role assignment properties.
     *
     * @param properties the properties value to set
     * @return the RoleAssignmentCreateParameters object itself.
     */
    public RoleAssignmentCreateParameters withProperties(RoleAssignmentProperties properties) {
        this.properties = properties;
        return this;
    }

}
