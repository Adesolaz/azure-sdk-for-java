/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.programmatic.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines the entity type and position of the extracted entity within the
 * example.
 */
public class EntityLabel {
    /**
     * The entity type.
     */
    @JsonProperty(value = "entityName", required = true)
    private String entityName;

    /**
     * The index within the utterance where the extracted entity starts.
     */
    @JsonProperty(value = "startTokenIndex", required = true)
    private int startTokenIndex;

    /**
     * The index within the utterance where the extracted entity ends.
     */
    @JsonProperty(value = "endTokenIndex", required = true)
    private int endTokenIndex;

    /**
     * Get the entityName value.
     *
     * @return the entityName value
     */
    public String entityName() {
        return this.entityName;
    }

    /**
     * Set the entityName value.
     *
     * @param entityName the entityName value to set
     * @return the EntityLabel object itself.
     */
    public EntityLabel withEntityName(String entityName) {
        this.entityName = entityName;
        return this;
    }

    /**
     * Get the startTokenIndex value.
     *
     * @return the startTokenIndex value
     */
    public int startTokenIndex() {
        return this.startTokenIndex;
    }

    /**
     * Set the startTokenIndex value.
     *
     * @param startTokenIndex the startTokenIndex value to set
     * @return the EntityLabel object itself.
     */
    public EntityLabel withStartTokenIndex(int startTokenIndex) {
        this.startTokenIndex = startTokenIndex;
        return this;
    }

    /**
     * Get the endTokenIndex value.
     *
     * @return the endTokenIndex value
     */
    public int endTokenIndex() {
        return this.endTokenIndex;
    }

    /**
     * Set the endTokenIndex value.
     *
     * @param endTokenIndex the endTokenIndex value to set
     * @return the EntityLabel object itself.
     */
    public EntityLabel withEndTokenIndex(int endTokenIndex) {
        this.endTokenIndex = endTokenIndex;
        return this;
    }

}
