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
 * Large face list object.
 */
public class LargeFaceList extends NameAndUserDataContract {
    /**
     * LargeFaceListId of the target large face list.
     */
    @JsonProperty(value = "largeFaceListId", required = true)
    private String largeFaceListId;

    /**
     * Get largeFaceListId of the target large face list.
     *
     * @return the largeFaceListId value
     */
    public String largeFaceListId() {
        return this.largeFaceListId;
    }

    /**
     * Set largeFaceListId of the target large face list.
     *
     * @param largeFaceListId the largeFaceListId value to set
     * @return the LargeFaceList object itself.
     */
    public LargeFaceList withLargeFaceListId(String largeFaceListId) {
        this.largeFaceListId = largeFaceListId;
        return this;
    }

}
