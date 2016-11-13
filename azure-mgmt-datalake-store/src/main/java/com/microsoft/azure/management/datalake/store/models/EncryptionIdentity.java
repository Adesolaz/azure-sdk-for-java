/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalake.store.models;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The EncryptionIdentity model.
 */
public class EncryptionIdentity {
    /**
     * The type of encryption being used. Currently the only supported type is
     * 'SystemAssigned'. Possible values include: 'SystemAssigned'.
     */
    private EncryptionIdentityType type;

    /**
     * The principal identifier associated with the encryption.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private UUID principalId;

    /**
     * The tenant identifier associated with the encryption.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private UUID tenantId;

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public EncryptionIdentityType type() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param type the type value to set
     * @return the EncryptionIdentity object itself.
     */
    public EncryptionIdentity withType(EncryptionIdentityType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the principalId value.
     *
     * @return the principalId value
     */
    public UUID principalId() {
        return this.principalId;
    }

    /**
     * Get the tenantId value.
     *
     * @return the tenantId value
     */
    public UUID tenantId() {
        return this.tenantId;
    }

}