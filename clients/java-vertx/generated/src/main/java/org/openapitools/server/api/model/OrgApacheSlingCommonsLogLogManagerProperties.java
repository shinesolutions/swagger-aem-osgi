package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyDropDown;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheSlingCommonsLogLogManagerProperties   {
  
  private ConfigNodePropertyDropDown orgApacheSlingCommonsLogLevel = null;
  private ConfigNodePropertyString orgApacheSlingCommonsLogFile = null;
  private ConfigNodePropertyInteger orgApacheSlingCommonsLogFileNumber = null;
  private ConfigNodePropertyString orgApacheSlingCommonsLogFileSize = null;
  private ConfigNodePropertyString orgApacheSlingCommonsLogPattern = null;
  private ConfigNodePropertyString orgApacheSlingCommonsLogConfigurationFile = null;
  private ConfigNodePropertyBoolean orgApacheSlingCommonsLogPackagingDataEnabled = null;
  private ConfigNodePropertyInteger orgApacheSlingCommonsLogMaxCallerDataDepth = null;
  private ConfigNodePropertyInteger orgApacheSlingCommonsLogMaxOldFileCountInDump = null;
  private ConfigNodePropertyInteger orgApacheSlingCommonsLogNumOfLines = null;

  public OrgApacheSlingCommonsLogLogManagerProperties () {

  }

  public OrgApacheSlingCommonsLogLogManagerProperties (ConfigNodePropertyDropDown orgApacheSlingCommonsLogLevel, ConfigNodePropertyString orgApacheSlingCommonsLogFile, ConfigNodePropertyInteger orgApacheSlingCommonsLogFileNumber, ConfigNodePropertyString orgApacheSlingCommonsLogFileSize, ConfigNodePropertyString orgApacheSlingCommonsLogPattern, ConfigNodePropertyString orgApacheSlingCommonsLogConfigurationFile, ConfigNodePropertyBoolean orgApacheSlingCommonsLogPackagingDataEnabled, ConfigNodePropertyInteger orgApacheSlingCommonsLogMaxCallerDataDepth, ConfigNodePropertyInteger orgApacheSlingCommonsLogMaxOldFileCountInDump, ConfigNodePropertyInteger orgApacheSlingCommonsLogNumOfLines) {
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

    
  @JsonProperty("org.apache.sling.commons.log.level")
  public ConfigNodePropertyDropDown getOrgApacheSlingCommonsLogLevel() {
    return orgApacheSlingCommonsLogLevel;
  }
  public void setOrgApacheSlingCommonsLogLevel(ConfigNodePropertyDropDown orgApacheSlingCommonsLogLevel) {
    this.orgApacheSlingCommonsLogLevel = orgApacheSlingCommonsLogLevel;
  }

    
  @JsonProperty("org.apache.sling.commons.log.file")
  public ConfigNodePropertyString getOrgApacheSlingCommonsLogFile() {
    return orgApacheSlingCommonsLogFile;
  }
  public void setOrgApacheSlingCommonsLogFile(ConfigNodePropertyString orgApacheSlingCommonsLogFile) {
    this.orgApacheSlingCommonsLogFile = orgApacheSlingCommonsLogFile;
  }

    
  @JsonProperty("org.apache.sling.commons.log.file.number")
  public ConfigNodePropertyInteger getOrgApacheSlingCommonsLogFileNumber() {
    return orgApacheSlingCommonsLogFileNumber;
  }
  public void setOrgApacheSlingCommonsLogFileNumber(ConfigNodePropertyInteger orgApacheSlingCommonsLogFileNumber) {
    this.orgApacheSlingCommonsLogFileNumber = orgApacheSlingCommonsLogFileNumber;
  }

    
  @JsonProperty("org.apache.sling.commons.log.file.size")
  public ConfigNodePropertyString getOrgApacheSlingCommonsLogFileSize() {
    return orgApacheSlingCommonsLogFileSize;
  }
  public void setOrgApacheSlingCommonsLogFileSize(ConfigNodePropertyString orgApacheSlingCommonsLogFileSize) {
    this.orgApacheSlingCommonsLogFileSize = orgApacheSlingCommonsLogFileSize;
  }

    
  @JsonProperty("org.apache.sling.commons.log.pattern")
  public ConfigNodePropertyString getOrgApacheSlingCommonsLogPattern() {
    return orgApacheSlingCommonsLogPattern;
  }
  public void setOrgApacheSlingCommonsLogPattern(ConfigNodePropertyString orgApacheSlingCommonsLogPattern) {
    this.orgApacheSlingCommonsLogPattern = orgApacheSlingCommonsLogPattern;
  }

    
  @JsonProperty("org.apache.sling.commons.log.configurationFile")
  public ConfigNodePropertyString getOrgApacheSlingCommonsLogConfigurationFile() {
    return orgApacheSlingCommonsLogConfigurationFile;
  }
  public void setOrgApacheSlingCommonsLogConfigurationFile(ConfigNodePropertyString orgApacheSlingCommonsLogConfigurationFile) {
    this.orgApacheSlingCommonsLogConfigurationFile = orgApacheSlingCommonsLogConfigurationFile;
  }

    
  @JsonProperty("org.apache.sling.commons.log.packagingDataEnabled")
  public ConfigNodePropertyBoolean getOrgApacheSlingCommonsLogPackagingDataEnabled() {
    return orgApacheSlingCommonsLogPackagingDataEnabled;
  }
  public void setOrgApacheSlingCommonsLogPackagingDataEnabled(ConfigNodePropertyBoolean orgApacheSlingCommonsLogPackagingDataEnabled) {
    this.orgApacheSlingCommonsLogPackagingDataEnabled = orgApacheSlingCommonsLogPackagingDataEnabled;
  }

    
  @JsonProperty("org.apache.sling.commons.log.maxCallerDataDepth")
  public ConfigNodePropertyInteger getOrgApacheSlingCommonsLogMaxCallerDataDepth() {
    return orgApacheSlingCommonsLogMaxCallerDataDepth;
  }
  public void setOrgApacheSlingCommonsLogMaxCallerDataDepth(ConfigNodePropertyInteger orgApacheSlingCommonsLogMaxCallerDataDepth) {
    this.orgApacheSlingCommonsLogMaxCallerDataDepth = orgApacheSlingCommonsLogMaxCallerDataDepth;
  }

    
  @JsonProperty("org.apache.sling.commons.log.maxOldFileCountInDump")
  public ConfigNodePropertyInteger getOrgApacheSlingCommonsLogMaxOldFileCountInDump() {
    return orgApacheSlingCommonsLogMaxOldFileCountInDump;
  }
  public void setOrgApacheSlingCommonsLogMaxOldFileCountInDump(ConfigNodePropertyInteger orgApacheSlingCommonsLogMaxOldFileCountInDump) {
    this.orgApacheSlingCommonsLogMaxOldFileCountInDump = orgApacheSlingCommonsLogMaxOldFileCountInDump;
  }

    
  @JsonProperty("org.apache.sling.commons.log.numOfLines")
  public ConfigNodePropertyInteger getOrgApacheSlingCommonsLogNumOfLines() {
    return orgApacheSlingCommonsLogNumOfLines;
  }
  public void setOrgApacheSlingCommonsLogNumOfLines(ConfigNodePropertyInteger orgApacheSlingCommonsLogNumOfLines) {
    this.orgApacheSlingCommonsLogNumOfLines = orgApacheSlingCommonsLogNumOfLines;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingCommonsLogLogManagerProperties orgApacheSlingCommonsLogLogManagerProperties = (OrgApacheSlingCommonsLogLogManagerProperties) o;
    return Objects.equals(orgApacheSlingCommonsLogLevel, orgApacheSlingCommonsLogLogManagerProperties.orgApacheSlingCommonsLogLevel) &&
        Objects.equals(orgApacheSlingCommonsLogFile, orgApacheSlingCommonsLogLogManagerProperties.orgApacheSlingCommonsLogFile) &&
        Objects.equals(orgApacheSlingCommonsLogFileNumber, orgApacheSlingCommonsLogLogManagerProperties.orgApacheSlingCommonsLogFileNumber) &&
        Objects.equals(orgApacheSlingCommonsLogFileSize, orgApacheSlingCommonsLogLogManagerProperties.orgApacheSlingCommonsLogFileSize) &&
        Objects.equals(orgApacheSlingCommonsLogPattern, orgApacheSlingCommonsLogLogManagerProperties.orgApacheSlingCommonsLogPattern) &&
        Objects.equals(orgApacheSlingCommonsLogConfigurationFile, orgApacheSlingCommonsLogLogManagerProperties.orgApacheSlingCommonsLogConfigurationFile) &&
        Objects.equals(orgApacheSlingCommonsLogPackagingDataEnabled, orgApacheSlingCommonsLogLogManagerProperties.orgApacheSlingCommonsLogPackagingDataEnabled) &&
        Objects.equals(orgApacheSlingCommonsLogMaxCallerDataDepth, orgApacheSlingCommonsLogLogManagerProperties.orgApacheSlingCommonsLogMaxCallerDataDepth) &&
        Objects.equals(orgApacheSlingCommonsLogMaxOldFileCountInDump, orgApacheSlingCommonsLogLogManagerProperties.orgApacheSlingCommonsLogMaxOldFileCountInDump) &&
        Objects.equals(orgApacheSlingCommonsLogNumOfLines, orgApacheSlingCommonsLogLogManagerProperties.orgApacheSlingCommonsLogNumOfLines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgApacheSlingCommonsLogLevel, orgApacheSlingCommonsLogFile, orgApacheSlingCommonsLogFileNumber, orgApacheSlingCommonsLogFileSize, orgApacheSlingCommonsLogPattern, orgApacheSlingCommonsLogConfigurationFile, orgApacheSlingCommonsLogPackagingDataEnabled, orgApacheSlingCommonsLogMaxCallerDataDepth, orgApacheSlingCommonsLogMaxOldFileCountInDump, orgApacheSlingCommonsLogNumOfLines);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
