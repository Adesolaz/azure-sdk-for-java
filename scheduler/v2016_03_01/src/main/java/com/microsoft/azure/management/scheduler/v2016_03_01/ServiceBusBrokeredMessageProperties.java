/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.scheduler.v2016_03_01;

import org.joda.time.DateTime;
import org.joda.time.Period;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ServiceBusBrokeredMessageProperties model.
 */
public class ServiceBusBrokeredMessageProperties {
    /**
     * Gets or sets the content type.
     */
    @JsonProperty(value = "contentType")
    private String contentType;

    /**
     * Gets or sets the correlation ID.
     */
    @JsonProperty(value = "correlationId")
    private String correlationId;

    /**
     * Gets or sets the force persistence.
     */
    @JsonProperty(value = "forcePersistence")
    private Boolean forcePersistence;

    /**
     * Gets or sets the label.
     */
    @JsonProperty(value = "label")
    private String label;

    /**
     * Gets or sets the message ID.
     */
    @JsonProperty(value = "messageId")
    private String messageId;

    /**
     * Gets or sets the partition key.
     */
    @JsonProperty(value = "partitionKey")
    private String partitionKey;

    /**
     * Gets or sets the reply to.
     */
    @JsonProperty(value = "replyTo")
    private String replyTo;

    /**
     * Gets or sets the reply to session ID.
     */
    @JsonProperty(value = "replyToSessionId")
    private String replyToSessionId;

    /**
     * Gets or sets the scheduled enqueue time UTC.
     */
    @JsonProperty(value = "scheduledEnqueueTimeUtc")
    private DateTime scheduledEnqueueTimeUtc;

    /**
     * Gets or sets the session ID.
     */
    @JsonProperty(value = "sessionId")
    private String sessionId;

    /**
     * Gets or sets the time to live.
     */
    @JsonProperty(value = "timeToLive")
    private Period timeToLive;

    /**
     * Gets or sets the to.
     */
    @JsonProperty(value = "to")
    private String to;

    /**
     * Gets or sets the via partition key.
     */
    @JsonProperty(value = "viaPartitionKey")
    private String viaPartitionKey;

    /**
     * Get the contentType value.
     *
     * @return the contentType value
     */
    public String contentType() {
        return this.contentType;
    }

    /**
     * Set the contentType value.
     *
     * @param contentType the contentType value to set
     * @return the ServiceBusBrokeredMessageProperties object itself.
     */
    public ServiceBusBrokeredMessageProperties withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get the correlationId value.
     *
     * @return the correlationId value
     */
    public String correlationId() {
        return this.correlationId;
    }

    /**
     * Set the correlationId value.
     *
     * @param correlationId the correlationId value to set
     * @return the ServiceBusBrokeredMessageProperties object itself.
     */
    public ServiceBusBrokeredMessageProperties withCorrelationId(String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     * Get the forcePersistence value.
     *
     * @return the forcePersistence value
     */
    public Boolean forcePersistence() {
        return this.forcePersistence;
    }

    /**
     * Set the forcePersistence value.
     *
     * @param forcePersistence the forcePersistence value to set
     * @return the ServiceBusBrokeredMessageProperties object itself.
     */
    public ServiceBusBrokeredMessageProperties withForcePersistence(Boolean forcePersistence) {
        this.forcePersistence = forcePersistence;
        return this;
    }

    /**
     * Get the label value.
     *
     * @return the label value
     */
    public String label() {
        return this.label;
    }

    /**
     * Set the label value.
     *
     * @param label the label value to set
     * @return the ServiceBusBrokeredMessageProperties object itself.
     */
    public ServiceBusBrokeredMessageProperties withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Get the messageId value.
     *
     * @return the messageId value
     */
    public String messageId() {
        return this.messageId;
    }

    /**
     * Set the messageId value.
     *
     * @param messageId the messageId value to set
     * @return the ServiceBusBrokeredMessageProperties object itself.
     */
    public ServiceBusBrokeredMessageProperties withMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Get the partitionKey value.
     *
     * @return the partitionKey value
     */
    public String partitionKey() {
        return this.partitionKey;
    }

    /**
     * Set the partitionKey value.
     *
     * @param partitionKey the partitionKey value to set
     * @return the ServiceBusBrokeredMessageProperties object itself.
     */
    public ServiceBusBrokeredMessageProperties withPartitionKey(String partitionKey) {
        this.partitionKey = partitionKey;
        return this;
    }

    /**
     * Get the replyTo value.
     *
     * @return the replyTo value
     */
    public String replyTo() {
        return this.replyTo;
    }

    /**
     * Set the replyTo value.
     *
     * @param replyTo the replyTo value to set
     * @return the ServiceBusBrokeredMessageProperties object itself.
     */
    public ServiceBusBrokeredMessageProperties withReplyTo(String replyTo) {
        this.replyTo = replyTo;
        return this;
    }

    /**
     * Get the replyToSessionId value.
     *
     * @return the replyToSessionId value
     */
    public String replyToSessionId() {
        return this.replyToSessionId;
    }

    /**
     * Set the replyToSessionId value.
     *
     * @param replyToSessionId the replyToSessionId value to set
     * @return the ServiceBusBrokeredMessageProperties object itself.
     */
    public ServiceBusBrokeredMessageProperties withReplyToSessionId(String replyToSessionId) {
        this.replyToSessionId = replyToSessionId;
        return this;
    }

    /**
     * Get the scheduledEnqueueTimeUtc value.
     *
     * @return the scheduledEnqueueTimeUtc value
     */
    public DateTime scheduledEnqueueTimeUtc() {
        return this.scheduledEnqueueTimeUtc;
    }

    /**
     * Set the scheduledEnqueueTimeUtc value.
     *
     * @param scheduledEnqueueTimeUtc the scheduledEnqueueTimeUtc value to set
     * @return the ServiceBusBrokeredMessageProperties object itself.
     */
    public ServiceBusBrokeredMessageProperties withScheduledEnqueueTimeUtc(DateTime scheduledEnqueueTimeUtc) {
        this.scheduledEnqueueTimeUtc = scheduledEnqueueTimeUtc;
        return this;
    }

    /**
     * Get the sessionId value.
     *
     * @return the sessionId value
     */
    public String sessionId() {
        return this.sessionId;
    }

    /**
     * Set the sessionId value.
     *
     * @param sessionId the sessionId value to set
     * @return the ServiceBusBrokeredMessageProperties object itself.
     */
    public ServiceBusBrokeredMessageProperties withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * Get the timeToLive value.
     *
     * @return the timeToLive value
     */
    public Period timeToLive() {
        return this.timeToLive;
    }

    /**
     * Set the timeToLive value.
     *
     * @param timeToLive the timeToLive value to set
     * @return the ServiceBusBrokeredMessageProperties object itself.
     */
    public ServiceBusBrokeredMessageProperties withTimeToLive(Period timeToLive) {
        this.timeToLive = timeToLive;
        return this;
    }

    /**
     * Get the to value.
     *
     * @return the to value
     */
    public String to() {
        return this.to;
    }

    /**
     * Set the to value.
     *
     * @param to the to value to set
     * @return the ServiceBusBrokeredMessageProperties object itself.
     */
    public ServiceBusBrokeredMessageProperties withTo(String to) {
        this.to = to;
        return this;
    }

    /**
     * Get the viaPartitionKey value.
     *
     * @return the viaPartitionKey value
     */
    public String viaPartitionKey() {
        return this.viaPartitionKey;
    }

    /**
     * Set the viaPartitionKey value.
     *
     * @param viaPartitionKey the viaPartitionKey value to set
     * @return the ServiceBusBrokeredMessageProperties object itself.
     */
    public ServiceBusBrokeredMessageProperties withViaPartitionKey(String viaPartitionKey) {
        this.viaPartitionKey = viaPartitionKey;
        return this;
    }

}
