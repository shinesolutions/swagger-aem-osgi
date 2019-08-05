package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties   {
  
  private ConfigNodePropertyArray resourceResolverSearchpath = null;
  private ConfigNodePropertyBoolean resourceResolverManglenamespaces = null;
  private ConfigNodePropertyBoolean resourceResolverAllowDirect = null;
  private ConfigNodePropertyArray resourceResolverRequiredProviders = null;
  private ConfigNodePropertyArray resourceResolverRequiredProvidernames = null;
  private ConfigNodePropertyArray resourceResolverVirtual = null;
  private ConfigNodePropertyArray resourceResolverMapping = null;
  private ConfigNodePropertyString resourceResolverMapLocation = null;
  private ConfigNodePropertyArray resourceResolverMapObservation = null;
  private ConfigNodePropertyInteger resourceResolverDefaultVanityRedirectStatus = null;
  private ConfigNodePropertyBoolean resourceResolverEnableVanitypath = null;
  private ConfigNodePropertyInteger resourceResolverVanitypathMaxEntries = null;
  private ConfigNodePropertyBoolean resourceResolverVanitypathMaxEntriesStartup = null;
  private ConfigNodePropertyInteger resourceResolverVanitypathBloomfilterMaxBytes = null;
  private ConfigNodePropertyBoolean resourceResolverOptimizeAliasResolution = null;
  private ConfigNodePropertyArray resourceResolverVanitypathWhitelist = null;
  private ConfigNodePropertyArray resourceResolverVanitypathBlacklist = null;
  private ConfigNodePropertyBoolean resourceResolverVanityPrecedence = null;
  private ConfigNodePropertyBoolean resourceResolverProviderhandlingParanoid = null;
  private ConfigNodePropertyBoolean resourceResolverLogClosing = null;
  private ConfigNodePropertyBoolean resourceResolverLogUnclosed = null;

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties () {

  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties (ConfigNodePropertyArray resourceResolverSearchpath, ConfigNodePropertyBoolean resourceResolverManglenamespaces, ConfigNodePropertyBoolean resourceResolverAllowDirect, ConfigNodePropertyArray resourceResolverRequiredProviders, ConfigNodePropertyArray resourceResolverRequiredProvidernames, ConfigNodePropertyArray resourceResolverVirtual, ConfigNodePropertyArray resourceResolverMapping, ConfigNodePropertyString resourceResolverMapLocation, ConfigNodePropertyArray resourceResolverMapObservation, ConfigNodePropertyInteger resourceResolverDefaultVanityRedirectStatus, ConfigNodePropertyBoolean resourceResolverEnableVanitypath, ConfigNodePropertyInteger resourceResolverVanitypathMaxEntries, ConfigNodePropertyBoolean resourceResolverVanitypathMaxEntriesStartup, ConfigNodePropertyInteger resourceResolverVanitypathBloomfilterMaxBytes, ConfigNodePropertyBoolean resourceResolverOptimizeAliasResolution, ConfigNodePropertyArray resourceResolverVanitypathWhitelist, ConfigNodePropertyArray resourceResolverVanitypathBlacklist, ConfigNodePropertyBoolean resourceResolverVanityPrecedence, ConfigNodePropertyBoolean resourceResolverProviderhandlingParanoid, ConfigNodePropertyBoolean resourceResolverLogClosing, ConfigNodePropertyBoolean resourceResolverLogUnclosed) {
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

    
  @JsonProperty("resource.resolver.searchpath")
  public ConfigNodePropertyArray getResourceResolverSearchpath() {
    return resourceResolverSearchpath;
  }
  public void setResourceResolverSearchpath(ConfigNodePropertyArray resourceResolverSearchpath) {
    this.resourceResolverSearchpath = resourceResolverSearchpath;
  }

    
  @JsonProperty("resource.resolver.manglenamespaces")
  public ConfigNodePropertyBoolean getResourceResolverManglenamespaces() {
    return resourceResolverManglenamespaces;
  }
  public void setResourceResolverManglenamespaces(ConfigNodePropertyBoolean resourceResolverManglenamespaces) {
    this.resourceResolverManglenamespaces = resourceResolverManglenamespaces;
  }

    
  @JsonProperty("resource.resolver.allowDirect")
  public ConfigNodePropertyBoolean getResourceResolverAllowDirect() {
    return resourceResolverAllowDirect;
  }
  public void setResourceResolverAllowDirect(ConfigNodePropertyBoolean resourceResolverAllowDirect) {
    this.resourceResolverAllowDirect = resourceResolverAllowDirect;
  }

    
  @JsonProperty("resource.resolver.required.providers")
  public ConfigNodePropertyArray getResourceResolverRequiredProviders() {
    return resourceResolverRequiredProviders;
  }
  public void setResourceResolverRequiredProviders(ConfigNodePropertyArray resourceResolverRequiredProviders) {
    this.resourceResolverRequiredProviders = resourceResolverRequiredProviders;
  }

    
  @JsonProperty("resource.resolver.required.providernames")
  public ConfigNodePropertyArray getResourceResolverRequiredProvidernames() {
    return resourceResolverRequiredProvidernames;
  }
  public void setResourceResolverRequiredProvidernames(ConfigNodePropertyArray resourceResolverRequiredProvidernames) {
    this.resourceResolverRequiredProvidernames = resourceResolverRequiredProvidernames;
  }

    
  @JsonProperty("resource.resolver.virtual")
  public ConfigNodePropertyArray getResourceResolverVirtual() {
    return resourceResolverVirtual;
  }
  public void setResourceResolverVirtual(ConfigNodePropertyArray resourceResolverVirtual) {
    this.resourceResolverVirtual = resourceResolverVirtual;
  }

    
  @JsonProperty("resource.resolver.mapping")
  public ConfigNodePropertyArray getResourceResolverMapping() {
    return resourceResolverMapping;
  }
  public void setResourceResolverMapping(ConfigNodePropertyArray resourceResolverMapping) {
    this.resourceResolverMapping = resourceResolverMapping;
  }

    
  @JsonProperty("resource.resolver.map.location")
  public ConfigNodePropertyString getResourceResolverMapLocation() {
    return resourceResolverMapLocation;
  }
  public void setResourceResolverMapLocation(ConfigNodePropertyString resourceResolverMapLocation) {
    this.resourceResolverMapLocation = resourceResolverMapLocation;
  }

    
  @JsonProperty("resource.resolver.map.observation")
  public ConfigNodePropertyArray getResourceResolverMapObservation() {
    return resourceResolverMapObservation;
  }
  public void setResourceResolverMapObservation(ConfigNodePropertyArray resourceResolverMapObservation) {
    this.resourceResolverMapObservation = resourceResolverMapObservation;
  }

    
  @JsonProperty("resource.resolver.default.vanity.redirect.status")
  public ConfigNodePropertyInteger getResourceResolverDefaultVanityRedirectStatus() {
    return resourceResolverDefaultVanityRedirectStatus;
  }
  public void setResourceResolverDefaultVanityRedirectStatus(ConfigNodePropertyInteger resourceResolverDefaultVanityRedirectStatus) {
    this.resourceResolverDefaultVanityRedirectStatus = resourceResolverDefaultVanityRedirectStatus;
  }

    
  @JsonProperty("resource.resolver.enable.vanitypath")
  public ConfigNodePropertyBoolean getResourceResolverEnableVanitypath() {
    return resourceResolverEnableVanitypath;
  }
  public void setResourceResolverEnableVanitypath(ConfigNodePropertyBoolean resourceResolverEnableVanitypath) {
    this.resourceResolverEnableVanitypath = resourceResolverEnableVanitypath;
  }

    
  @JsonProperty("resource.resolver.vanitypath.maxEntries")
  public ConfigNodePropertyInteger getResourceResolverVanitypathMaxEntries() {
    return resourceResolverVanitypathMaxEntries;
  }
  public void setResourceResolverVanitypathMaxEntries(ConfigNodePropertyInteger resourceResolverVanitypathMaxEntries) {
    this.resourceResolverVanitypathMaxEntries = resourceResolverVanitypathMaxEntries;
  }

    
  @JsonProperty("resource.resolver.vanitypath.maxEntries.startup")
  public ConfigNodePropertyBoolean getResourceResolverVanitypathMaxEntriesStartup() {
    return resourceResolverVanitypathMaxEntriesStartup;
  }
  public void setResourceResolverVanitypathMaxEntriesStartup(ConfigNodePropertyBoolean resourceResolverVanitypathMaxEntriesStartup) {
    this.resourceResolverVanitypathMaxEntriesStartup = resourceResolverVanitypathMaxEntriesStartup;
  }

    
  @JsonProperty("resource.resolver.vanitypath.bloomfilter.maxBytes")
  public ConfigNodePropertyInteger getResourceResolverVanitypathBloomfilterMaxBytes() {
    return resourceResolverVanitypathBloomfilterMaxBytes;
  }
  public void setResourceResolverVanitypathBloomfilterMaxBytes(ConfigNodePropertyInteger resourceResolverVanitypathBloomfilterMaxBytes) {
    this.resourceResolverVanitypathBloomfilterMaxBytes = resourceResolverVanitypathBloomfilterMaxBytes;
  }

    
  @JsonProperty("resource.resolver.optimize.alias.resolution")
  public ConfigNodePropertyBoolean getResourceResolverOptimizeAliasResolution() {
    return resourceResolverOptimizeAliasResolution;
  }
  public void setResourceResolverOptimizeAliasResolution(ConfigNodePropertyBoolean resourceResolverOptimizeAliasResolution) {
    this.resourceResolverOptimizeAliasResolution = resourceResolverOptimizeAliasResolution;
  }

    
  @JsonProperty("resource.resolver.vanitypath.whitelist")
  public ConfigNodePropertyArray getResourceResolverVanitypathWhitelist() {
    return resourceResolverVanitypathWhitelist;
  }
  public void setResourceResolverVanitypathWhitelist(ConfigNodePropertyArray resourceResolverVanitypathWhitelist) {
    this.resourceResolverVanitypathWhitelist = resourceResolverVanitypathWhitelist;
  }

    
  @JsonProperty("resource.resolver.vanitypath.blacklist")
  public ConfigNodePropertyArray getResourceResolverVanitypathBlacklist() {
    return resourceResolverVanitypathBlacklist;
  }
  public void setResourceResolverVanitypathBlacklist(ConfigNodePropertyArray resourceResolverVanitypathBlacklist) {
    this.resourceResolverVanitypathBlacklist = resourceResolverVanitypathBlacklist;
  }

    
  @JsonProperty("resource.resolver.vanity.precedence")
  public ConfigNodePropertyBoolean getResourceResolverVanityPrecedence() {
    return resourceResolverVanityPrecedence;
  }
  public void setResourceResolverVanityPrecedence(ConfigNodePropertyBoolean resourceResolverVanityPrecedence) {
    this.resourceResolverVanityPrecedence = resourceResolverVanityPrecedence;
  }

    
  @JsonProperty("resource.resolver.providerhandling.paranoid")
  public ConfigNodePropertyBoolean getResourceResolverProviderhandlingParanoid() {
    return resourceResolverProviderhandlingParanoid;
  }
  public void setResourceResolverProviderhandlingParanoid(ConfigNodePropertyBoolean resourceResolverProviderhandlingParanoid) {
    this.resourceResolverProviderhandlingParanoid = resourceResolverProviderhandlingParanoid;
  }

    
  @JsonProperty("resource.resolver.log.closing")
  public ConfigNodePropertyBoolean getResourceResolverLogClosing() {
    return resourceResolverLogClosing;
  }
  public void setResourceResolverLogClosing(ConfigNodePropertyBoolean resourceResolverLogClosing) {
    this.resourceResolverLogClosing = resourceResolverLogClosing;
  }

    
  @JsonProperty("resource.resolver.log.unclosed")
  public ConfigNodePropertyBoolean getResourceResolverLogUnclosed() {
    return resourceResolverLogUnclosed;
  }
  public void setResourceResolverLogUnclosed(ConfigNodePropertyBoolean resourceResolverLogUnclosed) {
    this.resourceResolverLogUnclosed = resourceResolverLogUnclosed;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties = (OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties) o;
    return Objects.equals(resourceResolverSearchpath, orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.resourceResolverSearchpath) &&
        Objects.equals(resourceResolverManglenamespaces, orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.resourceResolverManglenamespaces) &&
        Objects.equals(resourceResolverAllowDirect, orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.resourceResolverAllowDirect) &&
        Objects.equals(resourceResolverRequiredProviders, orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.resourceResolverRequiredProviders) &&
        Objects.equals(resourceResolverRequiredProvidernames, orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.resourceResolverRequiredProvidernames) &&
        Objects.equals(resourceResolverVirtual, orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.resourceResolverVirtual) &&
        Objects.equals(resourceResolverMapping, orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.resourceResolverMapping) &&
        Objects.equals(resourceResolverMapLocation, orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.resourceResolverMapLocation) &&
        Objects.equals(resourceResolverMapObservation, orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.resourceResolverMapObservation) &&
        Objects.equals(resourceResolverDefaultVanityRedirectStatus, orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.resourceResolverDefaultVanityRedirectStatus) &&
        Objects.equals(resourceResolverEnableVanitypath, orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.resourceResolverEnableVanitypath) &&
        Objects.equals(resourceResolverVanitypathMaxEntries, orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.resourceResolverVanitypathMaxEntries) &&
        Objects.equals(resourceResolverVanitypathMaxEntriesStartup, orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.resourceResolverVanitypathMaxEntriesStartup) &&
        Objects.equals(resourceResolverVanitypathBloomfilterMaxBytes, orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.resourceResolverVanitypathBloomfilterMaxBytes) &&
        Objects.equals(resourceResolverOptimizeAliasResolution, orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.resourceResolverOptimizeAliasResolution) &&
        Objects.equals(resourceResolverVanitypathWhitelist, orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.resourceResolverVanitypathWhitelist) &&
        Objects.equals(resourceResolverVanitypathBlacklist, orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.resourceResolverVanitypathBlacklist) &&
        Objects.equals(resourceResolverVanityPrecedence, orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.resourceResolverVanityPrecedence) &&
        Objects.equals(resourceResolverProviderhandlingParanoid, orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.resourceResolverProviderhandlingParanoid) &&
        Objects.equals(resourceResolverLogClosing, orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.resourceResolverLogClosing) &&
        Objects.equals(resourceResolverLogUnclosed, orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.resourceResolverLogUnclosed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceResolverSearchpath, resourceResolverManglenamespaces, resourceResolverAllowDirect, resourceResolverRequiredProviders, resourceResolverRequiredProvidernames, resourceResolverVirtual, resourceResolverMapping, resourceResolverMapLocation, resourceResolverMapObservation, resourceResolverDefaultVanityRedirectStatus, resourceResolverEnableVanitypath, resourceResolverVanitypathMaxEntries, resourceResolverVanitypathMaxEntriesStartup, resourceResolverVanitypathBloomfilterMaxBytes, resourceResolverOptimizeAliasResolution, resourceResolverVanitypathWhitelist, resourceResolverVanitypathBlacklist, resourceResolverVanityPrecedence, resourceResolverProviderhandlingParanoid, resourceResolverLogClosing, resourceResolverLogUnclosed);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
