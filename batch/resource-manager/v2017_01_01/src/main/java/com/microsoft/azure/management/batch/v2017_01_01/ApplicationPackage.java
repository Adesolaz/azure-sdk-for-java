/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batch.v2017_01_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.batch.v2017_01_01.implementation.ApplicationPackageInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.batch.v2017_01_01.implementation.BatchManager;
import org.joda.time.DateTime;

/**
 * Type representing ApplicationPackage.
 */
public interface ApplicationPackage extends HasInner<ApplicationPackageInner>, Indexable, Refreshable<ApplicationPackage>, HasManager<BatchManager> {
    /**
     * @return the format value.
     */
    String format();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the lastActivationTime value.
     */
    DateTime lastActivationTime();

    /**
     * @return the state value.
     */
    PackageState state();

    /**
     * @return the storageUrl value.
     */
    String storageUrl();

    /**
     * @return the storageUrlExpiry value.
     */
    DateTime storageUrlExpiry();

    /**
     * @return the version value.
     */
    String version();

}
