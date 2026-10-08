package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties
 */

@JsonTypeName("orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray resourceResolverSearchpath;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean resourceResolverManglenamespaces;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean resourceResolverAllowDirect;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray resourceResolverRequiredProviders;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray resourceResolverRequiredProvidernames;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray resourceResolverVirtual;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray resourceResolverMapping;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString resourceResolverMapLocation;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray resourceResolverMapObservation;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger resourceResolverDefaultVanityRedirectStatus;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean resourceResolverEnableVanitypath;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger resourceResolverVanitypathMaxEntries;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean resourceResolverVanitypathMaxEntriesStartup;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger resourceResolverVanitypathBloomfilterMaxBytes;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean resourceResolverOptimizeAliasResolution;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray resourceResolverVanitypathWhitelist;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray resourceResolverVanitypathBlacklist;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean resourceResolverVanityPrecedence;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean resourceResolverProviderhandlingParanoid;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean resourceResolverLogClosing;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean resourceResolverLogUnclosed;

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverSearchpath(@Nullable ConfigNodePropertyArray resourceResolverSearchpath) {
    this.resourceResolverSearchpath = resourceResolverSearchpath;
    return this;
  }

  /**
   * Get resourceResolverSearchpath
   * @return resourceResolverSearchpath
   */
  @Valid 
  @Schema(name = "resource.resolver.searchpath", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource.resolver.searchpath")
  public @Nullable ConfigNodePropertyArray getResourceResolverSearchpath() {
    return resourceResolverSearchpath;
  }

  @JsonProperty("resource.resolver.searchpath")
  public void setResourceResolverSearchpath(@Nullable ConfigNodePropertyArray resourceResolverSearchpath) {
    this.resourceResolverSearchpath = resourceResolverSearchpath;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverManglenamespaces(@Nullable ConfigNodePropertyBoolean resourceResolverManglenamespaces) {
    this.resourceResolverManglenamespaces = resourceResolverManglenamespaces;
    return this;
  }

  /**
   * Get resourceResolverManglenamespaces
   * @return resourceResolverManglenamespaces
   */
  @Valid 
  @Schema(name = "resource.resolver.manglenamespaces", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource.resolver.manglenamespaces")
  public @Nullable ConfigNodePropertyBoolean getResourceResolverManglenamespaces() {
    return resourceResolverManglenamespaces;
  }

  @JsonProperty("resource.resolver.manglenamespaces")
  public void setResourceResolverManglenamespaces(@Nullable ConfigNodePropertyBoolean resourceResolverManglenamespaces) {
    this.resourceResolverManglenamespaces = resourceResolverManglenamespaces;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverAllowDirect(@Nullable ConfigNodePropertyBoolean resourceResolverAllowDirect) {
    this.resourceResolverAllowDirect = resourceResolverAllowDirect;
    return this;
  }

  /**
   * Get resourceResolverAllowDirect
   * @return resourceResolverAllowDirect
   */
  @Valid 
  @Schema(name = "resource.resolver.allowDirect", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource.resolver.allowDirect")
  public @Nullable ConfigNodePropertyBoolean getResourceResolverAllowDirect() {
    return resourceResolverAllowDirect;
  }

  @JsonProperty("resource.resolver.allowDirect")
  public void setResourceResolverAllowDirect(@Nullable ConfigNodePropertyBoolean resourceResolverAllowDirect) {
    this.resourceResolverAllowDirect = resourceResolverAllowDirect;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverRequiredProviders(@Nullable ConfigNodePropertyArray resourceResolverRequiredProviders) {
    this.resourceResolverRequiredProviders = resourceResolverRequiredProviders;
    return this;
  }

  /**
   * Get resourceResolverRequiredProviders
   * @return resourceResolverRequiredProviders
   */
  @Valid 
  @Schema(name = "resource.resolver.required.providers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource.resolver.required.providers")
  public @Nullable ConfigNodePropertyArray getResourceResolverRequiredProviders() {
    return resourceResolverRequiredProviders;
  }

  @JsonProperty("resource.resolver.required.providers")
  public void setResourceResolverRequiredProviders(@Nullable ConfigNodePropertyArray resourceResolverRequiredProviders) {
    this.resourceResolverRequiredProviders = resourceResolverRequiredProviders;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverRequiredProvidernames(@Nullable ConfigNodePropertyArray resourceResolverRequiredProvidernames) {
    this.resourceResolverRequiredProvidernames = resourceResolverRequiredProvidernames;
    return this;
  }

  /**
   * Get resourceResolverRequiredProvidernames
   * @return resourceResolverRequiredProvidernames
   */
  @Valid 
  @Schema(name = "resource.resolver.required.providernames", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource.resolver.required.providernames")
  public @Nullable ConfigNodePropertyArray getResourceResolverRequiredProvidernames() {
    return resourceResolverRequiredProvidernames;
  }

  @JsonProperty("resource.resolver.required.providernames")
  public void setResourceResolverRequiredProvidernames(@Nullable ConfigNodePropertyArray resourceResolverRequiredProvidernames) {
    this.resourceResolverRequiredProvidernames = resourceResolverRequiredProvidernames;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverVirtual(@Nullable ConfigNodePropertyArray resourceResolverVirtual) {
    this.resourceResolverVirtual = resourceResolverVirtual;
    return this;
  }

  /**
   * Get resourceResolverVirtual
   * @return resourceResolverVirtual
   */
  @Valid 
  @Schema(name = "resource.resolver.virtual", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource.resolver.virtual")
  public @Nullable ConfigNodePropertyArray getResourceResolverVirtual() {
    return resourceResolverVirtual;
  }

  @JsonProperty("resource.resolver.virtual")
  public void setResourceResolverVirtual(@Nullable ConfigNodePropertyArray resourceResolverVirtual) {
    this.resourceResolverVirtual = resourceResolverVirtual;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverMapping(@Nullable ConfigNodePropertyArray resourceResolverMapping) {
    this.resourceResolverMapping = resourceResolverMapping;
    return this;
  }

  /**
   * Get resourceResolverMapping
   * @return resourceResolverMapping
   */
  @Valid 
  @Schema(name = "resource.resolver.mapping", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource.resolver.mapping")
  public @Nullable ConfigNodePropertyArray getResourceResolverMapping() {
    return resourceResolverMapping;
  }

  @JsonProperty("resource.resolver.mapping")
  public void setResourceResolverMapping(@Nullable ConfigNodePropertyArray resourceResolverMapping) {
    this.resourceResolverMapping = resourceResolverMapping;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverMapLocation(@Nullable ConfigNodePropertyString resourceResolverMapLocation) {
    this.resourceResolverMapLocation = resourceResolverMapLocation;
    return this;
  }

  /**
   * Get resourceResolverMapLocation
   * @return resourceResolverMapLocation
   */
  @Valid 
  @Schema(name = "resource.resolver.map.location", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource.resolver.map.location")
  public @Nullable ConfigNodePropertyString getResourceResolverMapLocation() {
    return resourceResolverMapLocation;
  }

  @JsonProperty("resource.resolver.map.location")
  public void setResourceResolverMapLocation(@Nullable ConfigNodePropertyString resourceResolverMapLocation) {
    this.resourceResolverMapLocation = resourceResolverMapLocation;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverMapObservation(@Nullable ConfigNodePropertyArray resourceResolverMapObservation) {
    this.resourceResolverMapObservation = resourceResolverMapObservation;
    return this;
  }

  /**
   * Get resourceResolverMapObservation
   * @return resourceResolverMapObservation
   */
  @Valid 
  @Schema(name = "resource.resolver.map.observation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource.resolver.map.observation")
  public @Nullable ConfigNodePropertyArray getResourceResolverMapObservation() {
    return resourceResolverMapObservation;
  }

  @JsonProperty("resource.resolver.map.observation")
  public void setResourceResolverMapObservation(@Nullable ConfigNodePropertyArray resourceResolverMapObservation) {
    this.resourceResolverMapObservation = resourceResolverMapObservation;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverDefaultVanityRedirectStatus(@Nullable ConfigNodePropertyInteger resourceResolverDefaultVanityRedirectStatus) {
    this.resourceResolverDefaultVanityRedirectStatus = resourceResolverDefaultVanityRedirectStatus;
    return this;
  }

  /**
   * Get resourceResolverDefaultVanityRedirectStatus
   * @return resourceResolverDefaultVanityRedirectStatus
   */
  @Valid 
  @Schema(name = "resource.resolver.default.vanity.redirect.status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource.resolver.default.vanity.redirect.status")
  public @Nullable ConfigNodePropertyInteger getResourceResolverDefaultVanityRedirectStatus() {
    return resourceResolverDefaultVanityRedirectStatus;
  }

  @JsonProperty("resource.resolver.default.vanity.redirect.status")
  public void setResourceResolverDefaultVanityRedirectStatus(@Nullable ConfigNodePropertyInteger resourceResolverDefaultVanityRedirectStatus) {
    this.resourceResolverDefaultVanityRedirectStatus = resourceResolverDefaultVanityRedirectStatus;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverEnableVanitypath(@Nullable ConfigNodePropertyBoolean resourceResolverEnableVanitypath) {
    this.resourceResolverEnableVanitypath = resourceResolverEnableVanitypath;
    return this;
  }

  /**
   * Get resourceResolverEnableVanitypath
   * @return resourceResolverEnableVanitypath
   */
  @Valid 
  @Schema(name = "resource.resolver.enable.vanitypath", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource.resolver.enable.vanitypath")
  public @Nullable ConfigNodePropertyBoolean getResourceResolverEnableVanitypath() {
    return resourceResolverEnableVanitypath;
  }

  @JsonProperty("resource.resolver.enable.vanitypath")
  public void setResourceResolverEnableVanitypath(@Nullable ConfigNodePropertyBoolean resourceResolverEnableVanitypath) {
    this.resourceResolverEnableVanitypath = resourceResolverEnableVanitypath;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverVanitypathMaxEntries(@Nullable ConfigNodePropertyInteger resourceResolverVanitypathMaxEntries) {
    this.resourceResolverVanitypathMaxEntries = resourceResolverVanitypathMaxEntries;
    return this;
  }

  /**
   * Get resourceResolverVanitypathMaxEntries
   * @return resourceResolverVanitypathMaxEntries
   */
  @Valid 
  @Schema(name = "resource.resolver.vanitypath.maxEntries", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource.resolver.vanitypath.maxEntries")
  public @Nullable ConfigNodePropertyInteger getResourceResolverVanitypathMaxEntries() {
    return resourceResolverVanitypathMaxEntries;
  }

  @JsonProperty("resource.resolver.vanitypath.maxEntries")
  public void setResourceResolverVanitypathMaxEntries(@Nullable ConfigNodePropertyInteger resourceResolverVanitypathMaxEntries) {
    this.resourceResolverVanitypathMaxEntries = resourceResolverVanitypathMaxEntries;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverVanitypathMaxEntriesStartup(@Nullable ConfigNodePropertyBoolean resourceResolverVanitypathMaxEntriesStartup) {
    this.resourceResolverVanitypathMaxEntriesStartup = resourceResolverVanitypathMaxEntriesStartup;
    return this;
  }

  /**
   * Get resourceResolverVanitypathMaxEntriesStartup
   * @return resourceResolverVanitypathMaxEntriesStartup
   */
  @Valid 
  @Schema(name = "resource.resolver.vanitypath.maxEntries.startup", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource.resolver.vanitypath.maxEntries.startup")
  public @Nullable ConfigNodePropertyBoolean getResourceResolverVanitypathMaxEntriesStartup() {
    return resourceResolverVanitypathMaxEntriesStartup;
  }

  @JsonProperty("resource.resolver.vanitypath.maxEntries.startup")
  public void setResourceResolverVanitypathMaxEntriesStartup(@Nullable ConfigNodePropertyBoolean resourceResolverVanitypathMaxEntriesStartup) {
    this.resourceResolverVanitypathMaxEntriesStartup = resourceResolverVanitypathMaxEntriesStartup;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverVanitypathBloomfilterMaxBytes(@Nullable ConfigNodePropertyInteger resourceResolverVanitypathBloomfilterMaxBytes) {
    this.resourceResolverVanitypathBloomfilterMaxBytes = resourceResolverVanitypathBloomfilterMaxBytes;
    return this;
  }

  /**
   * Get resourceResolverVanitypathBloomfilterMaxBytes
   * @return resourceResolverVanitypathBloomfilterMaxBytes
   */
  @Valid 
  @Schema(name = "resource.resolver.vanitypath.bloomfilter.maxBytes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource.resolver.vanitypath.bloomfilter.maxBytes")
  public @Nullable ConfigNodePropertyInteger getResourceResolverVanitypathBloomfilterMaxBytes() {
    return resourceResolverVanitypathBloomfilterMaxBytes;
  }

  @JsonProperty("resource.resolver.vanitypath.bloomfilter.maxBytes")
  public void setResourceResolverVanitypathBloomfilterMaxBytes(@Nullable ConfigNodePropertyInteger resourceResolverVanitypathBloomfilterMaxBytes) {
    this.resourceResolverVanitypathBloomfilterMaxBytes = resourceResolverVanitypathBloomfilterMaxBytes;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverOptimizeAliasResolution(@Nullable ConfigNodePropertyBoolean resourceResolverOptimizeAliasResolution) {
    this.resourceResolverOptimizeAliasResolution = resourceResolverOptimizeAliasResolution;
    return this;
  }

  /**
   * Get resourceResolverOptimizeAliasResolution
   * @return resourceResolverOptimizeAliasResolution
   */
  @Valid 
  @Schema(name = "resource.resolver.optimize.alias.resolution", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource.resolver.optimize.alias.resolution")
  public @Nullable ConfigNodePropertyBoolean getResourceResolverOptimizeAliasResolution() {
    return resourceResolverOptimizeAliasResolution;
  }

  @JsonProperty("resource.resolver.optimize.alias.resolution")
  public void setResourceResolverOptimizeAliasResolution(@Nullable ConfigNodePropertyBoolean resourceResolverOptimizeAliasResolution) {
    this.resourceResolverOptimizeAliasResolution = resourceResolverOptimizeAliasResolution;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverVanitypathWhitelist(@Nullable ConfigNodePropertyArray resourceResolverVanitypathWhitelist) {
    this.resourceResolverVanitypathWhitelist = resourceResolverVanitypathWhitelist;
    return this;
  }

  /**
   * Get resourceResolverVanitypathWhitelist
   * @return resourceResolverVanitypathWhitelist
   */
  @Valid 
  @Schema(name = "resource.resolver.vanitypath.whitelist", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource.resolver.vanitypath.whitelist")
  public @Nullable ConfigNodePropertyArray getResourceResolverVanitypathWhitelist() {
    return resourceResolverVanitypathWhitelist;
  }

  @JsonProperty("resource.resolver.vanitypath.whitelist")
  public void setResourceResolverVanitypathWhitelist(@Nullable ConfigNodePropertyArray resourceResolverVanitypathWhitelist) {
    this.resourceResolverVanitypathWhitelist = resourceResolverVanitypathWhitelist;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverVanitypathBlacklist(@Nullable ConfigNodePropertyArray resourceResolverVanitypathBlacklist) {
    this.resourceResolverVanitypathBlacklist = resourceResolverVanitypathBlacklist;
    return this;
  }

  /**
   * Get resourceResolverVanitypathBlacklist
   * @return resourceResolverVanitypathBlacklist
   */
  @Valid 
  @Schema(name = "resource.resolver.vanitypath.blacklist", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource.resolver.vanitypath.blacklist")
  public @Nullable ConfigNodePropertyArray getResourceResolverVanitypathBlacklist() {
    return resourceResolverVanitypathBlacklist;
  }

  @JsonProperty("resource.resolver.vanitypath.blacklist")
  public void setResourceResolverVanitypathBlacklist(@Nullable ConfigNodePropertyArray resourceResolverVanitypathBlacklist) {
    this.resourceResolverVanitypathBlacklist = resourceResolverVanitypathBlacklist;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverVanityPrecedence(@Nullable ConfigNodePropertyBoolean resourceResolverVanityPrecedence) {
    this.resourceResolverVanityPrecedence = resourceResolverVanityPrecedence;
    return this;
  }

  /**
   * Get resourceResolverVanityPrecedence
   * @return resourceResolverVanityPrecedence
   */
  @Valid 
  @Schema(name = "resource.resolver.vanity.precedence", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource.resolver.vanity.precedence")
  public @Nullable ConfigNodePropertyBoolean getResourceResolverVanityPrecedence() {
    return resourceResolverVanityPrecedence;
  }

  @JsonProperty("resource.resolver.vanity.precedence")
  public void setResourceResolverVanityPrecedence(@Nullable ConfigNodePropertyBoolean resourceResolverVanityPrecedence) {
    this.resourceResolverVanityPrecedence = resourceResolverVanityPrecedence;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverProviderhandlingParanoid(@Nullable ConfigNodePropertyBoolean resourceResolverProviderhandlingParanoid) {
    this.resourceResolverProviderhandlingParanoid = resourceResolverProviderhandlingParanoid;
    return this;
  }

  /**
   * Get resourceResolverProviderhandlingParanoid
   * @return resourceResolverProviderhandlingParanoid
   */
  @Valid 
  @Schema(name = "resource.resolver.providerhandling.paranoid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource.resolver.providerhandling.paranoid")
  public @Nullable ConfigNodePropertyBoolean getResourceResolverProviderhandlingParanoid() {
    return resourceResolverProviderhandlingParanoid;
  }

  @JsonProperty("resource.resolver.providerhandling.paranoid")
  public void setResourceResolverProviderhandlingParanoid(@Nullable ConfigNodePropertyBoolean resourceResolverProviderhandlingParanoid) {
    this.resourceResolverProviderhandlingParanoid = resourceResolverProviderhandlingParanoid;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverLogClosing(@Nullable ConfigNodePropertyBoolean resourceResolverLogClosing) {
    this.resourceResolverLogClosing = resourceResolverLogClosing;
    return this;
  }

  /**
   * Get resourceResolverLogClosing
   * @return resourceResolverLogClosing
   */
  @Valid 
  @Schema(name = "resource.resolver.log.closing", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource.resolver.log.closing")
  public @Nullable ConfigNodePropertyBoolean getResourceResolverLogClosing() {
    return resourceResolverLogClosing;
  }

  @JsonProperty("resource.resolver.log.closing")
  public void setResourceResolverLogClosing(@Nullable ConfigNodePropertyBoolean resourceResolverLogClosing) {
    this.resourceResolverLogClosing = resourceResolverLogClosing;
  }

  public OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties resourceResolverLogUnclosed(@Nullable ConfigNodePropertyBoolean resourceResolverLogUnclosed) {
    this.resourceResolverLogUnclosed = resourceResolverLogUnclosed;
    return this;
  }

  /**
   * Get resourceResolverLogUnclosed
   * @return resourceResolverLogUnclosed
   */
  @Valid 
  @Schema(name = "resource.resolver.log.unclosed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource.resolver.log.unclosed")
  public @Nullable ConfigNodePropertyBoolean getResourceResolverLogUnclosed() {
    return resourceResolverLogUnclosed;
  }

  @JsonProperty("resource.resolver.log.unclosed")
  public void setResourceResolverLogUnclosed(@Nullable ConfigNodePropertyBoolean resourceResolverLogUnclosed) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

