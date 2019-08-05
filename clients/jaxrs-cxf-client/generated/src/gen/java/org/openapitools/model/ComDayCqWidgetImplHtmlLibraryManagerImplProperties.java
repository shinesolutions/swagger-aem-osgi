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

public class ComDayCqWidgetImplHtmlLibraryManagerImplProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString htmllibmanagerClientmanager = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean htmllibmanagerDebug = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean htmllibmanagerDebugConsole = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString htmllibmanagerDebugInitJs = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString htmllibmanagerDefaultthemename = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString htmllibmanagerDefaultuserthemename = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString htmllibmanagerFirebuglitePath = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean htmllibmanagerForceCQUrlInfo = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean htmllibmanagerGzip = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger htmllibmanagerMaxage = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger htmllibmanagerMaxDataUriSize = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean htmllibmanagerMinify = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray htmllibmanagerPathList = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean htmllibmanagerTiming = null;
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

  public ComDayCqWidgetImplHtmlLibraryManagerImplProperties htmllibmanagerClientmanager(ConfigNodePropertyString htmllibmanagerClientmanager) {
    this.htmllibmanagerClientmanager = htmllibmanagerClientmanager;
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

  public ComDayCqWidgetImplHtmlLibraryManagerImplProperties htmllibmanagerDebug(ConfigNodePropertyBoolean htmllibmanagerDebug) {
    this.htmllibmanagerDebug = htmllibmanagerDebug;
    return this;
  }

 /**
   * Get htmllibmanagerDebugConsole
   * @return htmllibmanagerDebugConsole
  **/
  @JsonProperty("htmllibmanager.debug.console")
  public ConfigNodePropertyBoolean getHtmllibmanagerDebugConsole() {
    return htmllibmanagerDebugConsole;
  }

  public void setHtmllibmanagerDebugConsole(ConfigNodePropertyBoolean htmllibmanagerDebugConsole) {
    this.htmllibmanagerDebugConsole = htmllibmanagerDebugConsole;
  }

  public ComDayCqWidgetImplHtmlLibraryManagerImplProperties htmllibmanagerDebugConsole(ConfigNodePropertyBoolean htmllibmanagerDebugConsole) {
    this.htmllibmanagerDebugConsole = htmllibmanagerDebugConsole;
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

  public ComDayCqWidgetImplHtmlLibraryManagerImplProperties htmllibmanagerDebugInitJs(ConfigNodePropertyString htmllibmanagerDebugInitJs) {
    this.htmllibmanagerDebugInitJs = htmllibmanagerDebugInitJs;
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

  public ComDayCqWidgetImplHtmlLibraryManagerImplProperties htmllibmanagerDefaultthemename(ConfigNodePropertyString htmllibmanagerDefaultthemename) {
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

  public ComDayCqWidgetImplHtmlLibraryManagerImplProperties htmllibmanagerDefaultuserthemename(ConfigNodePropertyString htmllibmanagerDefaultuserthemename) {
    this.htmllibmanagerDefaultuserthemename = htmllibmanagerDefaultuserthemename;
    return this;
  }

 /**
   * Get htmllibmanagerFirebuglitePath
   * @return htmllibmanagerFirebuglitePath
  **/
  @JsonProperty("htmllibmanager.firebuglite.path")
  public ConfigNodePropertyString getHtmllibmanagerFirebuglitePath() {
    return htmllibmanagerFirebuglitePath;
  }

  public void setHtmllibmanagerFirebuglitePath(ConfigNodePropertyString htmllibmanagerFirebuglitePath) {
    this.htmllibmanagerFirebuglitePath = htmllibmanagerFirebuglitePath;
  }

  public ComDayCqWidgetImplHtmlLibraryManagerImplProperties htmllibmanagerFirebuglitePath(ConfigNodePropertyString htmllibmanagerFirebuglitePath) {
    this.htmllibmanagerFirebuglitePath = htmllibmanagerFirebuglitePath;
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

  public ComDayCqWidgetImplHtmlLibraryManagerImplProperties htmllibmanagerForceCQUrlInfo(ConfigNodePropertyBoolean htmllibmanagerForceCQUrlInfo) {
    this.htmllibmanagerForceCQUrlInfo = htmllibmanagerForceCQUrlInfo;
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

  public ComDayCqWidgetImplHtmlLibraryManagerImplProperties htmllibmanagerGzip(ConfigNodePropertyBoolean htmllibmanagerGzip) {
    this.htmllibmanagerGzip = htmllibmanagerGzip;
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

  public ComDayCqWidgetImplHtmlLibraryManagerImplProperties htmllibmanagerMaxage(ConfigNodePropertyInteger htmllibmanagerMaxage) {
    this.htmllibmanagerMaxage = htmllibmanagerMaxage;
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

  public ComDayCqWidgetImplHtmlLibraryManagerImplProperties htmllibmanagerMaxDataUriSize(ConfigNodePropertyInteger htmllibmanagerMaxDataUriSize) {
    this.htmllibmanagerMaxDataUriSize = htmllibmanagerMaxDataUriSize;
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

  public ComDayCqWidgetImplHtmlLibraryManagerImplProperties htmllibmanagerMinify(ConfigNodePropertyBoolean htmllibmanagerMinify) {
    this.htmllibmanagerMinify = htmllibmanagerMinify;
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

  public ComDayCqWidgetImplHtmlLibraryManagerImplProperties htmllibmanagerPathList(ConfigNodePropertyArray htmllibmanagerPathList) {
    this.htmllibmanagerPathList = htmllibmanagerPathList;
    return this;
  }

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

  public ComDayCqWidgetImplHtmlLibraryManagerImplProperties htmllibmanagerTiming(ConfigNodePropertyBoolean htmllibmanagerTiming) {
    this.htmllibmanagerTiming = htmllibmanagerTiming;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

