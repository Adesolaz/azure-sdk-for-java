/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2015_10_31;

import rx.Observable;
import com.microsoft.azure.management.automation.v2015_10_31.implementation.UsagesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Usages.
 */
public interface Usages extends HasInner<UsagesInner> {
    /**
     * Retrieve the usage for the account id.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Usage> listByAutomationAccountAsync(String resourceGroupName, String automationAccountName);

}