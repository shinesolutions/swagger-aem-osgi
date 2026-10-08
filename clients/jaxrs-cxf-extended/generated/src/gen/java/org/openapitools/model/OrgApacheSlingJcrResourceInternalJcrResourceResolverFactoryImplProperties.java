package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray resourceResolverSearchpath;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean resourceResolverManglenamespaces;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean resourceResolverAllowDirect;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray resourceResolverRequiredProviders;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray resourceResolverRequiredProvidernames;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray resourceResolverVirtual;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray resourceResolverMapping;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString resourceResolverMapLocation;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray resourceResolverMapObservation;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger resourceResolverDefaultVanityRedirectStatus;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean resourceResolverEnableVanitypath;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger resourceResolverVanitypathMaxEntries;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean resourceResolverVanitypathMaxEntriesStartup;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger resourceResolverVanitypathBloomfilterMaxBytes;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean resourceResolverOptimizeAliasResolution;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray resourceResolverVanitypathWhitelist;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray resourceResolverVanitypathBlacklist;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean resourceResolverVanityPrecedence;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean resourceResolverProviderhandlingParanoid;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean resourceResolverLogClosing;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean resourceResolverLogUnclosed;
 /**
  * Get resourceResolverSearchpath
  * @return resourceResolverSearchpath
  */
  @JsonProperty("resource.resolver.searchpath")
  public ConfigNodePropertyArray getResourceResolverSearchpath() {
    return resourceResolverSearchpath;
  }

  /**
   * Sets the <code>resourceResolverSearchpath</code> property.
   */
 public void setResourceResolverSearchpath(ConfigNodePropertyArray resourceResolverSearchpath) {
    this.resourceResolverSearchpath = resourceResolverSearchpath;
  }

  /**
   * Sets the <code>resourceResolverSearchpath</code> property.
   */
  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverSearchpath(ConfigNodePropertyArray resourceResolverSearchpath) {
    this.resourceResolverSearchpath = resourceResolverSearchpath;
    return this;
  }

 /**
  * Get resourceResolverManglenamespaces
  * @return resourceResolverManglenamespaces
  */
  @JsonProperty("resource.resolver.manglenamespaces")
  public ConfigNodePropertyBoolean getResourceResolverManglenamespaces() {
    return resourceResolverManglenamespaces;
  }

  /**
   * Sets the <code>resourceResolverManglenamespaces</code> property.
   */
 public void setResourceResolverManglenamespaces(ConfigNodePropertyBoolean resourceResolverManglenamespaces) {
    this.resourceResolverManglenamespaces = resourceResolverManglenamespaces;
  }

  /**
   * Sets the <code>resourceResolverManglenamespaces</code> property.
   */
  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverManglenamespaces(ConfigNodePropertyBoolean resourceResolverManglenamespaces) {
    this.resourceResolverManglenamespaces = resourceResolverManglenamespaces;
    return this;
  }

 /**
  * Get resourceResolverAllowDirect
  * @return resourceResolverAllowDirect
  */
  @JsonProperty("resource.resolver.allowDirect")
  public ConfigNodePropertyBoolean getResourceResolverAllowDirect() {
    return resourceResolverAllowDirect;
  }

  /**
   * Sets the <code>resourceResolverAllowDirect</code> property.
   */
 public void setResourceResolverAllowDirect(ConfigNodePropertyBoolean resourceResolverAllowDirect) {
    this.resourceResolverAllowDirect = resourceResolverAllowDirect;
  }

  /**
   * Sets the <code>resourceResolverAllowDirect</code> property.
   */
  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverAllowDirect(ConfigNodePropertyBoolean resourceResolverAllowDirect) {
    this.resourceResolverAllowDirect = resourceResolverAllowDirect;
    return this;
  }

 /**
  * Get resourceResolverRequiredProviders
  * @return resourceResolverRequiredProviders
  */
  @JsonProperty("resource.resolver.required.providers")
  public ConfigNodePropertyArray getResourceResolverRequiredProviders() {
    return resourceResolverRequiredProviders;
  }

  /**
   * Sets the <code>resourceResolverRequiredProviders</code> property.
   */
 public void setResourceResolverRequiredProviders(ConfigNodePropertyArray resourceResolverRequiredProviders) {
    this.resourceResolverRequiredProviders = resourceResolverRequiredProviders;
  }

  /**
   * Sets the <code>resourceResolverRequiredProviders</code> property.
   */
  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverRequiredProviders(ConfigNodePropertyArray resourceResolverRequiredProviders) {
    this.resourceResolverRequiredProviders = resourceResolverRequiredProviders;
    return this;
  }

 /**
  * Get resourceResolverRequiredProvidernames
  * @return resourceResolverRequiredProvidernames
  */
  @JsonProperty("resource.resolver.required.providernames")
  public ConfigNodePropertyArray getResourceResolverRequiredProvidernames() {
    return resourceResolverRequiredProvidernames;
  }

  /**
   * Sets the <code>resourceResolverRequiredProvidernames</code> property.
   */
 public void setResourceResolverRequiredProvidernames(ConfigNodePropertyArray resourceResolverRequiredProvidernames) {
    this.resourceResolverRequiredProvidernames = resourceResolverRequiredProvidernames;
  }

  /**
   * Sets the <code>resourceResolverRequiredProvidernames</code> property.
   */
  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverRequiredProvidernames(ConfigNodePropertyArray resourceResolverRequiredProvidernames) {
    this.resourceResolverRequiredProvidernames = resourceResolverRequiredProvidernames;
    return this;
  }

 /**
  * Get resourceResolverVirtual
  * @return resourceResolverVirtual
  */
  @JsonProperty("resource.resolver.virtual")
  public ConfigNodePropertyArray getResourceResolverVirtual() {
    return resourceResolverVirtual;
  }

  /**
   * Sets the <code>resourceResolverVirtual</code> property.
   */
 public void setResourceResolverVirtual(ConfigNodePropertyArray resourceResolverVirtual) {
    this.resourceResolverVirtual = resourceResolverVirtual;
  }

  /**
   * Sets the <code>resourceResolverVirtual</code> property.
   */
  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverVirtual(ConfigNodePropertyArray resourceResolverVirtual) {
    this.resourceResolverVirtual = resourceResolverVirtual;
    return this;
  }

 /**
  * Get resourceResolverMapping
  * @return resourceResolverMapping
  */
  @JsonProperty("resource.resolver.mapping")
  public ConfigNodePropertyArray getResourceResolverMapping() {
    return resourceResolverMapping;
  }

  /**
   * Sets the <code>resourceResolverMapping</code> property.
   */
 public void setResourceResolverMapping(ConfigNodePropertyArray resourceResolverMapping) {
    this.resourceResolverMapping = resourceResolverMapping;
  }

  /**
   * Sets the <code>resourceResolverMapping</code> property.
   */
  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverMapping(ConfigNodePropertyArray resourceResolverMapping) {
    this.resourceResolverMapping = resourceResolverMapping;
    return this;
  }

 /**
  * Get resourceResolverMapLocation
  * @return resourceResolverMapLocation
  */
  @JsonProperty("resource.resolver.map.location")
  public ConfigNodePropertyString getResourceResolverMapLocation() {
    return resourceResolverMapLocation;
  }

  /**
   * Sets the <code>resourceResolverMapLocation</code> property.
   */
 public void setResourceResolverMapLocation(ConfigNodePropertyString resourceResolverMapLocation) {
    this.resourceResolverMapLocation = resourceResolverMapLocation;
  }

  /**
   * Sets the <code>resourceResolverMapLocation</code> property.
   */
  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverMapLocation(ConfigNodePropertyString resourceResolverMapLocation) {
    this.resourceResolverMapLocation = resourceResolverMapLocation;
    return this;
  }

 /**
  * Get resourceResolverMapObservation
  * @return resourceResolverMapObservation
  */
  @JsonProperty("resource.resolver.map.observation")
  public ConfigNodePropertyArray getResourceResolverMapObservation() {
    return resourceResolverMapObservation;
  }

  /**
   * Sets the <code>resourceResolverMapObservation</code> property.
   */
 public void setResourceResolverMapObservation(ConfigNodePropertyArray resourceResolverMapObservation) {
    this.resourceResolverMapObservation = resourceResolverMapObservation;
  }

  /**
   * Sets the <code>resourceResolverMapObservation</code> property.
   */
  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverMapObservation(ConfigNodePropertyArray resourceResolverMapObservation) {
    this.resourceResolverMapObservation = resourceResolverMapObservation;
    return this;
  }

 /**
  * Get resourceResolverDefaultVanityRedirectStatus
  * @return resourceResolverDefaultVanityRedirectStatus
  */
  @JsonProperty("resource.resolver.default.vanity.redirect.status")
  public ConfigNodePropertyInteger getResourceResolverDefaultVanityRedirectStatus() {
    return resourceResolverDefaultVanityRedirectStatus;
  }

  /**
   * Sets the <code>resourceResolverDefaultVanityRedirectStatus</code> property.
   */
 public void setResourceResolverDefaultVanityRedirectStatus(ConfigNodePropertyInteger resourceResolverDefaultVanityRedirectStatus) {
    this.resourceResolverDefaultVanityRedirectStatus = resourceResolverDefaultVanityRedirectStatus;
  }

  /**
   * Sets the <code>resourceResolverDefaultVanityRedirectStatus</code> property.
   */
  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverDefaultVanityRedirectStatus(ConfigNodePropertyInteger resourceResolverDefaultVanityRedirectStatus) {
    this.resourceResolverDefaultVanityRedirectStatus = resourceResolverDefaultVanityRedirectStatus;
    return this;
  }

 /**
  * Get resourceResolverEnableVanitypath
  * @return resourceResolverEnableVanitypath
  */
  @JsonProperty("resource.resolver.enable.vanitypath")
  public ConfigNodePropertyBoolean getResourceResolverEnableVanitypath() {
    return resourceResolverEnableVanitypath;
  }

  /**
   * Sets the <code>resourceResolverEnableVanitypath</code> property.
   */
 public void setResourceResolverEnableVanitypath(ConfigNodePropertyBoolean resourceResolverEnableVanitypath) {
    this.resourceResolverEnableVanitypath = resourceResolverEnableVanitypath;
  }

  /**
   * Sets the <code>resourceResolverEnableVanitypath</code> property.
   */
  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverEnableVanitypath(ConfigNodePropertyBoolean resourceResolverEnableVanitypath) {
    this.resourceResolverEnableVanitypath = resourceResolverEnableVanitypath;
    return this;
  }

 /**
  * Get resourceResolverVanitypathMaxEntries
  * @return resourceResolverVanitypathMaxEntries
  */
  @JsonProperty("resource.resolver.vanitypath.maxEntries")
  public ConfigNodePropertyInteger getResourceResolverVanitypathMaxEntries() {
    return resourceResolverVanitypathMaxEntries;
  }

  /**
   * Sets the <code>resourceResolverVanitypathMaxEntries</code> property.
   */
 public void setResourceResolverVanitypathMaxEntries(ConfigNodePropertyInteger resourceResolverVanitypathMaxEntries) {
    this.resourceResolverVanitypathMaxEntries = resourceResolverVanitypathMaxEntries;
  }

  /**
   * Sets the <code>resourceResolverVanitypathMaxEntries</code> property.
   */
  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverVanitypathMaxEntries(ConfigNodePropertyInteger resourceResolverVanitypathMaxEntries) {
    this.resourceResolverVanitypathMaxEntries = resourceResolverVanitypathMaxEntries;
    return this;
  }

 /**
  * Get resourceResolverVanitypathMaxEntriesStartup
  * @return resourceResolverVanitypathMaxEntriesStartup
  */
  @JsonProperty("resource.resolver.vanitypath.maxEntries.startup")
  public ConfigNodePropertyBoolean getResourceResolverVanitypathMaxEntriesStartup() {
    return resourceResolverVanitypathMaxEntriesStartup;
  }

  /**
   * Sets the <code>resourceResolverVanitypathMaxEntriesStartup</code> property.
   */
 public void setResourceResolverVanitypathMaxEntriesStartup(ConfigNodePropertyBoolean resourceResolverVanitypathMaxEntriesStartup) {
    this.resourceResolverVanitypathMaxEntriesStartup = resourceResolverVanitypathMaxEntriesStartup;
  }

  /**
   * Sets the <code>resourceResolverVanitypathMaxEntriesStartup</code> property.
   */
  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverVanitypathMaxEntriesStartup(ConfigNodePropertyBoolean resourceResolverVanitypathMaxEntriesStartup) {
    this.resourceResolverVanitypathMaxEntriesStartup = resourceResolverVanitypathMaxEntriesStartup;
    return this;
  }

 /**
  * Get resourceResolverVanitypathBloomfilterMaxBytes
  * @return resourceResolverVanitypathBloomfilterMaxBytes
  */
  @JsonProperty("resource.resolver.vanitypath.bloomfilter.maxBytes")
  public ConfigNodePropertyInteger getResourceResolverVanitypathBloomfilterMaxBytes() {
    return resourceResolverVanitypathBloomfilterMaxBytes;
  }

  /**
   * Sets the <code>resourceResolverVanitypathBloomfilterMaxBytes</code> property.
   */
 public void setResourceResolverVanitypathBloomfilterMaxBytes(ConfigNodePropertyInteger resourceResolverVanitypathBloomfilterMaxBytes) {
    this.resourceResolverVanitypathBloomfilterMaxBytes = resourceResolverVanitypathBloomfilterMaxBytes;
  }

  /**
   * Sets the <code>resourceResolverVanitypathBloomfilterMaxBytes</code> property.
   */
  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverVanitypathBloomfilterMaxBytes(ConfigNodePropertyInteger resourceResolverVanitypathBloomfilterMaxBytes) {
    this.resourceResolverVanitypathBloomfilterMaxBytes = resourceResolverVanitypathBloomfilterMaxBytes;
    return this;
  }

 /**
  * Get resourceResolverOptimizeAliasResolution
  * @return resourceResolverOptimizeAliasResolution
  */
  @JsonProperty("resource.resolver.optimize.alias.resolution")
  public ConfigNodePropertyBoolean getResourceResolverOptimizeAliasResolution() {
    return resourceResolverOptimizeAliasResolution;
  }

  /**
   * Sets the <code>resourceResolverOptimizeAliasResolution</code> property.
   */
 public void setResourceResolverOptimizeAliasResolution(ConfigNodePropertyBoolean resourceResolverOptimizeAliasResolution) {
    this.resourceResolverOptimizeAliasResolution = resourceResolverOptimizeAliasResolution;
  }

  /**
   * Sets the <code>resourceResolverOptimizeAliasResolution</code> property.
   */
  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverOptimizeAliasResolution(ConfigNodePropertyBoolean resourceResolverOptimizeAliasResolution) {
    this.resourceResolverOptimizeAliasResolution = resourceResolverOptimizeAliasResolution;
    return this;
  }

 /**
  * Get resourceResolverVanitypathWhitelist
  * @return resourceResolverVanitypathWhitelist
  */
  @JsonProperty("resource.resolver.vanitypath.whitelist")
  public ConfigNodePropertyArray getResourceResolverVanitypathWhitelist() {
    return resourceResolverVanitypathWhitelist;
  }

  /**
   * Sets the <code>resourceResolverVanitypathWhitelist</code> property.
   */
 public void setResourceResolverVanitypathWhitelist(ConfigNodePropertyArray resourceResolverVanitypathWhitelist) {
    this.resourceResolverVanitypathWhitelist = resourceResolverVanitypathWhitelist;
  }

  /**
   * Sets the <code>resourceResolverVanitypathWhitelist</code> property.
   */
  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverVanitypathWhitelist(ConfigNodePropertyArray resourceResolverVanitypathWhitelist) {
    this.resourceResolverVanitypathWhitelist = resourceResolverVanitypathWhitelist;
    return this;
  }

 /**
  * Get resourceResolverVanitypathBlacklist
  * @return resourceResolverVanitypathBlacklist
  */
  @JsonProperty("resource.resolver.vanitypath.blacklist")
  public ConfigNodePropertyArray getResourceResolverVanitypathBlacklist() {
    return resourceResolverVanitypathBlacklist;
  }

  /**
   * Sets the <code>resourceResolverVanitypathBlacklist</code> property.
   */
 public void setResourceResolverVanitypathBlacklist(ConfigNodePropertyArray resourceResolverVanitypathBlacklist) {
    this.resourceResolverVanitypathBlacklist = resourceResolverVanitypathBlacklist;
  }

  /**
   * Sets the <code>resourceResolverVanitypathBlacklist</code> property.
   */
  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverVanitypathBlacklist(ConfigNodePropertyArray resourceResolverVanitypathBlacklist) {
    this.resourceResolverVanitypathBlacklist = resourceResolverVanitypathBlacklist;
    return this;
  }

 /**
  * Get resourceResolverVanityPrecedence
  * @return resourceResolverVanityPrecedence
  */
  @JsonProperty("resource.resolver.vanity.precedence")
  public ConfigNodePropertyBoolean getResourceResolverVanityPrecedence() {
    return resourceResolverVanityPrecedence;
  }

  /**
   * Sets the <code>resourceResolverVanityPrecedence</code> property.
   */
 public void setResourceResolverVanityPrecedence(ConfigNodePropertyBoolean resourceResolverVanityPrecedence) {
    this.resourceResolverVanityPrecedence = resourceResolverVanityPrecedence;
  }

  /**
   * Sets the <code>resourceResolverVanityPrecedence</code> property.
   */
  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverVanityPrecedence(ConfigNodePropertyBoolean resourceResolverVanityPrecedence) {
    this.resourceResolverVanityPrecedence = resourceResolverVanityPrecedence;
    return this;
  }

 /**
  * Get resourceResolverProviderhandlingParanoid
  * @return resourceResolverProviderhandlingParanoid
  */
  @JsonProperty("resource.resolver.providerhandling.paranoid")
  public ConfigNodePropertyBoolean getResourceResolverProviderhandlingParanoid() {
    return resourceResolverProviderhandlingParanoid;
  }

  /**
   * Sets the <code>resourceResolverProviderhandlingParanoid</code> property.
   */
 public void setResourceResolverProviderhandlingParanoid(ConfigNodePropertyBoolean resourceResolverProviderhandlingParanoid) {
    this.resourceResolverProviderhandlingParanoid = resourceResolverProviderhandlingParanoid;
  }

  /**
   * Sets the <code>resourceResolverProviderhandlingParanoid</code> property.
   */
  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverProviderhandlingParanoid(ConfigNodePropertyBoolean resourceResolverProviderhandlingParanoid) {
    this.resourceResolverProviderhandlingParanoid = resourceResolverProviderhandlingParanoid;
    return this;
  }

 /**
  * Get resourceResolverLogClosing
  * @return resourceResolverLogClosing
  */
  @JsonProperty("resource.resolver.log.closing")
  public ConfigNodePropertyBoolean getResourceResolverLogClosing() {
    return resourceResolverLogClosing;
  }

  /**
   * Sets the <code>resourceResolverLogClosing</code> property.
   */
 public void setResourceResolverLogClosing(ConfigNodePropertyBoolean resourceResolverLogClosing) {
    this.resourceResolverLogClosing = resourceResolverLogClosing;
  }

  /**
   * Sets the <code>resourceResolverLogClosing</code> property.
   */
  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverLogClosing(ConfigNodePropertyBoolean resourceResolverLogClosing) {
    this.resourceResolverLogClosing = resourceResolverLogClosing;
    return this;
  }

 /**
  * Get resourceResolverLogUnclosed
  * @return resourceResolverLogUnclosed
  */
  @JsonProperty("resource.resolver.log.unclosed")
  public ConfigNodePropertyBoolean getResourceResolverLogUnclosed() {
    return resourceResolverLogUnclosed;
  }

  /**
   * Sets the <code>resourceResolverLogUnclosed</code> property.
   */
 public void setResourceResolverLogUnclosed(ConfigNodePropertyBoolean resourceResolverLogUnclosed) {
    this.resourceResolverLogUnclosed = resourceResolverLogUnclosed;
  }

  /**
   * Sets the <code>resourceResolverLogUnclosed</code> property.
   */
  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverLogUnclosed(ConfigNodePropertyBoolean resourceResolverLogUnclosed) {
    this.resourceResolverLogUnclosed = resourceResolverLogUnclosed;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

