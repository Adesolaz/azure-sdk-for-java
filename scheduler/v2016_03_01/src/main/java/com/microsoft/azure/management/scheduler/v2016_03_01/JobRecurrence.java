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
 * The JobRecurrence model.
 */
public class JobRecurrence {
    /**
     * Gets or sets the frequency of recurrence (second, minute, hour, day,
     * week, month). Possible values include: 'Minute', 'Hour', 'Day', 'Week',
     * 'Month'.
     */
    @JsonProperty(value = "frequency")
    private RecurrenceFrequency frequency;

    /**
     * Gets or sets the interval between retries.
     */
    @JsonProperty(value = "interval")
    private Integer interval;

    /**
     * Gets or sets the maximum number of times that the job should run.
     */
    @JsonProperty(value = "count")
    private Integer count;

    /**
     * Gets or sets the time at which the job will complete.
     */
    @JsonProperty(value = "endTime")
    private DateTime endTime;

    /**
     * The schedule property.
     */
    @JsonProperty(value = "schedule")
    private JobRecurrenceSchedule schedule;

    /**
     * Get the frequency value.
     *
     * @return the frequency value
     */
    public RecurrenceFrequency frequency() {
        return this.frequency;
    }

    /**
     * Set the frequency value.
     *
     * @param frequency the frequency value to set
     * @return the JobRecurrence object itself.
     */
    public JobRecurrence withFrequency(RecurrenceFrequency frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * Get the interval value.
     *
     * @return the interval value
     */
    public Integer interval() {
        return this.interval;
    }

    /**
     * Set the interval value.
     *
     * @param interval the interval value to set
     * @return the JobRecurrence object itself.
     */
    public JobRecurrence withInterval(Integer interval) {
        this.interval = interval;
        return this;
    }

    /**
     * Get the count value.
     *
     * @return the count value
     */
    public Integer count() {
        return this.count;
    }

    /**
     * Set the count value.
     *
     * @param count the count value to set
     * @return the JobRecurrence object itself.
     */
    public JobRecurrence withCount(Integer count) {
        this.count = count;
        return this;
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
     * Set the endTime value.
     *
     * @param endTime the endTime value to set
     * @return the JobRecurrence object itself.
     */
    public JobRecurrence withEndTime(DateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the schedule value.
     *
     * @return the schedule value
     */
    public JobRecurrenceSchedule schedule() {
        return this.schedule;
    }

    /**
     * Set the schedule value.
     *
     * @param schedule the schedule value to set
     * @return the JobRecurrence object itself.
     */
    public JobRecurrence withSchedule(JobRecurrenceSchedule schedule) {
        this.schedule = schedule;
        return this;
    }

}
