/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.scheduler.v2016_03_01.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.scheduler.v2016_03_01.Jobs;
import com.microsoft.azure.management.scheduler.v2016_03_01.JobCollections;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure Scheduler resource management.
 */
public final class SchedulerManager extends ManagerCore<SchedulerManager, SchedulerManagementClientImpl> {
    private Jobs jobs;
    private JobCollections jobCollections;
    /**
    * Get a Configurable instance that can be used to create SchedulerManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new SchedulerManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of SchedulerManager that exposes Scheduler resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the SchedulerManager
    */
    public static SchedulerManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new SchedulerManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of SchedulerManager that exposes Scheduler resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the SchedulerManager
    */
    public static SchedulerManager authenticate(RestClient restClient, String subscriptionId) {
        return new SchedulerManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of SchedulerManager that exposes Scheduler management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing Scheduler management API entry points that work across subscriptions
        */
        SchedulerManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage Jobs.
     */
    public Jobs jobs() {
        if (this.jobs == null) {
            this.jobs = new JobsImpl(this);
        }
        return this.jobs;
    }

    /**
     * @return Entry point to manage JobCollections.
     */
    public JobCollections jobCollections() {
        if (this.jobCollections == null) {
            this.jobCollections = new JobCollectionsImpl(this);
        }
        return this.jobCollections;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public SchedulerManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return SchedulerManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private SchedulerManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new SchedulerManagementClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
