package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-10-07T12:54:21.614735164Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties   {
  
  private ConfigNodePropertyBoolean htmllibmanagerTiming;
  private ConfigNodePropertyString htmllibmanagerDebugInitJs;
  private ConfigNodePropertyBoolean htmllibmanagerMinify;
  private ConfigNodePropertyBoolean htmllibmanagerDebug;
  private ConfigNodePropertyBoolean htmllibmanagerGzip;
  private ConfigNodePropertyInteger htmllibmanagerMaxDataUriSize;
  private ConfigNodePropertyInteger htmllibmanagerMaxage;
  private ConfigNodePropertyBoolean htmllibmanagerForceCQUrlInfo;
  private ConfigNodePropertyString htmllibmanagerDefaultthemename;
  private ConfigNodePropertyString htmllibmanagerDefaultuserthemename;
  private ConfigNodePropertyString htmllibmanagerClientmanager;
  private ConfigNodePropertyArray htmllibmanagerPathList;
  private ConfigNodePropertyArray htmllibmanagerExcludedPathList;
  private ConfigNodePropertyArray htmllibmanagerProcessorJs;
  private ConfigNodePropertyArray htmllibmanagerProcessorCss;
  private ConfigNodePropertyArray htmllibmanagerLongcachePatterns;
  private ConfigNodePropertyString htmllibmanagerLongcacheFormat;
  private ConfigNodePropertyBoolean htmllibmanagerUseFileSystemOutputCache;
  private ConfigNodePropertyString htmllibmanagerFileSystemOutputCacheLocation;
  private ConfigNodePropertyArray htmllibmanagerDisableReplacement;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("htmllibmanager.timing")
  @Valid
  public ConfigNodePropertyBoolean getHtmllibmanagerTiming() {
    return htmllibmanagerTiming;
  }
  public void setHtmllibmanagerTiming(ConfigNodePropertyBoolean htmllibmanagerTiming) {
    this.htmllibmanagerTiming = htmllibmanagerTiming;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("htmllibmanager.debug.init.js")
  @Valid
  public ConfigNodePropertyString getHtmllibmanagerDebugInitJs() {
    return htmllibmanagerDebugInitJs;
  }
  public void setHtmllibmanagerDebugInitJs(ConfigNodePropertyString htmllibmanagerDebugInitJs) {
    this.htmllibmanagerDebugInitJs = htmllibmanagerDebugInitJs;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("htmllibmanager.minify")
  @Valid
  public ConfigNodePropertyBoolean getHtmllibmanagerMinify() {
    return htmllibmanagerMinify;
  }
  public void setHtmllibmanagerMinify(ConfigNodePropertyBoolean htmllibmanagerMinify) {
    this.htmllibmanagerMinify = htmllibmanagerMinify;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("htmllibmanager.debug")
  @Valid
  public ConfigNodePropertyBoolean getHtmllibmanagerDebug() {
    return htmllibmanagerDebug;
  }
  public void setHtmllibmanagerDebug(ConfigNodePropertyBoolean htmllibmanagerDebug) {
    this.htmllibmanagerDebug = htmllibmanagerDebug;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("htmllibmanager.gzip")
  @Valid
  public ConfigNodePropertyBoolean getHtmllibmanagerGzip() {
    return htmllibmanagerGzip;
  }
  public void setHtmllibmanagerGzip(ConfigNodePropertyBoolean htmllibmanagerGzip) {
    this.htmllibmanagerGzip = htmllibmanagerGzip;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("htmllibmanager.maxDataUriSize")
  @Valid
  public ConfigNodePropertyInteger getHtmllibmanagerMaxDataUriSize() {
    return htmllibmanagerMaxDataUriSize;
  }
  public void setHtmllibmanagerMaxDataUriSize(ConfigNodePropertyInteger htmllibmanagerMaxDataUriSize) {
    this.htmllibmanagerMaxDataUriSize = htmllibmanagerMaxDataUriSize;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("htmllibmanager.maxage")
  @Valid
  public ConfigNodePropertyInteger getHtmllibmanagerMaxage() {
    return htmllibmanagerMaxage;
  }
  public void setHtmllibmanagerMaxage(ConfigNodePropertyInteger htmllibmanagerMaxage) {
    this.htmllibmanagerMaxage = htmllibmanagerMaxage;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("htmllibmanager.forceCQUrlInfo")
  @Valid
  public ConfigNodePropertyBoolean getHtmllibmanagerForceCQUrlInfo() {
    return htmllibmanagerForceCQUrlInfo;
  }
  public void setHtmllibmanagerForceCQUrlInfo(ConfigNodePropertyBoolean htmllibmanagerForceCQUrlInfo) {
    this.htmllibmanagerForceCQUrlInfo = htmllibmanagerForceCQUrlInfo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("htmllibmanager.defaultthemename")
  @Valid
  public ConfigNodePropertyString getHtmllibmanagerDefaultthemename() {
    return htmllibmanagerDefaultthemename;
  }
  public void setHtmllibmanagerDefaultthemename(ConfigNodePropertyString htmllibmanagerDefaultthemename) {
    this.htmllibmanagerDefaultthemename = htmllibmanagerDefaultthemename;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("htmllibmanager.defaultuserthemename")
  @Valid
  public ConfigNodePropertyString getHtmllibmanagerDefaultuserthemename() {
    return htmllibmanagerDefaultuserthemename;
  }
  public void setHtmllibmanagerDefaultuserthemename(ConfigNodePropertyString htmllibmanagerDefaultuserthemename) {
    this.htmllibmanagerDefaultuserthemename = htmllibmanagerDefaultuserthemename;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("htmllibmanager.clientmanager")
  @Valid
  public ConfigNodePropertyString getHtmllibmanagerClientmanager() {
    return htmllibmanagerClientmanager;
  }
  public void setHtmllibmanagerClientmanager(ConfigNodePropertyString htmllibmanagerClientmanager) {
    this.htmllibmanagerClientmanager = htmllibmanagerClientmanager;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("htmllibmanager.path.list")
  @Valid
  public ConfigNodePropertyArray getHtmllibmanagerPathList() {
    return htmllibmanagerPathList;
  }
  public void setHtmllibmanagerPathList(ConfigNodePropertyArray htmllibmanagerPathList) {
    this.htmllibmanagerPathList = htmllibmanagerPathList;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("htmllibmanager.excluded.path.list")
  @Valid
  public ConfigNodePropertyArray getHtmllibmanagerExcludedPathList() {
    return htmllibmanagerExcludedPathList;
  }
  public void setHtmllibmanagerExcludedPathList(ConfigNodePropertyArray htmllibmanagerExcludedPathList) {
    this.htmllibmanagerExcludedPathList = htmllibmanagerExcludedPathList;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("htmllibmanager.processor.js")
  @Valid
  public ConfigNodePropertyArray getHtmllibmanagerProcessorJs() {
    return htmllibmanagerProcessorJs;
  }
  public void setHtmllibmanagerProcessorJs(ConfigNodePropertyArray htmllibmanagerProcessorJs) {
    this.htmllibmanagerProcessorJs = htmllibmanagerProcessorJs;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("htmllibmanager.processor.css")
  @Valid
  public ConfigNodePropertyArray getHtmllibmanagerProcessorCss() {
    return htmllibmanagerProcessorCss;
  }
  public void setHtmllibmanagerProcessorCss(ConfigNodePropertyArray htmllibmanagerProcessorCss) {
    this.htmllibmanagerProcessorCss = htmllibmanagerProcessorCss;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("htmllibmanager.longcache.patterns")
  @Valid
  public ConfigNodePropertyArray getHtmllibmanagerLongcachePatterns() {
    return htmllibmanagerLongcachePatterns;
  }
  public void setHtmllibmanagerLongcachePatterns(ConfigNodePropertyArray htmllibmanagerLongcachePatterns) {
    this.htmllibmanagerLongcachePatterns = htmllibmanagerLongcachePatterns;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("htmllibmanager.longcache.format")
  @Valid
  public ConfigNodePropertyString getHtmllibmanagerLongcacheFormat() {
    return htmllibmanagerLongcacheFormat;
  }
  public void setHtmllibmanagerLongcacheFormat(ConfigNodePropertyString htmllibmanagerLongcacheFormat) {
    this.htmllibmanagerLongcacheFormat = htmllibmanagerLongcacheFormat;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("htmllibmanager.useFileSystemOutputCache")
  @Valid
  public ConfigNodePropertyBoolean getHtmllibmanagerUseFileSystemOutputCache() {
    return htmllibmanagerUseFileSystemOutputCache;
  }
  public void setHtmllibmanagerUseFileSystemOutputCache(ConfigNodePropertyBoolean htmllibmanagerUseFileSystemOutputCache) {
    this.htmllibmanagerUseFileSystemOutputCache = htmllibmanagerUseFileSystemOutputCache;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("htmllibmanager.fileSystemOutputCacheLocation")
  @Valid
  public ConfigNodePropertyString getHtmllibmanagerFileSystemOutputCacheLocation() {
    return htmllibmanagerFileSystemOutputCacheLocation;
  }
  public void setHtmllibmanagerFileSystemOutputCacheLocation(ConfigNodePropertyString htmllibmanagerFileSystemOutputCacheLocation) {
    this.htmllibmanagerFileSystemOutputCacheLocation = htmllibmanagerFileSystemOutputCacheLocation;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("htmllibmanager.disable.replacement")
  @Valid
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

