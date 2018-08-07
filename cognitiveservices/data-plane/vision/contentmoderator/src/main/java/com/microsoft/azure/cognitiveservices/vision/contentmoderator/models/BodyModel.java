/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.contentmoderator.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The BodyModel model.
 */
public class BodyModel {
    /**
     * The dataRepresentation property.
     */
    @JsonProperty(value = "DataRepresentation")
    private String dataRepresentation;

    /**
     * The value property.
     */
    @JsonProperty(value = "Value")
    private String value;

    /**
     * Get the dataRepresentation value.
     *
     * @return the dataRepresentation value
     */
    public String dataRepresentation() {
        return this.dataRepresentation;
    }

    /**
     * Set the dataRepresentation value.
     *
     * @param dataRepresentation the dataRepresentation value to set
     * @return the BodyModel object itself.
     */
    public BodyModel withDataRepresentation(String dataRepresentation) {
        this.dataRepresentation = dataRepresentation;
        return this;
    }

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     * @return the BodyModel object itself.
     */
    public BodyModel withValue(String value) {
        this.value = value;
        return this;
    }

}
