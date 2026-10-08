package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingCommonsLogLogManagerProperties   {

    private ConfigNodePropertyDropDown orgApacheSlingCommonsLogLevel;
    private ConfigNodePropertyString orgApacheSlingCommonsLogFile;
    private ConfigNodePropertyInteger orgApacheSlingCommonsLogFileNumber;
    private ConfigNodePropertyString orgApacheSlingCommonsLogFileSize;
    private ConfigNodePropertyString orgApacheSlingCommonsLogPattern;
    private ConfigNodePropertyString orgApacheSlingCommonsLogConfigurationFile;
    private ConfigNodePropertyBoolean orgApacheSlingCommonsLogPackagingDataEnabled;
    private ConfigNodePropertyInteger orgApacheSlingCommonsLogMaxCallerDataDepth;
    private ConfigNodePropertyInteger orgApacheSlingCommonsLogMaxOldFileCountInDump;
    private ConfigNodePropertyInteger orgApacheSlingCommonsLogNumOfLines;

    /**
     * Default constructor.
     */
    public OrgApacheSlingCommonsLogLogManagerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingCommonsLogLogManagerProperties.
     *
     * @param orgApacheSlingCommonsLogLevel orgApacheSlingCommonsLogLevel
     * @param orgApacheSlingCommonsLogFile orgApacheSlingCommonsLogFile
     * @param orgApacheSlingCommonsLogFileNumber orgApacheSlingCommonsLogFileNumber
     * @param orgApacheSlingCommonsLogFileSize orgApacheSlingCommonsLogFileSize
     * @param orgApacheSlingCommonsLogPattern orgApacheSlingCommonsLogPattern
     * @param orgApacheSlingCommonsLogConfigurationFile orgApacheSlingCommonsLogConfigurationFile
     * @param orgApacheSlingCommonsLogPackagingDataEnabled orgApacheSlingCommonsLogPackagingDataEnabled
     * @param orgApacheSlingCommonsLogMaxCallerDataDepth orgApacheSlingCommonsLogMaxCallerDataDepth
     * @param orgApacheSlingCommonsLogMaxOldFileCountInDump orgApacheSlingCommonsLogMaxOldFileCountInDump
     * @param orgApacheSlingCommonsLogNumOfLines orgApacheSlingCommonsLogNumOfLines
     */
    public OrgApacheSlingCommonsLogLogManagerProperties(
        ConfigNodePropertyDropDown orgApacheSlingCommonsLogLevel, 
        ConfigNodePropertyString orgApacheSlingCommonsLogFile, 
        ConfigNodePropertyInteger orgApacheSlingCommonsLogFileNumber, 
        ConfigNodePropertyString orgApacheSlingCommonsLogFileSize, 
        ConfigNodePropertyString orgApacheSlingCommonsLogPattern, 
        ConfigNodePropertyString orgApacheSlingCommonsLogConfigurationFile, 
        ConfigNodePropertyBoolean orgApacheSlingCommonsLogPackagingDataEnabled, 
        ConfigNodePropertyInteger orgApacheSlingCommonsLogMaxCallerDataDepth, 
        ConfigNodePropertyInteger orgApacheSlingCommonsLogMaxOldFileCountInDump, 
        ConfigNodePropertyInteger orgApacheSlingCommonsLogNumOfLines
    ) {
        this.orgApacheSlingCommonsLogLevel = orgApacheSlingCommonsLogLevel;
        this.orgApacheSlingCommonsLogFile = orgApacheSlingCommonsLogFile;
        this.orgApacheSlingCommonsLogFileNumber = orgApacheSlingCommonsLogFileNumber;
        this.orgApacheSlingCommonsLogFileSize = orgApacheSlingCommonsLogFileSize;
        this.orgApacheSlingCommonsLogPattern = orgApacheSlingCommonsLogPattern;
        this.orgApacheSlingCommonsLogConfigurationFile = orgApacheSlingCommonsLogConfigurationFile;
        this.orgApacheSlingCommonsLogPackagingDataEnabled = orgApacheSlingCommonsLogPackagingDataEnabled;
        this.orgApacheSlingCommonsLogMaxCallerDataDepth = orgApacheSlingCommonsLogMaxCallerDataDepth;
        this.orgApacheSlingCommonsLogMaxOldFileCountInDump = orgApacheSlingCommonsLogMaxOldFileCountInDump;
        this.orgApacheSlingCommonsLogNumOfLines = orgApacheSlingCommonsLogNumOfLines;
    }



    /**
     * Get orgApacheSlingCommonsLogLevel
     * @return orgApacheSlingCommonsLogLevel
     */
    public ConfigNodePropertyDropDown getOrgApacheSlingCommonsLogLevel() {
        return orgApacheSlingCommonsLogLevel;
    }

    public void setOrgApacheSlingCommonsLogLevel(ConfigNodePropertyDropDown orgApacheSlingCommonsLogLevel) {
        this.orgApacheSlingCommonsLogLevel = orgApacheSlingCommonsLogLevel;
    }

    /**
     * Get orgApacheSlingCommonsLogFile
     * @return orgApacheSlingCommonsLogFile
     */
    public ConfigNodePropertyString getOrgApacheSlingCommonsLogFile() {
        return orgApacheSlingCommonsLogFile;
    }

    public void setOrgApacheSlingCommonsLogFile(ConfigNodePropertyString orgApacheSlingCommonsLogFile) {
        this.orgApacheSlingCommonsLogFile = orgApacheSlingCommonsLogFile;
    }

    /**
     * Get orgApacheSlingCommonsLogFileNumber
     * @return orgApacheSlingCommonsLogFileNumber
     */
    public ConfigNodePropertyInteger getOrgApacheSlingCommonsLogFileNumber() {
        return orgApacheSlingCommonsLogFileNumber;
    }

    public void setOrgApacheSlingCommonsLogFileNumber(ConfigNodePropertyInteger orgApacheSlingCommonsLogFileNumber) {
        this.orgApacheSlingCommonsLogFileNumber = orgApacheSlingCommonsLogFileNumber;
    }

    /**
     * Get orgApacheSlingCommonsLogFileSize
     * @return orgApacheSlingCommonsLogFileSize
     */
    public ConfigNodePropertyString getOrgApacheSlingCommonsLogFileSize() {
        return orgApacheSlingCommonsLogFileSize;
    }

    public void setOrgApacheSlingCommonsLogFileSize(ConfigNodePropertyString orgApacheSlingCommonsLogFileSize) {
        this.orgApacheSlingCommonsLogFileSize = orgApacheSlingCommonsLogFileSize;
    }

    /**
     * Get orgApacheSlingCommonsLogPattern
     * @return orgApacheSlingCommonsLogPattern
     */
    public ConfigNodePropertyString getOrgApacheSlingCommonsLogPattern() {
        return orgApacheSlingCommonsLogPattern;
    }

    public void setOrgApacheSlingCommonsLogPattern(ConfigNodePropertyString orgApacheSlingCommonsLogPattern) {
        this.orgApacheSlingCommonsLogPattern = orgApacheSlingCommonsLogPattern;
    }

    /**
     * Get orgApacheSlingCommonsLogConfigurationFile
     * @return orgApacheSlingCommonsLogConfigurationFile
     */
    public ConfigNodePropertyString getOrgApacheSlingCommonsLogConfigurationFile() {
        return orgApacheSlingCommonsLogConfigurationFile;
    }

    public void setOrgApacheSlingCommonsLogConfigurationFile(ConfigNodePropertyString orgApacheSlingCommonsLogConfigurationFile) {
        this.orgApacheSlingCommonsLogConfigurationFile = orgApacheSlingCommonsLogConfigurationFile;
    }

    /**
     * Get orgApacheSlingCommonsLogPackagingDataEnabled
     * @return orgApacheSlingCommonsLogPackagingDataEnabled
     */
    public ConfigNodePropertyBoolean getOrgApacheSlingCommonsLogPackagingDataEnabled() {
        return orgApacheSlingCommonsLogPackagingDataEnabled;
    }

    public void setOrgApacheSlingCommonsLogPackagingDataEnabled(ConfigNodePropertyBoolean orgApacheSlingCommonsLogPackagingDataEnabled) {
        this.orgApacheSlingCommonsLogPackagingDataEnabled = orgApacheSlingCommonsLogPackagingDataEnabled;
    }

    /**
     * Get orgApacheSlingCommonsLogMaxCallerDataDepth
     * @return orgApacheSlingCommonsLogMaxCallerDataDepth
     */
    public ConfigNodePropertyInteger getOrgApacheSlingCommonsLogMaxCallerDataDepth() {
        return orgApacheSlingCommonsLogMaxCallerDataDepth;
    }

    public void setOrgApacheSlingCommonsLogMaxCallerDataDepth(ConfigNodePropertyInteger orgApacheSlingCommonsLogMaxCallerDataDepth) {
        this.orgApacheSlingCommonsLogMaxCallerDataDepth = orgApacheSlingCommonsLogMaxCallerDataDepth;
    }

    /**
     * Get orgApacheSlingCommonsLogMaxOldFileCountInDump
     * @return orgApacheSlingCommonsLogMaxOldFileCountInDump
     */
    public ConfigNodePropertyInteger getOrgApacheSlingCommonsLogMaxOldFileCountInDump() {
        return orgApacheSlingCommonsLogMaxOldFileCountInDump;
    }

    public void setOrgApacheSlingCommonsLogMaxOldFileCountInDump(ConfigNodePropertyInteger orgApacheSlingCommonsLogMaxOldFileCountInDump) {
        this.orgApacheSlingCommonsLogMaxOldFileCountInDump = orgApacheSlingCommonsLogMaxOldFileCountInDump;
    }

    /**
     * Get orgApacheSlingCommonsLogNumOfLines
     * @return orgApacheSlingCommonsLogNumOfLines
     */
    public ConfigNodePropertyInteger getOrgApacheSlingCommonsLogNumOfLines() {
        return orgApacheSlingCommonsLogNumOfLines;
    }

    public void setOrgApacheSlingCommonsLogNumOfLines(ConfigNodePropertyInteger orgApacheSlingCommonsLogNumOfLines) {
        this.orgApacheSlingCommonsLogNumOfLines = orgApacheSlingCommonsLogNumOfLines;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingCommonsLogLogManagerProperties {\n");
        
        sb.append("    orgApacheSlingCommonsLogLevel: ").append(toIndentedString(orgApacheSlingCommonsLogLevel)).append("\n");
        sb.append("    orgApacheSlingCommonsLogFile: ").append(toIndentedString(orgApacheSlingCommonsLogFile)).append("\n");
        sb.append("    orgApacheSlingCommonsLogFileNumber: ").append(toIndentedString(orgApacheSlingCommonsLogFileNumber)).append("\n");
        sb.append("    orgApacheSlingCommonsLogFileSize: ").append(toIndentedString(orgApacheSlingCommonsLogFileSize)).append("\n");
        sb.append("    orgApacheSlingCommonsLogPattern: ").append(toIndentedString(orgApacheSlingCommonsLogPattern)).append("\n");
        sb.append("    orgApacheSlingCommonsLogConfigurationFile: ").append(toIndentedString(orgApacheSlingCommonsLogConfigurationFile)).append("\n");
        sb.append("    orgApacheSlingCommonsLogPackagingDataEnabled: ").append(toIndentedString(orgApacheSlingCommonsLogPackagingDataEnabled)).append("\n");
        sb.append("    orgApacheSlingCommonsLogMaxCallerDataDepth: ").append(toIndentedString(orgApacheSlingCommonsLogMaxCallerDataDepth)).append("\n");
        sb.append("    orgApacheSlingCommonsLogMaxOldFileCountInDump: ").append(toIndentedString(orgApacheSlingCommonsLogMaxOldFileCountInDump)).append("\n");
        sb.append("    orgApacheSlingCommonsLogNumOfLines: ").append(toIndentedString(orgApacheSlingCommonsLogNumOfLines)).append("\n");
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

