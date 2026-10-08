package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("resource.resolver.searchpath")
  private ConfigNodePropertyArray resourceResolverSearchpath;

  @JsonProperty("resource.resolver.manglenamespaces")
  private ConfigNodePropertyBoolean resourceResolverManglenamespaces;

  @JsonProperty("resource.resolver.allowDirect")
  private ConfigNodePropertyBoolean resourceResolverAllowDirect;

  @JsonProperty("resource.resolver.required.providers")
  private ConfigNodePropertyArray resourceResolverRequiredProviders;

  @JsonProperty("resource.resolver.required.providernames")
  private ConfigNodePropertyArray resourceResolverRequiredProvidernames;

  @JsonProperty("resource.resolver.virtual")
  private ConfigNodePropertyArray resourceResolverVirtual;

  @JsonProperty("resource.resolver.mapping")
  private ConfigNodePropertyArray resourceResolverMapping;

  @JsonProperty("resource.resolver.map.location")
  private ConfigNodePropertyString resourceResolverMapLocation;

  @JsonProperty("resource.resolver.map.observation")
  private ConfigNodePropertyArray resourceResolverMapObservation;

  @JsonProperty("resource.resolver.default.vanity.redirect.status")
  private ConfigNodePropertyInteger resourceResolverDefaultVanityRedirectStatus;

  @JsonProperty("resource.resolver.enable.vanitypath")
  private ConfigNodePropertyBoolean resourceResolverEnableVanitypath;

  @JsonProperty("resource.resolver.vanitypath.maxEntries")
  private ConfigNodePropertyInteger resourceResolverVanitypathMaxEntries;

  @JsonProperty("resource.resolver.vanitypath.maxEntries.startup")
  private ConfigNodePropertyBoolean resourceResolverVanitypathMaxEntriesStartup;

  @JsonProperty("resource.resolver.vanitypath.bloomfilter.maxBytes")
  private ConfigNodePropertyInteger resourceResolverVanitypathBloomfilterMaxBytes;

  @JsonProperty("resource.resolver.optimize.alias.resolution")
  private ConfigNodePropertyBoolean resourceResolverOptimizeAliasResolution;

  @JsonProperty("resource.resolver.vanitypath.whitelist")
  private ConfigNodePropertyArray resourceResolverVanitypathWhitelist;

  @JsonProperty("resource.resolver.vanitypath.blacklist")
  private ConfigNodePropertyArray resourceResolverVanitypathBlacklist;

  @JsonProperty("resource.resolver.vanity.precedence")
  private ConfigNodePropertyBoolean resourceResolverVanityPrecedence;

  @JsonProperty("resource.resolver.providerhandling.paranoid")
  private ConfigNodePropertyBoolean resourceResolverProviderhandlingParanoid;

  @JsonProperty("resource.resolver.log.closing")
  private ConfigNodePropertyBoolean resourceResolverLogClosing;

  @JsonProperty("resource.resolver.log.unclosed")
  private ConfigNodePropertyBoolean resourceResolverLogUnclosed;

  /**
   * 
   * @return resourceResolverSearchpath
   */
  public ConfigNodePropertyArray getResourceResolverSearchpath() {
    return resourceResolverSearchpath;
  }

  public void setResourceResolverSearchpath(ConfigNodePropertyArray resourceResolverSearchpath) {
    this.resourceResolverSearchpath = resourceResolverSearchpath;
  }

  /**
   * 
   * @return resourceResolverManglenamespaces
   */
  public ConfigNodePropertyBoolean getResourceResolverManglenamespaces() {
    return resourceResolverManglenamespaces;
  }

  public void setResourceResolverManglenamespaces(ConfigNodePropertyBoolean resourceResolverManglenamespaces) {
    this.resourceResolverManglenamespaces = resourceResolverManglenamespaces;
  }

  /**
   * 
   * @return resourceResolverAllowDirect
   */
  public ConfigNodePropertyBoolean getResourceResolverAllowDirect() {
    return resourceResolverAllowDirect;
  }

  public void setResourceResolverAllowDirect(ConfigNodePropertyBoolean resourceResolverAllowDirect) {
    this.resourceResolverAllowDirect = resourceResolverAllowDirect;
  }

  /**
   * 
   * @return resourceResolverRequiredProviders
   */
  public ConfigNodePropertyArray getResourceResolverRequiredProviders() {
    return resourceResolverRequiredProviders;
  }

  public void setResourceResolverRequiredProviders(ConfigNodePropertyArray resourceResolverRequiredProviders) {
    this.resourceResolverRequiredProviders = resourceResolverRequiredProviders;
  }

  /**
   * 
   * @return resourceResolverRequiredProvidernames
   */
  public ConfigNodePropertyArray getResourceResolverRequiredProvidernames() {
    return resourceResolverRequiredProvidernames;
  }

  public void setResourceResolverRequiredProvidernames(ConfigNodePropertyArray resourceResolverRequiredProvidernames) {
    this.resourceResolverRequiredProvidernames = resourceResolverRequiredProvidernames;
  }

  /**
   * 
   * @return resourceResolverVirtual
   */
  public ConfigNodePropertyArray getResourceResolverVirtual() {
    return resourceResolverVirtual;
  }

  public void setResourceResolverVirtual(ConfigNodePropertyArray resourceResolverVirtual) {
    this.resourceResolverVirtual = resourceResolverVirtual;
  }

  /**
   * 
   * @return resourceResolverMapping
   */
  public ConfigNodePropertyArray getResourceResolverMapping() {
    return resourceResolverMapping;
  }

  public void setResourceResolverMapping(ConfigNodePropertyArray resourceResolverMapping) {
    this.resourceResolverMapping = resourceResolverMapping;
  }

  /**
   * 
   * @return resourceResolverMapLocation
   */
  public ConfigNodePropertyString getResourceResolverMapLocation() {
    return resourceResolverMapLocation;
  }

  public void setResourceResolverMapLocation(ConfigNodePropertyString resourceResolverMapLocation) {
    this.resourceResolverMapLocation = resourceResolverMapLocation;
  }

  /**
   * 
   * @return resourceResolverMapObservation
   */
  public ConfigNodePropertyArray getResourceResolverMapObservation() {
    return resourceResolverMapObservation;
  }

  public void setResourceResolverMapObservation(ConfigNodePropertyArray resourceResolverMapObservation) {
    this.resourceResolverMapObservation = resourceResolverMapObservation;
  }

  /**
   * 
   * @return resourceResolverDefaultVanityRedirectStatus
   */
  public ConfigNodePropertyInteger getResourceResolverDefaultVanityRedirectStatus() {
    return resourceResolverDefaultVanityRedirectStatus;
  }

  public void setResourceResolverDefaultVanityRedirectStatus(ConfigNodePropertyInteger resourceResolverDefaultVanityRedirectStatus) {
    this.resourceResolverDefaultVanityRedirectStatus = resourceResolverDefaultVanityRedirectStatus;
  }

  /**
   * 
   * @return resourceResolverEnableVanitypath
   */
  public ConfigNodePropertyBoolean getResourceResolverEnableVanitypath() {
    return resourceResolverEnableVanitypath;
  }

  public void setResourceResolverEnableVanitypath(ConfigNodePropertyBoolean resourceResolverEnableVanitypath) {
    this.resourceResolverEnableVanitypath = resourceResolverEnableVanitypath;
  }

  /**
   * 
   * @return resourceResolverVanitypathMaxEntries
   */
  public ConfigNodePropertyInteger getResourceResolverVanitypathMaxEntries() {
    return resourceResolverVanitypathMaxEntries;
  }

  public void setResourceResolverVanitypathMaxEntries(ConfigNodePropertyInteger resourceResolverVanitypathMaxEntries) {
    this.resourceResolverVanitypathMaxEntries = resourceResolverVanitypathMaxEntries;
  }

  /**
   * 
   * @return resourceResolverVanitypathMaxEntriesStartup
   */
  public ConfigNodePropertyBoolean getResourceResolverVanitypathMaxEntriesStartup() {
    return resourceResolverVanitypathMaxEntriesStartup;
  }

  public void setResourceResolverVanitypathMaxEntriesStartup(ConfigNodePropertyBoolean resourceResolverVanitypathMaxEntriesStartup) {
    this.resourceResolverVanitypathMaxEntriesStartup = resourceResolverVanitypathMaxEntriesStartup;
  }

  /**
   * 
   * @return resourceResolverVanitypathBloomfilterMaxBytes
   */
  public ConfigNodePropertyInteger getResourceResolverVanitypathBloomfilterMaxBytes() {
    return resourceResolverVanitypathBloomfilterMaxBytes;
  }

  public void setResourceResolverVanitypathBloomfilterMaxBytes(ConfigNodePropertyInteger resourceResolverVanitypathBloomfilterMaxBytes) {
    this.resourceResolverVanitypathBloomfilterMaxBytes = resourceResolverVanitypathBloomfilterMaxBytes;
  }

  /**
   * 
   * @return resourceResolverOptimizeAliasResolution
   */
  public ConfigNodePropertyBoolean getResourceResolverOptimizeAliasResolution() {
    return resourceResolverOptimizeAliasResolution;
  }

  public void setResourceResolverOptimizeAliasResolution(ConfigNodePropertyBoolean resourceResolverOptimizeAliasResolution) {
    this.resourceResolverOptimizeAliasResolution = resourceResolverOptimizeAliasResolution;
  }

  /**
   * 
   * @return resourceResolverVanitypathWhitelist
   */
  public ConfigNodePropertyArray getResourceResolverVanitypathWhitelist() {
    return resourceResolverVanitypathWhitelist;
  }

  public void setResourceResolverVanitypathWhitelist(ConfigNodePropertyArray resourceResolverVanitypathWhitelist) {
    this.resourceResolverVanitypathWhitelist = resourceResolverVanitypathWhitelist;
  }

  /**
   * 
   * @return resourceResolverVanitypathBlacklist
   */
  public ConfigNodePropertyArray getResourceResolverVanitypathBlacklist() {
    return resourceResolverVanitypathBlacklist;
  }

  public void setResourceResolverVanitypathBlacklist(ConfigNodePropertyArray resourceResolverVanitypathBlacklist) {
    this.resourceResolverVanitypathBlacklist = resourceResolverVanitypathBlacklist;
  }

  /**
   * 
   * @return resourceResolverVanityPrecedence
   */
  public ConfigNodePropertyBoolean getResourceResolverVanityPrecedence() {
    return resourceResolverVanityPrecedence;
  }

  public void setResourceResolverVanityPrecedence(ConfigNodePropertyBoolean resourceResolverVanityPrecedence) {
    this.resourceResolverVanityPrecedence = resourceResolverVanityPrecedence;
  }

  /**
   * 
   * @return resourceResolverProviderhandlingParanoid
   */
  public ConfigNodePropertyBoolean getResourceResolverProviderhandlingParanoid() {
    return resourceResolverProviderhandlingParanoid;
  }

  public void setResourceResolverProviderhandlingParanoid(ConfigNodePropertyBoolean resourceResolverProviderhandlingParanoid) {
    this.resourceResolverProviderhandlingParanoid = resourceResolverProviderhandlingParanoid;
  }

  /**
   * 
   * @return resourceResolverLogClosing
   */
  public ConfigNodePropertyBoolean getResourceResolverLogClosing() {
    return resourceResolverLogClosing;
  }

  public void setResourceResolverLogClosing(ConfigNodePropertyBoolean resourceResolverLogClosing) {
    this.resourceResolverLogClosing = resourceResolverLogClosing;
  }

  /**
   * 
   * @return resourceResolverLogUnclosed
   */
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
    return Objects.equals(this.resourceResolverSearchpath, orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.resourceResolverSearchpath) &&
        Objects.equals(this.resourceResolverManglenamespaces, orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.resourceResolverManglenamespaces) &&
        Objects.equals(this.resourceResolverAllowDirect, orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.resourceResolverAllowDirect) &&
        Objects.equals(this.resourceResolverRequiredProviders, orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.resourceResolverRequiredProviders) &&
        Objects.equals(this.resourceResolverRequiredProvidernames, orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.resourceResolverRequiredProvidernames) &&
        Objects.equals(this.resourceResolverVirtual, orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.resourceResolverVirtual) &&
        Objects.equals(this.resourceResolverMapping, orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.resourceResolverMapping) &&
        Objects.equals(this.resourceResolverMapLocation, orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.resourceResolverMapLocation) &&
        Objects.equals(this.resourceResolverMapObservation, orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.resourceResolverMapObservation) &&
        Objects.equals(this.resourceResolverDefaultVanityRedirectStatus, orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.resourceResolverDefaultVanityRedirectStatus) &&
        Objects.equals(this.resourceResolverEnableVanitypath, orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.resourceResolverEnableVanitypath) &&
        Objects.equals(this.resourceResolverVanitypathMaxEntries, orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.resourceResolverVanitypathMaxEntries) &&
        Objects.equals(this.resourceResolverVanitypathMaxEntriesStartup, orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.resourceResolverVanitypathMaxEntriesStartup) &&
        Objects.equals(this.resourceResolverVanitypathBloomfilterMaxBytes, orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.resourceResolverVanitypathBloomfilterMaxBytes) &&
        Objects.equals(this.resourceResolverOptimizeAliasResolution, orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.resourceResolverOptimizeAliasResolution) &&
        Objects.equals(this.resourceResolverVanitypathWhitelist, orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.resourceResolverVanitypathWhitelist) &&
        Objects.equals(this.resourceResolverVanitypathBlacklist, orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.resourceResolverVanitypathBlacklist) &&
        Objects.equals(this.resourceResolverVanityPrecedence, orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.resourceResolverVanityPrecedence) &&
        Objects.equals(this.resourceResolverProviderhandlingParanoid, orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.resourceResolverProviderhandlingParanoid) &&
        Objects.equals(this.resourceResolverLogClosing, orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.resourceResolverLogClosing) &&
        Objects.equals(this.resourceResolverLogUnclosed, orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.resourceResolverLogUnclosed);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
