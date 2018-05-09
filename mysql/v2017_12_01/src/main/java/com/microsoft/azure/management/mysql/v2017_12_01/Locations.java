/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mysql.v2017_12_01;

import com.microsoft.azure.management.mysql.v2017_12_01.implementation.LocationBasedPerformanceTiersInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Locations.
 */
public interface Locations extends HasInner<LocationBasedPerformanceTiersInner> {

    /**
     * @return Entry point to manage Location PerformanceTier.
     */
    PerformanceTiers performanceTiers();
}