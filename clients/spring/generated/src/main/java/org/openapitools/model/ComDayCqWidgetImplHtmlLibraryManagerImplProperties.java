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
 * ComDayCqWidgetImplHtmlLibraryManagerImplProperties
 */

@JsonTypeName("comDayCqWidgetImplHtmlLibraryManagerImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWidgetImplHtmlLibraryManagerImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString htmllibmanagerClientmanager;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean htmllibmanagerDebug;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean htmllibmanagerDebugConsole;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString htmllibmanagerDebugInitJs;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString htmllibmanagerDefaultthemename;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString htmllibmanagerDefaultuserthemename;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString htmllibmanagerFirebuglitePath;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean htmllibmanagerForceCQUrlInfo;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean htmllibmanagerGzip;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger htmllibmanagerMaxage;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger htmllibmanagerMaxDataUriSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean htmllibmanagerMinify;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray htmllibmanagerPathList;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean htmllibmanagerTiming;

  public ComDayCqWidgetImplHtmlLibraryManagerImplProperties htmllibmanagerClientmanager(@Nullable ConfigNodePropertyString htmllibmanagerClientmanager) {
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

  public ComDayCqWidgetImplHtmlLibraryManagerImplProperties htmllibmanagerDebug(@Nullable ConfigNodePropertyBoolean htmllibmanagerDebug) {
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

  public ComDayCqWidgetImplHtmlLibraryManagerImplProperties htmllibmanagerDebugConsole(@Nullable ConfigNodePropertyBoolean htmllibmanagerDebugConsole) {
    this.htmllibmanagerDebugConsole = htmllibmanagerDebugConsole;
    return this;
  }

  /**
   * Get htmllibmanagerDebugConsole
   * @return htmllibmanagerDebugConsole
   */
  @Valid 
  @Schema(name = "htmllibmanager.debug.console", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("htmllibmanager.debug.console")
  public @Nullable ConfigNodePropertyBoolean getHtmllibmanagerDebugConsole() {
    return htmllibmanagerDebugConsole;
  }

  @JsonProperty("htmllibmanager.debug.console")
  public void setHtmllibmanagerDebugConsole(@Nullable ConfigNodePropertyBoolean htmllibmanagerDebugConsole) {
    this.htmllibmanagerDebugConsole = htmllibmanagerDebugConsole;
  }

  public ComDayCqWidgetImplHtmlLibraryManagerImplProperties htmllibmanagerDebugInitJs(@Nullable ConfigNodePropertyString htmllibmanagerDebugInitJs) {
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

  public ComDayCqWidgetImplHtmlLibraryManagerImplProperties htmllibmanagerDefaultthemename(@Nullable ConfigNodePropertyString htmllibmanagerDefaultthemename) {
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

  public ComDayCqWidgetImplHtmlLibraryManagerImplProperties htmllibmanagerDefaultuserthemename(@Nullable ConfigNodePropertyString htmllibmanagerDefaultuserthemename) {
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

  public ComDayCqWidgetImplHtmlLibraryManagerImplProperties htmllibmanagerFirebuglitePath(@Nullable ConfigNodePropertyString htmllibmanagerFirebuglitePath) {
    this.htmllibmanagerFirebuglitePath = htmllibmanagerFirebuglitePath;
    return this;
  }

  /**
   * Get htmllibmanagerFirebuglitePath
   * @return htmllibmanagerFirebuglitePath
   */
  @Valid 
  @Schema(name = "htmllibmanager.firebuglite.path", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("htmllibmanager.firebuglite.path")
  public @Nullable ConfigNodePropertyString getHtmllibmanagerFirebuglitePath() {
    return htmllibmanagerFirebuglitePath;
  }

  @JsonProperty("htmllibmanager.firebuglite.path")
  public void setHtmllibmanagerFirebuglitePath(@Nullable ConfigNodePropertyString htmllibmanagerFirebuglitePath) {
    this.htmllibmanagerFirebuglitePath = htmllibmanagerFirebuglitePath;
  }

  public ComDayCqWidgetImplHtmlLibraryManagerImplProperties htmllibmanagerForceCQUrlInfo(@Nullable ConfigNodePropertyBoolean htmllibmanagerForceCQUrlInfo) {
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

  public ComDayCqWidgetImplHtmlLibraryManagerImplProperties htmllibmanagerGzip(@Nullable ConfigNodePropertyBoolean htmllibmanagerGzip) {
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

  public ComDayCqWidgetImplHtmlLibraryManagerImplProperties htmllibmanagerMaxage(@Nullable ConfigNodePropertyInteger htmllibmanagerMaxage) {
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

  public ComDayCqWidgetImplHtmlLibraryManagerImplProperties htmllibmanagerMaxDataUriSize(@Nullable ConfigNodePropertyInteger htmllibmanagerMaxDataUriSize) {
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

  public ComDayCqWidgetImplHtmlLibraryManagerImplProperties htmllibmanagerMinify(@Nullable ConfigNodePropertyBoolean htmllibmanagerMinify) {
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

  public ComDayCqWidgetImplHtmlLibraryManagerImplProperties htmllibmanagerPathList(@Nullable ConfigNodePropertyArray htmllibmanagerPathList) {
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

  public ComDayCqWidgetImplHtmlLibraryManagerImplProperties htmllibmanagerTiming(@Nullable ConfigNodePropertyBoolean htmllibmanagerTiming) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWidgetImplHtmlLibraryManagerImplProperties comDayCqWidgetImplHtmlLibraryManagerImplProperties = (ComDayCqWidgetImplHtmlLibraryManagerImplProperties) o;
    return Objects.equals(this.htmllibmanagerClientmanager, comDayCqWidgetImplHtmlLibraryManagerImplProperties.htmllibmanagerClientmanager) &&
        Objects.equals(this.htmllibmanagerDebug, comDayCqWidgetImplHtmlLibraryManagerImplProperties.htmllibmanagerDebug) &&
        Objects.equals(this.htmllibmanagerDebugConsole, comDayCqWidgetImplHtmlLibraryManagerImplProperties.htmllibmanagerDebugConsole) &&
        Objects.equals(this.htmllibmanagerDebugInitJs, comDayCqWidgetImplHtmlLibraryManagerImplProperties.htmllibmanagerDebugInitJs) &&
        Objects.equals(this.htmllibmanagerDefaultthemename, comDayCqWidgetImplHtmlLibraryManagerImplProperties.htmllibmanagerDefaultthemename) &&
        Objects.equals(this.htmllibmanagerDefaultuserthemename, comDayCqWidgetImplHtmlLibraryManagerImplProperties.htmllibmanagerDefaultuserthemename) &&
        Objects.equals(this.htmllibmanagerFirebuglitePath, comDayCqWidgetImplHtmlLibraryManagerImplProperties.htmllibmanagerFirebuglitePath) &&
        Objects.equals(this.htmllibmanagerForceCQUrlInfo, comDayCqWidgetImplHtmlLibraryManagerImplProperties.htmllibmanagerForceCQUrlInfo) &&
        Objects.equals(this.htmllibmanagerGzip, comDayCqWidgetImplHtmlLibraryManagerImplProperties.htmllibmanagerGzip) &&
        Objects.equals(this.htmllibmanagerMaxage, comDayCqWidgetImplHtmlLibraryManagerImplProperties.htmllibmanagerMaxage) &&
        Objects.equals(this.htmllibmanagerMaxDataUriSize, comDayCqWidgetImplHtmlLibraryManagerImplProperties.htmllibmanagerMaxDataUriSize) &&
        Objects.equals(this.htmllibmanagerMinify, comDayCqWidgetImplHtmlLibraryManagerImplProperties.htmllibmanagerMinify) &&
        Objects.equals(this.htmllibmanagerPathList, comDayCqWidgetImplHtmlLibraryManagerImplProperties.htmllibmanagerPathList) &&
        Objects.equals(this.htmllibmanagerTiming, comDayCqWidgetImplHtmlLibraryManagerImplProperties.htmllibmanagerTiming);
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

