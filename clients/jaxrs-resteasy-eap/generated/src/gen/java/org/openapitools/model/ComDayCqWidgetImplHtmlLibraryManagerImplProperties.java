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
public class ComDayCqWidgetImplHtmlLibraryManagerImplProperties   {
  

  private ConfigNodePropertyString htmllibmanagerClientmanager = null;

  private ConfigNodePropertyBoolean htmllibmanagerDebug = null;

  private ConfigNodePropertyBoolean htmllibmanagerDebugConsole = null;

  private ConfigNodePropertyString htmllibmanagerDebugInitJs = null;

  private ConfigNodePropertyString htmllibmanagerDefaultthemename = null;

  private ConfigNodePropertyString htmllibmanagerDefaultuserthemename = null;

  private ConfigNodePropertyString htmllibmanagerFirebuglitePath = null;

  private ConfigNodePropertyBoolean htmllibmanagerForceCQUrlInfo = null;

  private ConfigNodePropertyBoolean htmllibmanagerGzip = null;

  private ConfigNodePropertyInteger htmllibmanagerMaxage = null;

  private ConfigNodePropertyInteger htmllibmanagerMaxDataUriSize = null;

  private ConfigNodePropertyBoolean htmllibmanagerMinify = null;

  private ConfigNodePropertyArray htmllibmanagerPathList = null;

  private ConfigNodePropertyBoolean htmllibmanagerTiming = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("htmllibmanager.clientmanager")
  public ConfigNodePropertyString getHtmllibmanagerClientmanager() {
    return htmllibmanagerClientmanager;
  }
  public void setHtmllibmanagerClientmanager(ConfigNodePropertyString htmllibmanagerClientmanager) {
    this.htmllibmanagerClientmanager = htmllibmanagerClientmanager;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("htmllibmanager.debug")
  public ConfigNodePropertyBoolean getHtmllibmanagerDebug() {
    return htmllibmanagerDebug;
  }
  public void setHtmllibmanagerDebug(ConfigNodePropertyBoolean htmllibmanagerDebug) {
    this.htmllibmanagerDebug = htmllibmanagerDebug;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("htmllibmanager.debug.console")
  public ConfigNodePropertyBoolean getHtmllibmanagerDebugConsole() {
    return htmllibmanagerDebugConsole;
  }
  public void setHtmllibmanagerDebugConsole(ConfigNodePropertyBoolean htmllibmanagerDebugConsole) {
    this.htmllibmanagerDebugConsole = htmllibmanagerDebugConsole;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("htmllibmanager.debug.init.js")
  public ConfigNodePropertyString getHtmllibmanagerDebugInitJs() {
    return htmllibmanagerDebugInitJs;
  }
  public void setHtmllibmanagerDebugInitJs(ConfigNodePropertyString htmllibmanagerDebugInitJs) {
    this.htmllibmanagerDebugInitJs = htmllibmanagerDebugInitJs;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("htmllibmanager.defaultthemename")
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
  public ConfigNodePropertyString getHtmllibmanagerDefaultuserthemename() {
    return htmllibmanagerDefaultuserthemename;
  }
  public void setHtmllibmanagerDefaultuserthemename(ConfigNodePropertyString htmllibmanagerDefaultuserthemename) {
    this.htmllibmanagerDefaultuserthemename = htmllibmanagerDefaultuserthemename;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("htmllibmanager.firebuglite.path")
  public ConfigNodePropertyString getHtmllibmanagerFirebuglitePath() {
    return htmllibmanagerFirebuglitePath;
  }
  public void setHtmllibmanagerFirebuglitePath(ConfigNodePropertyString htmllibmanagerFirebuglitePath) {
    this.htmllibmanagerFirebuglitePath = htmllibmanagerFirebuglitePath;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("htmllibmanager.forceCQUrlInfo")
  public ConfigNodePropertyBoolean getHtmllibmanagerForceCQUrlInfo() {
    return htmllibmanagerForceCQUrlInfo;
  }
  public void setHtmllibmanagerForceCQUrlInfo(ConfigNodePropertyBoolean htmllibmanagerForceCQUrlInfo) {
    this.htmllibmanagerForceCQUrlInfo = htmllibmanagerForceCQUrlInfo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("htmllibmanager.gzip")
  public ConfigNodePropertyBoolean getHtmllibmanagerGzip() {
    return htmllibmanagerGzip;
  }
  public void setHtmllibmanagerGzip(ConfigNodePropertyBoolean htmllibmanagerGzip) {
    this.htmllibmanagerGzip = htmllibmanagerGzip;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("htmllibmanager.maxage")
  public ConfigNodePropertyInteger getHtmllibmanagerMaxage() {
    return htmllibmanagerMaxage;
  }
  public void setHtmllibmanagerMaxage(ConfigNodePropertyInteger htmllibmanagerMaxage) {
    this.htmllibmanagerMaxage = htmllibmanagerMaxage;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("htmllibmanager.maxDataUriSize")
  public ConfigNodePropertyInteger getHtmllibmanagerMaxDataUriSize() {
    return htmllibmanagerMaxDataUriSize;
  }
  public void setHtmllibmanagerMaxDataUriSize(ConfigNodePropertyInteger htmllibmanagerMaxDataUriSize) {
    this.htmllibmanagerMaxDataUriSize = htmllibmanagerMaxDataUriSize;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("htmllibmanager.minify")
  public ConfigNodePropertyBoolean getHtmllibmanagerMinify() {
    return htmllibmanagerMinify;
  }
  public void setHtmllibmanagerMinify(ConfigNodePropertyBoolean htmllibmanagerMinify) {
    this.htmllibmanagerMinify = htmllibmanagerMinify;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("htmllibmanager.path.list")
  public ConfigNodePropertyArray getHtmllibmanagerPathList() {
    return htmllibmanagerPathList;
  }
  public void setHtmllibmanagerPathList(ConfigNodePropertyArray htmllibmanagerPathList) {
    this.htmllibmanagerPathList = htmllibmanagerPathList;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("htmllibmanager.timing")
  public ConfigNodePropertyBoolean getHtmllibmanagerTiming() {
    return htmllibmanagerTiming;
  }
  public void setHtmllibmanagerTiming(ConfigNodePropertyBoolean htmllibmanagerTiming) {
    this.htmllibmanagerTiming = htmllibmanagerTiming;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWidgetImplHtmlLibraryManagerImplProperties comDayCqWidgetImplHtmlLibraryManagerImplProperties = (ComDayCqWidgetImplHtmlLibraryManagerImplProperties) o;
    return Objects.equals(htmllibmanagerClientmanager, comDayCqWidgetImplHtmlLibraryManagerImplProperties.htmllibmanagerClientmanager) &&
        Objects.equals(htmllibmanagerDebug, comDayCqWidgetImplHtmlLibraryManagerImplProperties.htmllibmanagerDebug) &&
        Objects.equals(htmllibmanagerDebugConsole, comDayCqWidgetImplHtmlLibraryManagerImplProperties.htmllibmanagerDebugConsole) &&
        Objects.equals(htmllibmanagerDebugInitJs, comDayCqWidgetImplHtmlLibraryManagerImplProperties.htmllibmanagerDebugInitJs) &&
        Objects.equals(htmllibmanagerDefaultthemename, comDayCqWidgetImplHtmlLibraryManagerImplProperties.htmllibmanagerDefaultthemename) &&
        Objects.equals(htmllibmanagerDefaultuserthemename, comDayCqWidgetImplHtmlLibraryManagerImplProperties.htmllibmanagerDefaultuserthemename) &&
        Objects.equals(htmllibmanagerFirebuglitePath, comDayCqWidgetImplHtmlLibraryManagerImplProperties.htmllibmanagerFirebuglitePath) &&
        Objects.equals(htmllibmanagerForceCQUrlInfo, comDayCqWidgetImplHtmlLibraryManagerImplProperties.htmllibmanagerForceCQUrlInfo) &&
        Objects.equals(htmllibmanagerGzip, comDayCqWidgetImplHtmlLibraryManagerImplProperties.htmllibmanagerGzip) &&
        Objects.equals(htmllibmanagerMaxage, comDayCqWidgetImplHtmlLibraryManagerImplProperties.htmllibmanagerMaxage) &&
        Objects.equals(htmllibmanagerMaxDataUriSize, comDayCqWidgetImplHtmlLibraryManagerImplProperties.htmllibmanagerMaxDataUriSize) &&
        Objects.equals(htmllibmanagerMinify, comDayCqWidgetImplHtmlLibraryManagerImplProperties.htmllibmanagerMinify) &&
        Objects.equals(htmllibmanagerPathList, comDayCqWidgetImplHtmlLibraryManagerImplProperties.htmllibmanagerPathList) &&
        Objects.equals(htmllibmanagerTiming, comDayCqWidgetImplHtmlLibraryManagerImplProperties.htmllibmanagerTiming);
  }

  @Override
  public int hashCode() {
    return Objects.hash(htmllibmanagerClientmanager, htmllibmanagerDebug, htmllibmanagerDebugConsole, htmllibmanagerDebugInitJs, htmllibmanagerDefaultthemename, htmllibmanagerDefaultuserthemename, htmllibmanagerFirebuglitePath, htmllibmanagerForceCQUrlInfo, htmllibmanagerGzip, htmllibmanagerMaxage, htmllibmanagerMaxDataUriSize, htmllibmanagerMinify, htmllibmanagerPathList, htmllibmanagerTiming);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWidgetImplHtmlLibraryManagerImplProperties {\n");
    
    sb.append("    htmllibmanagerClientmanager: ").append(toIndentedString(htmllibmanagerClientmanager)).append("\n");
    sb.append("    htmllibmanagerDebug: ").append(toIndentedString(htmllibmanagerDebug)).append("\n");
    sb.append("    htmllibmanagerDebugConsole: ").append(toIndentedString(htmllibmanagerDebugConsole)).append("\n");
    sb.append("    htmllibmanagerDebugInitJs: ").append(toIndentedString(htmllibmanagerDebugInitJs)).append("\n");
    sb.append("    htmllibmanagerDefaultthemename: ").append(toIndentedString(htmllibmanagerDefaultthemename)).append("\n");
    sb.append("    htmllibmanagerDefaultuserthemename: ").append(toIndentedString(htmllibmanagerDefaultuserthemename)).append("\n");
    sb.append("    htmllibmanagerFirebuglitePath: ").append(toIndentedString(htmllibmanagerFirebuglitePath)).append("\n");
    sb.append("    htmllibmanagerForceCQUrlInfo: ").append(toIndentedString(htmllibmanagerForceCQUrlInfo)).append("\n");
    sb.append("    htmllibmanagerGzip: ").append(toIndentedString(htmllibmanagerGzip)).append("\n");
    sb.append("    htmllibmanagerMaxage: ").append(toIndentedString(htmllibmanagerMaxage)).append("\n");
    sb.append("    htmllibmanagerMaxDataUriSize: ").append(toIndentedString(htmllibmanagerMaxDataUriSize)).append("\n");
    sb.append("    htmllibmanagerMinify: ").append(toIndentedString(htmllibmanagerMinify)).append("\n");
    sb.append("    htmllibmanagerPathList: ").append(toIndentedString(htmllibmanagerPathList)).append("\n");
    sb.append("    htmllibmanagerTiming: ").append(toIndentedString(htmllibmanagerTiming)).append("\n");
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

