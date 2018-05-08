/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.programmatic.models;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The application settings.
 */
public class ApplicationSettings {
    /**
     * The application ID.
     */
    @JsonProperty(value = "id", required = true)
    private UUID id;

    /**
     * Setting your application as public allows other people to use your
     * application's endpoint using their own keys.
     */
    @JsonProperty(value = "public", required = true)
    private boolean isPublic;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public UUID id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the ApplicationSettings object itself.
     */
    public ApplicationSettings withId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Get the isPublic value.
     *
     * @return the isPublic value
     */
    public boolean isPublic() {
        return this.isPublic;
    }

    /**
     * Set the isPublic value.
     *
     * @param isPublic the isPublic value to set
     * @return the ApplicationSettings object itself.
     */
    public ApplicationSettings withIsPublic(boolean isPublic) {
        this.isPublic = isPublic;
        return this;
    }

}
