/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.programmatic.models;


/**
 * The optional parameters class for "addCustomPrebuiltDomain" method.
 */
public class AddCustomPrebuiltDomainOptionalParameter {
    /**
    * The domain name.
    */
    private String domainName;

    /**
    * Get the domainName value.
    *
    * @return the domainName value
    */
    public String domainName() {
        return this.domainName;
    }

    /**
    * Set the domainName value.
    * <p>
    * The domain name.
    *
    * @param domainName the domainName value to set
    * @return the addCustomPrebuiltDomainOptionalParameter object itself.
    */
    public AddCustomPrebuiltDomainOptionalParameter withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    }
