/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.searchmanagementclient.v2015_08_19.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.searchmanagementclient.v2015_08_19.AdminKeys;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.searchmanagementclient.v2015_08_19.AdminKeyResult;
import com.microsoft.azure.management.searchmanagementclient.v2015_08_19.AdminKeyKind;

class AdminKeysImpl extends WrapperImpl<AdminKeysInner> implements AdminKeys {
    private final SearchManager manager;

    AdminKeysImpl(SearchManager manager) {
        super(manager.inner().adminKeys());
        this.manager = manager;
    }

    public SearchManager manager() {
        return this.manager;
    }

    @Override
    public Observable<AdminKeyResult> getAsync(String resourceGroupName, String searchServiceName) {
        AdminKeysInner client = this.inner();
        return client.getAsync(resourceGroupName, searchServiceName)
        .map(new Func1<AdminKeyResultInner, AdminKeyResult>() {
            @Override
            public AdminKeyResult call(AdminKeyResultInner inner) {
                return new AdminKeyResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<AdminKeyResult> regenerateAsync(String resourceGroupName, String searchServiceName, AdminKeyKind keyKind) {
        AdminKeysInner client = this.inner();
        return client.regenerateAsync(resourceGroupName, searchServiceName, keyKind)
        .map(new Func1<AdminKeyResultInner, AdminKeyResult>() {
            @Override
            public AdminKeyResult call(AdminKeyResultInner inner) {
                return new AdminKeyResultImpl(inner, manager());
            }
        });
    }

}