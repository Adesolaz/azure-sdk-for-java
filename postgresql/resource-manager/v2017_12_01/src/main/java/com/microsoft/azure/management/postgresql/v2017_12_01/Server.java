/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.postgresql.v2017_12_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.postgresql.v2017_12_01.implementation.DBforPostgreSQLManager;
import org.joda.time.DateTime;
import com.microsoft.azure.management.postgresql.v2017_12_01.implementation.ServerInner;

/**
 * Type representing Server.
 */
public interface Server extends HasInner<ServerInner>, Resource, GroupableResourceCore<DBforPostgreSQLManager, ServerInner>, HasResourceGroup, Refreshable<Server>, Updatable<Server.Update>, HasManager<DBforPostgreSQLManager> {
    /**
     * @return the administratorLogin value.
     */
    String administratorLogin();

    /**
     * @return the earliestRestoreDate value.
     */
    DateTime earliestRestoreDate();

    /**
     * @return the fullyQualifiedDomainName value.
     */
    String fullyQualifiedDomainName();

    /**
     * @return the sku value.
     */
    Sku sku();

    /**
     * @return the sslEnforcement value.
     */
    SslEnforcementEnum sslEnforcement();

    /**
     * @return the storageProfile value.
     */
    StorageProfile storageProfile();

    /**
     * @return the userVisibleState value.
     */
    ServerState userVisibleState();

    /**
     * @return the version value.
     */
    ServerVersion version();

    /**
     * The entirety of the Server definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithProperties, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Server definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Server definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the Server definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithProperties> {
        }

        /**
         * The stage of the server definition allowing to specify Properties.
         */
        interface WithProperties {
           /**
            * Specifies properties.
            */
            WithCreate withProperties(ServerPropertiesForCreate properties);
        }

        /**
         * The stage of the server update allowing to specify Sku.
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
        interface WithCreate extends Creatable<Server>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithSku {
        }
    }
    /**
     * The template for a Server update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Server>, Resource.UpdateWithTags<Update>, UpdateStages.WithAdministratorLoginPassword, UpdateStages.WithSku, UpdateStages.WithSslEnforcement, UpdateStages.WithStorageProfile, UpdateStages.WithVersion {
    }

    /**
     * Grouping of Server update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the server {0} allowing to specify AdministratorLoginPassword.
         */
        interface WithAdministratorLoginPassword {
            /**
             * Specifies administratorLoginPassword.
             */
            Update withAdministratorLoginPassword(String administratorLoginPassword);
        }

        /**
         * The stage of the server {0} allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             */
            Update withSku(Sku sku);
        }

        /**
         * The stage of the server {0} allowing to specify SslEnforcement.
         */
        interface WithSslEnforcement {
            /**
             * Specifies sslEnforcement.
             */
            Update withSslEnforcement(SslEnforcementEnum sslEnforcement);
        }

        /**
         * The stage of the server {0} allowing to specify StorageProfile.
         */
        interface WithStorageProfile {
            /**
             * Specifies storageProfile.
             */
            Update withStorageProfile(StorageProfile storageProfile);
        }

        /**
         * The stage of the server {0} allowing to specify Version.
         */
        interface WithVersion {
            /**
             * Specifies version.
             */
            Update withVersion(ServerVersion version);
        }

    }
}
