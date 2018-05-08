/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.programmatic.models;


/**
 * The optional parameters class for "clone" method.
 */
public class CloneOptionalParameter {
    /**
    * The new version for the cloned model.
    */
    private String version;

    /**
    * Get the version value.
    *
    * @return the version value
    */
    public String version() {
        return this.version;
    }

    /**
    * Set the version value.
    * <p>
    * The new version for the cloned model.
    *
    * @param version the version value to set
    * @return the cloneOptionalParameter object itself.
    */
    public CloneOptionalParameter withVersion(String version) {
        this.version = version;
        return this;
    }

    }
