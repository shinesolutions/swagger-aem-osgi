package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



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


  /**
   **/
  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverSearchpath(ConfigNodePropertyArray resourceResolverSearchpath) {
    this.resourceResolverSearchpath = resourceResolverSearchpath;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("resource.resolver.searchpath")
  public ConfigNodePropertyArray getResourceResolverSearchpath() {
    return resourceResolverSearchpath;
  }
  public void setResourceResolverSearchpath(ConfigNodePropertyArray resourceResolverSearchpath) {
    this.resourceResolverSearchpath = resourceResolverSearchpath;
  }


  /**
   **/
  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverManglenamespaces(ConfigNodePropertyBoolean resourceResolverManglenamespaces) {
    this.resourceResolverManglenamespaces = resourceResolverManglenamespaces;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("resource.resolver.manglenamespaces")
  public ConfigNodePropertyBoolean getResourceResolverManglenamespaces() {
    return resourceResolverManglenamespaces;
  }
  public void setResourceResolverManglenamespaces(ConfigNodePropertyBoolean resourceResolverManglenamespaces) {
    this.resourceResolverManglenamespaces = resourceResolverManglenamespaces;
  }


  /**
   **/
  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverAllowDirect(ConfigNodePropertyBoolean resourceResolverAllowDirect) {
    this.resourceResolverAllowDirect = resourceResolverAllowDirect;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("resource.resolver.allowDirect")
  public ConfigNodePropertyBoolean getResourceResolverAllowDirect() {
    return resourceResolverAllowDirect;
  }
  public void setResourceResolverAllowDirect(ConfigNodePropertyBoolean resourceResolverAllowDirect) {
    this.resourceResolverAllowDirect = resourceResolverAllowDirect;
  }


  /**
   **/
  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverRequiredProviders(ConfigNodePropertyArray resourceResolverRequiredProviders) {
    this.resourceResolverRequiredProviders = resourceResolverRequiredProviders;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("resource.resolver.required.providers")
  public ConfigNodePropertyArray getResourceResolverRequiredProviders() {
    return resourceResolverRequiredProviders;
  }
  public void setResourceResolverRequiredProviders(ConfigNodePropertyArray resourceResolverRequiredProviders) {
    this.resourceResolverRequiredProviders = resourceResolverRequiredProviders;
  }


  /**
   **/
  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverRequiredProvidernames(ConfigNodePropertyArray resourceResolverRequiredProvidernames) {
    this.resourceResolverRequiredProvidernames = resourceResolverRequiredProvidernames;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("resource.resolver.required.providernames")
  public ConfigNodePropertyArray getResourceResolverRequiredProvidernames() {
    return resourceResolverRequiredProvidernames;
  }
  public void setResourceResolverRequiredProvidernames(ConfigNodePropertyArray resourceResolverRequiredProvidernames) {
    this.resourceResolverRequiredProvidernames = resourceResolverRequiredProvidernames;
  }


  /**
   **/
  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverVirtual(ConfigNodePropertyArray resourceResolverVirtual) {
    this.resourceResolverVirtual = resourceResolverVirtual;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("resource.resolver.virtual")
  public ConfigNodePropertyArray getResourceResolverVirtual() {
    return resourceResolverVirtual;
  }
  public void setResourceResolverVirtual(ConfigNodePropertyArray resourceResolverVirtual) {
    this.resourceResolverVirtual = resourceResolverVirtual;
  }


  /**
   **/
  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverMapping(ConfigNodePropertyArray resourceResolverMapping) {
    this.resourceResolverMapping = resourceResolverMapping;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("resource.resolver.mapping")
  public ConfigNodePropertyArray getResourceResolverMapping() {
    return resourceResolverMapping;
  }
  public void setResourceResolverMapping(ConfigNodePropertyArray resourceResolverMapping) {
    this.resourceResolverMapping = resourceResolverMapping;
  }


  /**
   **/
  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverMapLocation(ConfigNodePropertyString resourceResolverMapLocation) {
    this.resourceResolverMapLocation = resourceResolverMapLocation;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("resource.resolver.map.location")
  public ConfigNodePropertyString getResourceResolverMapLocation() {
    return resourceResolverMapLocation;
  }
  public void setResourceResolverMapLocation(ConfigNodePropertyString resourceResolverMapLocation) {
    this.resourceResolverMapLocation = resourceResolverMapLocation;
  }


  /**
   **/
  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverMapObservation(ConfigNodePropertyArray resourceResolverMapObservation) {
    this.resourceResolverMapObservation = resourceResolverMapObservation;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("resource.resolver.map.observation")
  public ConfigNodePropertyArray getResourceResolverMapObservation() {
    return resourceResolverMapObservation;
  }
  public void setResourceResolverMapObservation(ConfigNodePropertyArray resourceResolverMapObservation) {
    this.resourceResolverMapObservation = resourceResolverMapObservation;
  }


  /**
   **/
  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverDefaultVanityRedirectStatus(ConfigNodePropertyInteger resourceResolverDefaultVanityRedirectStatus) {
    this.resourceResolverDefaultVanityRedirectStatus = resourceResolverDefaultVanityRedirectStatus;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("resource.resolver.default.vanity.redirect.status")
  public ConfigNodePropertyInteger getResourceResolverDefaultVanityRedirectStatus() {
    return resourceResolverDefaultVanityRedirectStatus;
  }
  public void setResourceResolverDefaultVanityRedirectStatus(ConfigNodePropertyInteger resourceResolverDefaultVanityRedirectStatus) {
    this.resourceResolverDefaultVanityRedirectStatus = resourceResolverDefaultVanityRedirectStatus;
  }


  /**
   **/
  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverEnableVanitypath(ConfigNodePropertyBoolean resourceResolverEnableVanitypath) {
    this.resourceResolverEnableVanitypath = resourceResolverEnableVanitypath;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("resource.resolver.enable.vanitypath")
  public ConfigNodePropertyBoolean getResourceResolverEnableVanitypath() {
    return resourceResolverEnableVanitypath;
  }
  public void setResourceResolverEnableVanitypath(ConfigNodePropertyBoolean resourceResolverEnableVanitypath) {
    this.resourceResolverEnableVanitypath = resourceResolverEnableVanitypath;
  }


  /**
   **/
  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverVanitypathMaxEntries(ConfigNodePropertyInteger resourceResolverVanitypathMaxEntries) {
    this.resourceResolverVanitypathMaxEntries = resourceResolverVanitypathMaxEntries;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("resource.resolver.vanitypath.maxEntries")
  public ConfigNodePropertyInteger getResourceResolverVanitypathMaxEntries() {
    return resourceResolverVanitypathMaxEntries;
  }
  public void setResourceResolverVanitypathMaxEntries(ConfigNodePropertyInteger resourceResolverVanitypathMaxEntries) {
    this.resourceResolverVanitypathMaxEntries = resourceResolverVanitypathMaxEntries;
  }


  /**
   **/
  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverVanitypathMaxEntriesStartup(ConfigNodePropertyBoolean resourceResolverVanitypathMaxEntriesStartup) {
    this.resourceResolverVanitypathMaxEntriesStartup = resourceResolverVanitypathMaxEntriesStartup;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("resource.resolver.vanitypath.maxEntries.startup")
  public ConfigNodePropertyBoolean getResourceResolverVanitypathMaxEntriesStartup() {
    return resourceResolverVanitypathMaxEntriesStartup;
  }
  public void setResourceResolverVanitypathMaxEntriesStartup(ConfigNodePropertyBoolean resourceResolverVanitypathMaxEntriesStartup) {
    this.resourceResolverVanitypathMaxEntriesStartup = resourceResolverVanitypathMaxEntriesStartup;
  }


  /**
   **/
  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverVanitypathBloomfilterMaxBytes(ConfigNodePropertyInteger resourceResolverVanitypathBloomfilterMaxBytes) {
    this.resourceResolverVanitypathBloomfilterMaxBytes = resourceResolverVanitypathBloomfilterMaxBytes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("resource.resolver.vanitypath.bloomfilter.maxBytes")
  public ConfigNodePropertyInteger getResourceResolverVanitypathBloomfilterMaxBytes() {
    return resourceResolverVanitypathBloomfilterMaxBytes;
  }
  public void setResourceResolverVanitypathBloomfilterMaxBytes(ConfigNodePropertyInteger resourceResolverVanitypathBloomfilterMaxBytes) {
    this.resourceResolverVanitypathBloomfilterMaxBytes = resourceResolverVanitypathBloomfilterMaxBytes;
  }


  /**
   **/
  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverOptimizeAliasResolution(ConfigNodePropertyBoolean resourceResolverOptimizeAliasResolution) {
    this.resourceResolverOptimizeAliasResolution = resourceResolverOptimizeAliasResolution;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("resource.resolver.optimize.alias.resolution")
  public ConfigNodePropertyBoolean getResourceResolverOptimizeAliasResolution() {
    return resourceResolverOptimizeAliasResolution;
  }
  public void setResourceResolverOptimizeAliasResolution(ConfigNodePropertyBoolean resourceResolverOptimizeAliasResolution) {
    this.resourceResolverOptimizeAliasResolution = resourceResolverOptimizeAliasResolution;
  }


  /**
   **/
  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverVanitypathWhitelist(ConfigNodePropertyArray resourceResolverVanitypathWhitelist) {
    this.resourceResolverVanitypathWhitelist = resourceResolverVanitypathWhitelist;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("resource.resolver.vanitypath.whitelist")
  public ConfigNodePropertyArray getResourceResolverVanitypathWhitelist() {
    return resourceResolverVanitypathWhitelist;
  }
  public void setResourceResolverVanitypathWhitelist(ConfigNodePropertyArray resourceResolverVanitypathWhitelist) {
    this.resourceResolverVanitypathWhitelist = resourceResolverVanitypathWhitelist;
  }


  /**
   **/
  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverVanitypathBlacklist(ConfigNodePropertyArray resourceResolverVanitypathBlacklist) {
    this.resourceResolverVanitypathBlacklist = resourceResolverVanitypathBlacklist;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("resource.resolver.vanitypath.blacklist")
  public ConfigNodePropertyArray getResourceResolverVanitypathBlacklist() {
    return resourceResolverVanitypathBlacklist;
  }
  public void setResourceResolverVanitypathBlacklist(ConfigNodePropertyArray resourceResolverVanitypathBlacklist) {
    this.resourceResolverVanitypathBlacklist = resourceResolverVanitypathBlacklist;
  }


  /**
   **/
  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverVanityPrecedence(ConfigNodePropertyBoolean resourceResolverVanityPrecedence) {
    this.resourceResolverVanityPrecedence = resourceResolverVanityPrecedence;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("resource.resolver.vanity.precedence")
  public ConfigNodePropertyBoolean getResourceResolverVanityPrecedence() {
    return resourceResolverVanityPrecedence;
  }
  public void setResourceResolverVanityPrecedence(ConfigNodePropertyBoolean resourceResolverVanityPrecedence) {
    this.resourceResolverVanityPrecedence = resourceResolverVanityPrecedence;
  }


  /**
   **/
  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverProviderhandlingParanoid(ConfigNodePropertyBoolean resourceResolverProviderhandlingParanoid) {
    this.resourceResolverProviderhandlingParanoid = resourceResolverProviderhandlingParanoid;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("resource.resolver.providerhandling.paranoid")
  public ConfigNodePropertyBoolean getResourceResolverProviderhandlingParanoid() {
    return resourceResolverProviderhandlingParanoid;
  }
  public void setResourceResolverProviderhandlingParanoid(ConfigNodePropertyBoolean resourceResolverProviderhandlingParanoid) {
    this.resourceResolverProviderhandlingParanoid = resourceResolverProviderhandlingParanoid;
  }


  /**
   **/
  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverLogClosing(ConfigNodePropertyBoolean resourceResolverLogClosing) {
    this.resourceResolverLogClosing = resourceResolverLogClosing;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("resource.resolver.log.closing")
  public ConfigNodePropertyBoolean getResourceResolverLogClosing() {
    return resourceResolverLogClosing;
  }
  public void setResourceResolverLogClosing(ConfigNodePropertyBoolean resourceResolverLogClosing) {
    this.resourceResolverLogClosing = resourceResolverLogClosing;
  }


  /**
   **/
  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverLogUnclosed(ConfigNodePropertyBoolean resourceResolverLogUnclosed) {
    this.resourceResolverLogUnclosed = resourceResolverLogUnclosed;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("resource.resolver.log.unclosed")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

