package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties   {
  
  private ConfigNodePropertyBoolean htmllibmanagerTiming = null;
  private ConfigNodePropertyString htmllibmanagerDebugInitJs = null;
  private ConfigNodePropertyBoolean htmllibmanagerMinify = null;
  private ConfigNodePropertyBoolean htmllibmanagerDebug = null;
  private ConfigNodePropertyBoolean htmllibmanagerGzip = null;
  private ConfigNodePropertyInteger htmllibmanagerMaxDataUriSize = null;
  private ConfigNodePropertyInteger htmllibmanagerMaxage = null;
  private ConfigNodePropertyBoolean htmllibmanagerForceCQUrlInfo = null;
  private ConfigNodePropertyString htmllibmanagerDefaultthemename = null;
  private ConfigNodePropertyString htmllibmanagerDefaultuserthemename = null;
  private ConfigNodePropertyString htmllibmanagerClientmanager = null;
  private ConfigNodePropertyArray htmllibmanagerPathList = null;
  private ConfigNodePropertyArray htmllibmanagerExcludedPathList = null;
  private ConfigNodePropertyArray htmllibmanagerProcessorJs = null;
  private ConfigNodePropertyArray htmllibmanagerProcessorCss = null;
  private ConfigNodePropertyArray htmllibmanagerLongcachePatterns = null;
  private ConfigNodePropertyString htmllibmanagerLongcacheFormat = null;
  private ConfigNodePropertyBoolean htmllibmanagerUseFileSystemOutputCache = null;
  private ConfigNodePropertyString htmllibmanagerFileSystemOutputCacheLocation = null;
  private ConfigNodePropertyArray htmllibmanagerDisableReplacement = null;

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties () {

  }

  public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties (ConfigNodePropertyBoolean htmllibmanagerTiming, ConfigNodePropertyString htmllibmanagerDebugInitJs, ConfigNodePropertyBoolean htmllibmanagerMinify, ConfigNodePropertyBoolean htmllibmanagerDebug, ConfigNodePropertyBoolean htmllibmanagerGzip, ConfigNodePropertyInteger htmllibmanagerMaxDataUriSize, ConfigNodePropertyInteger htmllibmanagerMaxage, ConfigNodePropertyBoolean htmllibmanagerForceCQUrlInfo, ConfigNodePropertyString htmllibmanagerDefaultthemename, ConfigNodePropertyString htmllibmanagerDefaultuserthemename, ConfigNodePropertyString htmllibmanagerClientmanager, ConfigNodePropertyArray htmllibmanagerPathList, ConfigNodePropertyArray htmllibmanagerExcludedPathList, ConfigNodePropertyArray htmllibmanagerProcessorJs, ConfigNodePropertyArray htmllibmanagerProcessorCss, ConfigNodePropertyArray htmllibmanagerLongcachePatterns, ConfigNodePropertyString htmllibmanagerLongcacheFormat, ConfigNodePropertyBoolean htmllibmanagerUseFileSystemOutputCache, ConfigNodePropertyString htmllibmanagerFileSystemOutputCacheLocation, ConfigNodePropertyArray htmllibmanagerDisableReplacement) {
    this.htmllibmanagerTiming = htmllibmanagerTiming;
    this.htmllibmanagerDebugInitJs = htmllibmanagerDebugInitJs;
    this.htmllibmanagerMinify = htmllibmanagerMinify;
    this.htmllibmanagerDebug = htmllibmanagerDebug;
    this.htmllibmanagerGzip = htmllibmanagerGzip;
    this.htmllibmanagerMaxDataUriSize = htmllibmanagerMaxDataUriSize;
    this.htmllibmanagerMaxage = htmllibmanagerMaxage;
    this.htmllibmanagerForceCQUrlInfo = htmllibmanagerForceCQUrlInfo;
    this.htmllibmanagerDefaultthemename = htmllibmanagerDefaultthemename;
    this.htmllibmanagerDefaultuserthemename = htmllibmanagerDefaultuserthemename;
    this.htmllibmanagerClientmanager = htmllibmanagerClientmanager;
    this.htmllibmanagerPathList = htmllibmanagerPathList;
    this.htmllibmanagerExcludedPathList = htmllibmanagerExcludedPathList;
    this.htmllibmanagerProcessorJs = htmllibmanagerProcessorJs;
    this.htmllibmanagerProcessorCss = htmllibmanagerProcessorCss;
    this.htmllibmanagerLongcachePatterns = htmllibmanagerLongcachePatterns;
    this.htmllibmanagerLongcacheFormat = htmllibmanagerLongcacheFormat;
    this.htmllibmanagerUseFileSystemOutputCache = htmllibmanagerUseFileSystemOutputCache;
    this.htmllibmanagerFileSystemOutputCacheLocation = htmllibmanagerFileSystemOutputCacheLocation;
    this.htmllibmanagerDisableReplacement = htmllibmanagerDisableReplacement;
  }

    
  @JsonProperty("htmllibmanager.timing")
  public ConfigNodePropertyBoolean getHtmllibmanagerTiming() {
    return htmllibmanagerTiming;
  }
  public void setHtmllibmanagerTiming(ConfigNodePropertyBoolean htmllibmanagerTiming) {
    this.htmllibmanagerTiming = htmllibmanagerTiming;
  }

    
  @JsonProperty("htmllibmanager.debug.init.js")
  public ConfigNodePropertyString getHtmllibmanagerDebugInitJs() {
    return htmllibmanagerDebugInitJs;
  }
  public void setHtmllibmanagerDebugInitJs(ConfigNodePropertyString htmllibmanagerDebugInitJs) {
    this.htmllibmanagerDebugInitJs = htmllibmanagerDebugInitJs;
  }

    
  @JsonProperty("htmllibmanager.minify")
  public ConfigNodePropertyBoolean getHtmllibmanagerMinify() {
    return htmllibmanagerMinify;
  }
  public void setHtmllibmanagerMinify(ConfigNodePropertyBoolean htmllibmanagerMinify) {
    this.htmllibmanagerMinify = htmllibmanagerMinify;
  }

    
  @JsonProperty("htmllibmanager.debug")
  public ConfigNodePropertyBoolean getHtmllibmanagerDebug() {
    return htmllibmanagerDebug;
  }
  public void setHtmllibmanagerDebug(ConfigNodePropertyBoolean htmllibmanagerDebug) {
    this.htmllibmanagerDebug = htmllibmanagerDebug;
  }

    
  @JsonProperty("htmllibmanager.gzip")
  public ConfigNodePropertyBoolean getHtmllibmanagerGzip() {
    return htmllibmanagerGzip;
  }
  public void setHtmllibmanagerGzip(ConfigNodePropertyBoolean htmllibmanagerGzip) {
    this.htmllibmanagerGzip = htmllibmanagerGzip;
  }

    
  @JsonProperty("htmllibmanager.maxDataUriSize")
  public ConfigNodePropertyInteger getHtmllibmanagerMaxDataUriSize() {
    return htmllibmanagerMaxDataUriSize;
  }
  public void setHtmllibmanagerMaxDataUriSize(ConfigNodePropertyInteger htmllibmanagerMaxDataUriSize) {
    this.htmllibmanagerMaxDataUriSize = htmllibmanagerMaxDataUriSize;
  }

    
  @JsonProperty("htmllibmanager.maxage")
  public ConfigNodePropertyInteger getHtmllibmanagerMaxage() {
    return htmllibmanagerMaxage;
  }
  public void setHtmllibmanagerMaxage(ConfigNodePropertyInteger htmllibmanagerMaxage) {
    this.htmllibmanagerMaxage = htmllibmanagerMaxage;
  }

    
  @JsonProperty("htmllibmanager.forceCQUrlInfo")
  public ConfigNodePropertyBoolean getHtmllibmanagerForceCQUrlInfo() {
    return htmllibmanagerForceCQUrlInfo;
  }
  public void setHtmllibmanagerForceCQUrlInfo(ConfigNodePropertyBoolean htmllibmanagerForceCQUrlInfo) {
    this.htmllibmanagerForceCQUrlInfo = htmllibmanagerForceCQUrlInfo;
  }

    
  @JsonProperty("htmllibmanager.defaultthemename")
  public ConfigNodePropertyString getHtmllibmanagerDefaultthemename() {
    return htmllibmanagerDefaultthemename;
  }
  public void setHtmllibmanagerDefaultthemename(ConfigNodePropertyString htmllibmanagerDefaultthemename) {
    this.htmllibmanagerDefaultthemename = htmllibmanagerDefaultthemename;
  }

    
  @JsonProperty("htmllibmanager.defaultuserthemename")
  public ConfigNodePropertyString getHtmllibmanagerDefaultuserthemename() {
    return htmllibmanagerDefaultuserthemename;
  }
  public void setHtmllibmanagerDefaultuserthemename(ConfigNodePropertyString htmllibmanagerDefaultuserthemename) {
    this.htmllibmanagerDefaultuserthemename = htmllibmanagerDefaultuserthemename;
  }

    
  @JsonProperty("htmllibmanager.clientmanager")
  public ConfigNodePropertyString getHtmllibmanagerClientmanager() {
    return htmllibmanagerClientmanager;
  }
  public void setHtmllibmanagerClientmanager(ConfigNodePropertyString htmllibmanagerClientmanager) {
    this.htmllibmanagerClientmanager = htmllibmanagerClientmanager;
  }

    
  @JsonProperty("htmllibmanager.path.list")
  public ConfigNodePropertyArray getHtmllibmanagerPathList() {
    return htmllibmanagerPathList;
  }
  public void setHtmllibmanagerPathList(ConfigNodePropertyArray htmllibmanagerPathList) {
    this.htmllibmanagerPathList = htmllibmanagerPathList;
  }

    
  @JsonProperty("htmllibmanager.excluded.path.list")
  public ConfigNodePropertyArray getHtmllibmanagerExcludedPathList() {
    return htmllibmanagerExcludedPathList;
  }
  public void setHtmllibmanagerExcludedPathList(ConfigNodePropertyArray htmllibmanagerExcludedPathList) {
    this.htmllibmanagerExcludedPathList = htmllibmanagerExcludedPathList;
  }

    
  @JsonProperty("htmllibmanager.processor.js")
  public ConfigNodePropertyArray getHtmllibmanagerProcessorJs() {
    return htmllibmanagerProcessorJs;
  }
  public void setHtmllibmanagerProcessorJs(ConfigNodePropertyArray htmllibmanagerProcessorJs) {
    this.htmllibmanagerProcessorJs = htmllibmanagerProcessorJs;
  }

    
  @JsonProperty("htmllibmanager.processor.css")
  public ConfigNodePropertyArray getHtmllibmanagerProcessorCss() {
    return htmllibmanagerProcessorCss;
  }
  public void setHtmllibmanagerProcessorCss(ConfigNodePropertyArray htmllibmanagerProcessorCss) {
    this.htmllibmanagerProcessorCss = htmllibmanagerProcessorCss;
  }

    
  @JsonProperty("htmllibmanager.longcache.patterns")
  public ConfigNodePropertyArray getHtmllibmanagerLongcachePatterns() {
    return htmllibmanagerLongcachePatterns;
  }
  public void setHtmllibmanagerLongcachePatterns(ConfigNodePropertyArray htmllibmanagerLongcachePatterns) {
    this.htmllibmanagerLongcachePatterns = htmllibmanagerLongcachePatterns;
  }

    
  @JsonProperty("htmllibmanager.longcache.format")
  public ConfigNodePropertyString getHtmllibmanagerLongcacheFormat() {
    return htmllibmanagerLongcacheFormat;
  }
  public void setHtmllibmanagerLongcacheFormat(ConfigNodePropertyString htmllibmanagerLongcacheFormat) {
    this.htmllibmanagerLongcacheFormat = htmllibmanagerLongcacheFormat;
  }

    
  @JsonProperty("htmllibmanager.useFileSystemOutputCache")
  public ConfigNodePropertyBoolean getHtmllibmanagerUseFileSystemOutputCache() {
    return htmllibmanagerUseFileSystemOutputCache;
  }
  public void setHtmllibmanagerUseFileSystemOutputCache(ConfigNodePropertyBoolean htmllibmanagerUseFileSystemOutputCache) {
    this.htmllibmanagerUseFileSystemOutputCache = htmllibmanagerUseFileSystemOutputCache;
  }

    
  @JsonProperty("htmllibmanager.fileSystemOutputCacheLocation")
  public ConfigNodePropertyString getHtmllibmanagerFileSystemOutputCacheLocation() {
    return htmllibmanagerFileSystemOutputCacheLocation;
  }
  public void setHtmllibmanagerFileSystemOutputCacheLocation(ConfigNodePropertyString htmllibmanagerFileSystemOutputCacheLocation) {
    this.htmllibmanagerFileSystemOutputCacheLocation = htmllibmanagerFileSystemOutputCacheLocation;
  }

    
  @JsonProperty("htmllibmanager.disable.replacement")
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
    return Objects.equals(htmllibmanagerTiming, comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.htmllibmanagerTiming) &&
        Objects.equals(htmllibmanagerDebugInitJs, comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.htmllibmanagerDebugInitJs) &&
        Objects.equals(htmllibmanagerMinify, comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.htmllibmanagerMinify) &&
        Objects.equals(htmllibmanagerDebug, comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.htmllibmanagerDebug) &&
        Objects.equals(htmllibmanagerGzip, comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.htmllibmanagerGzip) &&
        Objects.equals(htmllibmanagerMaxDataUriSize, comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.htmllibmanagerMaxDataUriSize) &&
        Objects.equals(htmllibmanagerMaxage, comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.htmllibmanagerMaxage) &&
        Objects.equals(htmllibmanagerForceCQUrlInfo, comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.htmllibmanagerForceCQUrlInfo) &&
        Objects.equals(htmllibmanagerDefaultthemename, comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.htmllibmanagerDefaultthemename) &&
        Objects.equals(htmllibmanagerDefaultuserthemename, comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.htmllibmanagerDefaultuserthemename) &&
        Objects.equals(htmllibmanagerClientmanager, comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.htmllibmanagerClientmanager) &&
        Objects.equals(htmllibmanagerPathList, comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.htmllibmanagerPathList) &&
        Objects.equals(htmllibmanagerExcludedPathList, comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.htmllibmanagerExcludedPathList) &&
        Objects.equals(htmllibmanagerProcessorJs, comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.htmllibmanagerProcessorJs) &&
        Objects.equals(htmllibmanagerProcessorCss, comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.htmllibmanagerProcessorCss) &&
        Objects.equals(htmllibmanagerLongcachePatterns, comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.htmllibmanagerLongcachePatterns) &&
        Objects.equals(htmllibmanagerLongcacheFormat, comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.htmllibmanagerLongcacheFormat) &&
        Objects.equals(htmllibmanagerUseFileSystemOutputCache, comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.htmllibmanagerUseFileSystemOutputCache) &&
        Objects.equals(htmllibmanagerFileSystemOutputCacheLocation, comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.htmllibmanagerFileSystemOutputCacheLocation) &&
        Objects.equals(htmllibmanagerDisableReplacement, comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.htmllibmanagerDisableReplacement);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
