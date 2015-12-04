/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.compute.models;

import java.util.List;

/**
 * Describes a set of certificates which are all in the same Key Vault.
 */
public class VaultSecretGroup {
    /**
     * Gets or sets the Relative URL of the Key Vault containing all of the
     * certificates in VaultCertificates.
     */
    private SubResource sourceVault;

    /**
     * Gets or sets the list of key vault references in SourceVault which
     * contain certificates.
     */
    private List<VaultCertificate> vaultCertificates;

    /**
     * Get the sourceVault value.
     *
     * @return the sourceVault value
     */
    public SubResource getSourceVault() {
        return this.sourceVault;
    }

    /**
     * Set the sourceVault value.
     *
     * @param sourceVault the sourceVault value to set
     */
    public void setSourceVault(SubResource sourceVault) {
        this.sourceVault = sourceVault;
    }

    /**
     * Get the vaultCertificates value.
     *
     * @return the vaultCertificates value
     */
    public List<VaultCertificate> getVaultCertificates() {
        return this.vaultCertificates;
    }

    /**
     * Set the vaultCertificates value.
     *
     * @param vaultCertificates the vaultCertificates value to set
     */
    public void setVaultCertificates(List<VaultCertificate> vaultCertificates) {
        this.vaultCertificates = vaultCertificates;
    }

}