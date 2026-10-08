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
 * ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties
 */

@JsonTypeName("comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean htmllibmanagerTiming;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString htmllibmanagerDebugInitJs;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean htmllibmanagerMinify;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean htmllibmanagerDebug;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean htmllibmanagerGzip;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger htmllibmanagerMaxDataUriSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger htmllibmanagerMaxage;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean htmllibmanagerForceCQUrlInfo;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString htmllibmanagerDefaultthemename;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString htmllibmanagerDefaultuserthemename;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString htmllibmanagerClientmanager;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray htmllibmanagerPathList;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray htmllibmanagerExcludedPathList;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray htmllibmanagerProcessorJs;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray htmllibmanagerProcessorCss;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray htmllibmanagerLongcachePatterns;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString htmllibmanagerLongcacheFormat;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean htmllibmanagerUseFileSystemOutputCache;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString htmllibmanagerFileSystemOutputCacheLocation;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray htmllibmanagerDisableReplacement;

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerTiming(@Nullable ConfigNodePropertyBoolean htmllibmanagerTiming) {
    this.htmllibmanagerTiming = htmllibmanagerTiming;
    return this;
  }

  /**
   * Get htmllibmanagerTiming
   * @return htmllibmanagerTiming
   */
  @Valid 
  @Schema(name = "htmllibmanager.timing", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("htmllibmanager.timing")
  public @Nullable ConfigNodePropertyBoolean getHtmllibmanagerTiming() {
    return htmllibmanagerTiming;
  }

  @JsonProperty("htmllibmanager.timing")
  public void setHtmllibmanagerTiming(@Nullable ConfigNodePropertyBoolean htmllibmanagerTiming) {
    this.htmllibmanagerTiming = htmllibmanagerTiming;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerDebugInitJs(@Nullable ConfigNodePropertyString htmllibmanagerDebugInitJs) {
    this.htmllibmanagerDebugInitJs = htmllibmanagerDebugInitJs;
    return this;
  }

  /**
   * Get htmllibmanagerDebugInitJs
   * @return htmllibmanagerDebugInitJs
   */
  @Valid 
  @Schema(name = "htmllibmanager.debug.init.js", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("htmllibmanager.debug.init.js")
  public @Nullable ConfigNodePropertyString getHtmllibmanagerDebugInitJs() {
    return htmllibmanagerDebugInitJs;
  }

  @JsonProperty("htmllibmanager.debug.init.js")
  public void setHtmllibmanagerDebugInitJs(@Nullable ConfigNodePropertyString htmllibmanagerDebugInitJs) {
    this.htmllibmanagerDebugInitJs = htmllibmanagerDebugInitJs;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerMinify(@Nullable ConfigNodePropertyBoolean htmllibmanagerMinify) {
    this.htmllibmanagerMinify = htmllibmanagerMinify;
    return this;
  }

  /**
   * Get htmllibmanagerMinify
   * @return htmllibmanagerMinify
   */
  @Valid 
  @Schema(name = "htmllibmanager.minify", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("htmllibmanager.minify")
  public @Nullable ConfigNodePropertyBoolean getHtmllibmanagerMinify() {
    return htmllibmanagerMinify;
  }

  @JsonProperty("htmllibmanager.minify")
  public void setHtmllibmanagerMinify(@Nullable ConfigNodePropertyBoolean htmllibmanagerMinify) {
    this.htmllibmanagerMinify = htmllibmanagerMinify;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerDebug(@Nullable ConfigNodePropertyBoolean htmllibmanagerDebug) {
    this.htmllibmanagerDebug = htmllibmanagerDebug;
    return this;
  }

  /**
   * Get htmllibmanagerDebug
   * @return htmllibmanagerDebug
   */
  @Valid 
  @Schema(name = "htmllibmanager.debug", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("htmllibmanager.debug")
  public @Nullable ConfigNodePropertyBoolean getHtmllibmanagerDebug() {
    return htmllibmanagerDebug;
  }

  @JsonProperty("htmllibmanager.debug")
  public void setHtmllibmanagerDebug(@Nullable ConfigNodePropertyBoolean htmllibmanagerDebug) {
    this.htmllibmanagerDebug = htmllibmanagerDebug;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerGzip(@Nullable ConfigNodePropertyBoolean htmllibmanagerGzip) {
    this.htmllibmanagerGzip = htmllibmanagerGzip;
    return this;
  }

  /**
   * Get htmllibmanagerGzip
   * @return htmllibmanagerGzip
   */
  @Valid 
  @Schema(name = "htmllibmanager.gzip", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("htmllibmanager.gzip")
  public @Nullable ConfigNodePropertyBoolean getHtmllibmanagerGzip() {
    return htmllibmanagerGzip;
  }

  @JsonProperty("htmllibmanager.gzip")
  public void setHtmllibmanagerGzip(@Nullable ConfigNodePropertyBoolean htmllibmanagerGzip) {
    this.htmllibmanagerGzip = htmllibmanagerGzip;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerMaxDataUriSize(@Nullable ConfigNodePropertyInteger htmllibmanagerMaxDataUriSize) {
    this.htmllibmanagerMaxDataUriSize = htmllibmanagerMaxDataUriSize;
    return this;
  }

  /**
   * Get htmllibmanagerMaxDataUriSize
   * @return htmllibmanagerMaxDataUriSize
   */
  @Valid 
  @Schema(name = "htmllibmanager.maxDataUriSize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("htmllibmanager.maxDataUriSize")
  public @Nullable ConfigNodePropertyInteger getHtmllibmanagerMaxDataUriSize() {
    return htmllibmanagerMaxDataUriSize;
  }

  @JsonProperty("htmllibmanager.maxDataUriSize")
  public void setHtmllibmanagerMaxDataUriSize(@Nullable ConfigNodePropertyInteger htmllibmanagerMaxDataUriSize) {
    this.htmllibmanagerMaxDataUriSize = htmllibmanagerMaxDataUriSize;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerMaxage(@Nullable ConfigNodePropertyInteger htmllibmanagerMaxage) {
    this.htmllibmanagerMaxage = htmllibmanagerMaxage;
    return this;
  }

  /**
   * Get htmllibmanagerMaxage
   * @return htmllibmanagerMaxage
   */
  @Valid 
  @Schema(name = "htmllibmanager.maxage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("htmllibmanager.maxage")
  public @Nullable ConfigNodePropertyInteger getHtmllibmanagerMaxage() {
    return htmllibmanagerMaxage;
  }

  @JsonProperty("htmllibmanager.maxage")
  public void setHtmllibmanagerMaxage(@Nullable ConfigNodePropertyInteger htmllibmanagerMaxage) {
    this.htmllibmanagerMaxage = htmllibmanagerMaxage;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerForceCQUrlInfo(@Nullable ConfigNodePropertyBoolean htmllibmanagerForceCQUrlInfo) {
    this.htmllibmanagerForceCQUrlInfo = htmllibmanagerForceCQUrlInfo;
    return this;
  }

  /**
   * Get htmllibmanagerForceCQUrlInfo
   * @return htmllibmanagerForceCQUrlInfo
   */
  @Valid 
  @Schema(name = "htmllibmanager.forceCQUrlInfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("htmllibmanager.forceCQUrlInfo")
  public @Nullable ConfigNodePropertyBoolean getHtmllibmanagerForceCQUrlInfo() {
    return htmllibmanagerForceCQUrlInfo;
  }

  @JsonProperty("htmllibmanager.forceCQUrlInfo")
  public void setHtmllibmanagerForceCQUrlInfo(@Nullable ConfigNodePropertyBoolean htmllibmanagerForceCQUrlInfo) {
    this.htmllibmanagerForceCQUrlInfo = htmllibmanagerForceCQUrlInfo;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerDefaultthemename(@Nullable ConfigNodePropertyString htmllibmanagerDefaultthemename) {
    this.htmllibmanagerDefaultthemename = htmllibmanagerDefaultthemename;
    return this;
  }

  /**
   * Get htmllibmanagerDefaultthemename
   * @return htmllibmanagerDefaultthemename
   */
  @Valid 
  @Schema(name = "htmllibmanager.defaultthemename", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("htmllibmanager.defaultthemename")
  public @Nullable ConfigNodePropertyString getHtmllibmanagerDefaultthemename() {
    return htmllibmanagerDefaultthemename;
  }

  @JsonProperty("htmllibmanager.defaultthemename")
  public void setHtmllibmanagerDefaultthemename(@Nullable ConfigNodePropertyString htmllibmanagerDefaultthemename) {
    this.htmllibmanagerDefaultthemename = htmllibmanagerDefaultthemename;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerDefaultuserthemename(@Nullable ConfigNodePropertyString htmllibmanagerDefaultuserthemename) {
    this.htmllibmanagerDefaultuserthemename = htmllibmanagerDefaultuserthemename;
    return this;
  }

  /**
   * Get htmllibmanagerDefaultuserthemename
   * @return htmllibmanagerDefaultuserthemename
   */
  @Valid 
  @Schema(name = "htmllibmanager.defaultuserthemename", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("htmllibmanager.defaultuserthemename")
  public @Nullable ConfigNodePropertyString getHtmllibmanagerDefaultuserthemename() {
    return htmllibmanagerDefaultuserthemename;
  }

  @JsonProperty("htmllibmanager.defaultuserthemename")
  public void setHtmllibmanagerDefaultuserthemename(@Nullable ConfigNodePropertyString htmllibmanagerDefaultuserthemename) {
    this.htmllibmanagerDefaultuserthemename = htmllibmanagerDefaultuserthemename;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerClientmanager(@Nullable ConfigNodePropertyString htmllibmanagerClientmanager) {
    this.htmllibmanagerClientmanager = htmllibmanagerClientmanager;
    return this;
  }

  /**
   * Get htmllibmanagerClientmanager
   * @return htmllibmanagerClientmanager
   */
  @Valid 
  @Schema(name = "htmllibmanager.clientmanager", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("htmllibmanager.clientmanager")
  public @Nullable ConfigNodePropertyString getHtmllibmanagerClientmanager() {
    return htmllibmanagerClientmanager;
  }

  @JsonProperty("htmllibmanager.clientmanager")
  public void setHtmllibmanagerClientmanager(@Nullable ConfigNodePropertyString htmllibmanagerClientmanager) {
    this.htmllibmanagerClientmanager = htmllibmanagerClientmanager;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerPathList(@Nullable ConfigNodePropertyArray htmllibmanagerPathList) {
    this.htmllibmanagerPathList = htmllibmanagerPathList;
    return this;
  }

  /**
   * Get htmllibmanagerPathList
   * @return htmllibmanagerPathList
   */
  @Valid 
  @Schema(name = "htmllibmanager.path.list", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("htmllibmanager.path.list")
  public @Nullable ConfigNodePropertyArray getHtmllibmanagerPathList() {
    return htmllibmanagerPathList;
  }

  @JsonProperty("htmllibmanager.path.list")
  public void setHtmllibmanagerPathList(@Nullable ConfigNodePropertyArray htmllibmanagerPathList) {
    this.htmllibmanagerPathList = htmllibmanagerPathList;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerExcludedPathList(@Nullable ConfigNodePropertyArray htmllibmanagerExcludedPathList) {
    this.htmllibmanagerExcludedPathList = htmllibmanagerExcludedPathList;
    return this;
  }

  /**
   * Get htmllibmanagerExcludedPathList
   * @return htmllibmanagerExcludedPathList
   */
  @Valid 
  @Schema(name = "htmllibmanager.excluded.path.list", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("htmllibmanager.excluded.path.list")
  public @Nullable ConfigNodePropertyArray getHtmllibmanagerExcludedPathList() {
    return htmllibmanagerExcludedPathList;
  }

  @JsonProperty("htmllibmanager.excluded.path.list")
  public void setHtmllibmanagerExcludedPathList(@Nullable ConfigNodePropertyArray htmllibmanagerExcludedPathList) {
    this.htmllibmanagerExcludedPathList = htmllibmanagerExcludedPathList;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerProcessorJs(@Nullable ConfigNodePropertyArray htmllibmanagerProcessorJs) {
    this.htmllibmanagerProcessorJs = htmllibmanagerProcessorJs;
    return this;
  }

  /**
   * Get htmllibmanagerProcessorJs
   * @return htmllibmanagerProcessorJs
   */
  @Valid 
  @Schema(name = "htmllibmanager.processor.js", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("htmllibmanager.processor.js")
  public @Nullable ConfigNodePropertyArray getHtmllibmanagerProcessorJs() {
    return htmllibmanagerProcessorJs;
  }

  @JsonProperty("htmllibmanager.processor.js")
  public void setHtmllibmanagerProcessorJs(@Nullable ConfigNodePropertyArray htmllibmanagerProcessorJs) {
    this.htmllibmanagerProcessorJs = htmllibmanagerProcessorJs;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerProcessorCss(@Nullable ConfigNodePropertyArray htmllibmanagerProcessorCss) {
    this.htmllibmanagerProcessorCss = htmllibmanagerProcessorCss;
    return this;
  }

  /**
   * Get htmllibmanagerProcessorCss
   * @return htmllibmanagerProcessorCss
   */
  @Valid 
  @Schema(name = "htmllibmanager.processor.css", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("htmllibmanager.processor.css")
  public @Nullable ConfigNodePropertyArray getHtmllibmanagerProcessorCss() {
    return htmllibmanagerProcessorCss;
  }

  @JsonProperty("htmllibmanager.processor.css")
  public void setHtmllibmanagerProcessorCss(@Nullable ConfigNodePropertyArray htmllibmanagerProcessorCss) {
    this.htmllibmanagerProcessorCss = htmllibmanagerProcessorCss;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerLongcachePatterns(@Nullable ConfigNodePropertyArray htmllibmanagerLongcachePatterns) {
    this.htmllibmanagerLongcachePatterns = htmllibmanagerLongcachePatterns;
    return this;
  }

  /**
   * Get htmllibmanagerLongcachePatterns
   * @return htmllibmanagerLongcachePatterns
   */
  @Valid 
  @Schema(name = "htmllibmanager.longcache.patterns", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("htmllibmanager.longcache.patterns")
  public @Nullable ConfigNodePropertyArray getHtmllibmanagerLongcachePatterns() {
    return htmllibmanagerLongcachePatterns;
  }

  @JsonProperty("htmllibmanager.longcache.patterns")
  public void setHtmllibmanagerLongcachePatterns(@Nullable ConfigNodePropertyArray htmllibmanagerLongcachePatterns) {
    this.htmllibmanagerLongcachePatterns = htmllibmanagerLongcachePatterns;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerLongcacheFormat(@Nullable ConfigNodePropertyString htmllibmanagerLongcacheFormat) {
    this.htmllibmanagerLongcacheFormat = htmllibmanagerLongcacheFormat;
    return this;
  }

  /**
   * Get htmllibmanagerLongcacheFormat
   * @return htmllibmanagerLongcacheFormat
   */
  @Valid 
  @Schema(name = "htmllibmanager.longcache.format", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("htmllibmanager.longcache.format")
  public @Nullable ConfigNodePropertyString getHtmllibmanagerLongcacheFormat() {
    return htmllibmanagerLongcacheFormat;
  }

  @JsonProperty("htmllibmanager.longcache.format")
  public void setHtmllibmanagerLongcacheFormat(@Nullable ConfigNodePropertyString htmllibmanagerLongcacheFormat) {
    this.htmllibmanagerLongcacheFormat = htmllibmanagerLongcacheFormat;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerUseFileSystemOutputCache(@Nullable ConfigNodePropertyBoolean htmllibmanagerUseFileSystemOutputCache) {
    this.htmllibmanagerUseFileSystemOutputCache = htmllibmanagerUseFileSystemOutputCache;
    return this;
  }

  /**
   * Get htmllibmanagerUseFileSystemOutputCache
   * @return htmllibmanagerUseFileSystemOutputCache
   */
  @Valid 
  @Schema(name = "htmllibmanager.useFileSystemOutputCache", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("htmllibmanager.useFileSystemOutputCache")
  public @Nullable ConfigNodePropertyBoolean getHtmllibmanagerUseFileSystemOutputCache() {
    return htmllibmanagerUseFileSystemOutputCache;
  }

  @JsonProperty("htmllibmanager.useFileSystemOutputCache")
  public void setHtmllibmanagerUseFileSystemOutputCache(@Nullable ConfigNodePropertyBoolean htmllibmanagerUseFileSystemOutputCache) {
    this.htmllibmanagerUseFileSystemOutputCache = htmllibmanagerUseFileSystemOutputCache;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerFileSystemOutputCacheLocation(@Nullable ConfigNodePropertyString htmllibmanagerFileSystemOutputCacheLocation) {
    this.htmllibmanagerFileSystemOutputCacheLocation = htmllibmanagerFileSystemOutputCacheLocation;
    return this;
  }

  /**
   * Get htmllibmanagerFileSystemOutputCacheLocation
   * @return htmllibmanagerFileSystemOutputCacheLocation
   */
  @Valid 
  @Schema(name = "htmllibmanager.fileSystemOutputCacheLocation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("htmllibmanager.fileSystemOutputCacheLocation")
  public @Nullable ConfigNodePropertyString getHtmllibmanagerFileSystemOutputCacheLocation() {
    return htmllibmanagerFileSystemOutputCacheLocation;
  }

  @JsonProperty("htmllibmanager.fileSystemOutputCacheLocation")
  public void setHtmllibmanagerFileSystemOutputCacheLocation(@Nullable ConfigNodePropertyString htmllibmanagerFileSystemOutputCacheLocation) {
    this.htmllibmanagerFileSystemOutputCacheLocation = htmllibmanagerFileSystemOutputCacheLocation;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerDisableReplacement(@Nullable ConfigNodePropertyArray htmllibmanagerDisableReplacement) {
    this.htmllibmanagerDisableReplacement = htmllibmanagerDisableReplacement;
    return this;
  }

  /**
   * Get htmllibmanagerDisableReplacement
   * @return htmllibmanagerDisableReplacement
   */
  @Valid 
  @Schema(name = "htmllibmanager.disable.replacement", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("htmllibmanager.disable.replacement")
  public @Nullable ConfigNodePropertyArray getHtmllibmanagerDisableReplacement() {
    return htmllibmanagerDisableReplacement;
  }

  @JsonProperty("htmllibmanager.disable.replacement")
  public void setHtmllibmanagerDisableReplacement(@Nullable ConfigNodePropertyArray htmllibmanagerDisableReplacement) {
    this.htmllibmanagerDisableReplacement = htmllibmanagerDisableReplacement;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties = (ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties) o;
    return Objects.equals(this.htmllibmanagerTiming, comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.htmllibmanagerTiming) &&
        Objects.equals(this.htmllibmanagerDebugInitJs, comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.htmllibmanagerDebugInitJs) &&
        Objects.equals(this.htmllibmanagerMinify, comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.htmllibmanagerMinify) &&
        Objects.equals(this.htmllibmanagerDebug, comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.htmllibmanagerDebug) &&
        Objects.equals(this.htmllibmanagerGzip, comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.htmllibmanagerGzip) &&
        Objects.equals(this.htmllibmanagerMaxDataUriSize, comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.htmllibmanagerMaxDataUriSize) &&
        Objects.equals(this.htmllibmanagerMaxage, comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.htmllibmanagerMaxage) &&
        Objects.equals(this.htmllibmanagerForceCQUrlInfo, comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.htmllibmanagerForceCQUrlInfo) &&
        Objects.equals(this.htmllibmanagerDefaultthemename, comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.htmllibmanagerDefaultthemename) &&
        Objects.equals(this.htmllibmanagerDefaultuserthemename, comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.htmllibmanagerDefaultuserthemename) &&
        Objects.equals(this.htmllibmanagerClientmanager, comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.htmllibmanagerClientmanager) &&
        Objects.equals(this.htmllibmanagerPathList, comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.htmllibmanagerPathList) &&
        Objects.equals(this.htmllibmanagerExcludedPathList, comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.htmllibmanagerExcludedPathList) &&
        Objects.equals(this.htmllibmanagerProcessorJs, comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.htmllibmanagerProcessorJs) &&
        Objects.equals(this.htmllibmanagerProcessorCss, comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.htmllibmanagerProcessorCss) &&
        Objects.equals(this.htmllibmanagerLongcachePatterns, comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.htmllibmanagerLongcachePatterns) &&
        Objects.equals(this.htmllibmanagerLongcacheFormat, comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.htmllibmanagerLongcacheFormat) &&
        Objects.equals(this.htmllibmanagerUseFileSystemOutputCache, comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.htmllibmanagerUseFileSystemOutputCache) &&
        Objects.equals(this.htmllibmanagerFileSystemOutputCacheLocation, comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.htmllibmanagerFileSystemOutputCacheLocation) &&
        Objects.equals(this.htmllibmanagerDisableReplacement, comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.htmllibmanagerDisableReplacement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(htmllibmanagerTiming, htmllibmanagerDebugInitJs, htmllibmanagerMinify, htmllibmanagerDebug, htmllibmanagerGzip, htmllibmanagerMaxDataUriSize, htmllibmanagerMaxage, htmllibmanagerForceCQUrlInfo, htmllibmanagerDefaultthemename, htmllibmanagerDefaultuserthemename, htmllibmanagerClientmanager, htmllibmanagerPathList, htmllibmanagerExcludedPathList, htmllibmanagerProcessorJs, htmllibmanagerProcessorCss, htmllibmanagerLongcachePatterns, htmllibmanagerLongcacheFormat, htmllibmanagerUseFileSystemOutputCache, htmllibmanagerFileSystemOutputCacheLocation, htmllibmanagerDisableReplacement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties {\n");
    sb.append("    htmllibmanagerTiming: ").append(toIndentedString(htmllibmanagerTiming)).append("\n");
    sb.append("    htmllibmanagerDebugInitJs: ").append(toIndentedString(htmllibmanagerDebugInitJs)).append("\n");
    sb.append("    htmllibmanagerMinify: ").append(toIndentedString(htmllibmanagerMinify)).append("\n");
    sb.append("    htmllibmanagerDebug: ").append(toIndentedString(htmllibmanagerDebug)).append("\n");
    sb.append("    htmllibmanagerGzip: ").append(toIndentedString(htmllibmanagerGzip)).append("\n");
    sb.append("    htmllibmanagerMaxDataUriSize: ").append(toIndentedString(htmllibmanagerMaxDataUriSize)).append("\n");
    sb.append("    htmllibmanagerMaxage: ").append(toIndentedString(htmllibmanagerMaxage)).append("\n");
    sb.append("    htmllibmanagerForceCQUrlInfo: ").append(toIndentedString(htmllibmanagerForceCQUrlInfo)).append("\n");
    sb.append("    htmllibmanagerDefaultthemename: ").append(toIndentedString(htmllibmanagerDefaultthemename)).append("\n");
    sb.append("    htmllibmanagerDefaultuserthemename: ").append(toIndentedString(htmllibmanagerDefaultuserthemename)).append("\n");
    sb.append("    htmllibmanagerClientmanager: ").append(toIndentedString(htmllibmanagerClientmanager)).append("\n");
    sb.append("    htmllibmanagerPathList: ").append(toIndentedString(htmllibmanagerPathList)).append("\n");
    sb.append("    htmllibmanagerExcludedPathList: ").append(toIndentedString(htmllibmanagerExcludedPathList)).append("\n");
    sb.append("    htmllibmanagerProcessorJs: ").append(toIndentedString(htmllibmanagerProcessorJs)).append("\n");
    sb.append("    htmllibmanagerProcessorCss: ").append(toIndentedString(htmllibmanagerProcessorCss)).append("\n");
    sb.append("    htmllibmanagerLongcachePatterns: ").append(toIndentedString(htmllibmanagerLongcachePatterns)).append("\n");
    sb.append("    htmllibmanagerLongcacheFormat: ").append(toIndentedString(htmllibmanagerLongcacheFormat)).append("\n");
    sb.append("    htmllibmanagerUseFileSystemOutputCache: ").append(toIndentedString(htmllibmanagerUseFileSystemOutputCache)).append("\n");
    sb.append("    htmllibmanagerFileSystemOutputCacheLocation: ").append(toIndentedString(htmllibmanagerFileSystemOutputCacheLocation)).append("\n");
    sb.append("    htmllibmanagerDisableReplacement: ").append(toIndentedString(htmllibmanagerDisableReplacement)).append("\n");
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

