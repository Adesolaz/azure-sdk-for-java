/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.storage.models;

import com.microsoft.windowsazure.core.LazyArrayList;
import java.net.URI;
import java.util.ArrayList;
import java.util.Calendar;

/**
* Details about a storage account.
*/
public class StorageAccountProperties {
    private String accountType;
    
    /**
    * Optional. Specifies whether the account supports locally-redundant
    * storage, geo-redundant storage, zone-redundant storage, or read access
    * geo-redundant storage. Possible values are:'Standard_LRS',
    * 'Standard_ZRS', 'Standard_GRS', and 'Standard_RAGRS'.
    * @return The AccountType value.
    */
    public String getAccountType() {
        return this.accountType;
    }
    
    /**
    * Optional. Specifies whether the account supports locally-redundant
    * storage, geo-redundant storage, zone-redundant storage, or read access
    * geo-redundant storage. Possible values are:'Standard_LRS',
    * 'Standard_ZRS', 'Standard_GRS', and 'Standard_RAGRS'.
    * @param accountTypeValue The AccountType value.
    */
    public void setAccountType(final String accountTypeValue) {
        this.accountType = accountTypeValue;
    }
    
    private String affinityGroup;
    
    /**
    * Optional. The affinity group with which this storage account is
    * associated.
    * @return The AffinityGroup value.
    */
    public String getAffinityGroup() {
        return this.affinityGroup;
    }
    
    /**
    * Optional. The affinity group with which this storage account is
    * associated.
    * @param affinityGroupValue The AffinityGroup value.
    */
    public void setAffinityGroup(final String affinityGroupValue) {
        this.affinityGroup = affinityGroupValue;
    }
    
    private String description;
    
    /**
    * Optional. The user-supplied description of the storage account.
    * @return The Description value.
    */
    public String getDescription() {
        return this.description;
    }
    
    /**
    * Optional. The user-supplied description of the storage account.
    * @param descriptionValue The Description value.
    */
    public void setDescription(final String descriptionValue) {
        this.description = descriptionValue;
    }
    
    private ArrayList<URI> endpoints;
    
    /**
    * Optional. The URLs that are used to perform a retrieval of a public blob,
    * queue, or table object.
    * @return The Endpoints value.
    */
    public ArrayList<URI> getEndpoints() {
        return this.endpoints;
    }
    
    /**
    * Optional. The URLs that are used to perform a retrieval of a public blob,
    * queue, or table object.
    * @param endpointsValue The Endpoints value.
    */
    public void setEndpoints(final ArrayList<URI> endpointsValue) {
        this.endpoints = endpointsValue;
    }
    
    private String geoPrimaryRegion;
    
    /**
    * Optional. Indicates the primary geographical region in which the storage
    * account exists at this time.
    * @return The GeoPrimaryRegion value.
    */
    public String getGeoPrimaryRegion() {
        return this.geoPrimaryRegion;
    }
    
    /**
    * Optional. Indicates the primary geographical region in which the storage
    * account exists at this time.
    * @param geoPrimaryRegionValue The GeoPrimaryRegion value.
    */
    public void setGeoPrimaryRegion(final String geoPrimaryRegionValue) {
        this.geoPrimaryRegion = geoPrimaryRegionValue;
    }
    
    private String geoSecondaryRegion;
    
    /**
    * Optional. Indicates the geographical region in which the storage account
    * is being replicated. The GeoSecondaryRegion element is not returned if
    * geo-replication is "off" for this account.
    * @return The GeoSecondaryRegion value.
    */
    public String getGeoSecondaryRegion() {
        return this.geoSecondaryRegion;
    }
    
    /**
    * Optional. Indicates the geographical region in which the storage account
    * is being replicated. The GeoSecondaryRegion element is not returned if
    * geo-replication is "off" for this account.
    * @param geoSecondaryRegionValue The GeoSecondaryRegion value.
    */
    public void setGeoSecondaryRegion(final String geoSecondaryRegionValue) {
        this.geoSecondaryRegion = geoSecondaryRegionValue;
    }
    
    private String label;
    
    /**
    * Optional. The user-supplied name of the storage account, returned as a
    * base-64 encoded string. This name can be used identify the storage
    * account for your tracking purposes.
    * @return The Label value.
    */
    public String getLabel() {
        return this.label;
    }
    
    /**
    * Optional. The user-supplied name of the storage account, returned as a
    * base-64 encoded string. This name can be used identify the storage
    * account for your tracking purposes.
    * @param labelValue The Label value.
    */
    public void setLabel(final String labelValue) {
        this.label = labelValue;
    }
    
    private Calendar lastGeoFailoverTime;
    
    /**
    * Optional. A timestamp that indicates the most recent instance of a
    * failover to the secondary region. In the case of multiple failovers,
    * only the latest failover date and time is maintained. The format of the
    * returned timestamp is:
    * [4DigitYear]-[2DigitMonth]-[2DigitDay]T[2DigitMinute]:[2DigitSecond]:[7DigitsOfPrecision]Z.
    * LastGeoFailoverTime is not returned if there has not been an instance of
    * a failover.
    * @return The LastGeoFailoverTime value.
    */
    public Calendar getLastGeoFailoverTime() {
        return this.lastGeoFailoverTime;
    }
    
    /**
    * Optional. A timestamp that indicates the most recent instance of a
    * failover to the secondary region. In the case of multiple failovers,
    * only the latest failover date and time is maintained. The format of the
    * returned timestamp is:
    * [4DigitYear]-[2DigitMonth]-[2DigitDay]T[2DigitMinute]:[2DigitSecond]:[7DigitsOfPrecision]Z.
    * LastGeoFailoverTime is not returned if there has not been an instance of
    * a failover.
    * @param lastGeoFailoverTimeValue The LastGeoFailoverTime value.
    */
    public void setLastGeoFailoverTime(final Calendar lastGeoFailoverTimeValue) {
        this.lastGeoFailoverTime = lastGeoFailoverTimeValue;
    }
    
    private String location;
    
    /**
    * Optional. The geo-location specified when the storage account was
    * created. This property is only returned if the storage account is not
    * associated with an affinity group.
    * @return The Location value.
    */
    public String getLocation() {
        return this.location;
    }
    
    /**
    * Optional. The geo-location specified when the storage account was
    * created. This property is only returned if the storage account is not
    * associated with an affinity group.
    * @param locationValue The Location value.
    */
    public void setLocation(final String locationValue) {
        this.location = locationValue;
    }
    
    private StorageAccountStatus status;
    
    /**
    * Optional. The status of the storage account at the time the operation was
    * called.
    * @return The Status value.
    */
    public StorageAccountStatus getStatus() {
        return this.status;
    }
    
    /**
    * Optional. The status of the storage account at the time the operation was
    * called.
    * @param statusValue The Status value.
    */
    public void setStatus(final StorageAccountStatus statusValue) {
        this.status = statusValue;
    }
    
    private GeoRegionStatus statusOfGeoPrimaryRegion;
    
    /**
    * Optional. Indicates whether the primary storage region is available.
    * @return The StatusOfGeoPrimaryRegion value.
    */
    public GeoRegionStatus getStatusOfGeoPrimaryRegion() {
        return this.statusOfGeoPrimaryRegion;
    }
    
    /**
    * Optional. Indicates whether the primary storage region is available.
    * @param statusOfGeoPrimaryRegionValue The StatusOfGeoPrimaryRegion value.
    */
    public void setStatusOfGeoPrimaryRegion(final GeoRegionStatus statusOfGeoPrimaryRegionValue) {
        this.statusOfGeoPrimaryRegion = statusOfGeoPrimaryRegionValue;
    }
    
    private GeoRegionStatus statusOfGeoSecondaryRegion;
    
    /**
    * Optional. Indicates whether the secondary storage region is available.
    * @return The StatusOfGeoSecondaryRegion value.
    */
    public GeoRegionStatus getStatusOfGeoSecondaryRegion() {
        return this.statusOfGeoSecondaryRegion;
    }
    
    /**
    * Optional. Indicates whether the secondary storage region is available.
    * @param statusOfGeoSecondaryRegionValue The StatusOfGeoSecondaryRegion
    * value.
    */
    public void setStatusOfGeoSecondaryRegion(final GeoRegionStatus statusOfGeoSecondaryRegionValue) {
        this.statusOfGeoSecondaryRegion = statusOfGeoSecondaryRegionValue;
    }
    
    /**
    * Initializes a new instance of the StorageAccountProperties class.
    *
    */
    public StorageAccountProperties() {
        this.setEndpoints(new LazyArrayList<URI>());
    }
}