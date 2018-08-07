/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.contentmoderator.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains the text found in image for the language specified.
 */
public class OCR {
    /**
     * The evaluate status.
     */
    @JsonProperty(value = "Status")
    private Status status;

    /**
     * Array of KeyValue.
     */
    @JsonProperty(value = "Metadata")
    private List<KeyValuePair> metadata;

    /**
     * The tracking id.
     */
    @JsonProperty(value = "TrackingId")
    private String trackingId;

    /**
     * The cache id.
     */
    @JsonProperty(value = "CacheId")
    private String cacheId;

    /**
     * The ISO 639-3 code.
     */
    @JsonProperty(value = "Language")
    private String language;

    /**
     * The found text.
     */
    @JsonProperty(value = "Text")
    private String text;

    /**
     * The list of candidate text.
     */
    @JsonProperty(value = "Candidates")
    private List<Candidate> candidates;

    /**
     * Get the evaluate status.
     *
     * @return the status value
     */
    public Status status() {
        return this.status;
    }

    /**
     * Set the evaluate status.
     *
     * @param status the status value to set
     * @return the OCR object itself.
     */
    public OCR withStatus(Status status) {
        this.status = status;
        return this;
    }

    /**
     * Get array of KeyValue.
     *
     * @return the metadata value
     */
    public List<KeyValuePair> metadata() {
        return this.metadata;
    }

    /**
     * Set array of KeyValue.
     *
     * @param metadata the metadata value to set
     * @return the OCR object itself.
     */
    public OCR withMetadata(List<KeyValuePair> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the tracking id.
     *
     * @return the trackingId value
     */
    public String trackingId() {
        return this.trackingId;
    }

    /**
     * Set the tracking id.
     *
     * @param trackingId the trackingId value to set
     * @return the OCR object itself.
     */
    public OCR withTrackingId(String trackingId) {
        this.trackingId = trackingId;
        return this;
    }

    /**
     * Get the cache id.
     *
     * @return the cacheId value
     */
    public String cacheId() {
        return this.cacheId;
    }

    /**
     * Set the cache id.
     *
     * @param cacheId the cacheId value to set
     * @return the OCR object itself.
     */
    public OCR withCacheId(String cacheId) {
        this.cacheId = cacheId;
        return this;
    }

    /**
     * Get the ISO 639-3 code.
     *
     * @return the language value
     */
    public String language() {
        return this.language;
    }

    /**
     * Set the ISO 639-3 code.
     *
     * @param language the language value to set
     * @return the OCR object itself.
     */
    public OCR withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Get the found text.
     *
     * @return the text value
     */
    public String text() {
        return this.text;
    }

    /**
     * Set the found text.
     *
     * @param text the text value to set
     * @return the OCR object itself.
     */
    public OCR withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get the list of candidate text.
     *
     * @return the candidates value
     */
    public List<Candidate> candidates() {
        return this.candidates;
    }

    /**
     * Set the list of candidate text.
     *
     * @param candidates the candidates value to set
     * @return the OCR object itself.
     */
    public OCR withCandidates(List<Candidate> candidates) {
        this.candidates = candidates;
        return this;
    }

}
