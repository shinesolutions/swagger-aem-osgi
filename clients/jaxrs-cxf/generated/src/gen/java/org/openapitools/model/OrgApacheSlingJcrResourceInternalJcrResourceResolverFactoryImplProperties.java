package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray resourceResolverSearchpath = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean resourceResolverManglenamespaces = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean resourceResolverAllowDirect = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray resourceResolverRequiredProviders = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray resourceResolverRequiredProvidernames = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray resourceResolverVirtual = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray resourceResolverMapping = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString resourceResolverMapLocation = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray resourceResolverMapObservation = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger resourceResolverDefaultVanityRedirectStatus = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean resourceResolverEnableVanitypath = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger resourceResolverVanitypathMaxEntries = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean resourceResolverVanitypathMaxEntriesStartup = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger resourceResolverVanitypathBloomfilterMaxBytes = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean resourceResolverOptimizeAliasResolution = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray resourceResolverVanitypathWhitelist = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray resourceResolverVanitypathBlacklist = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean resourceResolverVanityPrecedence = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean resourceResolverProviderhandlingParanoid = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean resourceResolverLogClosing = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean resourceResolverLogUnclosed = null;
 /**
   * Get resourceResolverSearchpath
   * @return resourceResolverSearchpath
  **/
  @JsonProperty("resource.resolver.searchpath")
  public ConfigNodePropertyArray getResourceResolverSearchpath() {
    return resourceResolverSearchpath;
  }

  public void setResourceResolverSearchpath(ConfigNodePropertyArray resourceResolverSearchpath) {
    this.resourceResolverSearchpath = resourceResolverSearchpath;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverSearchpath(ConfigNodePropertyArray resourceResolverSearchpath) {
    this.resourceResolverSearchpath = resourceResolverSearchpath;
    return this;
  }

 /**
   * Get resourceResolverManglenamespaces
   * @return resourceResolverManglenamespaces
  **/
  @JsonProperty("resource.resolver.manglenamespaces")
  public ConfigNodePropertyBoolean getResourceResolverManglenamespaces() {
    return resourceResolverManglenamespaces;
  }

  public void setResourceResolverManglenamespaces(ConfigNodePropertyBoolean resourceResolverManglenamespaces) {
    this.resourceResolverManglenamespaces = resourceResolverManglenamespaces;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverManglenamespaces(ConfigNodePropertyBoolean resourceResolverManglenamespaces) {
    this.resourceResolverManglenamespaces = resourceResolverManglenamespaces;
    return this;
  }

 /**
   * Get resourceResolverAllowDirect
   * @return resourceResolverAllowDirect
  **/
  @JsonProperty("resource.resolver.allowDirect")
  public ConfigNodePropertyBoolean getResourceResolverAllowDirect() {
    return resourceResolverAllowDirect;
  }

  public void setResourceResolverAllowDirect(ConfigNodePropertyBoolean resourceResolverAllowDirect) {
    this.resourceResolverAllowDirect = resourceResolverAllowDirect;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverAllowDirect(ConfigNodePropertyBoolean resourceResolverAllowDirect) {
    this.resourceResolverAllowDirect = resourceResolverAllowDirect;
    return this;
  }

 /**
   * Get resourceResolverRequiredProviders
   * @return resourceResolverRequiredProviders
  **/
  @JsonProperty("resource.resolver.required.providers")
  public ConfigNodePropertyArray getResourceResolverRequiredProviders() {
    return resourceResolverRequiredProviders;
  }

  public void setResourceResolverRequiredProviders(ConfigNodePropertyArray resourceResolverRequiredProviders) {
    this.resourceResolverRequiredProviders = resourceResolverRequiredProviders;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverRequiredProviders(ConfigNodePropertyArray resourceResolverRequiredProviders) {
    this.resourceResolverRequiredProviders = resourceResolverRequiredProviders;
    return this;
  }

 /**
   * Get resourceResolverRequiredProvidernames
   * @return resourceResolverRequiredProvidernames
  **/
  @JsonProperty("resource.resolver.required.providernames")
  public ConfigNodePropertyArray getResourceResolverRequiredProvidernames() {
    return resourceResolverRequiredProvidernames;
  }

  public void setResourceResolverRequiredProvidernames(ConfigNodePropertyArray resourceResolverRequiredProvidernames) {
    this.resourceResolverRequiredProvidernames = resourceResolverRequiredProvidernames;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverRequiredProvidernames(ConfigNodePropertyArray resourceResolverRequiredProvidernames) {
    this.resourceResolverRequiredProvidernames = resourceResolverRequiredProvidernames;
    return this;
  }

 /**
   * Get resourceResolverVirtual
   * @return resourceResolverVirtual
  **/
  @JsonProperty("resource.resolver.virtual")
  public ConfigNodePropertyArray getResourceResolverVirtual() {
    return resourceResolverVirtual;
  }

  public void setResourceResolverVirtual(ConfigNodePropertyArray resourceResolverVirtual) {
    this.resourceResolverVirtual = resourceResolverVirtual;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverVirtual(ConfigNodePropertyArray resourceResolverVirtual) {
    this.resourceResolverVirtual = resourceResolverVirtual;
    return this;
  }

 /**
   * Get resourceResolverMapping
   * @return resourceResolverMapping
  **/
  @JsonProperty("resource.resolver.mapping")
  public ConfigNodePropertyArray getResourceResolverMapping() {
    return resourceResolverMapping;
  }

  public void setResourceResolverMapping(ConfigNodePropertyArray resourceResolverMapping) {
    this.resourceResolverMapping = resourceResolverMapping;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverMapping(ConfigNodePropertyArray resourceResolverMapping) {
    this.resourceResolverMapping = resourceResolverMapping;
    return this;
  }

 /**
   * Get resourceResolverMapLocation
   * @return resourceResolverMapLocation
  **/
  @JsonProperty("resource.resolver.map.location")
  public ConfigNodePropertyString getResourceResolverMapLocation() {
    return resourceResolverMapLocation;
  }

  public void setResourceResolverMapLocation(ConfigNodePropertyString resourceResolverMapLocation) {
    this.resourceResolverMapLocation = resourceResolverMapLocation;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverMapLocation(ConfigNodePropertyString resourceResolverMapLocation) {
    this.resourceResolverMapLocation = resourceResolverMapLocation;
    return this;
  }

 /**
   * Get resourceResolverMapObservation
   * @return resourceResolverMapObservation
  **/
  @JsonProperty("resource.resolver.map.observation")
  public ConfigNodePropertyArray getResourceResolverMapObservation() {
    return resourceResolverMapObservation;
  }

  public void setResourceResolverMapObservation(ConfigNodePropertyArray resourceResolverMapObservation) {
    this.resourceResolverMapObservation = resourceResolverMapObservation;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverMapObservation(ConfigNodePropertyArray resourceResolverMapObservation) {
    this.resourceResolverMapObservation = resourceResolverMapObservation;
    return this;
  }

 /**
   * Get resourceResolverDefaultVanityRedirectStatus
   * @return resourceResolverDefaultVanityRedirectStatus
  **/
  @JsonProperty("resource.resolver.default.vanity.redirect.status")
  public ConfigNodePropertyInteger getResourceResolverDefaultVanityRedirectStatus() {
    return resourceResolverDefaultVanityRedirectStatus;
  }

  public void setResourceResolverDefaultVanityRedirectStatus(ConfigNodePropertyInteger resourceResolverDefaultVanityRedirectStatus) {
    this.resourceResolverDefaultVanityRedirectStatus = resourceResolverDefaultVanityRedirectStatus;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverDefaultVanityRedirectStatus(ConfigNodePropertyInteger resourceResolverDefaultVanityRedirectStatus) {
    this.resourceResolverDefaultVanityRedirectStatus = resourceResolverDefaultVanityRedirectStatus;
    return this;
  }

 /**
   * Get resourceResolverEnableVanitypath
   * @return resourceResolverEnableVanitypath
  **/
  @JsonProperty("resource.resolver.enable.vanitypath")
  public ConfigNodePropertyBoolean getResourceResolverEnableVanitypath() {
    return resourceResolverEnableVanitypath;
  }

  public void setResourceResolverEnableVanitypath(ConfigNodePropertyBoolean resourceResolverEnableVanitypath) {
    this.resourceResolverEnableVanitypath = resourceResolverEnableVanitypath;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverEnableVanitypath(ConfigNodePropertyBoolean resourceResolverEnableVanitypath) {
    this.resourceResolverEnableVanitypath = resourceResolverEnableVanitypath;
    return this;
  }

 /**
   * Get resourceResolverVanitypathMaxEntries
   * @return resourceResolverVanitypathMaxEntries
  **/
  @JsonProperty("resource.resolver.vanitypath.maxEntries")
  public ConfigNodePropertyInteger getResourceResolverVanitypathMaxEntries() {
    return resourceResolverVanitypathMaxEntries;
  }

  public void setResourceResolverVanitypathMaxEntries(ConfigNodePropertyInteger resourceResolverVanitypathMaxEntries) {
    this.resourceResolverVanitypathMaxEntries = resourceResolverVanitypathMaxEntries;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverVanitypathMaxEntries(ConfigNodePropertyInteger resourceResolverVanitypathMaxEntries) {
    this.resourceResolverVanitypathMaxEntries = resourceResolverVanitypathMaxEntries;
    return this;
  }

 /**
   * Get resourceResolverVanitypathMaxEntriesStartup
   * @return resourceResolverVanitypathMaxEntriesStartup
  **/
  @JsonProperty("resource.resolver.vanitypath.maxEntries.startup")
  public ConfigNodePropertyBoolean getResourceResolverVanitypathMaxEntriesStartup() {
    return resourceResolverVanitypathMaxEntriesStartup;
  }

  public void setResourceResolverVanitypathMaxEntriesStartup(ConfigNodePropertyBoolean resourceResolverVanitypathMaxEntriesStartup) {
    this.resourceResolverVanitypathMaxEntriesStartup = resourceResolverVanitypathMaxEntriesStartup;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverVanitypathMaxEntriesStartup(ConfigNodePropertyBoolean resourceResolverVanitypathMaxEntriesStartup) {
    this.resourceResolverVanitypathMaxEntriesStartup = resourceResolverVanitypathMaxEntriesStartup;
    return this;
  }

 /**
   * Get resourceResolverVanitypathBloomfilterMaxBytes
   * @return resourceResolverVanitypathBloomfilterMaxBytes
  **/
  @JsonProperty("resource.resolver.vanitypath.bloomfilter.maxBytes")
  public ConfigNodePropertyInteger getResourceResolverVanitypathBloomfilterMaxBytes() {
    return resourceResolverVanitypathBloomfilterMaxBytes;
  }

  public void setResourceResolverVanitypathBloomfilterMaxBytes(ConfigNodePropertyInteger resourceResolverVanitypathBloomfilterMaxBytes) {
    this.resourceResolverVanitypathBloomfilterMaxBytes = resourceResolverVanitypathBloomfilterMaxBytes;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverVanitypathBloomfilterMaxBytes(ConfigNodePropertyInteger resourceResolverVanitypathBloomfilterMaxBytes) {
    this.resourceResolverVanitypathBloomfilterMaxBytes = resourceResolverVanitypathBloomfilterMaxBytes;
    return this;
  }

 /**
   * Get resourceResolverOptimizeAliasResolution
   * @return resourceResolverOptimizeAliasResolution
  **/
  @JsonProperty("resource.resolver.optimize.alias.resolution")
  public ConfigNodePropertyBoolean getResourceResolverOptimizeAliasResolution() {
    return resourceResolverOptimizeAliasResolution;
  }

  public void setResourceResolverOptimizeAliasResolution(ConfigNodePropertyBoolean resourceResolverOptimizeAliasResolution) {
    this.resourceResolverOptimizeAliasResolution = resourceResolverOptimizeAliasResolution;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverOptimizeAliasResolution(ConfigNodePropertyBoolean resourceResolverOptimizeAliasResolution) {
    this.resourceResolverOptimizeAliasResolution = resourceResolverOptimizeAliasResolution;
    return this;
  }

 /**
   * Get resourceResolverVanitypathWhitelist
   * @return resourceResolverVanitypathWhitelist
  **/
  @JsonProperty("resource.resolver.vanitypath.whitelist")
  public ConfigNodePropertyArray getResourceResolverVanitypathWhitelist() {
    return resourceResolverVanitypathWhitelist;
  }

  public void setResourceResolverVanitypathWhitelist(ConfigNodePropertyArray resourceResolverVanitypathWhitelist) {
    this.resourceResolverVanitypathWhitelist = resourceResolverVanitypathWhitelist;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverVanitypathWhitelist(ConfigNodePropertyArray resourceResolverVanitypathWhitelist) {
    this.resourceResolverVanitypathWhitelist = resourceResolverVanitypathWhitelist;
    return this;
  }

 /**
   * Get resourceResolverVanitypathBlacklist
   * @return resourceResolverVanitypathBlacklist
  **/
  @JsonProperty("resource.resolver.vanitypath.blacklist")
  public ConfigNodePropertyArray getResourceResolverVanitypathBlacklist() {
    return resourceResolverVanitypathBlacklist;
  }

  public void setResourceResolverVanitypathBlacklist(ConfigNodePropertyArray resourceResolverVanitypathBlacklist) {
    this.resourceResolverVanitypathBlacklist = resourceResolverVanitypathBlacklist;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverVanitypathBlacklist(ConfigNodePropertyArray resourceResolverVanitypathBlacklist) {
    this.resourceResolverVanitypathBlacklist = resourceResolverVanitypathBlacklist;
    return this;
  }

 /**
   * Get resourceResolverVanityPrecedence
   * @return resourceResolverVanityPrecedence
  **/
  @JsonProperty("resource.resolver.vanity.precedence")
  public ConfigNodePropertyBoolean getResourceResolverVanityPrecedence() {
    return resourceResolverVanityPrecedence;
  }

  public void setResourceResolverVanityPrecedence(ConfigNodePropertyBoolean resourceResolverVanityPrecedence) {
    this.resourceResolverVanityPrecedence = resourceResolverVanityPrecedence;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverVanityPrecedence(ConfigNodePropertyBoolean resourceResolverVanityPrecedence) {
    this.resourceResolverVanityPrecedence = resourceResolverVanityPrecedence;
    return this;
  }

 /**
   * Get resourceResolverProviderhandlingParanoid
   * @return resourceResolverProviderhandlingParanoid
  **/
  @JsonProperty("resource.resolver.providerhandling.paranoid")
  public ConfigNodePropertyBoolean getResourceResolverProviderhandlingParanoid() {
    return resourceResolverProviderhandlingParanoid;
  }

  public void setResourceResolverProviderhandlingParanoid(ConfigNodePropertyBoolean resourceResolverProviderhandlingParanoid) {
    this.resourceResolverProviderhandlingParanoid = resourceResolverProviderhandlingParanoid;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverProviderhandlingParanoid(ConfigNodePropertyBoolean resourceResolverProviderhandlingParanoid) {
    this.resourceResolverProviderhandlingParanoid = resourceResolverProviderhandlingParanoid;
    return this;
  }

 /**
   * Get resourceResolverLogClosing
   * @return resourceResolverLogClosing
  **/
  @JsonProperty("resource.resolver.log.closing")
  public ConfigNodePropertyBoolean getResourceResolverLogClosing() {
    return resourceResolverLogClosing;
  }

  public void setResourceResolverLogClosing(ConfigNodePropertyBoolean resourceResolverLogClosing) {
    this.resourceResolverLogClosing = resourceResolverLogClosing;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverLogClosing(ConfigNodePropertyBoolean resourceResolverLogClosing) {
    this.resourceResolverLogClosing = resourceResolverLogClosing;
    return this;
  }

 /**
   * Get resourceResolverLogUnclosed
   * @return resourceResolverLogUnclosed
  **/
  @JsonProperty("resource.resolver.log.unclosed")
  public ConfigNodePropertyBoolean getResourceResolverLogUnclosed() {
    return resourceResolverLogUnclosed;
  }

  public void setResourceResolverLogUnclosed(ConfigNodePropertyBoolean resourceResolverLogUnclosed) {
    this.resourceResolverLogUnclosed = resourceResolverLogUnclosed;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverLogUnclosed(ConfigNodePropertyBoolean resourceResolverLogUnclosed) {
    this.resourceResolverLogUnclosed = resourceResolverLogUnclosed;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

