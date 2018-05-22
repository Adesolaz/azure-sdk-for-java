/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_04_01.implementation;

import com.microsoft.azure.management.network.v2018_04_01.ExpressRoutePeeringType;
import com.microsoft.azure.management.network.v2018_04_01.ExpressRoutePeeringState;
import com.microsoft.azure.management.network.v2018_04_01.ExpressRouteCircuitPeeringConfig;
import com.microsoft.azure.management.network.v2018_04_01.Ipv6ExpressRouteCircuitPeeringConfig;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.SubResource;

/**
 * Peering in an ExpressRouteCircuit resource.
 */
@JsonFlatten
public class ExpressRouteCircuitPeeringInner extends SubResource {
    /**
     * The peering type. Possible values include: 'AzurePublicPeering',
     * 'AzurePrivatePeering', 'MicrosoftPeering'.
     */
    @JsonProperty(value = "properties.peeringType")
    private ExpressRoutePeeringType peeringType;

    /**
     * The peering state. Possible values include: 'Disabled', 'Enabled'.
     */
    @JsonProperty(value = "properties.state")
    private ExpressRoutePeeringState state;

    /**
     * The Azure ASN.
     */
    @JsonProperty(value = "properties.azureASN")
    private Integer azureASN;

    /**
     * The peer ASN.
     */
    @JsonProperty(value = "properties.peerASN")
    private Long peerASN;

    /**
     * The primary address prefix.
     */
    @JsonProperty(value = "properties.primaryPeerAddressPrefix")
    private String primaryPeerAddressPrefix;

    /**
     * The secondary address prefix.
     */
    @JsonProperty(value = "properties.secondaryPeerAddressPrefix")
    private String secondaryPeerAddressPrefix;

    /**
     * The primary port.
     */
    @JsonProperty(value = "properties.primaryAzurePort")
    private String primaryAzurePort;

    /**
     * The secondary port.
     */
    @JsonProperty(value = "properties.secondaryAzurePort")
    private String secondaryAzurePort;

    /**
     * The shared key.
     */
    @JsonProperty(value = "properties.sharedKey")
    private String sharedKey;

    /**
     * The VLAN ID.
     */
    @JsonProperty(value = "properties.vlanId")
    private Integer vlanId;

    /**
     * The Microsoft peering configuration.
     */
    @JsonProperty(value = "properties.microsoftPeeringConfig")
    private ExpressRouteCircuitPeeringConfig microsoftPeeringConfig;

    /**
     * Gets peering stats.
     */
    @JsonProperty(value = "properties.stats")
    private ExpressRouteCircuitStatsInner stats;

    /**
     * Gets the provisioning state of the public IP resource. Possible values
     * are: 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * The GatewayManager Etag.
     */
    @JsonProperty(value = "properties.gatewayManagerEtag")
    private String gatewayManagerEtag;

    /**
     * Gets whether the provider or the customer last modified the peering.
     */
    @JsonProperty(value = "properties.lastModifiedBy")
    private String lastModifiedBy;

    /**
     * The reference of the RouteFilter resource.
     */
    @JsonProperty(value = "properties.routeFilter")
    private RouteFilterInner routeFilter;

    /**
     * The IPv6 peering configuration.
     */
    @JsonProperty(value = "properties.ipv6PeeringConfig")
    private Ipv6ExpressRouteCircuitPeeringConfig ipv6PeeringConfig;

    /**
     * The list of circuit connections associated with Azure Private Peering
     * for this circuit.
     */
    @JsonProperty(value = "properties.connections")
    private List<ExpressRouteCircuitConnectionInner> connections;

    /**
     * Gets name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Get the peeringType value.
     *
     * @return the peeringType value
     */
    public ExpressRoutePeeringType peeringType() {
        return this.peeringType;
    }

    /**
     * Set the peeringType value.
     *
     * @param peeringType the peeringType value to set
     * @return the ExpressRouteCircuitPeeringInner object itself.
     */
    public ExpressRouteCircuitPeeringInner withPeeringType(ExpressRoutePeeringType peeringType) {
        this.peeringType = peeringType;
        return this;
    }

    /**
     * Get the state value.
     *
     * @return the state value
     */
    public ExpressRoutePeeringState state() {
        return this.state;
    }

    /**
     * Set the state value.
     *
     * @param state the state value to set
     * @return the ExpressRouteCircuitPeeringInner object itself.
     */
    public ExpressRouteCircuitPeeringInner withState(ExpressRoutePeeringState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the azureASN value.
     *
     * @return the azureASN value
     */
    public Integer azureASN() {
        return this.azureASN;
    }

    /**
     * Set the azureASN value.
     *
     * @param azureASN the azureASN value to set
     * @return the ExpressRouteCircuitPeeringInner object itself.
     */
    public ExpressRouteCircuitPeeringInner withAzureASN(Integer azureASN) {
        this.azureASN = azureASN;
        return this;
    }

    /**
     * Get the peerASN value.
     *
     * @return the peerASN value
     */
    public Long peerASN() {
        return this.peerASN;
    }

    /**
     * Set the peerASN value.
     *
     * @param peerASN the peerASN value to set
     * @return the ExpressRouteCircuitPeeringInner object itself.
     */
    public ExpressRouteCircuitPeeringInner withPeerASN(Long peerASN) {
        this.peerASN = peerASN;
        return this;
    }

    /**
     * Get the primaryPeerAddressPrefix value.
     *
     * @return the primaryPeerAddressPrefix value
     */
    public String primaryPeerAddressPrefix() {
        return this.primaryPeerAddressPrefix;
    }

    /**
     * Set the primaryPeerAddressPrefix value.
     *
     * @param primaryPeerAddressPrefix the primaryPeerAddressPrefix value to set
     * @return the ExpressRouteCircuitPeeringInner object itself.
     */
    public ExpressRouteCircuitPeeringInner withPrimaryPeerAddressPrefix(String primaryPeerAddressPrefix) {
        this.primaryPeerAddressPrefix = primaryPeerAddressPrefix;
        return this;
    }

    /**
     * Get the secondaryPeerAddressPrefix value.
     *
     * @return the secondaryPeerAddressPrefix value
     */
    public String secondaryPeerAddressPrefix() {
        return this.secondaryPeerAddressPrefix;
    }

    /**
     * Set the secondaryPeerAddressPrefix value.
     *
     * @param secondaryPeerAddressPrefix the secondaryPeerAddressPrefix value to set
     * @return the ExpressRouteCircuitPeeringInner object itself.
     */
    public ExpressRouteCircuitPeeringInner withSecondaryPeerAddressPrefix(String secondaryPeerAddressPrefix) {
        this.secondaryPeerAddressPrefix = secondaryPeerAddressPrefix;
        return this;
    }

    /**
     * Get the primaryAzurePort value.
     *
     * @return the primaryAzurePort value
     */
    public String primaryAzurePort() {
        return this.primaryAzurePort;
    }

    /**
     * Set the primaryAzurePort value.
     *
     * @param primaryAzurePort the primaryAzurePort value to set
     * @return the ExpressRouteCircuitPeeringInner object itself.
     */
    public ExpressRouteCircuitPeeringInner withPrimaryAzurePort(String primaryAzurePort) {
        this.primaryAzurePort = primaryAzurePort;
        return this;
    }

    /**
     * Get the secondaryAzurePort value.
     *
     * @return the secondaryAzurePort value
     */
    public String secondaryAzurePort() {
        return this.secondaryAzurePort;
    }

    /**
     * Set the secondaryAzurePort value.
     *
     * @param secondaryAzurePort the secondaryAzurePort value to set
     * @return the ExpressRouteCircuitPeeringInner object itself.
     */
    public ExpressRouteCircuitPeeringInner withSecondaryAzurePort(String secondaryAzurePort) {
        this.secondaryAzurePort = secondaryAzurePort;
        return this;
    }

    /**
     * Get the sharedKey value.
     *
     * @return the sharedKey value
     */
    public String sharedKey() {
        return this.sharedKey;
    }

    /**
     * Set the sharedKey value.
     *
     * @param sharedKey the sharedKey value to set
     * @return the ExpressRouteCircuitPeeringInner object itself.
     */
    public ExpressRouteCircuitPeeringInner withSharedKey(String sharedKey) {
        this.sharedKey = sharedKey;
        return this;
    }

    /**
     * Get the vlanId value.
     *
     * @return the vlanId value
     */
    public Integer vlanId() {
        return this.vlanId;
    }

    /**
     * Set the vlanId value.
     *
     * @param vlanId the vlanId value to set
     * @return the ExpressRouteCircuitPeeringInner object itself.
     */
    public ExpressRouteCircuitPeeringInner withVlanId(Integer vlanId) {
        this.vlanId = vlanId;
        return this;
    }

    /**
     * Get the microsoftPeeringConfig value.
     *
     * @return the microsoftPeeringConfig value
     */
    public ExpressRouteCircuitPeeringConfig microsoftPeeringConfig() {
        return this.microsoftPeeringConfig;
    }

    /**
     * Set the microsoftPeeringConfig value.
     *
     * @param microsoftPeeringConfig the microsoftPeeringConfig value to set
     * @return the ExpressRouteCircuitPeeringInner object itself.
     */
    public ExpressRouteCircuitPeeringInner withMicrosoftPeeringConfig(ExpressRouteCircuitPeeringConfig microsoftPeeringConfig) {
        this.microsoftPeeringConfig = microsoftPeeringConfig;
        return this;
    }

    /**
     * Get the stats value.
     *
     * @return the stats value
     */
    public ExpressRouteCircuitStatsInner stats() {
        return this.stats;
    }

    /**
     * Set the stats value.
     *
     * @param stats the stats value to set
     * @return the ExpressRouteCircuitPeeringInner object itself.
     */
    public ExpressRouteCircuitPeeringInner withStats(ExpressRouteCircuitStatsInner stats) {
        this.stats = stats;
        return this;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState value.
     *
     * @param provisioningState the provisioningState value to set
     * @return the ExpressRouteCircuitPeeringInner object itself.
     */
    public ExpressRouteCircuitPeeringInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the gatewayManagerEtag value.
     *
     * @return the gatewayManagerEtag value
     */
    public String gatewayManagerEtag() {
        return this.gatewayManagerEtag;
    }

    /**
     * Set the gatewayManagerEtag value.
     *
     * @param gatewayManagerEtag the gatewayManagerEtag value to set
     * @return the ExpressRouteCircuitPeeringInner object itself.
     */
    public ExpressRouteCircuitPeeringInner withGatewayManagerEtag(String gatewayManagerEtag) {
        this.gatewayManagerEtag = gatewayManagerEtag;
        return this;
    }

    /**
     * Get the lastModifiedBy value.
     *
     * @return the lastModifiedBy value
     */
    public String lastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * Set the lastModifiedBy value.
     *
     * @param lastModifiedBy the lastModifiedBy value to set
     * @return the ExpressRouteCircuitPeeringInner object itself.
     */
    public ExpressRouteCircuitPeeringInner withLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     * Get the routeFilter value.
     *
     * @return the routeFilter value
     */
    public RouteFilterInner routeFilter() {
        return this.routeFilter;
    }

    /**
     * Set the routeFilter value.
     *
     * @param routeFilter the routeFilter value to set
     * @return the ExpressRouteCircuitPeeringInner object itself.
     */
    public ExpressRouteCircuitPeeringInner withRouteFilter(RouteFilterInner routeFilter) {
        this.routeFilter = routeFilter;
        return this;
    }

    /**
     * Get the ipv6PeeringConfig value.
     *
     * @return the ipv6PeeringConfig value
     */
    public Ipv6ExpressRouteCircuitPeeringConfig ipv6PeeringConfig() {
        return this.ipv6PeeringConfig;
    }

    /**
     * Set the ipv6PeeringConfig value.
     *
     * @param ipv6PeeringConfig the ipv6PeeringConfig value to set
     * @return the ExpressRouteCircuitPeeringInner object itself.
     */
    public ExpressRouteCircuitPeeringInner withIpv6PeeringConfig(Ipv6ExpressRouteCircuitPeeringConfig ipv6PeeringConfig) {
        this.ipv6PeeringConfig = ipv6PeeringConfig;
        return this;
    }

    /**
     * Get the connections value.
     *
     * @return the connections value
     */
    public List<ExpressRouteCircuitConnectionInner> connections() {
        return this.connections;
    }

    /**
     * Set the connections value.
     *
     * @param connections the connections value to set
     * @return the ExpressRouteCircuitPeeringInner object itself.
     */
    public ExpressRouteCircuitPeeringInner withConnections(List<ExpressRouteCircuitConnectionInner> connections) {
        this.connections = connections;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the ExpressRouteCircuitPeeringInner object itself.
     */
    public ExpressRouteCircuitPeeringInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag value.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

}
