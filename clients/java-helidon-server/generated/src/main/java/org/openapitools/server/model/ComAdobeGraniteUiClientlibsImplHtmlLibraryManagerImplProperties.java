package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



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
     * Default constructor.
     */
    public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.
     *
     * @param htmllibmanagerTiming htmllibmanagerTiming
     * @param htmllibmanagerDebugInitJs htmllibmanagerDebugInitJs
     * @param htmllibmanagerMinify htmllibmanagerMinify
     * @param htmllibmanagerDebug htmllibmanagerDebug
     * @param htmllibmanagerGzip htmllibmanagerGzip
     * @param htmllibmanagerMaxDataUriSize htmllibmanagerMaxDataUriSize
     * @param htmllibmanagerMaxage htmllibmanagerMaxage
     * @param htmllibmanagerForceCQUrlInfo htmllibmanagerForceCQUrlInfo
     * @param htmllibmanagerDefaultthemename htmllibmanagerDefaultthemename
     * @param htmllibmanagerDefaultuserthemename htmllibmanagerDefaultuserthemename
     * @param htmllibmanagerClientmanager htmllibmanagerClientmanager
     * @param htmllibmanagerPathList htmllibmanagerPathList
     * @param htmllibmanagerExcludedPathList htmllibmanagerExcludedPathList
     * @param htmllibmanagerProcessorJs htmllibmanagerProcessorJs
     * @param htmllibmanagerProcessorCss htmllibmanagerProcessorCss
     * @param htmllibmanagerLongcachePatterns htmllibmanagerLongcachePatterns
     * @param htmllibmanagerLongcacheFormat htmllibmanagerLongcacheFormat
     * @param htmllibmanagerUseFileSystemOutputCache htmllibmanagerUseFileSystemOutputCache
     * @param htmllibmanagerFileSystemOutputCacheLocation htmllibmanagerFileSystemOutputCacheLocation
     * @param htmllibmanagerDisableReplacement htmllibmanagerDisableReplacement
     */
    public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties(
        ConfigNodePropertyBoolean htmllibmanagerTiming, 
        ConfigNodePropertyString htmllibmanagerDebugInitJs, 
        ConfigNodePropertyBoolean htmllibmanagerMinify, 
        ConfigNodePropertyBoolean htmllibmanagerDebug, 
        ConfigNodePropertyBoolean htmllibmanagerGzip, 
        ConfigNodePropertyInteger htmllibmanagerMaxDataUriSize, 
        ConfigNodePropertyInteger htmllibmanagerMaxage, 
        ConfigNodePropertyBoolean htmllibmanagerForceCQUrlInfo, 
        ConfigNodePropertyString htmllibmanagerDefaultthemename, 
        ConfigNodePropertyString htmllibmanagerDefaultuserthemename, 
        ConfigNodePropertyString htmllibmanagerClientmanager, 
        ConfigNodePropertyArray htmllibmanagerPathList, 
        ConfigNodePropertyArray htmllibmanagerExcludedPathList, 
        ConfigNodePropertyArray htmllibmanagerProcessorJs, 
        ConfigNodePropertyArray htmllibmanagerProcessorCss, 
        ConfigNodePropertyArray htmllibmanagerLongcachePatterns, 
        ConfigNodePropertyString htmllibmanagerLongcacheFormat, 
        ConfigNodePropertyBoolean htmllibmanagerUseFileSystemOutputCache, 
        ConfigNodePropertyString htmllibmanagerFileSystemOutputCacheLocation, 
        ConfigNodePropertyArray htmllibmanagerDisableReplacement
    ) {
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



    /**
     * Get htmllibmanagerTiming
     * @return htmllibmanagerTiming
     */
    public ConfigNodePropertyBoolean getHtmllibmanagerTiming() {
        return htmllibmanagerTiming;
    }

    public void setHtmllibmanagerTiming(ConfigNodePropertyBoolean htmllibmanagerTiming) {
        this.htmllibmanagerTiming = htmllibmanagerTiming;
    }

    /**
     * Get htmllibmanagerDebugInitJs
     * @return htmllibmanagerDebugInitJs
     */
    public ConfigNodePropertyString getHtmllibmanagerDebugInitJs() {
        return htmllibmanagerDebugInitJs;
    }

    public void setHtmllibmanagerDebugInitJs(ConfigNodePropertyString htmllibmanagerDebugInitJs) {
        this.htmllibmanagerDebugInitJs = htmllibmanagerDebugInitJs;
    }

    /**
     * Get htmllibmanagerMinify
     * @return htmllibmanagerMinify
     */
    public ConfigNodePropertyBoolean getHtmllibmanagerMinify() {
        return htmllibmanagerMinify;
    }

    public void setHtmllibmanagerMinify(ConfigNodePropertyBoolean htmllibmanagerMinify) {
        this.htmllibmanagerMinify = htmllibmanagerMinify;
    }

    /**
     * Get htmllibmanagerDebug
     * @return htmllibmanagerDebug
     */
    public ConfigNodePropertyBoolean getHtmllibmanagerDebug() {
        return htmllibmanagerDebug;
    }

    public void setHtmllibmanagerDebug(ConfigNodePropertyBoolean htmllibmanagerDebug) {
        this.htmllibmanagerDebug = htmllibmanagerDebug;
    }

    /**
     * Get htmllibmanagerGzip
     * @return htmllibmanagerGzip
     */
    public ConfigNodePropertyBoolean getHtmllibmanagerGzip() {
        return htmllibmanagerGzip;
    }

    public void setHtmllibmanagerGzip(ConfigNodePropertyBoolean htmllibmanagerGzip) {
        this.htmllibmanagerGzip = htmllibmanagerGzip;
    }

    /**
     * Get htmllibmanagerMaxDataUriSize
     * @return htmllibmanagerMaxDataUriSize
     */
    public ConfigNodePropertyInteger getHtmllibmanagerMaxDataUriSize() {
        return htmllibmanagerMaxDataUriSize;
    }

    public void setHtmllibmanagerMaxDataUriSize(ConfigNodePropertyInteger htmllibmanagerMaxDataUriSize) {
        this.htmllibmanagerMaxDataUriSize = htmllibmanagerMaxDataUriSize;
    }

    /**
     * Get htmllibmanagerMaxage
     * @return htmllibmanagerMaxage
     */
    public ConfigNodePropertyInteger getHtmllibmanagerMaxage() {
        return htmllibmanagerMaxage;
    }

    public void setHtmllibmanagerMaxage(ConfigNodePropertyInteger htmllibmanagerMaxage) {
        this.htmllibmanagerMaxage = htmllibmanagerMaxage;
    }

    /**
     * Get htmllibmanagerForceCQUrlInfo
     * @return htmllibmanagerForceCQUrlInfo
     */
    public ConfigNodePropertyBoolean getHtmllibmanagerForceCQUrlInfo() {
        return htmllibmanagerForceCQUrlInfo;
    }

    public void setHtmllibmanagerForceCQUrlInfo(ConfigNodePropertyBoolean htmllibmanagerForceCQUrlInfo) {
        this.htmllibmanagerForceCQUrlInfo = htmllibmanagerForceCQUrlInfo;
    }

    /**
     * Get htmllibmanagerDefaultthemename
     * @return htmllibmanagerDefaultthemename
     */
    public ConfigNodePropertyString getHtmllibmanagerDefaultthemename() {
        return htmllibmanagerDefaultthemename;
    }

    public void setHtmllibmanagerDefaultthemename(ConfigNodePropertyString htmllibmanagerDefaultthemename) {
        this.htmllibmanagerDefaultthemename = htmllibmanagerDefaultthemename;
    }

    /**
     * Get htmllibmanagerDefaultuserthemename
     * @return htmllibmanagerDefaultuserthemename
     */
    public ConfigNodePropertyString getHtmllibmanagerDefaultuserthemename() {
        return htmllibmanagerDefaultuserthemename;
    }

    public void setHtmllibmanagerDefaultuserthemename(ConfigNodePropertyString htmllibmanagerDefaultuserthemename) {
        this.htmllibmanagerDefaultuserthemename = htmllibmanagerDefaultuserthemename;
    }

    /**
     * Get htmllibmanagerClientmanager
     * @return htmllibmanagerClientmanager
     */
    public ConfigNodePropertyString getHtmllibmanagerClientmanager() {
        return htmllibmanagerClientmanager;
    }

    public void setHtmllibmanagerClientmanager(ConfigNodePropertyString htmllibmanagerClientmanager) {
        this.htmllibmanagerClientmanager = htmllibmanagerClientmanager;
    }

    /**
     * Get htmllibmanagerPathList
     * @return htmllibmanagerPathList
     */
    public ConfigNodePropertyArray getHtmllibmanagerPathList() {
        return htmllibmanagerPathList;
    }

    public void setHtmllibmanagerPathList(ConfigNodePropertyArray htmllibmanagerPathList) {
        this.htmllibmanagerPathList = htmllibmanagerPathList;
    }

    /**
     * Get htmllibmanagerExcludedPathList
     * @return htmllibmanagerExcludedPathList
     */
    public ConfigNodePropertyArray getHtmllibmanagerExcludedPathList() {
        return htmllibmanagerExcludedPathList;
    }

    public void setHtmllibmanagerExcludedPathList(ConfigNodePropertyArray htmllibmanagerExcludedPathList) {
        this.htmllibmanagerExcludedPathList = htmllibmanagerExcludedPathList;
    }

    /**
     * Get htmllibmanagerProcessorJs
     * @return htmllibmanagerProcessorJs
     */
    public ConfigNodePropertyArray getHtmllibmanagerProcessorJs() {
        return htmllibmanagerProcessorJs;
    }

    public void setHtmllibmanagerProcessorJs(ConfigNodePropertyArray htmllibmanagerProcessorJs) {
        this.htmllibmanagerProcessorJs = htmllibmanagerProcessorJs;
    }

    /**
     * Get htmllibmanagerProcessorCss
     * @return htmllibmanagerProcessorCss
     */
    public ConfigNodePropertyArray getHtmllibmanagerProcessorCss() {
        return htmllibmanagerProcessorCss;
    }

    public void setHtmllibmanagerProcessorCss(ConfigNodePropertyArray htmllibmanagerProcessorCss) {
        this.htmllibmanagerProcessorCss = htmllibmanagerProcessorCss;
    }

    /**
     * Get htmllibmanagerLongcachePatterns
     * @return htmllibmanagerLongcachePatterns
     */
    public ConfigNodePropertyArray getHtmllibmanagerLongcachePatterns() {
        return htmllibmanagerLongcachePatterns;
    }

    public void setHtmllibmanagerLongcachePatterns(ConfigNodePropertyArray htmllibmanagerLongcachePatterns) {
        this.htmllibmanagerLongcachePatterns = htmllibmanagerLongcachePatterns;
    }

    /**
     * Get htmllibmanagerLongcacheFormat
     * @return htmllibmanagerLongcacheFormat
     */
    public ConfigNodePropertyString getHtmllibmanagerLongcacheFormat() {
        return htmllibmanagerLongcacheFormat;
    }

    public void setHtmllibmanagerLongcacheFormat(ConfigNodePropertyString htmllibmanagerLongcacheFormat) {
        this.htmllibmanagerLongcacheFormat = htmllibmanagerLongcacheFormat;
    }

    /**
     * Get htmllibmanagerUseFileSystemOutputCache
     * @return htmllibmanagerUseFileSystemOutputCache
     */
    public ConfigNodePropertyBoolean getHtmllibmanagerUseFileSystemOutputCache() {
        return htmllibmanagerUseFileSystemOutputCache;
    }

    public void setHtmllibmanagerUseFileSystemOutputCache(ConfigNodePropertyBoolean htmllibmanagerUseFileSystemOutputCache) {
        this.htmllibmanagerUseFileSystemOutputCache = htmllibmanagerUseFileSystemOutputCache;
    }

    /**
     * Get htmllibmanagerFileSystemOutputCacheLocation
     * @return htmllibmanagerFileSystemOutputCacheLocation
     */
    public ConfigNodePropertyString getHtmllibmanagerFileSystemOutputCacheLocation() {
        return htmllibmanagerFileSystemOutputCacheLocation;
    }

    public void setHtmllibmanagerFileSystemOutputCacheLocation(ConfigNodePropertyString htmllibmanagerFileSystemOutputCacheLocation) {
        this.htmllibmanagerFileSystemOutputCacheLocation = htmllibmanagerFileSystemOutputCacheLocation;
    }

    /**
     * Get htmllibmanagerDisableReplacement
     * @return htmllibmanagerDisableReplacement
     */
    public ConfigNodePropertyArray getHtmllibmanagerDisableReplacement() {
        return htmllibmanagerDisableReplacement;
    }

    public void setHtmllibmanagerDisableReplacement(ConfigNodePropertyArray htmllibmanagerDisableReplacement) {
        this.htmllibmanagerDisableReplacement = htmllibmanagerDisableReplacement;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

