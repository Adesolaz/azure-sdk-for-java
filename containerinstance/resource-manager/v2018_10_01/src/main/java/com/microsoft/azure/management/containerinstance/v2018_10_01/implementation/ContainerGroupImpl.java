/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance.v2018_10_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.containerinstance.v2018_10_01.ContainerGroup;
import rx.Observable;
import com.microsoft.azure.Resource;
import com.microsoft.azure.management.containerinstance.v2018_10_01.ContainerGroupIdentity;
import java.util.List;
import com.microsoft.azure.management.containerinstance.v2018_10_01.ImageRegistryCredential;
import com.microsoft.azure.management.containerinstance.v2018_10_01.ContainerGroupRestartPolicy;
import com.microsoft.azure.management.containerinstance.v2018_10_01.IpAddress;
import com.microsoft.azure.management.containerinstance.v2018_10_01.OperatingSystemTypes;
import com.microsoft.azure.management.containerinstance.v2018_10_01.Volume;
import com.microsoft.azure.management.containerinstance.v2018_10_01.ContainerGroupPropertiesInstanceView;
import com.microsoft.azure.management.containerinstance.v2018_10_01.ContainerGroupDiagnostics;
import com.microsoft.azure.management.containerinstance.v2018_10_01.ContainerGroupNetworkProfile;
import java.util.ArrayList;
import com.microsoft.azure.management.containerinstance.v2018_10_01.;
import rx.functions.Func1;

class ContainerGroupImpl extends GroupableResourceCoreImpl<ContainerGroup, ContainerGroupInner, ContainerGroupImpl, ContainerInstanceManager> implements ContainerGroup, ContainerGroup.Definition, ContainerGroup.Update {
    private Resource updateParameter;
    ContainerGroupImpl(String name, ContainerGroupInner inner, ContainerInstanceManager manager) {
        super(name, inner, manager);
        this.updateParameter = new Resource();
    }

    @Override
    public Observable<ContainerGroup> createResourceAsync() {
        ContainerGroupsInner client = this.manager().inner().containerGroups();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(new Func1<ContainerGroupInner, ContainerGroupInner>() {
               @Override
               public ContainerGroupInner call(ContainerGroupInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ContainerGroup> updateResourceAsync() {
        ContainerGroupsInner client = this.manager().inner().containerGroups();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.updateParameter)
            .map(new Func1<ContainerGroupInner, ContainerGroupInner>() {
               @Override
               public ContainerGroupInner call(ContainerGroupInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ContainerGroupInner> getInnerAsync() {
        ContainerGroupsInner client = this.manager().inner().containerGroups();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new Resource();
    }

    @Override
    public List<ContainerInner> containers() {
        return this.inner().containers();
    }

    @Override
    public ContainerGroupDiagnostics diagnostics() {
        return this.inner().diagnostics();
    }

    @Override
    public ContainerGroupIdentity identity() {
        return this.inner().identity();
    }

    @Override
    public List<ImageRegistryCredential> imageRegistryCredentials() {
        return this.inner().imageRegistryCredentials();
    }

    @Override
    public ContainerGroupPropertiesInstanceView instanceView() {
        return this.inner().instanceView();
    }

    @Override
    public IpAddress ipAddress() {
        return this.inner().ipAddress();
    }

    @Override
    public ContainerGroupNetworkProfile networkProfile() {
        return this.inner().networkProfile();
    }

    @Override
    public OperatingSystemTypes osType() {
        return this.inner().osType();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public ContainerGroupRestartPolicy restartPolicy() {
        return this.inner().restartPolicy();
    }

    @Override
    public List<Volume> volumes() {
        return this.inner().volumes();
    }

    @Override
    public ContainerGroupImpl withContainers(List<ContainerInner> containers) {
        this.inner().withContainers(containers);
        return this;
    }

    @Override
    public ContainerGroupImpl withOsType(OperatingSystemTypes osType) {
        this.inner().withOsType(osType);
        return this;
    }

    @Override
    public ContainerGroupImpl withDiagnostics(ContainerGroupDiagnostics diagnostics) {
        this.inner().withDiagnostics(diagnostics);
        return this;
    }

    @Override
    public ContainerGroupImpl withIdentity(ContainerGroupIdentity identity) {
        this.inner().withIdentity(identity);
        return this;
    }

    @Override
    public ContainerGroupImpl withImageRegistryCredentials(List<ImageRegistryCredential> imageRegistryCredentials) {
        this.inner().withImageRegistryCredentials(imageRegistryCredentials);
        return this;
    }

    @Override
    public ContainerGroupImpl withIpAddress(IpAddress ipAddress) {
        this.inner().withIpAddress(ipAddress);
        return this;
    }

    @Override
    public ContainerGroupImpl withNetworkProfile(ContainerGroupNetworkProfile networkProfile) {
        this.inner().withNetworkProfile(networkProfile);
        return this;
    }

    @Override
    public ContainerGroupImpl withRestartPolicy(ContainerGroupRestartPolicy restartPolicy) {
        this.inner().withRestartPolicy(restartPolicy);
        return this;
    }

    @Override
    public ContainerGroupImpl withVolumes(List<Volume> volumes) {
        this.inner().withVolumes(volumes);
        return this;
    }

}