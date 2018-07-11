/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.searchmanagementclient.v2015_08_19;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.searchmanagementclient.v2015_08_19.implementation.SearchManager;
import com.microsoft.azure.management.searchmanagementclient.v2015_08_19.implementation.SearchServiceInner;

/**
 * Type representing SearchService.
 */
public interface SearchService extends HasInner<SearchServiceInner>, Resource, GroupableResourceCore<SearchManager, SearchServiceInner>, HasResourceGroup, Refreshable<SearchService>, Updatable<SearchService.Update>, HasManager<SearchManager> {
    /**
     * @return the hostingMode value.
     */
    HostingMode hostingMode();

    /**
     * @return the identity value.
     */
    Identity identity();

    /**
     * @return the partitionCount value.
     */
    Integer partitionCount();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the replicaCount value.
     */
    Integer replicaCount();

    /**
     * @return the sku value.
     */
    Sku sku();

    /**
     * @return the status value.
     */
    SearchServiceStatus status();

    /**
     * @return the statusDetails value.
     */
    String statusDetails();

    /**
     * The entirety of the SearchService definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of SearchService definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a SearchService definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the SearchService definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the searchservice update allowing to specify HostingMode.
         */
        interface WithHostingMode {
            /**
             * Specifies hostingMode.
             */
            WithCreate withHostingMode(HostingMode hostingMode);
        }

        /**
         * The stage of the searchservice update allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             */
            WithCreate withIdentity(Identity identity);
        }

        /**
         * The stage of the searchservice update allowing to specify PartitionCount.
         */
        interface WithPartitionCount {
            /**
             * Specifies partitionCount.
             */
            WithCreate withPartitionCount(Integer partitionCount);
        }

        /**
         * The stage of the searchservice update allowing to specify ReplicaCount.
         */
        interface WithReplicaCount {
            /**
             * Specifies replicaCount.
             */
            WithCreate withReplicaCount(Integer replicaCount);
        }

        /**
         * The stage of the searchservice update allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             */
            WithCreate withSku(Sku sku);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<SearchService>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithHostingMode, DefinitionStages.WithIdentity, DefinitionStages.WithPartitionCount, DefinitionStages.WithReplicaCount, DefinitionStages.WithSku {
        }
    }
    /**
     * The template for a SearchService update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<SearchService>, Resource.UpdateWithTags<Update>, UpdateStages.WithHostingMode, UpdateStages.WithIdentity, UpdateStages.WithPartitionCount, UpdateStages.WithReplicaCount, UpdateStages.WithSku {
    }

    /**
     * Grouping of SearchService update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the searchservice {0} allowing to specify HostingMode.
         */
        interface WithHostingMode {
            /**
             * Specifies hostingMode.
             */
            Update withHostingMode(HostingMode hostingMode);
        }

        /**
         * The stage of the searchservice {0} allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             */
            Update withIdentity(Identity identity);
        }

        /**
         * The stage of the searchservice {0} allowing to specify PartitionCount.
         */
        interface WithPartitionCount {
            /**
             * Specifies partitionCount.
             */
            Update withPartitionCount(Integer partitionCount);
        }

        /**
         * The stage of the searchservice {0} allowing to specify ReplicaCount.
         */
        interface WithReplicaCount {
            /**
             * Specifies replicaCount.
             */
            Update withReplicaCount(Integer replicaCount);
        }

        /**
         * The stage of the searchservice {0} allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             */
            Update withSku(Sku sku);
        }

    }
}
