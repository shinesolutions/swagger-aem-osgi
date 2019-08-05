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
 * ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
public class ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties   {
  @JsonProperty("htmllibmanager.timing")
  private ConfigNodePropertyBoolean htmllibmanagerTiming = null;

  @JsonProperty("htmllibmanager.debug.init.js")
  private ConfigNodePropertyString htmllibmanagerDebugInitJs = null;

  @JsonProperty("htmllibmanager.minify")
  private ConfigNodePropertyBoolean htmllibmanagerMinify = null;

  @JsonProperty("htmllibmanager.debug")
  private ConfigNodePropertyBoolean htmllibmanagerDebug = null;

  @JsonProperty("htmllibmanager.gzip")
  private ConfigNodePropertyBoolean htmllibmanagerGzip = null;

  @JsonProperty("htmllibmanager.maxDataUriSize")
  private ConfigNodePropertyInteger htmllibmanagerMaxDataUriSize = null;

  @JsonProperty("htmllibmanager.maxage")
  private ConfigNodePropertyInteger htmllibmanagerMaxage = null;

  @JsonProperty("htmllibmanager.forceCQUrlInfo")
  private ConfigNodePropertyBoolean htmllibmanagerForceCQUrlInfo = null;

  @JsonProperty("htmllibmanager.defaultthemename")
  private ConfigNodePropertyString htmllibmanagerDefaultthemename = null;

  @JsonProperty("htmllibmanager.defaultuserthemename")
  private ConfigNodePropertyString htmllibmanagerDefaultuserthemename = null;

  @JsonProperty("htmllibmanager.clientmanager")
  private ConfigNodePropertyString htmllibmanagerClientmanager = null;

  @JsonProperty("htmllibmanager.path.list")
  private ConfigNodePropertyArray htmllibmanagerPathList = null;

  @JsonProperty("htmllibmanager.excluded.path.list")
  private ConfigNodePropertyArray htmllibmanagerExcludedPathList = null;

  @JsonProperty("htmllibmanager.processor.js")
  private ConfigNodePropertyArray htmllibmanagerProcessorJs = null;

  @JsonProperty("htmllibmanager.processor.css")
  private ConfigNodePropertyArray htmllibmanagerProcessorCss = null;

  @JsonProperty("htmllibmanager.longcache.patterns")
  private ConfigNodePropertyArray htmllibmanagerLongcachePatterns = null;

  @JsonProperty("htmllibmanager.longcache.format")
  private ConfigNodePropertyString htmllibmanagerLongcacheFormat = null;

  @JsonProperty("htmllibmanager.useFileSystemOutputCache")
  private ConfigNodePropertyBoolean htmllibmanagerUseFileSystemOutputCache = null;

  @JsonProperty("htmllibmanager.fileSystemOutputCacheLocation")
  private ConfigNodePropertyString htmllibmanagerFileSystemOutputCacheLocation = null;

  @JsonProperty("htmllibmanager.disable.replacement")
  private ConfigNodePropertyArray htmllibmanagerDisableReplacement = null;

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerTiming(ConfigNodePropertyBoolean htmllibmanagerTiming) {
    this.htmllibmanagerTiming = htmllibmanagerTiming;
    return this;
  }

   /**
   * Get htmllibmanagerTiming
   * @return htmllibmanagerTiming
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getHtmllibmanagerTiming() {
    return htmllibmanagerTiming;
  }

  public void setHtmllibmanagerTiming(ConfigNodePropertyBoolean htmllibmanagerTiming) {
    this.htmllibmanagerTiming = htmllibmanagerTiming;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerDebugInitJs(ConfigNodePropertyString htmllibmanagerDebugInitJs) {
    this.htmllibmanagerDebugInitJs = htmllibmanagerDebugInitJs;
    return this;
  }

   /**
   * Get htmllibmanagerDebugInitJs
   * @return htmllibmanagerDebugInitJs
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getHtmllibmanagerDebugInitJs() {
    return htmllibmanagerDebugInitJs;
  }

  public void setHtmllibmanagerDebugInitJs(ConfigNodePropertyString htmllibmanagerDebugInitJs) {
    this.htmllibmanagerDebugInitJs = htmllibmanagerDebugInitJs;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerMinify(ConfigNodePropertyBoolean htmllibmanagerMinify) {
    this.htmllibmanagerMinify = htmllibmanagerMinify;
    return this;
  }

   /**
   * Get htmllibmanagerMinify
   * @return htmllibmanagerMinify
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getHtmllibmanagerMinify() {
    return htmllibmanagerMinify;
  }

  public void setHtmllibmanagerMinify(ConfigNodePropertyBoolean htmllibmanagerMinify) {
    this.htmllibmanagerMinify = htmllibmanagerMinify;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerDebug(ConfigNodePropertyBoolean htmllibmanagerDebug) {
    this.htmllibmanagerDebug = htmllibmanagerDebug;
    return this;
  }

   /**
   * Get htmllibmanagerDebug
   * @return htmllibmanagerDebug
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getHtmllibmanagerDebug() {
    return htmllibmanagerDebug;
  }

  public void setHtmllibmanagerDebug(ConfigNodePropertyBoolean htmllibmanagerDebug) {
    this.htmllibmanagerDebug = htmllibmanagerDebug;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerGzip(ConfigNodePropertyBoolean htmllibmanagerGzip) {
    this.htmllibmanagerGzip = htmllibmanagerGzip;
    return this;
  }

   /**
   * Get htmllibmanagerGzip
   * @return htmllibmanagerGzip
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getHtmllibmanagerGzip() {
    return htmllibmanagerGzip;
  }

  public void setHtmllibmanagerGzip(ConfigNodePropertyBoolean htmllibmanagerGzip) {
    this.htmllibmanagerGzip = htmllibmanagerGzip;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerMaxDataUriSize(ConfigNodePropertyInteger htmllibmanagerMaxDataUriSize) {
    this.htmllibmanagerMaxDataUriSize = htmllibmanagerMaxDataUriSize;
    return this;
  }

   /**
   * Get htmllibmanagerMaxDataUriSize
   * @return htmllibmanagerMaxDataUriSize
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getHtmllibmanagerMaxDataUriSize() {
    return htmllibmanagerMaxDataUriSize;
  }

  public void setHtmllibmanagerMaxDataUriSize(ConfigNodePropertyInteger htmllibmanagerMaxDataUriSize) {
    this.htmllibmanagerMaxDataUriSize = htmllibmanagerMaxDataUriSize;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerMaxage(ConfigNodePropertyInteger htmllibmanagerMaxage) {
    this.htmllibmanagerMaxage = htmllibmanagerMaxage;
    return this;
  }

   /**
   * Get htmllibmanagerMaxage
   * @return htmllibmanagerMaxage
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getHtmllibmanagerMaxage() {
    return htmllibmanagerMaxage;
  }

  public void setHtmllibmanagerMaxage(ConfigNodePropertyInteger htmllibmanagerMaxage) {
    this.htmllibmanagerMaxage = htmllibmanagerMaxage;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerForceCQUrlInfo(ConfigNodePropertyBoolean htmllibmanagerForceCQUrlInfo) {
    this.htmllibmanagerForceCQUrlInfo = htmllibmanagerForceCQUrlInfo;
    return this;
  }

   /**
   * Get htmllibmanagerForceCQUrlInfo
   * @return htmllibmanagerForceCQUrlInfo
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getHtmllibmanagerForceCQUrlInfo() {
    return htmllibmanagerForceCQUrlInfo;
  }

  public void setHtmllibmanagerForceCQUrlInfo(ConfigNodePropertyBoolean htmllibmanagerForceCQUrlInfo) {
    this.htmllibmanagerForceCQUrlInfo = htmllibmanagerForceCQUrlInfo;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerDefaultthemename(ConfigNodePropertyString htmllibmanagerDefaultthemename) {
    this.htmllibmanagerDefaultthemename = htmllibmanagerDefaultthemename;
    return this;
  }

   /**
   * Get htmllibmanagerDefaultthemename
   * @return htmllibmanagerDefaultthemename
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getHtmllibmanagerDefaultthemename() {
    return htmllibmanagerDefaultthemename;
  }

  public void setHtmllibmanagerDefaultthemename(ConfigNodePropertyString htmllibmanagerDefaultthemename) {
    this.htmllibmanagerDefaultthemename = htmllibmanagerDefaultthemename;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerDefaultuserthemename(ConfigNodePropertyString htmllibmanagerDefaultuserthemename) {
    this.htmllibmanagerDefaultuserthemename = htmllibmanagerDefaultuserthemename;
    return this;
  }

   /**
   * Get htmllibmanagerDefaultuserthemename
   * @return htmllibmanagerDefaultuserthemename
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getHtmllibmanagerDefaultuserthemename() {
    return htmllibmanagerDefaultuserthemename;
  }

  public void setHtmllibmanagerDefaultuserthemename(ConfigNodePropertyString htmllibmanagerDefaultuserthemename) {
    this.htmllibmanagerDefaultuserthemename = htmllibmanagerDefaultuserthemename;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerClientmanager(ConfigNodePropertyString htmllibmanagerClientmanager) {
    this.htmllibmanagerClientmanager = htmllibmanagerClientmanager;
    return this;
  }

   /**
   * Get htmllibmanagerClientmanager
   * @return htmllibmanagerClientmanager
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getHtmllibmanagerClientmanager() {
    return htmllibmanagerClientmanager;
  }

  public void setHtmllibmanagerClientmanager(ConfigNodePropertyString htmllibmanagerClientmanager) {
    this.htmllibmanagerClientmanager = htmllibmanagerClientmanager;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerPathList(ConfigNodePropertyArray htmllibmanagerPathList) {
    this.htmllibmanagerPathList = htmllibmanagerPathList;
    return this;
  }

   /**
   * Get htmllibmanagerPathList
   * @return htmllibmanagerPathList
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getHtmllibmanagerPathList() {
    return htmllibmanagerPathList;
  }

  public void setHtmllibmanagerPathList(ConfigNodePropertyArray htmllibmanagerPathList) {
    this.htmllibmanagerPathList = htmllibmanagerPathList;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerExcludedPathList(ConfigNodePropertyArray htmllibmanagerExcludedPathList) {
    this.htmllibmanagerExcludedPathList = htmllibmanagerExcludedPathList;
    return this;
  }

   /**
   * Get htmllibmanagerExcludedPathList
   * @return htmllibmanagerExcludedPathList
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getHtmllibmanagerExcludedPathList() {
    return htmllibmanagerExcludedPathList;
  }

  public void setHtmllibmanagerExcludedPathList(ConfigNodePropertyArray htmllibmanagerExcludedPathList) {
    this.htmllibmanagerExcludedPathList = htmllibmanagerExcludedPathList;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerProcessorJs(ConfigNodePropertyArray htmllibmanagerProcessorJs) {
    this.htmllibmanagerProcessorJs = htmllibmanagerProcessorJs;
    return this;
  }

   /**
   * Get htmllibmanagerProcessorJs
   * @return htmllibmanagerProcessorJs
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getHtmllibmanagerProcessorJs() {
    return htmllibmanagerProcessorJs;
  }

  public void setHtmllibmanagerProcessorJs(ConfigNodePropertyArray htmllibmanagerProcessorJs) {
    this.htmllibmanagerProcessorJs = htmllibmanagerProcessorJs;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerProcessorCss(ConfigNodePropertyArray htmllibmanagerProcessorCss) {
    this.htmllibmanagerProcessorCss = htmllibmanagerProcessorCss;
    return this;
  }

   /**
   * Get htmllibmanagerProcessorCss
   * @return htmllibmanagerProcessorCss
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getHtmllibmanagerProcessorCss() {
    return htmllibmanagerProcessorCss;
  }

  public void setHtmllibmanagerProcessorCss(ConfigNodePropertyArray htmllibmanagerProcessorCss) {
    this.htmllibmanagerProcessorCss = htmllibmanagerProcessorCss;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerLongcachePatterns(ConfigNodePropertyArray htmllibmanagerLongcachePatterns) {
    this.htmllibmanagerLongcachePatterns = htmllibmanagerLongcachePatterns;
    return this;
  }

   /**
   * Get htmllibmanagerLongcachePatterns
   * @return htmllibmanagerLongcachePatterns
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getHtmllibmanagerLongcachePatterns() {
    return htmllibmanagerLongcachePatterns;
  }

  public void setHtmllibmanagerLongcachePatterns(ConfigNodePropertyArray htmllibmanagerLongcachePatterns) {
    this.htmllibmanagerLongcachePatterns = htmllibmanagerLongcachePatterns;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerLongcacheFormat(ConfigNodePropertyString htmllibmanagerLongcacheFormat) {
    this.htmllibmanagerLongcacheFormat = htmllibmanagerLongcacheFormat;
    return this;
  }

   /**
   * Get htmllibmanagerLongcacheFormat
   * @return htmllibmanagerLongcacheFormat
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getHtmllibmanagerLongcacheFormat() {
    return htmllibmanagerLongcacheFormat;
  }

  public void setHtmllibmanagerLongcacheFormat(ConfigNodePropertyString htmllibmanagerLongcacheFormat) {
    this.htmllibmanagerLongcacheFormat = htmllibmanagerLongcacheFormat;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerUseFileSystemOutputCache(ConfigNodePropertyBoolean htmllibmanagerUseFileSystemOutputCache) {
    this.htmllibmanagerUseFileSystemOutputCache = htmllibmanagerUseFileSystemOutputCache;
    return this;
  }

   /**
   * Get htmllibmanagerUseFileSystemOutputCache
   * @return htmllibmanagerUseFileSystemOutputCache
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getHtmllibmanagerUseFileSystemOutputCache() {
    return htmllibmanagerUseFileSystemOutputCache;
  }

  public void setHtmllibmanagerUseFileSystemOutputCache(ConfigNodePropertyBoolean htmllibmanagerUseFileSystemOutputCache) {
    this.htmllibmanagerUseFileSystemOutputCache = htmllibmanagerUseFileSystemOutputCache;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerFileSystemOutputCacheLocation(ConfigNodePropertyString htmllibmanagerFileSystemOutputCacheLocation) {
    this.htmllibmanagerFileSystemOutputCacheLocation = htmllibmanagerFileSystemOutputCacheLocation;
    return this;
  }

   /**
   * Get htmllibmanagerFileSystemOutputCacheLocation
   * @return htmllibmanagerFileSystemOutputCacheLocation
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getHtmllibmanagerFileSystemOutputCacheLocation() {
    return htmllibmanagerFileSystemOutputCacheLocation;
  }

  public void setHtmllibmanagerFileSystemOutputCacheLocation(ConfigNodePropertyString htmllibmanagerFileSystemOutputCacheLocation) {
    this.htmllibmanagerFileSystemOutputCacheLocation = htmllibmanagerFileSystemOutputCacheLocation;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerDisableReplacement(ConfigNodePropertyArray htmllibmanagerDisableReplacement) {
    this.htmllibmanagerDisableReplacement = htmllibmanagerDisableReplacement;
    return this;
  }

   /**
   * Get htmllibmanagerDisableReplacement
   * @return htmllibmanagerDisableReplacement
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getHtmllibmanagerDisableReplacement() {
    return htmllibmanagerDisableReplacement;
  }

  public void setHtmllibmanagerDisableReplacement(ConfigNodePropertyArray htmllibmanagerDisableReplacement) {
    this.htmllibmanagerDisableReplacement = htmllibmanagerDisableReplacement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

