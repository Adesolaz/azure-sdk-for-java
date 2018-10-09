/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagesync;

import java.util.List;
import com.microsoft.azure.management.storagesync.implementation.WorkflowInner;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Array of Workflow.
 */
public class WorkflowArray {
    /**
     * Collection of workflow items.
     */
    @JsonProperty(value = "value")
    private List<WorkflowInner> value;

    /**
     * Get collection of workflow items.
     *
     * @return the value value
     */
    public List<WorkflowInner> value() {
        return this.value;
    }

    /**
     * Set collection of workflow items.
     *
     * @param value the value value to set
     * @return the WorkflowArray object itself.
     */
    public WorkflowArray withValue(List<WorkflowInner> value) {
        this.value = value;
        return this;
    }

}