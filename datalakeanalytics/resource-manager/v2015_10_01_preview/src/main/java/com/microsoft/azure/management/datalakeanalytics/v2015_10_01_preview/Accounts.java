/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalakeanalytics.v2015_10_01_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import rx.Completable;
import com.microsoft.azure.management.datalakeanalytics.v2015_10_01_preview.implementation.AccountsInner;
import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.datalakeanalytics.v2015_10_01_preview.StorageAccountInfo;
import com.microsoft.azure.management.datalakeanalytics.v2015_10_01_preview.BlobContainer;
import com.microsoft.azure.management.datalakeanalytics.v2015_10_01_preview.DataLakeStoreAccountInfo;

/**
 * Type representing Accounts.
 */
public interface Accounts extends SupportsCreating<DataLakeAnalyticsAccount.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<DataLakeAnalyticsAccount>, SupportsListingByResourceGroup<DataLakeAnalyticsAccount>, SupportsListing<DataLakeAnalyticsAccount>, HasInner<AccountsInner> {
    /**
     * Updates the specified Data Lake Analytics account to add an Azure Storage account.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account to which to add the Azure Storage account.
     * @param storageAccountName The name of the Azure Storage account to add
     * @param parameters The parameters containing the access key and optional suffix for the Azure Storage Account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable addStorageAccountAsync(String resourceGroupName, String accountName, String storageAccountName, AddStorageAccountParameters parameters);

    /**
     * Updates the specified Data Lake Analytics account to include the additional Data Lake Store account.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account to which to add the Data Lake Store account.
     * @param dataLakeStoreAccountName The name of the Data Lake Store account to add.
     * @param parameters The details of the Data Lake Store account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable addDataLakeStoreAccountAsync(String resourceGroupName, String accountName, String dataLakeStoreAccountName, AddDataLakeStoreParameters parameters);

    /**
     * Gets the specified Azure Storage account linked to the given Data Lake Analytics account.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account from which to retrieve Azure storage account details.
     * @param storageAccountName The name of the Azure Storage account for which to retrieve the details.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<StorageAccountInfo> getStorageAccountAsync(String resourceGroupName, String accountName, String storageAccountName);

    /**
     * Gets the first page of Azure Storage accounts, if any, linked to the specified Data Lake Analytics account. The response includes a link to the next page, if any.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account for which to list Azure Storage accounts.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<StorageAccountInfo> listStorageAccountsAsync(final String resourceGroupName, final String accountName);

    /**
     * Updates the specified Data Lake Analytics account to remove an Azure Storage account.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account from which to remove the Azure Storage account.
     * @param storageAccountName The name of the Azure Storage account to remove
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteStorageAccountAsync(String resourceGroupName, String accountName, String storageAccountName);

    /**
     * Updates the Data Lake Analytics account to replace Azure Storage blob account details, such as the access key and/or suffix.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account to modify storage accounts in
     * @param storageAccountName The Azure Storage account to modify
     * @param parameters The parameters containing the access key and suffix to update the storage account with.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable updateStorageAccountAsync(String resourceGroupName, String accountName, String storageAccountName, AddStorageAccountParameters parameters);

    /**
     * Gets the specified Azure Storage container associated with the given Data Lake Analytics and Azure Storage accounts.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account for which to retrieve blob container.
     * @param storageAccountName The name of the Azure storage account from which to retrieve the blob container.
     * @param containerName The name of the Azure storage container to retrieve
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BlobContainer> getStorageContainerAsync(String resourceGroupName, String accountName, String storageAccountName, String containerName);

    /**
     * Lists the Azure Storage containers, if any, associated with the specified Data Lake Analytics and Azure Storage account combination. The response includes a link to the next page of results, if any.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account for which to list Azure Storage blob containers.
     * @param storageAccountName The name of the Azure storage account from which to list blob containers.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BlobContainer> listStorageContainersAsync(final String resourceGroupName, final String accountName, final String storageAccountName);

    /**
     * Gets the SAS token associated with the specified Data Lake Analytics and Azure Storage account and container combination.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account from which an Azure Storage account's SAS token is being requested.
     * @param storageAccountName The name of the Azure storage account for which the SAS token is being requested.
     * @param containerName The name of the Azure storage container for which the SAS token is being requested.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SasTokenInfo> listSasTokensAsync(final String resourceGroupName, final String accountName, final String storageAccountName, final String containerName);

    /**
     * Gets the specified Data Lake Store account details in the specified Data Lake Analytics account.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account from which to retrieve the Data Lake Store account details.
     * @param dataLakeStoreAccountName The name of the Data Lake Store account to retrieve
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DataLakeStoreAccountInfo> getDataLakeStoreAccountAsync(String resourceGroupName, String accountName, String dataLakeStoreAccountName);

    /**
     * Gets the first page of Data Lake Store accounts linked to the specified Data Lake Analytics account. The response includes a link to the next page, if any.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account for which to list Data Lake Store accounts.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DataLakeStoreAccountInfo> listDataLakeStoreAccountsAsync(final String resourceGroupName, final String accountName);

    /**
     * Updates the Data Lake Analytics account specified to remove the specified Data Lake Store account.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account from which to remove the Data Lake Store account.
     * @param dataLakeStoreAccountName The name of the Data Lake Store account to remove
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteDataLakeStoreAccountAsync(String resourceGroupName, String accountName, String dataLakeStoreAccountName);

}
