package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

/**
 * OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
public class OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties   {
  @JsonProperty("resource.resolver.searchpath")
  private ConfigNodePropertyArray resourceResolverSearchpath = null;

  @JsonProperty("resource.resolver.manglenamespaces")
  private ConfigNodePropertyBoolean resourceResolverManglenamespaces = null;

  @JsonProperty("resource.resolver.allowDirect")
  private ConfigNodePropertyBoolean resourceResolverAllowDirect = null;

  @JsonProperty("resource.resolver.required.providers")
  private ConfigNodePropertyArray resourceResolverRequiredProviders = null;

  @JsonProperty("resource.resolver.required.providernames")
  private ConfigNodePropertyArray resourceResolverRequiredProvidernames = null;

  @JsonProperty("resource.resolver.virtual")
  private ConfigNodePropertyArray resourceResolverVirtual = null;

  @JsonProperty("resource.resolver.mapping")
  private ConfigNodePropertyArray resourceResolverMapping = null;

  @JsonProperty("resource.resolver.map.location")
  private ConfigNodePropertyString resourceResolverMapLocation = null;

  @JsonProperty("resource.resolver.map.observation")
  private ConfigNodePropertyArray resourceResolverMapObservation = null;

  @JsonProperty("resource.resolver.default.vanity.redirect.status")
  private ConfigNodePropertyInteger resourceResolverDefaultVanityRedirectStatus = null;

  @JsonProperty("resource.resolver.enable.vanitypath")
  private ConfigNodePropertyBoolean resourceResolverEnableVanitypath = null;

  @JsonProperty("resource.resolver.vanitypath.maxEntries")
  private ConfigNodePropertyInteger resourceResolverVanitypathMaxEntries = null;

  @JsonProperty("resource.resolver.vanitypath.maxEntries.startup")
  private ConfigNodePropertyBoolean resourceResolverVanitypathMaxEntriesStartup = null;

  @JsonProperty("resource.resolver.vanitypath.bloomfilter.maxBytes")
  private ConfigNodePropertyInteger resourceResolverVanitypathBloomfilterMaxBytes = null;

  @JsonProperty("resource.resolver.optimize.alias.resolution")
  private ConfigNodePropertyBoolean resourceResolverOptimizeAliasResolution = null;

  @JsonProperty("resource.resolver.vanitypath.whitelist")
  private ConfigNodePropertyArray resourceResolverVanitypathWhitelist = null;

  @JsonProperty("resource.resolver.vanitypath.blacklist")
  private ConfigNodePropertyArray resourceResolverVanitypathBlacklist = null;

  @JsonProperty("resource.resolver.vanity.precedence")
  private ConfigNodePropertyBoolean resourceResolverVanityPrecedence = null;

  @JsonProperty("resource.resolver.providerhandling.paranoid")
  private ConfigNodePropertyBoolean resourceResolverProviderhandlingParanoid = null;

  @JsonProperty("resource.resolver.log.closing")
  private ConfigNodePropertyBoolean resourceResolverLogClosing = null;

  @JsonProperty("resource.resolver.log.unclosed")
  private ConfigNodePropertyBoolean resourceResolverLogUnclosed = null;

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverSearchpath(ConfigNodePropertyArray resourceResolverSearchpath) {
    this.resourceResolverSearchpath = resourceResolverSearchpath;
    return this;
  }

   /**
   * Get resourceResolverSearchpath
   * @return resourceResolverSearchpath
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getResourceResolverSearchpath() {
    return resourceResolverSearchpath;
  }

  public void setResourceResolverSearchpath(ConfigNodePropertyArray resourceResolverSearchpath) {
    this.resourceResolverSearchpath = resourceResolverSearchpath;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverManglenamespaces(ConfigNodePropertyBoolean resourceResolverManglenamespaces) {
    this.resourceResolverManglenamespaces = resourceResolverManglenamespaces;
    return this;
  }

   /**
   * Get resourceResolverManglenamespaces
   * @return resourceResolverManglenamespaces
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getResourceResolverManglenamespaces() {
    return resourceResolverManglenamespaces;
  }

  public void setResourceResolverManglenamespaces(ConfigNodePropertyBoolean resourceResolverManglenamespaces) {
    this.resourceResolverManglenamespaces = resourceResolverManglenamespaces;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverAllowDirect(ConfigNodePropertyBoolean resourceResolverAllowDirect) {
    this.resourceResolverAllowDirect = resourceResolverAllowDirect;
    return this;
  }

   /**
   * Get resourceResolverAllowDirect
   * @return resourceResolverAllowDirect
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getResourceResolverAllowDirect() {
    return resourceResolverAllowDirect;
  }

  public void setResourceResolverAllowDirect(ConfigNodePropertyBoolean resourceResolverAllowDirect) {
    this.resourceResolverAllowDirect = resourceResolverAllowDirect;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverRequiredProviders(ConfigNodePropertyArray resourceResolverRequiredProviders) {
    this.resourceResolverRequiredProviders = resourceResolverRequiredProviders;
    return this;
  }

   /**
   * Get resourceResolverRequiredProviders
   * @return resourceResolverRequiredProviders
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getResourceResolverRequiredProviders() {
    return resourceResolverRequiredProviders;
  }

  public void setResourceResolverRequiredProviders(ConfigNodePropertyArray resourceResolverRequiredProviders) {
    this.resourceResolverRequiredProviders = resourceResolverRequiredProviders;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverRequiredProvidernames(ConfigNodePropertyArray resourceResolverRequiredProvidernames) {
    this.resourceResolverRequiredProvidernames = resourceResolverRequiredProvidernames;
    return this;
  }

   /**
   * Get resourceResolverRequiredProvidernames
   * @return resourceResolverRequiredProvidernames
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getResourceResolverRequiredProvidernames() {
    return resourceResolverRequiredProvidernames;
  }

  public void setResourceResolverRequiredProvidernames(ConfigNodePropertyArray resourceResolverRequiredProvidernames) {
    this.resourceResolverRequiredProvidernames = resourceResolverRequiredProvidernames;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverVirtual(ConfigNodePropertyArray resourceResolverVirtual) {
    this.resourceResolverVirtual = resourceResolverVirtual;
    return this;
  }

   /**
   * Get resourceResolverVirtual
   * @return resourceResolverVirtual
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getResourceResolverVirtual() {
    return resourceResolverVirtual;
  }

  public void setResourceResolverVirtual(ConfigNodePropertyArray resourceResolverVirtual) {
    this.resourceResolverVirtual = resourceResolverVirtual;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverMapping(ConfigNodePropertyArray resourceResolverMapping) {
    this.resourceResolverMapping = resourceResolverMapping;
    return this;
  }

   /**
   * Get resourceResolverMapping
   * @return resourceResolverMapping
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getResourceResolverMapping() {
    return resourceResolverMapping;
  }

  public void setResourceResolverMapping(ConfigNodePropertyArray resourceResolverMapping) {
    this.resourceResolverMapping = resourceResolverMapping;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverMapLocation(ConfigNodePropertyString resourceResolverMapLocation) {
    this.resourceResolverMapLocation = resourceResolverMapLocation;
    return this;
  }

   /**
   * Get resourceResolverMapLocation
   * @return resourceResolverMapLocation
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getResourceResolverMapLocation() {
    return resourceResolverMapLocation;
  }

  public void setResourceResolverMapLocation(ConfigNodePropertyString resourceResolverMapLocation) {
    this.resourceResolverMapLocation = resourceResolverMapLocation;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverMapObservation(ConfigNodePropertyArray resourceResolverMapObservation) {
    this.resourceResolverMapObservation = resourceResolverMapObservation;
    return this;
  }

   /**
   * Get resourceResolverMapObservation
   * @return resourceResolverMapObservation
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getResourceResolverMapObservation() {
    return resourceResolverMapObservation;
  }

  public void setResourceResolverMapObservation(ConfigNodePropertyArray resourceResolverMapObservation) {
    this.resourceResolverMapObservation = resourceResolverMapObservation;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverDefaultVanityRedirectStatus(ConfigNodePropertyInteger resourceResolverDefaultVanityRedirectStatus) {
    this.resourceResolverDefaultVanityRedirectStatus = resourceResolverDefaultVanityRedirectStatus;
    return this;
  }

   /**
   * Get resourceResolverDefaultVanityRedirectStatus
   * @return resourceResolverDefaultVanityRedirectStatus
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getResourceResolverDefaultVanityRedirectStatus() {
    return resourceResolverDefaultVanityRedirectStatus;
  }

  public void setResourceResolverDefaultVanityRedirectStatus(ConfigNodePropertyInteger resourceResolverDefaultVanityRedirectStatus) {
    this.resourceResolverDefaultVanityRedirectStatus = resourceResolverDefaultVanityRedirectStatus;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverEnableVanitypath(ConfigNodePropertyBoolean resourceResolverEnableVanitypath) {
    this.resourceResolverEnableVanitypath = resourceResolverEnableVanitypath;
    return this;
  }

   /**
   * Get resourceResolverEnableVanitypath
   * @return resourceResolverEnableVanitypath
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getResourceResolverEnableVanitypath() {
    return resourceResolverEnableVanitypath;
  }

  public void setResourceResolverEnableVanitypath(ConfigNodePropertyBoolean resourceResolverEnableVanitypath) {
    this.resourceResolverEnableVanitypath = resourceResolverEnableVanitypath;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverVanitypathMaxEntries(ConfigNodePropertyInteger resourceResolverVanitypathMaxEntries) {
    this.resourceResolverVanitypathMaxEntries = resourceResolverVanitypathMaxEntries;
    return this;
  }

   /**
   * Get resourceResolverVanitypathMaxEntries
   * @return resourceResolverVanitypathMaxEntries
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getResourceResolverVanitypathMaxEntries() {
    return resourceResolverVanitypathMaxEntries;
  }

  public void setResourceResolverVanitypathMaxEntries(ConfigNodePropertyInteger resourceResolverVanitypathMaxEntries) {
    this.resourceResolverVanitypathMaxEntries = resourceResolverVanitypathMaxEntries;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverVanitypathMaxEntriesStartup(ConfigNodePropertyBoolean resourceResolverVanitypathMaxEntriesStartup) {
    this.resourceResolverVanitypathMaxEntriesStartup = resourceResolverVanitypathMaxEntriesStartup;
    return this;
  }

   /**
   * Get resourceResolverVanitypathMaxEntriesStartup
   * @return resourceResolverVanitypathMaxEntriesStartup
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getResourceResolverVanitypathMaxEntriesStartup() {
    return resourceResolverVanitypathMaxEntriesStartup;
  }

  public void setResourceResolverVanitypathMaxEntriesStartup(ConfigNodePropertyBoolean resourceResolverVanitypathMaxEntriesStartup) {
    this.resourceResolverVanitypathMaxEntriesStartup = resourceResolverVanitypathMaxEntriesStartup;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverVanitypathBloomfilterMaxBytes(ConfigNodePropertyInteger resourceResolverVanitypathBloomfilterMaxBytes) {
    this.resourceResolverVanitypathBloomfilterMaxBytes = resourceResolverVanitypathBloomfilterMaxBytes;
    return this;
  }

   /**
   * Get resourceResolverVanitypathBloomfilterMaxBytes
   * @return resourceResolverVanitypathBloomfilterMaxBytes
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getResourceResolverVanitypathBloomfilterMaxBytes() {
    return resourceResolverVanitypathBloomfilterMaxBytes;
  }

  public void setResourceResolverVanitypathBloomfilterMaxBytes(ConfigNodePropertyInteger resourceResolverVanitypathBloomfilterMaxBytes) {
    this.resourceResolverVanitypathBloomfilterMaxBytes = resourceResolverVanitypathBloomfilterMaxBytes;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverOptimizeAliasResolution(ConfigNodePropertyBoolean resourceResolverOptimizeAliasResolution) {
    this.resourceResolverOptimizeAliasResolution = resourceResolverOptimizeAliasResolution;
    return this;
  }

   /**
   * Get resourceResolverOptimizeAliasResolution
   * @return resourceResolverOptimizeAliasResolution
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getResourceResolverOptimizeAliasResolution() {
    return resourceResolverOptimizeAliasResolution;
  }

  public void setResourceResolverOptimizeAliasResolution(ConfigNodePropertyBoolean resourceResolverOptimizeAliasResolution) {
    this.resourceResolverOptimizeAliasResolution = resourceResolverOptimizeAliasResolution;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverVanitypathWhitelist(ConfigNodePropertyArray resourceResolverVanitypathWhitelist) {
    this.resourceResolverVanitypathWhitelist = resourceResolverVanitypathWhitelist;
    return this;
  }

   /**
   * Get resourceResolverVanitypathWhitelist
   * @return resourceResolverVanitypathWhitelist
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getResourceResolverVanitypathWhitelist() {
    return resourceResolverVanitypathWhitelist;
  }

  public void setResourceResolverVanitypathWhitelist(ConfigNodePropertyArray resourceResolverVanitypathWhitelist) {
    this.resourceResolverVanitypathWhitelist = resourceResolverVanitypathWhitelist;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverVanitypathBlacklist(ConfigNodePropertyArray resourceResolverVanitypathBlacklist) {
    this.resourceResolverVanitypathBlacklist = resourceResolverVanitypathBlacklist;
    return this;
  }

   /**
   * Get resourceResolverVanitypathBlacklist
   * @return resourceResolverVanitypathBlacklist
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getResourceResolverVanitypathBlacklist() {
    return resourceResolverVanitypathBlacklist;
  }

  public void setResourceResolverVanitypathBlacklist(ConfigNodePropertyArray resourceResolverVanitypathBlacklist) {
    this.resourceResolverVanitypathBlacklist = resourceResolverVanitypathBlacklist;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverVanityPrecedence(ConfigNodePropertyBoolean resourceResolverVanityPrecedence) {
    this.resourceResolverVanityPrecedence = resourceResolverVanityPrecedence;
    return this;
  }

   /**
   * Get resourceResolverVanityPrecedence
   * @return resourceResolverVanityPrecedence
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getResourceResolverVanityPrecedence() {
    return resourceResolverVanityPrecedence;
  }

  public void setResourceResolverVanityPrecedence(ConfigNodePropertyBoolean resourceResolverVanityPrecedence) {
    this.resourceResolverVanityPrecedence = resourceResolverVanityPrecedence;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverProviderhandlingParanoid(ConfigNodePropertyBoolean resourceResolverProviderhandlingParanoid) {
    this.resourceResolverProviderhandlingParanoid = resourceResolverProviderhandlingParanoid;
    return this;
  }

   /**
   * Get resourceResolverProviderhandlingParanoid
   * @return resourceResolverProviderhandlingParanoid
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getResourceResolverProviderhandlingParanoid() {
    return resourceResolverProviderhandlingParanoid;
  }

  public void setResourceResolverProviderhandlingParanoid(ConfigNodePropertyBoolean resourceResolverProviderhandlingParanoid) {
    this.resourceResolverProviderhandlingParanoid = resourceResolverProviderhandlingParanoid;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverLogClosing(ConfigNodePropertyBoolean resourceResolverLogClosing) {
    this.resourceResolverLogClosing = resourceResolverLogClosing;
    return this;
  }

   /**
   * Get resourceResolverLogClosing
   * @return resourceResolverLogClosing
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getResourceResolverLogClosing() {
    return resourceResolverLogClosing;
  }

  public void setResourceResolverLogClosing(ConfigNodePropertyBoolean resourceResolverLogClosing) {
    this.resourceResolverLogClosing = resourceResolverLogClosing;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverLogUnclosed(ConfigNodePropertyBoolean resourceResolverLogUnclosed) {
    this.resourceResolverLogUnclosed = resourceResolverLogUnclosed;
    return this;
  }

   /**
   * Get resourceResolverLogUnclosed
   * @return resourceResolverLogUnclosed
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getResourceResolverLogUnclosed() {
    return resourceResolverLogUnclosed;
  }

  public void setResourceResolverLogUnclosed(ConfigNodePropertyBoolean resourceResolverLogUnclosed) {
    this.resourceResolverLogUnclosed = resourceResolverLogUnclosed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

