package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

