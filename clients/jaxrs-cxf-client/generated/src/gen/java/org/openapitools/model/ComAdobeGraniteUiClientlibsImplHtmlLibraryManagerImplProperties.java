package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean htmllibmanagerTiming = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString htmllibmanagerDebugInitJs = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean htmllibmanagerMinify = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean htmllibmanagerDebug = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean htmllibmanagerGzip = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger htmllibmanagerMaxDataUriSize = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger htmllibmanagerMaxage = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean htmllibmanagerForceCQUrlInfo = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString htmllibmanagerDefaultthemename = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString htmllibmanagerDefaultuserthemename = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString htmllibmanagerClientmanager = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray htmllibmanagerPathList = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray htmllibmanagerExcludedPathList = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray htmllibmanagerProcessorJs = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray htmllibmanagerProcessorCss = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray htmllibmanagerLongcachePatterns = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString htmllibmanagerLongcacheFormat = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean htmllibmanagerUseFileSystemOutputCache = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString htmllibmanagerFileSystemOutputCacheLocation = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray htmllibmanagerDisableReplacement = null;
 /**
   * Get htmllibmanagerTiming
   * @return htmllibmanagerTiming
  **/
  @JsonProperty("htmllibmanager.timing")
  public ConfigNodePropertyBoolean getHtmllibmanagerTiming() {
    return htmllibmanagerTiming;
  }

  public void setHtmllibmanagerTiming(ConfigNodePropertyBoolean htmllibmanagerTiming) {
    this.htmllibmanagerTiming = htmllibmanagerTiming;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerTiming(ConfigNodePropertyBoolean htmllibmanagerTiming) {
    this.htmllibmanagerTiming = htmllibmanagerTiming;
    return this;
  }

 /**
   * Get htmllibmanagerDebugInitJs
   * @return htmllibmanagerDebugInitJs
  **/
  @JsonProperty("htmllibmanager.debug.init.js")
  public ConfigNodePropertyString getHtmllibmanagerDebugInitJs() {
    return htmllibmanagerDebugInitJs;
  }

  public void setHtmllibmanagerDebugInitJs(ConfigNodePropertyString htmllibmanagerDebugInitJs) {
    this.htmllibmanagerDebugInitJs = htmllibmanagerDebugInitJs;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerDebugInitJs(ConfigNodePropertyString htmllibmanagerDebugInitJs) {
    this.htmllibmanagerDebugInitJs = htmllibmanagerDebugInitJs;
    return this;
  }

 /**
   * Get htmllibmanagerMinify
   * @return htmllibmanagerMinify
  **/
  @JsonProperty("htmllibmanager.minify")
  public ConfigNodePropertyBoolean getHtmllibmanagerMinify() {
    return htmllibmanagerMinify;
  }

  public void setHtmllibmanagerMinify(ConfigNodePropertyBoolean htmllibmanagerMinify) {
    this.htmllibmanagerMinify = htmllibmanagerMinify;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerMinify(ConfigNodePropertyBoolean htmllibmanagerMinify) {
    this.htmllibmanagerMinify = htmllibmanagerMinify;
    return this;
  }

 /**
   * Get htmllibmanagerDebug
   * @return htmllibmanagerDebug
  **/
  @JsonProperty("htmllibmanager.debug")
  public ConfigNodePropertyBoolean getHtmllibmanagerDebug() {
    return htmllibmanagerDebug;
  }

  public void setHtmllibmanagerDebug(ConfigNodePropertyBoolean htmllibmanagerDebug) {
    this.htmllibmanagerDebug = htmllibmanagerDebug;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerDebug(ConfigNodePropertyBoolean htmllibmanagerDebug) {
    this.htmllibmanagerDebug = htmllibmanagerDebug;
    return this;
  }

 /**
   * Get htmllibmanagerGzip
   * @return htmllibmanagerGzip
  **/
  @JsonProperty("htmllibmanager.gzip")
  public ConfigNodePropertyBoolean getHtmllibmanagerGzip() {
    return htmllibmanagerGzip;
  }

  public void setHtmllibmanagerGzip(ConfigNodePropertyBoolean htmllibmanagerGzip) {
    this.htmllibmanagerGzip = htmllibmanagerGzip;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerGzip(ConfigNodePropertyBoolean htmllibmanagerGzip) {
    this.htmllibmanagerGzip = htmllibmanagerGzip;
    return this;
  }

 /**
   * Get htmllibmanagerMaxDataUriSize
   * @return htmllibmanagerMaxDataUriSize
  **/
  @JsonProperty("htmllibmanager.maxDataUriSize")
  public ConfigNodePropertyInteger getHtmllibmanagerMaxDataUriSize() {
    return htmllibmanagerMaxDataUriSize;
  }

  public void setHtmllibmanagerMaxDataUriSize(ConfigNodePropertyInteger htmllibmanagerMaxDataUriSize) {
    this.htmllibmanagerMaxDataUriSize = htmllibmanagerMaxDataUriSize;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerMaxDataUriSize(ConfigNodePropertyInteger htmllibmanagerMaxDataUriSize) {
    this.htmllibmanagerMaxDataUriSize = htmllibmanagerMaxDataUriSize;
    return this;
  }

 /**
   * Get htmllibmanagerMaxage
   * @return htmllibmanagerMaxage
  **/
  @JsonProperty("htmllibmanager.maxage")
  public ConfigNodePropertyInteger getHtmllibmanagerMaxage() {
    return htmllibmanagerMaxage;
  }

  public void setHtmllibmanagerMaxage(ConfigNodePropertyInteger htmllibmanagerMaxage) {
    this.htmllibmanagerMaxage = htmllibmanagerMaxage;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerMaxage(ConfigNodePropertyInteger htmllibmanagerMaxage) {
    this.htmllibmanagerMaxage = htmllibmanagerMaxage;
    return this;
  }

 /**
   * Get htmllibmanagerForceCQUrlInfo
   * @return htmllibmanagerForceCQUrlInfo
  **/
  @JsonProperty("htmllibmanager.forceCQUrlInfo")
  public ConfigNodePropertyBoolean getHtmllibmanagerForceCQUrlInfo() {
    return htmllibmanagerForceCQUrlInfo;
  }

  public void setHtmllibmanagerForceCQUrlInfo(ConfigNodePropertyBoolean htmllibmanagerForceCQUrlInfo) {
    this.htmllibmanagerForceCQUrlInfo = htmllibmanagerForceCQUrlInfo;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerForceCQUrlInfo(ConfigNodePropertyBoolean htmllibmanagerForceCQUrlInfo) {
    this.htmllibmanagerForceCQUrlInfo = htmllibmanagerForceCQUrlInfo;
    return this;
  }

 /**
   * Get htmllibmanagerDefaultthemename
   * @return htmllibmanagerDefaultthemename
  **/
  @JsonProperty("htmllibmanager.defaultthemename")
  public ConfigNodePropertyString getHtmllibmanagerDefaultthemename() {
    return htmllibmanagerDefaultthemename;
  }

  public void setHtmllibmanagerDefaultthemename(ConfigNodePropertyString htmllibmanagerDefaultthemename) {
    this.htmllibmanagerDefaultthemename = htmllibmanagerDefaultthemename;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerDefaultthemename(ConfigNodePropertyString htmllibmanagerDefaultthemename) {
    this.htmllibmanagerDefaultthemename = htmllibmanagerDefaultthemename;
    return this;
  }

 /**
   * Get htmllibmanagerDefaultuserthemename
   * @return htmllibmanagerDefaultuserthemename
  **/
  @JsonProperty("htmllibmanager.defaultuserthemename")
  public ConfigNodePropertyString getHtmllibmanagerDefaultuserthemename() {
    return htmllibmanagerDefaultuserthemename;
  }

  public void setHtmllibmanagerDefaultuserthemename(ConfigNodePropertyString htmllibmanagerDefaultuserthemename) {
    this.htmllibmanagerDefaultuserthemename = htmllibmanagerDefaultuserthemename;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerDefaultuserthemename(ConfigNodePropertyString htmllibmanagerDefaultuserthemename) {
    this.htmllibmanagerDefaultuserthemename = htmllibmanagerDefaultuserthemename;
    return this;
  }

 /**
   * Get htmllibmanagerClientmanager
   * @return htmllibmanagerClientmanager
  **/
  @JsonProperty("htmllibmanager.clientmanager")
  public ConfigNodePropertyString getHtmllibmanagerClientmanager() {
    return htmllibmanagerClientmanager;
  }

  public void setHtmllibmanagerClientmanager(ConfigNodePropertyString htmllibmanagerClientmanager) {
    this.htmllibmanagerClientmanager = htmllibmanagerClientmanager;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerClientmanager(ConfigNodePropertyString htmllibmanagerClientmanager) {
    this.htmllibmanagerClientmanager = htmllibmanagerClientmanager;
    return this;
  }

 /**
   * Get htmllibmanagerPathList
   * @return htmllibmanagerPathList
  **/
  @JsonProperty("htmllibmanager.path.list")
  public ConfigNodePropertyArray getHtmllibmanagerPathList() {
    return htmllibmanagerPathList;
  }

  public void setHtmllibmanagerPathList(ConfigNodePropertyArray htmllibmanagerPathList) {
    this.htmllibmanagerPathList = htmllibmanagerPathList;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerPathList(ConfigNodePropertyArray htmllibmanagerPathList) {
    this.htmllibmanagerPathList = htmllibmanagerPathList;
    return this;
  }

 /**
   * Get htmllibmanagerExcludedPathList
   * @return htmllibmanagerExcludedPathList
  **/
  @JsonProperty("htmllibmanager.excluded.path.list")
  public ConfigNodePropertyArray getHtmllibmanagerExcludedPathList() {
    return htmllibmanagerExcludedPathList;
  }

  public void setHtmllibmanagerExcludedPathList(ConfigNodePropertyArray htmllibmanagerExcludedPathList) {
    this.htmllibmanagerExcludedPathList = htmllibmanagerExcludedPathList;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerExcludedPathList(ConfigNodePropertyArray htmllibmanagerExcludedPathList) {
    this.htmllibmanagerExcludedPathList = htmllibmanagerExcludedPathList;
    return this;
  }

 /**
   * Get htmllibmanagerProcessorJs
   * @return htmllibmanagerProcessorJs
  **/
  @JsonProperty("htmllibmanager.processor.js")
  public ConfigNodePropertyArray getHtmllibmanagerProcessorJs() {
    return htmllibmanagerProcessorJs;
  }

  public void setHtmllibmanagerProcessorJs(ConfigNodePropertyArray htmllibmanagerProcessorJs) {
    this.htmllibmanagerProcessorJs = htmllibmanagerProcessorJs;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerProcessorJs(ConfigNodePropertyArray htmllibmanagerProcessorJs) {
    this.htmllibmanagerProcessorJs = htmllibmanagerProcessorJs;
    return this;
  }

 /**
   * Get htmllibmanagerProcessorCss
   * @return htmllibmanagerProcessorCss
  **/
  @JsonProperty("htmllibmanager.processor.css")
  public ConfigNodePropertyArray getHtmllibmanagerProcessorCss() {
    return htmllibmanagerProcessorCss;
  }

  public void setHtmllibmanagerProcessorCss(ConfigNodePropertyArray htmllibmanagerProcessorCss) {
    this.htmllibmanagerProcessorCss = htmllibmanagerProcessorCss;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerProcessorCss(ConfigNodePropertyArray htmllibmanagerProcessorCss) {
    this.htmllibmanagerProcessorCss = htmllibmanagerProcessorCss;
    return this;
  }

 /**
   * Get htmllibmanagerLongcachePatterns
   * @return htmllibmanagerLongcachePatterns
  **/
  @JsonProperty("htmllibmanager.longcache.patterns")
  public ConfigNodePropertyArray getHtmllibmanagerLongcachePatterns() {
    return htmllibmanagerLongcachePatterns;
  }

  public void setHtmllibmanagerLongcachePatterns(ConfigNodePropertyArray htmllibmanagerLongcachePatterns) {
    this.htmllibmanagerLongcachePatterns = htmllibmanagerLongcachePatterns;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerLongcachePatterns(ConfigNodePropertyArray htmllibmanagerLongcachePatterns) {
    this.htmllibmanagerLongcachePatterns = htmllibmanagerLongcachePatterns;
    return this;
  }

 /**
   * Get htmllibmanagerLongcacheFormat
   * @return htmllibmanagerLongcacheFormat
  **/
  @JsonProperty("htmllibmanager.longcache.format")
  public ConfigNodePropertyString getHtmllibmanagerLongcacheFormat() {
    return htmllibmanagerLongcacheFormat;
  }

  public void setHtmllibmanagerLongcacheFormat(ConfigNodePropertyString htmllibmanagerLongcacheFormat) {
    this.htmllibmanagerLongcacheFormat = htmllibmanagerLongcacheFormat;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerLongcacheFormat(ConfigNodePropertyString htmllibmanagerLongcacheFormat) {
    this.htmllibmanagerLongcacheFormat = htmllibmanagerLongcacheFormat;
    return this;
  }

 /**
   * Get htmllibmanagerUseFileSystemOutputCache
   * @return htmllibmanagerUseFileSystemOutputCache
  **/
  @JsonProperty("htmllibmanager.useFileSystemOutputCache")
  public ConfigNodePropertyBoolean getHtmllibmanagerUseFileSystemOutputCache() {
    return htmllibmanagerUseFileSystemOutputCache;
  }

  public void setHtmllibmanagerUseFileSystemOutputCache(ConfigNodePropertyBoolean htmllibmanagerUseFileSystemOutputCache) {
    this.htmllibmanagerUseFileSystemOutputCache = htmllibmanagerUseFileSystemOutputCache;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerUseFileSystemOutputCache(ConfigNodePropertyBoolean htmllibmanagerUseFileSystemOutputCache) {
    this.htmllibmanagerUseFileSystemOutputCache = htmllibmanagerUseFileSystemOutputCache;
    return this;
  }

 /**
   * Get htmllibmanagerFileSystemOutputCacheLocation
   * @return htmllibmanagerFileSystemOutputCacheLocation
  **/
  @JsonProperty("htmllibmanager.fileSystemOutputCacheLocation")
  public ConfigNodePropertyString getHtmllibmanagerFileSystemOutputCacheLocation() {
    return htmllibmanagerFileSystemOutputCacheLocation;
  }

  public void setHtmllibmanagerFileSystemOutputCacheLocation(ConfigNodePropertyString htmllibmanagerFileSystemOutputCacheLocation) {
    this.htmllibmanagerFileSystemOutputCacheLocation = htmllibmanagerFileSystemOutputCacheLocation;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerFileSystemOutputCacheLocation(ConfigNodePropertyString htmllibmanagerFileSystemOutputCacheLocation) {
    this.htmllibmanagerFileSystemOutputCacheLocation = htmllibmanagerFileSystemOutputCacheLocation;
    return this;
  }

 /**
   * Get htmllibmanagerDisableReplacement
   * @return htmllibmanagerDisableReplacement
  **/
  @JsonProperty("htmllibmanager.disable.replacement")
  public ConfigNodePropertyArray getHtmllibmanagerDisableReplacement() {
    return htmllibmanagerDisableReplacement;
  }

  public void setHtmllibmanagerDisableReplacement(ConfigNodePropertyArray htmllibmanagerDisableReplacement) {
    this.htmllibmanagerDisableReplacement = htmllibmanagerDisableReplacement;
  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties htmllibmanagerDisableReplacement(ConfigNodePropertyArray htmllibmanagerDisableReplacement) {
    this.htmllibmanagerDisableReplacement = htmllibmanagerDisableReplacement;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

