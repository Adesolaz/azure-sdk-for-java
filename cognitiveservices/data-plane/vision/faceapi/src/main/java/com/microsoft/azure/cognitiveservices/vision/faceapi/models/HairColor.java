/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.faceapi.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Hair color and associated confidence.
 */
public class HairColor {
    /**
     * Name of the hair color. Possible values include: 'unknown', 'white',
     * 'gray', 'blond', 'brown', 'red', 'black', 'other'.
     */
    @JsonProperty(value = "color")
    private HairColorType color;

    /**
     * Confidence level of the color.
     */
    @JsonProperty(value = "confidence")
    private double confidence;

    /**
     * Get name of the hair color. Possible values include: 'unknown', 'white', 'gray', 'blond', 'brown', 'red', 'black', 'other'.
     *
     * @return the color value
     */
    public HairColorType color() {
        return this.color;
    }

    /**
     * Set name of the hair color. Possible values include: 'unknown', 'white', 'gray', 'blond', 'brown', 'red', 'black', 'other'.
     *
     * @param color the color value to set
     * @return the HairColor object itself.
     */
    public HairColor withColor(HairColorType color) {
        this.color = color;
        return this;
    }

    /**
     * Get confidence level of the color.
     *
     * @return the confidence value
     */
    public double confidence() {
        return this.confidence;
    }

    /**
     * Set confidence level of the color.
     *
     * @param confidence the confidence value to set
     * @return the HairColor object itself.
     */
    public HairColor withConfidence(double confidence) {
        this.confidence = confidence;
        return this;
    }

}
