package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
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
  
  @ApiModelProperty(value = "")
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

