package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties   {

    private ConfigNodePropertyArray resourceResolverSearchpath;
    private ConfigNodePropertyBoolean resourceResolverManglenamespaces;
    private ConfigNodePropertyBoolean resourceResolverAllowDirect;
    private ConfigNodePropertyArray resourceResolverRequiredProviders;
    private ConfigNodePropertyArray resourceResolverRequiredProvidernames;
    private ConfigNodePropertyArray resourceResolverVirtual;
    private ConfigNodePropertyArray resourceResolverMapping;
    private ConfigNodePropertyString resourceResolverMapLocation;
    private ConfigNodePropertyArray resourceResolverMapObservation;
    private ConfigNodePropertyInteger resourceResolverDefaultVanityRedirectStatus;
    private ConfigNodePropertyBoolean resourceResolverEnableVanitypath;
    private ConfigNodePropertyInteger resourceResolverVanitypathMaxEntries;
    private ConfigNodePropertyBoolean resourceResolverVanitypathMaxEntriesStartup;
    private ConfigNodePropertyInteger resourceResolverVanitypathBloomfilterMaxBytes;
    private ConfigNodePropertyBoolean resourceResolverOptimizeAliasResolution;
    private ConfigNodePropertyArray resourceResolverVanitypathWhitelist;
    private ConfigNodePropertyArray resourceResolverVanitypathBlacklist;
    private ConfigNodePropertyBoolean resourceResolverVanityPrecedence;
    private ConfigNodePropertyBoolean resourceResolverProviderhandlingParanoid;
    private ConfigNodePropertyBoolean resourceResolverLogClosing;
    private ConfigNodePropertyBoolean resourceResolverLogUnclosed;

    /**
     * Default constructor.
     */
    public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.
     *
     * @param resourceResolverSearchpath resourceResolverSearchpath
     * @param resourceResolverManglenamespaces resourceResolverManglenamespaces
     * @param resourceResolverAllowDirect resourceResolverAllowDirect
     * @param resourceResolverRequiredProviders resourceResolverRequiredProviders
     * @param resourceResolverRequiredProvidernames resourceResolverRequiredProvidernames
     * @param resourceResolverVirtual resourceResolverVirtual
     * @param resourceResolverMapping resourceResolverMapping
     * @param resourceResolverMapLocation resourceResolverMapLocation
     * @param resourceResolverMapObservation resourceResolverMapObservation
     * @param resourceResolverDefaultVanityRedirectStatus resourceResolverDefaultVanityRedirectStatus
     * @param resourceResolverEnableVanitypath resourceResolverEnableVanitypath
     * @param resourceResolverVanitypathMaxEntries resourceResolverVanitypathMaxEntries
     * @param resourceResolverVanitypathMaxEntriesStartup resourceResolverVanitypathMaxEntriesStartup
     * @param resourceResolverVanitypathBloomfilterMaxBytes resourceResolverVanitypathBloomfilterMaxBytes
     * @param resourceResolverOptimizeAliasResolution resourceResolverOptimizeAliasResolution
     * @param resourceResolverVanitypathWhitelist resourceResolverVanitypathWhitelist
     * @param resourceResolverVanitypathBlacklist resourceResolverVanitypathBlacklist
     * @param resourceResolverVanityPrecedence resourceResolverVanityPrecedence
     * @param resourceResolverProviderhandlingParanoid resourceResolverProviderhandlingParanoid
     * @param resourceResolverLogClosing resourceResolverLogClosing
     * @param resourceResolverLogUnclosed resourceResolverLogUnclosed
     */
    public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties(
        ConfigNodePropertyArray resourceResolverSearchpath, 
        ConfigNodePropertyBoolean resourceResolverManglenamespaces, 
        ConfigNodePropertyBoolean resourceResolverAllowDirect, 
        ConfigNodePropertyArray resourceResolverRequiredProviders, 
        ConfigNodePropertyArray resourceResolverRequiredProvidernames, 
        ConfigNodePropertyArray resourceResolverVirtual, 
        ConfigNodePropertyArray resourceResolverMapping, 
        ConfigNodePropertyString resourceResolverMapLocation, 
        ConfigNodePropertyArray resourceResolverMapObservation, 
        ConfigNodePropertyInteger resourceResolverDefaultVanityRedirectStatus, 
        ConfigNodePropertyBoolean resourceResolverEnableVanitypath, 
        ConfigNodePropertyInteger resourceResolverVanitypathMaxEntries, 
        ConfigNodePropertyBoolean resourceResolverVanitypathMaxEntriesStartup, 
        ConfigNodePropertyInteger resourceResolverVanitypathBloomfilterMaxBytes, 
        ConfigNodePropertyBoolean resourceResolverOptimizeAliasResolution, 
        ConfigNodePropertyArray resourceResolverVanitypathWhitelist, 
        ConfigNodePropertyArray resourceResolverVanitypathBlacklist, 
        ConfigNodePropertyBoolean resourceResolverVanityPrecedence, 
        ConfigNodePropertyBoolean resourceResolverProviderhandlingParanoid, 
        ConfigNodePropertyBoolean resourceResolverLogClosing, 
        ConfigNodePropertyBoolean resourceResolverLogUnclosed
    ) {
        this.resourceResolverSearchpath = resourceResolverSearchpath;
        this.resourceResolverManglenamespaces = resourceResolverManglenamespaces;
        this.resourceResolverAllowDirect = resourceResolverAllowDirect;
        this.resourceResolverRequiredProviders = resourceResolverRequiredProviders;
        this.resourceResolverRequiredProvidernames = resourceResolverRequiredProvidernames;
        this.resourceResolverVirtual = resourceResolverVirtual;
        this.resourceResolverMapping = resourceResolverMapping;
        this.resourceResolverMapLocation = resourceResolverMapLocation;
        this.resourceResolverMapObservation = resourceResolverMapObservation;
        this.resourceResolverDefaultVanityRedirectStatus = resourceResolverDefaultVanityRedirectStatus;
        this.resourceResolverEnableVanitypath = resourceResolverEnableVanitypath;
        this.resourceResolverVanitypathMaxEntries = resourceResolverVanitypathMaxEntries;
        this.resourceResolverVanitypathMaxEntriesStartup = resourceResolverVanitypathMaxEntriesStartup;
        this.resourceResolverVanitypathBloomfilterMaxBytes = resourceResolverVanitypathBloomfilterMaxBytes;
        this.resourceResolverOptimizeAliasResolution = resourceResolverOptimizeAliasResolution;
        this.resourceResolverVanitypathWhitelist = resourceResolverVanitypathWhitelist;
        this.resourceResolverVanitypathBlacklist = resourceResolverVanitypathBlacklist;
        this.resourceResolverVanityPrecedence = resourceResolverVanityPrecedence;
        this.resourceResolverProviderhandlingParanoid = resourceResolverProviderhandlingParanoid;
        this.resourceResolverLogClosing = resourceResolverLogClosing;
        this.resourceResolverLogUnclosed = resourceResolverLogUnclosed;
    }



    /**
     * Get resourceResolverSearchpath
     * @return resourceResolverSearchpath
     */
    public ConfigNodePropertyArray getResourceResolverSearchpath() {
        return resourceResolverSearchpath;
    }

    public void setResourceResolverSearchpath(ConfigNodePropertyArray resourceResolverSearchpath) {
        this.resourceResolverSearchpath = resourceResolverSearchpath;
    }

    /**
     * Get resourceResolverManglenamespaces
     * @return resourceResolverManglenamespaces
     */
    public ConfigNodePropertyBoolean getResourceResolverManglenamespaces() {
        return resourceResolverManglenamespaces;
    }

    public void setResourceResolverManglenamespaces(ConfigNodePropertyBoolean resourceResolverManglenamespaces) {
        this.resourceResolverManglenamespaces = resourceResolverManglenamespaces;
    }

    /**
     * Get resourceResolverAllowDirect
     * @return resourceResolverAllowDirect
     */
    public ConfigNodePropertyBoolean getResourceResolverAllowDirect() {
        return resourceResolverAllowDirect;
    }

    public void setResourceResolverAllowDirect(ConfigNodePropertyBoolean resourceResolverAllowDirect) {
        this.resourceResolverAllowDirect = resourceResolverAllowDirect;
    }

    /**
     * Get resourceResolverRequiredProviders
     * @return resourceResolverRequiredProviders
     */
    public ConfigNodePropertyArray getResourceResolverRequiredProviders() {
        return resourceResolverRequiredProviders;
    }

    public void setResourceResolverRequiredProviders(ConfigNodePropertyArray resourceResolverRequiredProviders) {
        this.resourceResolverRequiredProviders = resourceResolverRequiredProviders;
    }

    /**
     * Get resourceResolverRequiredProvidernames
     * @return resourceResolverRequiredProvidernames
     */
    public ConfigNodePropertyArray getResourceResolverRequiredProvidernames() {
        return resourceResolverRequiredProvidernames;
    }

    public void setResourceResolverRequiredProvidernames(ConfigNodePropertyArray resourceResolverRequiredProvidernames) {
        this.resourceResolverRequiredProvidernames = resourceResolverRequiredProvidernames;
    }

    /**
     * Get resourceResolverVirtual
     * @return resourceResolverVirtual
     */
    public ConfigNodePropertyArray getResourceResolverVirtual() {
        return resourceResolverVirtual;
    }

    public void setResourceResolverVirtual(ConfigNodePropertyArray resourceResolverVirtual) {
        this.resourceResolverVirtual = resourceResolverVirtual;
    }

    /**
     * Get resourceResolverMapping
     * @return resourceResolverMapping
     */
    public ConfigNodePropertyArray getResourceResolverMapping() {
        return resourceResolverMapping;
    }

    public void setResourceResolverMapping(ConfigNodePropertyArray resourceResolverMapping) {
        this.resourceResolverMapping = resourceResolverMapping;
    }

    /**
     * Get resourceResolverMapLocation
     * @return resourceResolverMapLocation
     */
    public ConfigNodePropertyString getResourceResolverMapLocation() {
        return resourceResolverMapLocation;
    }

    public void setResourceResolverMapLocation(ConfigNodePropertyString resourceResolverMapLocation) {
        this.resourceResolverMapLocation = resourceResolverMapLocation;
    }

    /**
     * Get resourceResolverMapObservation
     * @return resourceResolverMapObservation
     */
    public ConfigNodePropertyArray getResourceResolverMapObservation() {
        return resourceResolverMapObservation;
    }

    public void setResourceResolverMapObservation(ConfigNodePropertyArray resourceResolverMapObservation) {
        this.resourceResolverMapObservation = resourceResolverMapObservation;
    }

    /**
     * Get resourceResolverDefaultVanityRedirectStatus
     * @return resourceResolverDefaultVanityRedirectStatus
     */
    public ConfigNodePropertyInteger getResourceResolverDefaultVanityRedirectStatus() {
        return resourceResolverDefaultVanityRedirectStatus;
    }

    public void setResourceResolverDefaultVanityRedirectStatus(ConfigNodePropertyInteger resourceResolverDefaultVanityRedirectStatus) {
        this.resourceResolverDefaultVanityRedirectStatus = resourceResolverDefaultVanityRedirectStatus;
    }

    /**
     * Get resourceResolverEnableVanitypath
     * @return resourceResolverEnableVanitypath
     */
    public ConfigNodePropertyBoolean getResourceResolverEnableVanitypath() {
        return resourceResolverEnableVanitypath;
    }

    public void setResourceResolverEnableVanitypath(ConfigNodePropertyBoolean resourceResolverEnableVanitypath) {
        this.resourceResolverEnableVanitypath = resourceResolverEnableVanitypath;
    }

    /**
     * Get resourceResolverVanitypathMaxEntries
     * @return resourceResolverVanitypathMaxEntries
     */
    public ConfigNodePropertyInteger getResourceResolverVanitypathMaxEntries() {
        return resourceResolverVanitypathMaxEntries;
    }

    public void setResourceResolverVanitypathMaxEntries(ConfigNodePropertyInteger resourceResolverVanitypathMaxEntries) {
        this.resourceResolverVanitypathMaxEntries = resourceResolverVanitypathMaxEntries;
    }

    /**
     * Get resourceResolverVanitypathMaxEntriesStartup
     * @return resourceResolverVanitypathMaxEntriesStartup
     */
    public ConfigNodePropertyBoolean getResourceResolverVanitypathMaxEntriesStartup() {
        return resourceResolverVanitypathMaxEntriesStartup;
    }

    public void setResourceResolverVanitypathMaxEntriesStartup(ConfigNodePropertyBoolean resourceResolverVanitypathMaxEntriesStartup) {
        this.resourceResolverVanitypathMaxEntriesStartup = resourceResolverVanitypathMaxEntriesStartup;
    }

    /**
     * Get resourceResolverVanitypathBloomfilterMaxBytes
     * @return resourceResolverVanitypathBloomfilterMaxBytes
     */
    public ConfigNodePropertyInteger getResourceResolverVanitypathBloomfilterMaxBytes() {
        return resourceResolverVanitypathBloomfilterMaxBytes;
    }

    public void setResourceResolverVanitypathBloomfilterMaxBytes(ConfigNodePropertyInteger resourceResolverVanitypathBloomfilterMaxBytes) {
        this.resourceResolverVanitypathBloomfilterMaxBytes = resourceResolverVanitypathBloomfilterMaxBytes;
    }

    /**
     * Get resourceResolverOptimizeAliasResolution
     * @return resourceResolverOptimizeAliasResolution
     */
    public ConfigNodePropertyBoolean getResourceResolverOptimizeAliasResolution() {
        return resourceResolverOptimizeAliasResolution;
    }

    public void setResourceResolverOptimizeAliasResolution(ConfigNodePropertyBoolean resourceResolverOptimizeAliasResolution) {
        this.resourceResolverOptimizeAliasResolution = resourceResolverOptimizeAliasResolution;
    }

    /**
     * Get resourceResolverVanitypathWhitelist
     * @return resourceResolverVanitypathWhitelist
     */
    public ConfigNodePropertyArray getResourceResolverVanitypathWhitelist() {
        return resourceResolverVanitypathWhitelist;
    }

    public void setResourceResolverVanitypathWhitelist(ConfigNodePropertyArray resourceResolverVanitypathWhitelist) {
        this.resourceResolverVanitypathWhitelist = resourceResolverVanitypathWhitelist;
    }

    /**
     * Get resourceResolverVanitypathBlacklist
     * @return resourceResolverVanitypathBlacklist
     */
    public ConfigNodePropertyArray getResourceResolverVanitypathBlacklist() {
        return resourceResolverVanitypathBlacklist;
    }

    public void setResourceResolverVanitypathBlacklist(ConfigNodePropertyArray resourceResolverVanitypathBlacklist) {
        this.resourceResolverVanitypathBlacklist = resourceResolverVanitypathBlacklist;
    }

    /**
     * Get resourceResolverVanityPrecedence
     * @return resourceResolverVanityPrecedence
     */
    public ConfigNodePropertyBoolean getResourceResolverVanityPrecedence() {
        return resourceResolverVanityPrecedence;
    }

    public void setResourceResolverVanityPrecedence(ConfigNodePropertyBoolean resourceResolverVanityPrecedence) {
        this.resourceResolverVanityPrecedence = resourceResolverVanityPrecedence;
    }

    /**
     * Get resourceResolverProviderhandlingParanoid
     * @return resourceResolverProviderhandlingParanoid
     */
    public ConfigNodePropertyBoolean getResourceResolverProviderhandlingParanoid() {
        return resourceResolverProviderhandlingParanoid;
    }

    public void setResourceResolverProviderhandlingParanoid(ConfigNodePropertyBoolean resourceResolverProviderhandlingParanoid) {
        this.resourceResolverProviderhandlingParanoid = resourceResolverProviderhandlingParanoid;
    }

    /**
     * Get resourceResolverLogClosing
     * @return resourceResolverLogClosing
     */
    public ConfigNodePropertyBoolean getResourceResolverLogClosing() {
        return resourceResolverLogClosing;
    }

    public void setResourceResolverLogClosing(ConfigNodePropertyBoolean resourceResolverLogClosing) {
        this.resourceResolverLogClosing = resourceResolverLogClosing;
    }

    /**
     * Get resourceResolverLogUnclosed
     * @return resourceResolverLogUnclosed
     */
    public ConfigNodePropertyBoolean getResourceResolverLogUnclosed() {
        return resourceResolverLogUnclosed;
    }

    public void setResourceResolverLogUnclosed(ConfigNodePropertyBoolean resourceResolverLogUnclosed) {
        this.resourceResolverLogUnclosed = resourceResolverLogUnclosed;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties {\n");
        
        sb.append("    resourceResolverSearchpath: ").append(toIndentedString(resourceResolverSearchpath)).append("\n");
        sb.append("    resourceResolverManglenamespaces: ").append(toIndentedString(resourceResolverManglenamespaces)).append("\n");
        sb.append("    resourceResolverAllowDirect: ").append(toIndentedString(resourceResolverAllowDirect)).append("\n");
        sb.append("    resourceResolverRequiredProviders: ").append(toIndentedString(resourceResolverRequiredProviders)).append("\n");
        sb.append("    resourceResolverRequiredProvidernames: ").append(toIndentedString(resourceResolverRequiredProvidernames)).append("\n");
        sb.append("    resourceResolverVirtual: ").append(toIndentedString(resourceResolverVirtual)).append("\n");
        sb.append("    resourceResolverMapping: ").append(toIndentedString(resourceResolverMapping)).append("\n");
        sb.append("    resourceResolverMapLocation: ").append(toIndentedString(resourceResolverMapLocation)).append("\n");
        sb.append("    resourceResolverMapObservation: ").append(toIndentedString(resourceResolverMapObservation)).append("\n");
        sb.append("    resourceResolverDefaultVanityRedirectStatus: ").append(toIndentedString(resourceResolverDefaultVanityRedirectStatus)).append("\n");
        sb.append("    resourceResolverEnableVanitypath: ").append(toIndentedString(resourceResolverEnableVanitypath)).append("\n");
        sb.append("    resourceResolverVanitypathMaxEntries: ").append(toIndentedString(resourceResolverVanitypathMaxEntries)).append("\n");
        sb.append("    resourceResolverVanitypathMaxEntriesStartup: ").append(toIndentedString(resourceResolverVanitypathMaxEntriesStartup)).append("\n");
        sb.append("    resourceResolverVanitypathBloomfilterMaxBytes: ").append(toIndentedString(resourceResolverVanitypathBloomfilterMaxBytes)).append("\n");
        sb.append("    resourceResolverOptimizeAliasResolution: ").append(toIndentedString(resourceResolverOptimizeAliasResolution)).append("\n");
        sb.append("    resourceResolverVanitypathWhitelist: ").append(toIndentedString(resourceResolverVanitypathWhitelist)).append("\n");
        sb.append("    resourceResolverVanitypathBlacklist: ").append(toIndentedString(resourceResolverVanitypathBlacklist)).append("\n");
        sb.append("    resourceResolverVanityPrecedence: ").append(toIndentedString(resourceResolverVanityPrecedence)).append("\n");
        sb.append("    resourceResolverProviderhandlingParanoid: ").append(toIndentedString(resourceResolverProviderhandlingParanoid)).append("\n");
        sb.append("    resourceResolverLogClosing: ").append(toIndentedString(resourceResolverLogClosing)).append("\n");
        sb.append("    resourceResolverLogUnclosed: ").append(toIndentedString(resourceResolverLogUnclosed)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

