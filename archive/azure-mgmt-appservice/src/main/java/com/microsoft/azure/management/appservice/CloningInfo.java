/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information needed for cloning operation.
 */
public class CloningInfo {
    /**
     * Correlation ID of cloning operation. This ID ties multiple cloning
     * operations
     * together to use the same snapshot.
     */
    @JsonProperty(value = "correlationId")
    private String correlationId;

    /**
     * &lt;code&gt;true&lt;/code&gt; to overwrite destination app; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "overwrite")
    private Boolean overwrite;

    /**
     * &lt;code&gt;true&lt;/code&gt; to clone custom hostnames from source app;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "cloneCustomHostNames")
    private Boolean cloneCustomHostNames;

    /**
     * &lt;code&gt;true&lt;/code&gt; to clone source control from source app;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "cloneSourceControl")
    private Boolean cloneSourceControl;

    /**
     * ARM resource ID of the source app. App resource ID is of the form
     * /subscriptions/{subId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{siteName}
     * for production slots and
     * /subscriptions/{subId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{siteName}/slots/{slotName}
     * for other slots.
     */
    @JsonProperty(value = "sourceWebAppId", required = true)
    private String sourceWebAppId;

    /**
     * App Service Environment.
     */
    @JsonProperty(value = "hostingEnvironment")
    private String hostingEnvironment;

    /**
     * Application setting overrides for cloned app. If specified, these
     * settings override the settings cloned
     * from source app. Otherwise, application settings from source app are
     * retained.
     */
    @JsonProperty(value = "appSettingsOverrides")
    private Map<String, String> appSettingsOverrides;

    /**
     * &lt;code&gt;true&lt;/code&gt; to configure load balancing for source and
     * destination app.
     */
    @JsonProperty(value = "configureLoadBalancing")
    private Boolean configureLoadBalancing;

    /**
     * ARM resource ID of the Traffic Manager profile to use, if it exists.
     * Traffic Manager resource ID is of the form
     * /subscriptions/{subId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/trafficManagerProfiles/{profileName}.
     */
    @JsonProperty(value = "trafficManagerProfileId")
    private String trafficManagerProfileId;

    /**
     * Name of Traffic Manager profile to create. This is only needed if
     * Traffic Manager profile does not already exist.
     */
    @JsonProperty(value = "trafficManagerProfileName")
    private String trafficManagerProfileName;

    /**
     * &lt;code&gt;true&lt;/code&gt; if quotas should be ignored; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "ignoreQuotas")
    private Boolean ignoreQuotas;

    /**
     * Get the correlationId value.
     *
     * @return the correlationId value
     */
    public String correlationId() {
        return this.correlationId;
    }

    /**
     * Set the correlationId value.
     *
     * @param correlationId the correlationId value to set
     * @return the CloningInfo object itself.
     */
    public CloningInfo withCorrelationId(String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     * Get the overwrite value.
     *
     * @return the overwrite value
     */
    public Boolean overwrite() {
        return this.overwrite;
    }

    /**
     * Set the overwrite value.
     *
     * @param overwrite the overwrite value to set
     * @return the CloningInfo object itself.
     */
    public CloningInfo withOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
        return this;
    }

    /**
     * Get the cloneCustomHostNames value.
     *
     * @return the cloneCustomHostNames value
     */
    public Boolean cloneCustomHostNames() {
        return this.cloneCustomHostNames;
    }

    /**
     * Set the cloneCustomHostNames value.
     *
     * @param cloneCustomHostNames the cloneCustomHostNames value to set
     * @return the CloningInfo object itself.
     */
    public CloningInfo withCloneCustomHostNames(Boolean cloneCustomHostNames) {
        this.cloneCustomHostNames = cloneCustomHostNames;
        return this;
    }

    /**
     * Get the cloneSourceControl value.
     *
     * @return the cloneSourceControl value
     */
    public Boolean cloneSourceControl() {
        return this.cloneSourceControl;
    }

    /**
     * Set the cloneSourceControl value.
     *
     * @param cloneSourceControl the cloneSourceControl value to set
     * @return the CloningInfo object itself.
     */
    public CloningInfo withCloneSourceControl(Boolean cloneSourceControl) {
        this.cloneSourceControl = cloneSourceControl;
        return this;
    }

    /**
     * Get the sourceWebAppId value.
     *
     * @return the sourceWebAppId value
     */
    public String sourceWebAppId() {
        return this.sourceWebAppId;
    }

    /**
     * Set the sourceWebAppId value.
     *
     * @param sourceWebAppId the sourceWebAppId value to set
     * @return the CloningInfo object itself.
     */
    public CloningInfo withSourceWebAppId(String sourceWebAppId) {
        this.sourceWebAppId = sourceWebAppId;
        return this;
    }

    /**
     * Get the hostingEnvironment value.
     *
     * @return the hostingEnvironment value
     */
    public String hostingEnvironment() {
        return this.hostingEnvironment;
    }

    /**
     * Set the hostingEnvironment value.
     *
     * @param hostingEnvironment the hostingEnvironment value to set
     * @return the CloningInfo object itself.
     */
    public CloningInfo withHostingEnvironment(String hostingEnvironment) {
        this.hostingEnvironment = hostingEnvironment;
        return this;
    }

    /**
     * Get the appSettingsOverrides value.
     *
     * @return the appSettingsOverrides value
     */
    public Map<String, String> appSettingsOverrides() {
        return this.appSettingsOverrides;
    }

    /**
     * Set the appSettingsOverrides value.
     *
     * @param appSettingsOverrides the appSettingsOverrides value to set
     * @return the CloningInfo object itself.
     */
    public CloningInfo withAppSettingsOverrides(Map<String, String> appSettingsOverrides) {
        this.appSettingsOverrides = appSettingsOverrides;
        return this;
    }

    /**
     * Get the configureLoadBalancing value.
     *
     * @return the configureLoadBalancing value
     */
    public Boolean configureLoadBalancing() {
        return this.configureLoadBalancing;
    }

    /**
     * Set the configureLoadBalancing value.
     *
     * @param configureLoadBalancing the configureLoadBalancing value to set
     * @return the CloningInfo object itself.
     */
    public CloningInfo withConfigureLoadBalancing(Boolean configureLoadBalancing) {
        this.configureLoadBalancing = configureLoadBalancing;
        return this;
    }

    /**
     * Get the trafficManagerProfileId value.
     *
     * @return the trafficManagerProfileId value
     */
    public String trafficManagerProfileId() {
        return this.trafficManagerProfileId;
    }

    /**
     * Set the trafficManagerProfileId value.
     *
     * @param trafficManagerProfileId the trafficManagerProfileId value to set
     * @return the CloningInfo object itself.
     */
    public CloningInfo withTrafficManagerProfileId(String trafficManagerProfileId) {
        this.trafficManagerProfileId = trafficManagerProfileId;
        return this;
    }

    /**
     * Get the trafficManagerProfileName value.
     *
     * @return the trafficManagerProfileName value
     */
    public String trafficManagerProfileName() {
        return this.trafficManagerProfileName;
    }

    /**
     * Set the trafficManagerProfileName value.
     *
     * @param trafficManagerProfileName the trafficManagerProfileName value to set
     * @return the CloningInfo object itself.
     */
    public CloningInfo withTrafficManagerProfileName(String trafficManagerProfileName) {
        this.trafficManagerProfileName = trafficManagerProfileName;
        return this;
    }

    /**
     * Get the ignoreQuotas value.
     *
     * @return the ignoreQuotas value
     */
    public Boolean ignoreQuotas() {
        return this.ignoreQuotas;
    }

    /**
     * Set the ignoreQuotas value.
     *
     * @param ignoreQuotas the ignoreQuotas value to set
     * @return the CloningInfo object itself.
     */
    public CloningInfo withIgnoreQuotas(Boolean ignoreQuotas) {
        this.ignoreQuotas = ignoreQuotas;
        return this;
    }

}
