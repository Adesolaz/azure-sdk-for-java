/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2018_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Api error base.
 */
public class ApiErrorBase {
    /**
     * The error code.
     */
    @JsonProperty(value = "code")
    private String code;

    /**
     * The target of the particular error.
     */
    @JsonProperty(value = "target")
    private String target;

    /**
     * The error message.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Get the code value.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code value.
     *
     * @param code the code value to set
     * @return the ApiErrorBase object itself.
     */
    public ApiErrorBase withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the target value.
     *
     * @return the target value
     */
    public String target() {
        return this.target;
    }

    /**
     * Set the target value.
     *
     * @param target the target value to set
     * @return the ApiErrorBase object itself.
     */
    public ApiErrorBase withTarget(String target) {
        this.target = target;
        return this;
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
     * Set the message value.
     *
     * @param message the message value to set
     * @return the ApiErrorBase object itself.
     */
    public ApiErrorBase withMessage(String message) {
        this.message = message;
        return this;
    }

}