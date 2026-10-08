package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWidgetImplHtmlLibraryManagerImplProperties   {

    private ConfigNodePropertyString htmllibmanagerClientmanager;
    private ConfigNodePropertyBoolean htmllibmanagerDebug;
    private ConfigNodePropertyBoolean htmllibmanagerDebugConsole;
    private ConfigNodePropertyString htmllibmanagerDebugInitJs;
    private ConfigNodePropertyString htmllibmanagerDefaultthemename;
    private ConfigNodePropertyString htmllibmanagerDefaultuserthemename;
    private ConfigNodePropertyString htmllibmanagerFirebuglitePath;
    private ConfigNodePropertyBoolean htmllibmanagerForceCQUrlInfo;
    private ConfigNodePropertyBoolean htmllibmanagerGzip;
    private ConfigNodePropertyInteger htmllibmanagerMaxage;
    private ConfigNodePropertyInteger htmllibmanagerMaxDataUriSize;
    private ConfigNodePropertyBoolean htmllibmanagerMinify;
    private ConfigNodePropertyArray htmllibmanagerPathList;
    private ConfigNodePropertyBoolean htmllibmanagerTiming;

    /**
     * Default constructor.
     */
    public ComDayCqWidgetImplHtmlLibraryManagerImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWidgetImplHtmlLibraryManagerImplProperties.
     *
     * @param htmllibmanagerClientmanager htmllibmanagerClientmanager
     * @param htmllibmanagerDebug htmllibmanagerDebug
     * @param htmllibmanagerDebugConsole htmllibmanagerDebugConsole
     * @param htmllibmanagerDebugInitJs htmllibmanagerDebugInitJs
     * @param htmllibmanagerDefaultthemename htmllibmanagerDefaultthemename
     * @param htmllibmanagerDefaultuserthemename htmllibmanagerDefaultuserthemename
     * @param htmllibmanagerFirebuglitePath htmllibmanagerFirebuglitePath
     * @param htmllibmanagerForceCQUrlInfo htmllibmanagerForceCQUrlInfo
     * @param htmllibmanagerGzip htmllibmanagerGzip
     * @param htmllibmanagerMaxage htmllibmanagerMaxage
     * @param htmllibmanagerMaxDataUriSize htmllibmanagerMaxDataUriSize
     * @param htmllibmanagerMinify htmllibmanagerMinify
     * @param htmllibmanagerPathList htmllibmanagerPathList
     * @param htmllibmanagerTiming htmllibmanagerTiming
     */
    public ComDayCqWidgetImplHtmlLibraryManagerImplProperties(
        ConfigNodePropertyString htmllibmanagerClientmanager, 
        ConfigNodePropertyBoolean htmllibmanagerDebug, 
        ConfigNodePropertyBoolean htmllibmanagerDebugConsole, 
        ConfigNodePropertyString htmllibmanagerDebugInitJs, 
        ConfigNodePropertyString htmllibmanagerDefaultthemename, 
        ConfigNodePropertyString htmllibmanagerDefaultuserthemename, 
        ConfigNodePropertyString htmllibmanagerFirebuglitePath, 
        ConfigNodePropertyBoolean htmllibmanagerForceCQUrlInfo, 
        ConfigNodePropertyBoolean htmllibmanagerGzip, 
        ConfigNodePropertyInteger htmllibmanagerMaxage, 
        ConfigNodePropertyInteger htmllibmanagerMaxDataUriSize, 
        ConfigNodePropertyBoolean htmllibmanagerMinify, 
        ConfigNodePropertyArray htmllibmanagerPathList, 
        ConfigNodePropertyBoolean htmllibmanagerTiming
    ) {
        this.htmllibmanagerClientmanager = htmllibmanagerClientmanager;
        this.htmllibmanagerDebug = htmllibmanagerDebug;
        this.htmllibmanagerDebugConsole = htmllibmanagerDebugConsole;
        this.htmllibmanagerDebugInitJs = htmllibmanagerDebugInitJs;
        this.htmllibmanagerDefaultthemename = htmllibmanagerDefaultthemename;
        this.htmllibmanagerDefaultuserthemename = htmllibmanagerDefaultuserthemename;
        this.htmllibmanagerFirebuglitePath = htmllibmanagerFirebuglitePath;
        this.htmllibmanagerForceCQUrlInfo = htmllibmanagerForceCQUrlInfo;
        this.htmllibmanagerGzip = htmllibmanagerGzip;
        this.htmllibmanagerMaxage = htmllibmanagerMaxage;
        this.htmllibmanagerMaxDataUriSize = htmllibmanagerMaxDataUriSize;
        this.htmllibmanagerMinify = htmllibmanagerMinify;
        this.htmllibmanagerPathList = htmllibmanagerPathList;
        this.htmllibmanagerTiming = htmllibmanagerTiming;
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
     * Get htmllibmanagerDebugConsole
     * @return htmllibmanagerDebugConsole
     */
    public ConfigNodePropertyBoolean getHtmllibmanagerDebugConsole() {
        return htmllibmanagerDebugConsole;
    }

    public void setHtmllibmanagerDebugConsole(ConfigNodePropertyBoolean htmllibmanagerDebugConsole) {
        this.htmllibmanagerDebugConsole = htmllibmanagerDebugConsole;
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
     * Get htmllibmanagerFirebuglitePath
     * @return htmllibmanagerFirebuglitePath
     */
    public ConfigNodePropertyString getHtmllibmanagerFirebuglitePath() {
        return htmllibmanagerFirebuglitePath;
    }

    public void setHtmllibmanagerFirebuglitePath(ConfigNodePropertyString htmllibmanagerFirebuglitePath) {
        this.htmllibmanagerFirebuglitePath = htmllibmanagerFirebuglitePath;
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
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

