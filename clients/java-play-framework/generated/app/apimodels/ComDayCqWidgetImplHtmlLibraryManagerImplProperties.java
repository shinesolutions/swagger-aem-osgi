package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComDayCqWidgetImplHtmlLibraryManagerImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqWidgetImplHtmlLibraryManagerImplProperties   {
  @JsonProperty("htmllibmanager.clientmanager")
  @Valid

  private ConfigNodePropertyString htmllibmanagerClientmanager;

  @JsonProperty("htmllibmanager.debug")
  @Valid

  private ConfigNodePropertyBoolean htmllibmanagerDebug;

  @JsonProperty("htmllibmanager.debug.console")
  @Valid

  private ConfigNodePropertyBoolean htmllibmanagerDebugConsole;

  @JsonProperty("htmllibmanager.debug.init.js")
  @Valid

  private ConfigNodePropertyString htmllibmanagerDebugInitJs;

  @JsonProperty("htmllibmanager.defaultthemename")
  @Valid

  private ConfigNodePropertyString htmllibmanagerDefaultthemename;

  @JsonProperty("htmllibmanager.defaultuserthemename")
  @Valid

  private ConfigNodePropertyString htmllibmanagerDefaultuserthemename;

  @JsonProperty("htmllibmanager.firebuglite.path")
  @Valid

  private ConfigNodePropertyString htmllibmanagerFirebuglitePath;

  @JsonProperty("htmllibmanager.forceCQUrlInfo")
  @Valid

  private ConfigNodePropertyBoolean htmllibmanagerForceCQUrlInfo;

  @JsonProperty("htmllibmanager.gzip")
  @Valid

  private ConfigNodePropertyBoolean htmllibmanagerGzip;

  @JsonProperty("htmllibmanager.maxage")
  @Valid

  private ConfigNodePropertyInteger htmllibmanagerMaxage;

  @JsonProperty("htmllibmanager.maxDataUriSize")
  @Valid

  private ConfigNodePropertyInteger htmllibmanagerMaxDataUriSize;

  @JsonProperty("htmllibmanager.minify")
  @Valid

  private ConfigNodePropertyBoolean htmllibmanagerMinify;

  @JsonProperty("htmllibmanager.path.list")
  @Valid

  private ConfigNodePropertyArray htmllibmanagerPathList;

  @JsonProperty("htmllibmanager.timing")
  @Valid

  private ConfigNodePropertyBoolean htmllibmanagerTiming;

  public ComDayCqWidgetImplHtmlLibraryManagerImplProperties htmllibmanagerClientmanager(ConfigNodePropertyString htmllibmanagerClientmanager) {
    this.htmllibmanagerClientmanager = htmllibmanagerClientmanager;
    return this;
  }

   /**
   * Get htmllibmanagerClientmanager
   * @return htmllibmanagerClientmanager
  **/
  public ConfigNodePropertyString getHtmllibmanagerClientmanager() {
    return htmllibmanagerClientmanager;
  }

  public void setHtmllibmanagerClientmanager(ConfigNodePropertyString htmllibmanagerClientmanager) {
    this.htmllibmanagerClientmanager = htmllibmanagerClientmanager;
  }

  public ComDayCqWidgetImplHtmlLibraryManagerImplProperties htmllibmanagerDebug(ConfigNodePropertyBoolean htmllibmanagerDebug) {
    this.htmllibmanagerDebug = htmllibmanagerDebug;
    return this;
  }

   /**
   * Get htmllibmanagerDebug
   * @return htmllibmanagerDebug
  **/
  public ConfigNodePropertyBoolean getHtmllibmanagerDebug() {
    return htmllibmanagerDebug;
  }

  public void setHtmllibmanagerDebug(ConfigNodePropertyBoolean htmllibmanagerDebug) {
    this.htmllibmanagerDebug = htmllibmanagerDebug;
  }

  public ComDayCqWidgetImplHtmlLibraryManagerImplProperties htmllibmanagerDebugConsole(ConfigNodePropertyBoolean htmllibmanagerDebugConsole) {
    this.htmllibmanagerDebugConsole = htmllibmanagerDebugConsole;
    return this;
  }

   /**
   * Get htmllibmanagerDebugConsole
   * @return htmllibmanagerDebugConsole
  **/
  public ConfigNodePropertyBoolean getHtmllibmanagerDebugConsole() {
    return htmllibmanagerDebugConsole;
  }

  public void setHtmllibmanagerDebugConsole(ConfigNodePropertyBoolean htmllibmanagerDebugConsole) {
    this.htmllibmanagerDebugConsole = htmllibmanagerDebugConsole;
  }

  public ComDayCqWidgetImplHtmlLibraryManagerImplProperties htmllibmanagerDebugInitJs(ConfigNodePropertyString htmllibmanagerDebugInitJs) {
    this.htmllibmanagerDebugInitJs = htmllibmanagerDebugInitJs;
    return this;
  }

   /**
   * Get htmllibmanagerDebugInitJs
   * @return htmllibmanagerDebugInitJs
  **/
  public ConfigNodePropertyString getHtmllibmanagerDebugInitJs() {
    return htmllibmanagerDebugInitJs;
  }

  public void setHtmllibmanagerDebugInitJs(ConfigNodePropertyString htmllibmanagerDebugInitJs) {
    this.htmllibmanagerDebugInitJs = htmllibmanagerDebugInitJs;
  }

  public ComDayCqWidgetImplHtmlLibraryManagerImplProperties htmllibmanagerDefaultthemename(ConfigNodePropertyString htmllibmanagerDefaultthemename) {
    this.htmllibmanagerDefaultthemename = htmllibmanagerDefaultthemename;
    return this;
  }

   /**
   * Get htmllibmanagerDefaultthemename
   * @return htmllibmanagerDefaultthemename
  **/
  public ConfigNodePropertyString getHtmllibmanagerDefaultthemename() {
    return htmllibmanagerDefaultthemename;
  }

  public void setHtmllibmanagerDefaultthemename(ConfigNodePropertyString htmllibmanagerDefaultthemename) {
    this.htmllibmanagerDefaultthemename = htmllibmanagerDefaultthemename;
  }

  public ComDayCqWidgetImplHtmlLibraryManagerImplProperties htmllibmanagerDefaultuserthemename(ConfigNodePropertyString htmllibmanagerDefaultuserthemename) {
    this.htmllibmanagerDefaultuserthemename = htmllibmanagerDefaultuserthemename;
    return this;
  }

   /**
   * Get htmllibmanagerDefaultuserthemename
   * @return htmllibmanagerDefaultuserthemename
  **/
  public ConfigNodePropertyString getHtmllibmanagerDefaultuserthemename() {
    return htmllibmanagerDefaultuserthemename;
  }

  public void setHtmllibmanagerDefaultuserthemename(ConfigNodePropertyString htmllibmanagerDefaultuserthemename) {
    this.htmllibmanagerDefaultuserthemename = htmllibmanagerDefaultuserthemename;
  }

  public ComDayCqWidgetImplHtmlLibraryManagerImplProperties htmllibmanagerFirebuglitePath(ConfigNodePropertyString htmllibmanagerFirebuglitePath) {
    this.htmllibmanagerFirebuglitePath = htmllibmanagerFirebuglitePath;
    return this;
  }

   /**
   * Get htmllibmanagerFirebuglitePath
   * @return htmllibmanagerFirebuglitePath
  **/
  public ConfigNodePropertyString getHtmllibmanagerFirebuglitePath() {
    return htmllibmanagerFirebuglitePath;
  }

  public void setHtmllibmanagerFirebuglitePath(ConfigNodePropertyString htmllibmanagerFirebuglitePath) {
    this.htmllibmanagerFirebuglitePath = htmllibmanagerFirebuglitePath;
  }

  public ComDayCqWidgetImplHtmlLibraryManagerImplProperties htmllibmanagerForceCQUrlInfo(ConfigNodePropertyBoolean htmllibmanagerForceCQUrlInfo) {
    this.htmllibmanagerForceCQUrlInfo = htmllibmanagerForceCQUrlInfo;
    return this;
  }

   /**
   * Get htmllibmanagerForceCQUrlInfo
   * @return htmllibmanagerForceCQUrlInfo
  **/
  public ConfigNodePropertyBoolean getHtmllibmanagerForceCQUrlInfo() {
    return htmllibmanagerForceCQUrlInfo;
  }

  public void setHtmllibmanagerForceCQUrlInfo(ConfigNodePropertyBoolean htmllibmanagerForceCQUrlInfo) {
    this.htmllibmanagerForceCQUrlInfo = htmllibmanagerForceCQUrlInfo;
  }

  public ComDayCqWidgetImplHtmlLibraryManagerImplProperties htmllibmanagerGzip(ConfigNodePropertyBoolean htmllibmanagerGzip) {
    this.htmllibmanagerGzip = htmllibmanagerGzip;
    return this;
  }

   /**
   * Get htmllibmanagerGzip
   * @return htmllibmanagerGzip
  **/
  public ConfigNodePropertyBoolean getHtmllibmanagerGzip() {
    return htmllibmanagerGzip;
  }

  public void setHtmllibmanagerGzip(ConfigNodePropertyBoolean htmllibmanagerGzip) {
    this.htmllibmanagerGzip = htmllibmanagerGzip;
  }

  public ComDayCqWidgetImplHtmlLibraryManagerImplProperties htmllibmanagerMaxage(ConfigNodePropertyInteger htmllibmanagerMaxage) {
    this.htmllibmanagerMaxage = htmllibmanagerMaxage;
    return this;
  }

   /**
   * Get htmllibmanagerMaxage
   * @return htmllibmanagerMaxage
  **/
  public ConfigNodePropertyInteger getHtmllibmanagerMaxage() {
    return htmllibmanagerMaxage;
  }

  public void setHtmllibmanagerMaxage(ConfigNodePropertyInteger htmllibmanagerMaxage) {
    this.htmllibmanagerMaxage = htmllibmanagerMaxage;
  }

  public ComDayCqWidgetImplHtmlLibraryManagerImplProperties htmllibmanagerMaxDataUriSize(ConfigNodePropertyInteger htmllibmanagerMaxDataUriSize) {
    this.htmllibmanagerMaxDataUriSize = htmllibmanagerMaxDataUriSize;
    return this;
  }

   /**
   * Get htmllibmanagerMaxDataUriSize
   * @return htmllibmanagerMaxDataUriSize
  **/
  public ConfigNodePropertyInteger getHtmllibmanagerMaxDataUriSize() {
    return htmllibmanagerMaxDataUriSize;
  }

  public void setHtmllibmanagerMaxDataUriSize(ConfigNodePropertyInteger htmllibmanagerMaxDataUriSize) {
    this.htmllibmanagerMaxDataUriSize = htmllibmanagerMaxDataUriSize;
  }

  public ComDayCqWidgetImplHtmlLibraryManagerImplProperties htmllibmanagerMinify(ConfigNodePropertyBoolean htmllibmanagerMinify) {
    this.htmllibmanagerMinify = htmllibmanagerMinify;
    return this;
  }

   /**
   * Get htmllibmanagerMinify
   * @return htmllibmanagerMinify
  **/
  public ConfigNodePropertyBoolean getHtmllibmanagerMinify() {
    return htmllibmanagerMinify;
  }

  public void setHtmllibmanagerMinify(ConfigNodePropertyBoolean htmllibmanagerMinify) {
    this.htmllibmanagerMinify = htmllibmanagerMinify;
  }

  public ComDayCqWidgetImplHtmlLibraryManagerImplProperties htmllibmanagerPathList(ConfigNodePropertyArray htmllibmanagerPathList) {
    this.htmllibmanagerPathList = htmllibmanagerPathList;
    return this;
  }

   /**
   * Get htmllibmanagerPathList
   * @return htmllibmanagerPathList
  **/
  public ConfigNodePropertyArray getHtmllibmanagerPathList() {
    return htmllibmanagerPathList;
  }

  public void setHtmllibmanagerPathList(ConfigNodePropertyArray htmllibmanagerPathList) {
    this.htmllibmanagerPathList = htmllibmanagerPathList;
  }

  public ComDayCqWidgetImplHtmlLibraryManagerImplProperties htmllibmanagerTiming(ConfigNodePropertyBoolean htmllibmanagerTiming) {
    this.htmllibmanagerTiming = htmllibmanagerTiming;
    return this;
  }

   /**
   * Get htmllibmanagerTiming
   * @return htmllibmanagerTiming
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

