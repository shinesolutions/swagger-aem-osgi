package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-08-05T00:56:20.785Z[GMT]")
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

  /**
   **/
  public OrgApacheSlingCommonsLogLogManagerProperties orgApacheSlingCommonsLogLevel(ConfigNodePropertyDropDown orgApacheSlingCommonsLogLevel) {
    this.orgApacheSlingCommonsLogLevel = orgApacheSlingCommonsLogLevel;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.sling.commons.log.level")
  public ConfigNodePropertyDropDown getOrgApacheSlingCommonsLogLevel() {
    return orgApacheSlingCommonsLogLevel;
  }
  public void setOrgApacheSlingCommonsLogLevel(ConfigNodePropertyDropDown orgApacheSlingCommonsLogLevel) {
    this.orgApacheSlingCommonsLogLevel = orgApacheSlingCommonsLogLevel;
  }

  /**
   **/
  public OrgApacheSlingCommonsLogLogManagerProperties orgApacheSlingCommonsLogFile(ConfigNodePropertyString orgApacheSlingCommonsLogFile) {
    this.orgApacheSlingCommonsLogFile = orgApacheSlingCommonsLogFile;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.sling.commons.log.file")
  public ConfigNodePropertyString getOrgApacheSlingCommonsLogFile() {
    return orgApacheSlingCommonsLogFile;
  }
  public void setOrgApacheSlingCommonsLogFile(ConfigNodePropertyString orgApacheSlingCommonsLogFile) {
    this.orgApacheSlingCommonsLogFile = orgApacheSlingCommonsLogFile;
  }

  /**
   **/
  public OrgApacheSlingCommonsLogLogManagerProperties orgApacheSlingCommonsLogFileNumber(ConfigNodePropertyInteger orgApacheSlingCommonsLogFileNumber) {
    this.orgApacheSlingCommonsLogFileNumber = orgApacheSlingCommonsLogFileNumber;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.sling.commons.log.file.number")
  public ConfigNodePropertyInteger getOrgApacheSlingCommonsLogFileNumber() {
    return orgApacheSlingCommonsLogFileNumber;
  }
  public void setOrgApacheSlingCommonsLogFileNumber(ConfigNodePropertyInteger orgApacheSlingCommonsLogFileNumber) {
    this.orgApacheSlingCommonsLogFileNumber = orgApacheSlingCommonsLogFileNumber;
  }

  /**
   **/
  public OrgApacheSlingCommonsLogLogManagerProperties orgApacheSlingCommonsLogFileSize(ConfigNodePropertyString orgApacheSlingCommonsLogFileSize) {
    this.orgApacheSlingCommonsLogFileSize = orgApacheSlingCommonsLogFileSize;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.sling.commons.log.file.size")
  public ConfigNodePropertyString getOrgApacheSlingCommonsLogFileSize() {
    return orgApacheSlingCommonsLogFileSize;
  }
  public void setOrgApacheSlingCommonsLogFileSize(ConfigNodePropertyString orgApacheSlingCommonsLogFileSize) {
    this.orgApacheSlingCommonsLogFileSize = orgApacheSlingCommonsLogFileSize;
  }

  /**
   **/
  public OrgApacheSlingCommonsLogLogManagerProperties orgApacheSlingCommonsLogPattern(ConfigNodePropertyString orgApacheSlingCommonsLogPattern) {
    this.orgApacheSlingCommonsLogPattern = orgApacheSlingCommonsLogPattern;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.sling.commons.log.pattern")
  public ConfigNodePropertyString getOrgApacheSlingCommonsLogPattern() {
    return orgApacheSlingCommonsLogPattern;
  }
  public void setOrgApacheSlingCommonsLogPattern(ConfigNodePropertyString orgApacheSlingCommonsLogPattern) {
    this.orgApacheSlingCommonsLogPattern = orgApacheSlingCommonsLogPattern;
  }

  /**
   **/
  public OrgApacheSlingCommonsLogLogManagerProperties orgApacheSlingCommonsLogConfigurationFile(ConfigNodePropertyString orgApacheSlingCommonsLogConfigurationFile) {
    this.orgApacheSlingCommonsLogConfigurationFile = orgApacheSlingCommonsLogConfigurationFile;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.sling.commons.log.configurationFile")
  public ConfigNodePropertyString getOrgApacheSlingCommonsLogConfigurationFile() {
    return orgApacheSlingCommonsLogConfigurationFile;
  }
  public void setOrgApacheSlingCommonsLogConfigurationFile(ConfigNodePropertyString orgApacheSlingCommonsLogConfigurationFile) {
    this.orgApacheSlingCommonsLogConfigurationFile = orgApacheSlingCommonsLogConfigurationFile;
  }

  /**
   **/
  public OrgApacheSlingCommonsLogLogManagerProperties orgApacheSlingCommonsLogPackagingDataEnabled(ConfigNodePropertyBoolean orgApacheSlingCommonsLogPackagingDataEnabled) {
    this.orgApacheSlingCommonsLogPackagingDataEnabled = orgApacheSlingCommonsLogPackagingDataEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.sling.commons.log.packagingDataEnabled")
  public ConfigNodePropertyBoolean getOrgApacheSlingCommonsLogPackagingDataEnabled() {
    return orgApacheSlingCommonsLogPackagingDataEnabled;
  }
  public void setOrgApacheSlingCommonsLogPackagingDataEnabled(ConfigNodePropertyBoolean orgApacheSlingCommonsLogPackagingDataEnabled) {
    this.orgApacheSlingCommonsLogPackagingDataEnabled = orgApacheSlingCommonsLogPackagingDataEnabled;
  }

  /**
   **/
  public OrgApacheSlingCommonsLogLogManagerProperties orgApacheSlingCommonsLogMaxCallerDataDepth(ConfigNodePropertyInteger orgApacheSlingCommonsLogMaxCallerDataDepth) {
    this.orgApacheSlingCommonsLogMaxCallerDataDepth = orgApacheSlingCommonsLogMaxCallerDataDepth;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.sling.commons.log.maxCallerDataDepth")
  public ConfigNodePropertyInteger getOrgApacheSlingCommonsLogMaxCallerDataDepth() {
    return orgApacheSlingCommonsLogMaxCallerDataDepth;
  }
  public void setOrgApacheSlingCommonsLogMaxCallerDataDepth(ConfigNodePropertyInteger orgApacheSlingCommonsLogMaxCallerDataDepth) {
    this.orgApacheSlingCommonsLogMaxCallerDataDepth = orgApacheSlingCommonsLogMaxCallerDataDepth;
  }

  /**
   **/
  public OrgApacheSlingCommonsLogLogManagerProperties orgApacheSlingCommonsLogMaxOldFileCountInDump(ConfigNodePropertyInteger orgApacheSlingCommonsLogMaxOldFileCountInDump) {
    this.orgApacheSlingCommonsLogMaxOldFileCountInDump = orgApacheSlingCommonsLogMaxOldFileCountInDump;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.sling.commons.log.maxOldFileCountInDump")
  public ConfigNodePropertyInteger getOrgApacheSlingCommonsLogMaxOldFileCountInDump() {
    return orgApacheSlingCommonsLogMaxOldFileCountInDump;
  }
  public void setOrgApacheSlingCommonsLogMaxOldFileCountInDump(ConfigNodePropertyInteger orgApacheSlingCommonsLogMaxOldFileCountInDump) {
    this.orgApacheSlingCommonsLogMaxOldFileCountInDump = orgApacheSlingCommonsLogMaxOldFileCountInDump;
  }

  /**
   **/
  public OrgApacheSlingCommonsLogLogManagerProperties orgApacheSlingCommonsLogNumOfLines(ConfigNodePropertyInteger orgApacheSlingCommonsLogNumOfLines) {
    this.orgApacheSlingCommonsLogNumOfLines = orgApacheSlingCommonsLogNumOfLines;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.sling.commons.log.numOfLines")
  public ConfigNodePropertyInteger getOrgApacheSlingCommonsLogNumOfLines() {
    return orgApacheSlingCommonsLogNumOfLines;
  }
  public void setOrgApacheSlingCommonsLogNumOfLines(ConfigNodePropertyInteger orgApacheSlingCommonsLogNumOfLines) {
    this.orgApacheSlingCommonsLogNumOfLines = orgApacheSlingCommonsLogNumOfLines;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

