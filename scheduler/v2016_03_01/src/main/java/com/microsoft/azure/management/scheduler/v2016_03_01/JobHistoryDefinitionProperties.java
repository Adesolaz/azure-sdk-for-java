/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.scheduler.v2016_03_01;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The JobHistoryDefinitionProperties model.
 */
public class JobHistoryDefinitionProperties {
    /**
     * Gets the start time for this job.
     */
    @JsonProperty(value = "startTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime startTime;

    /**
     * Gets the end time for this job.
     */
    @JsonProperty(value = "endTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime endTime;

    /**
     * Gets the expected execution time for this job.
     */
    @JsonProperty(value = "expectedExecutionTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime expectedExecutionTime;

    /**
     * Gets the job history action name. Possible values include: 'MainAction',
     * 'ErrorAction'.
     */
    @JsonProperty(value = "actionName", access = JsonProperty.Access.WRITE_ONLY)
    private JobHistoryActionName actionName;

    /**
     * Gets the job history status. Possible values include: 'Completed',
     * 'Failed', 'Postponed'.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private JobExecutionStatus status;

    /**
     * Gets the message for the job history.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /**
     * Gets the retry count for job.
     */
    @JsonProperty(value = "retryCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer retryCount;

    /**
     * Gets the repeat count for the job.
     */
    @JsonProperty(value = "repeatCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer repeatCount;

    /**
     * Get the startTime value.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Get the endTime value.
     *
     * @return the endTime value
     */
    public DateTime endTime() {
        return this.endTime;
    }

    /**
     * Get the expectedExecutionTime value.
     *
     * @return the expectedExecutionTime value
     */
    public DateTime expectedExecutionTime() {
        return this.expectedExecutionTime;
    }

    /**
     * Get the actionName value.
     *
     * @return the actionName value
     */
    public JobHistoryActionName actionName() {
        return this.actionName;
    }

    /**
     * Get the status value.
     *
     * @return the status value
     */
    public JobExecutionStatus status() {
        return this.status;
    }

    /**
     * Get the message value.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Get the retryCount value.
     *
     * @return the retryCount value
     */
    public Integer retryCount() {
        return this.retryCount;
    }

    /**
     * Get the repeatCount value.
     *
     * @return the repeatCount value
     */
    public Integer repeatCount() {
        return this.repeatCount;
    }

}
