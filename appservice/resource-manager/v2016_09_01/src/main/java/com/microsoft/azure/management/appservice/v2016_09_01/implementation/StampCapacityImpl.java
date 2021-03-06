/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_09_01.implementation;

import com.microsoft.azure.management.appservice.v2016_09_01.StampCapacity;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.appservice.v2016_09_01.ComputeModeOptions;
import com.microsoft.azure.management.appservice.v2016_09_01.WorkerSizeOptions;

class StampCapacityImpl extends WrapperImpl<StampCapacityInner> implements StampCapacity {
    private final AppServiceManager manager;
    StampCapacityImpl(StampCapacityInner inner, AppServiceManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public AppServiceManager manager() {
        return this.manager;
    }

    @Override
    public Long availableCapacity() {
        return this.inner().availableCapacity();
    }

    @Override
    public ComputeModeOptions computeMode() {
        return this.inner().computeMode();
    }

    @Override
    public Boolean excludeFromCapacityAllocation() {
        return this.inner().excludeFromCapacityAllocation();
    }

    @Override
    public Boolean isApplicableForAllComputeModes() {
        return this.inner().isApplicableForAllComputeModes();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String siteMode() {
        return this.inner().siteMode();
    }

    @Override
    public Long totalCapacity() {
        return this.inner().totalCapacity();
    }

    @Override
    public String unit() {
        return this.inner().unit();
    }

    @Override
    public WorkerSizeOptions workerSize() {
        return this.inner().workerSize();
    }

    @Override
    public Integer workerSizeId() {
        return this.inner().workerSizeId();
    }

}
