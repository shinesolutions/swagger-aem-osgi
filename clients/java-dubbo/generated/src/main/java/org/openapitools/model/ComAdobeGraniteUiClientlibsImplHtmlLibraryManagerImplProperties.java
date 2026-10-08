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

public class ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("htmllibmanager.timing")
  private ConfigNodePropertyBoolean htmllibmanagerTiming;

  @JsonProperty("htmllibmanager.debug.init.js")
  private ConfigNodePropertyString htmllibmanagerDebugInitJs;

  @JsonProperty("htmllibmanager.minify")
  private ConfigNodePropertyBoolean htmllibmanagerMinify;

  @JsonProperty("htmllibmanager.debug")
  private ConfigNodePropertyBoolean htmllibmanagerDebug;

  @JsonProperty("htmllibmanager.gzip")
  private ConfigNodePropertyBoolean htmllibmanagerGzip;

  @JsonProperty("htmllibmanager.maxDataUriSize")
  private ConfigNodePropertyInteger htmllibmanagerMaxDataUriSize;

  @JsonProperty("htmllibmanager.maxage")
  private ConfigNodePropertyInteger htmllibmanagerMaxage;

  @JsonProperty("htmllibmanager.forceCQUrlInfo")
  private ConfigNodePropertyBoolean htmllibmanagerForceCQUrlInfo;

  @JsonProperty("htmllibmanager.defaultthemename")
  private ConfigNodePropertyString htmllibmanagerDefaultthemename;

  @JsonProperty("htmllibmanager.defaultuserthemename")
  private ConfigNodePropertyString htmllibmanagerDefaultuserthemename;

  @JsonProperty("htmllibmanager.clientmanager")
  private ConfigNodePropertyString htmllibmanagerClientmanager;

  @JsonProperty("htmllibmanager.path.list")
  private ConfigNodePropertyArray htmllibmanagerPathList;

  @JsonProperty("htmllibmanager.excluded.path.list")
  private ConfigNodePropertyArray htmllibmanagerExcludedPathList;

  @JsonProperty("htmllibmanager.processor.js")
  private ConfigNodePropertyArray htmllibmanagerProcessorJs;

  @JsonProperty("htmllibmanager.processor.css")
  private ConfigNodePropertyArray htmllibmanagerProcessorCss;

  @JsonProperty("htmllibmanager.longcache.patterns")
  private ConfigNodePropertyArray htmllibmanagerLongcachePatterns;

  @JsonProperty("htmllibmanager.longcache.format")
  private ConfigNodePropertyString htmllibmanagerLongcacheFormat;

  @JsonProperty("htmllibmanager.useFileSystemOutputCache")
  private ConfigNodePropertyBoolean htmllibmanagerUseFileSystemOutputCache;

  @JsonProperty("htmllibmanager.fileSystemOutputCacheLocation")
  private ConfigNodePropertyString htmllibmanagerFileSystemOutputCacheLocation;

  @JsonProperty("htmllibmanager.disable.replacement")
  private ConfigNodePropertyArray htmllibmanagerDisableReplacement;

  /**
   * 
   * @return htmllibmanagerTiming
   */
  public ConfigNodePropertyBoolean getHtmllibmanagerTiming() {
    return htmllibmanagerTiming;
  }

  public void setHtmllibmanagerTiming(ConfigNodePropertyBoolean htmllibmanagerTiming) {
    this.htmllibmanagerTiming = htmllibmanagerTiming;
  }

  /**
   * 
   * @return htmllibmanagerDebugInitJs
   */
  public ConfigNodePropertyString getHtmllibmanagerDebugInitJs() {
    return htmllibmanagerDebugInitJs;
  }

  public void setHtmllibmanagerDebugInitJs(ConfigNodePropertyString htmllibmanagerDebugInitJs) {
    this.htmllibmanagerDebugInitJs = htmllibmanagerDebugInitJs;
  }

  /**
   * 
   * @return htmllibmanagerMinify
   */
  public ConfigNodePropertyBoolean getHtmllibmanagerMinify() {
    return htmllibmanagerMinify;
  }

  public void setHtmllibmanagerMinify(ConfigNodePropertyBoolean htmllibmanagerMinify) {
    this.htmllibmanagerMinify = htmllibmanagerMinify;
  }

  /**
   * 
   * @return htmllibmanagerDebug
   */
  public ConfigNodePropertyBoolean getHtmllibmanagerDebug() {
    return htmllibmanagerDebug;
  }

  public void setHtmllibmanagerDebug(ConfigNodePropertyBoolean htmllibmanagerDebug) {
    this.htmllibmanagerDebug = htmllibmanagerDebug;
  }

  /**
   * 
   * @return htmllibmanagerGzip
   */
  public ConfigNodePropertyBoolean getHtmllibmanagerGzip() {
    return htmllibmanagerGzip;
  }

  public void setHtmllibmanagerGzip(ConfigNodePropertyBoolean htmllibmanagerGzip) {
    this.htmllibmanagerGzip = htmllibmanagerGzip;
  }

  /**
   * 
   * @return htmllibmanagerMaxDataUriSize
   */
  public ConfigNodePropertyInteger getHtmllibmanagerMaxDataUriSize() {
    return htmllibmanagerMaxDataUriSize;
  }

  public void setHtmllibmanagerMaxDataUriSize(ConfigNodePropertyInteger htmllibmanagerMaxDataUriSize) {
    this.htmllibmanagerMaxDataUriSize = htmllibmanagerMaxDataUriSize;
  }

  /**
   * 
   * @return htmllibmanagerMaxage
   */
  public ConfigNodePropertyInteger getHtmllibmanagerMaxage() {
    return htmllibmanagerMaxage;
  }

  public void setHtmllibmanagerMaxage(ConfigNodePropertyInteger htmllibmanagerMaxage) {
    this.htmllibmanagerMaxage = htmllibmanagerMaxage;
  }

  /**
   * 
   * @return htmllibmanagerForceCQUrlInfo
   */
  public ConfigNodePropertyBoolean getHtmllibmanagerForceCQUrlInfo() {
    return htmllibmanagerForceCQUrlInfo;
  }

  public void setHtmllibmanagerForceCQUrlInfo(ConfigNodePropertyBoolean htmllibmanagerForceCQUrlInfo) {
    this.htmllibmanagerForceCQUrlInfo = htmllibmanagerForceCQUrlInfo;
  }

  /**
   * 
   * @return htmllibmanagerDefaultthemename
   */
  public ConfigNodePropertyString getHtmllibmanagerDefaultthemename() {
    return htmllibmanagerDefaultthemename;
  }

  public void setHtmllibmanagerDefaultthemename(ConfigNodePropertyString htmllibmanagerDefaultthemename) {
    this.htmllibmanagerDefaultthemename = htmllibmanagerDefaultthemename;
  }

  /**
   * 
   * @return htmllibmanagerDefaultuserthemename
   */
  public ConfigNodePropertyString getHtmllibmanagerDefaultuserthemename() {
    return htmllibmanagerDefaultuserthemename;
  }

  public void setHtmllibmanagerDefaultuserthemename(ConfigNodePropertyString htmllibmanagerDefaultuserthemename) {
    this.htmllibmanagerDefaultuserthemename = htmllibmanagerDefaultuserthemename;
  }

  /**
   * 
   * @return htmllibmanagerClientmanager
   */
  public ConfigNodePropertyString getHtmllibmanagerClientmanager() {
    return htmllibmanagerClientmanager;
  }

  public void setHtmllibmanagerClientmanager(ConfigNodePropertyString htmllibmanagerClientmanager) {
    this.htmllibmanagerClientmanager = htmllibmanagerClientmanager;
  }

  /**
   * 
   * @return htmllibmanagerPathList
   */
  public ConfigNodePropertyArray getHtmllibmanagerPathList() {
    return htmllibmanagerPathList;
  }

  public void setHtmllibmanagerPathList(ConfigNodePropertyArray htmllibmanagerPathList) {
    this.htmllibmanagerPathList = htmllibmanagerPathList;
  }

  /**
   * 
   * @return htmllibmanagerExcludedPathList
   */
  public ConfigNodePropertyArray getHtmllibmanagerExcludedPathList() {
    return htmllibmanagerExcludedPathList;
  }

  public void setHtmllibmanagerExcludedPathList(ConfigNodePropertyArray htmllibmanagerExcludedPathList) {
    this.htmllibmanagerExcludedPathList = htmllibmanagerExcludedPathList;
  }

  /**
   * 
   * @return htmllibmanagerProcessorJs
   */
  public ConfigNodePropertyArray getHtmllibmanagerProcessorJs() {
    return htmllibmanagerProcessorJs;
  }

  public void setHtmllibmanagerProcessorJs(ConfigNodePropertyArray htmllibmanagerProcessorJs) {
    this.htmllibmanagerProcessorJs = htmllibmanagerProcessorJs;
  }

  /**
   * 
   * @return htmllibmanagerProcessorCss
   */
  public ConfigNodePropertyArray getHtmllibmanagerProcessorCss() {
    return htmllibmanagerProcessorCss;
  }

  public void setHtmllibmanagerProcessorCss(ConfigNodePropertyArray htmllibmanagerProcessorCss) {
    this.htmllibmanagerProcessorCss = htmllibmanagerProcessorCss;
  }

  /**
   * 
   * @return htmllibmanagerLongcachePatterns
   */
  public ConfigNodePropertyArray getHtmllibmanagerLongcachePatterns() {
    return htmllibmanagerLongcachePatterns;
  }

  public void setHtmllibmanagerLongcachePatterns(ConfigNodePropertyArray htmllibmanagerLongcachePatterns) {
    this.htmllibmanagerLongcachePatterns = htmllibmanagerLongcachePatterns;
  }

  /**
   * 
   * @return htmllibmanagerLongcacheFormat
   */
  public ConfigNodePropertyString getHtmllibmanagerLongcacheFormat() {
    return htmllibmanagerLongcacheFormat;
  }

  public void setHtmllibmanagerLongcacheFormat(ConfigNodePropertyString htmllibmanagerLongcacheFormat) {
    this.htmllibmanagerLongcacheFormat = htmllibmanagerLongcacheFormat;
  }

  /**
   * 
   * @return htmllibmanagerUseFileSystemOutputCache
   */
  public ConfigNodePropertyBoolean getHtmllibmanagerUseFileSystemOutputCache() {
    return htmllibmanagerUseFileSystemOutputCache;
  }

  public void setHtmllibmanagerUseFileSystemOutputCache(ConfigNodePropertyBoolean htmllibmanagerUseFileSystemOutputCache) {
    this.htmllibmanagerUseFileSystemOutputCache = htmllibmanagerUseFileSystemOutputCache;
  }

  /**
   * 
   * @return htmllibmanagerFileSystemOutputCacheLocation
   */
  public ConfigNodePropertyString getHtmllibmanagerFileSystemOutputCacheLocation() {
    return htmllibmanagerFileSystemOutputCacheLocation;
  }

  public void setHtmllibmanagerFileSystemOutputCacheLocation(ConfigNodePropertyString htmllibmanagerFileSystemOutputCacheLocation) {
    this.htmllibmanagerFileSystemOutputCacheLocation = htmllibmanagerFileSystemOutputCacheLocation;
  }

  /**
   * 
   * @return htmllibmanagerDisableReplacement
   */
  public ConfigNodePropertyArray getHtmllibmanagerDisableReplacement() {
    return htmllibmanagerDisableReplacement;
  }

  public void setHtmllibmanagerDisableReplacement(ConfigNodePropertyArray htmllibmanagerDisableReplacement) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
