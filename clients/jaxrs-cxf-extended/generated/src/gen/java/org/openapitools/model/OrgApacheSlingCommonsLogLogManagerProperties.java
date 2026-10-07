package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingCommonsLogLogManagerProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyDropDown orgApacheSlingCommonsLogLevel;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString orgApacheSlingCommonsLogFile;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger orgApacheSlingCommonsLogFileNumber;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString orgApacheSlingCommonsLogFileSize;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString orgApacheSlingCommonsLogPattern;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString orgApacheSlingCommonsLogConfigurationFile;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean orgApacheSlingCommonsLogPackagingDataEnabled;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger orgApacheSlingCommonsLogMaxCallerDataDepth;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger orgApacheSlingCommonsLogMaxOldFileCountInDump;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger orgApacheSlingCommonsLogNumOfLines;
 /**
  * Get orgApacheSlingCommonsLogLevel
  * @return orgApacheSlingCommonsLogLevel
  */
  @JsonProperty("org.apache.sling.commons.log.level")
  public ConfigNodePropertyDropDown getOrgApacheSlingCommonsLogLevel() {
    return orgApacheSlingCommonsLogLevel;
  }

  /**
   * Sets the <code>orgApacheSlingCommonsLogLevel</code> property.
   */
 public void setOrgApacheSlingCommonsLogLevel(ConfigNodePropertyDropDown orgApacheSlingCommonsLogLevel) {
    this.orgApacheSlingCommonsLogLevel = orgApacheSlingCommonsLogLevel;
  }

  /**
   * Sets the <code>orgApacheSlingCommonsLogLevel</code> property.
   */
  public OrgApacheSlingCommonsLogLogManagerProperties orgApacheSlingCommonsLogLevel(ConfigNodePropertyDropDown orgApacheSlingCommonsLogLevel) {
    this.orgApacheSlingCommonsLogLevel = orgApacheSlingCommonsLogLevel;
    return this;
  }

 /**
  * Get orgApacheSlingCommonsLogFile
  * @return orgApacheSlingCommonsLogFile
  */
  @JsonProperty("org.apache.sling.commons.log.file")
  public ConfigNodePropertyString getOrgApacheSlingCommonsLogFile() {
    return orgApacheSlingCommonsLogFile;
  }

  /**
   * Sets the <code>orgApacheSlingCommonsLogFile</code> property.
   */
 public void setOrgApacheSlingCommonsLogFile(ConfigNodePropertyString orgApacheSlingCommonsLogFile) {
    this.orgApacheSlingCommonsLogFile = orgApacheSlingCommonsLogFile;
  }

  /**
   * Sets the <code>orgApacheSlingCommonsLogFile</code> property.
   */
  public OrgApacheSlingCommonsLogLogManagerProperties orgApacheSlingCommonsLogFile(ConfigNodePropertyString orgApacheSlingCommonsLogFile) {
    this.orgApacheSlingCommonsLogFile = orgApacheSlingCommonsLogFile;
    return this;
  }

 /**
  * Get orgApacheSlingCommonsLogFileNumber
  * @return orgApacheSlingCommonsLogFileNumber
  */
  @JsonProperty("org.apache.sling.commons.log.file.number")
  public ConfigNodePropertyInteger getOrgApacheSlingCommonsLogFileNumber() {
    return orgApacheSlingCommonsLogFileNumber;
  }

  /**
   * Sets the <code>orgApacheSlingCommonsLogFileNumber</code> property.
   */
 public void setOrgApacheSlingCommonsLogFileNumber(ConfigNodePropertyInteger orgApacheSlingCommonsLogFileNumber) {
    this.orgApacheSlingCommonsLogFileNumber = orgApacheSlingCommonsLogFileNumber;
  }

  /**
   * Sets the <code>orgApacheSlingCommonsLogFileNumber</code> property.
   */
  public OrgApacheSlingCommonsLogLogManagerProperties orgApacheSlingCommonsLogFileNumber(ConfigNodePropertyInteger orgApacheSlingCommonsLogFileNumber) {
    this.orgApacheSlingCommonsLogFileNumber = orgApacheSlingCommonsLogFileNumber;
    return this;
  }

 /**
  * Get orgApacheSlingCommonsLogFileSize
  * @return orgApacheSlingCommonsLogFileSize
  */
  @JsonProperty("org.apache.sling.commons.log.file.size")
  public ConfigNodePropertyString getOrgApacheSlingCommonsLogFileSize() {
    return orgApacheSlingCommonsLogFileSize;
  }

  /**
   * Sets the <code>orgApacheSlingCommonsLogFileSize</code> property.
   */
 public void setOrgApacheSlingCommonsLogFileSize(ConfigNodePropertyString orgApacheSlingCommonsLogFileSize) {
    this.orgApacheSlingCommonsLogFileSize = orgApacheSlingCommonsLogFileSize;
  }

  /**
   * Sets the <code>orgApacheSlingCommonsLogFileSize</code> property.
   */
  public OrgApacheSlingCommonsLogLogManagerProperties orgApacheSlingCommonsLogFileSize(ConfigNodePropertyString orgApacheSlingCommonsLogFileSize) {
    this.orgApacheSlingCommonsLogFileSize = orgApacheSlingCommonsLogFileSize;
    return this;
  }

 /**
  * Get orgApacheSlingCommonsLogPattern
  * @return orgApacheSlingCommonsLogPattern
  */
  @JsonProperty("org.apache.sling.commons.log.pattern")
  public ConfigNodePropertyString getOrgApacheSlingCommonsLogPattern() {
    return orgApacheSlingCommonsLogPattern;
  }

  /**
   * Sets the <code>orgApacheSlingCommonsLogPattern</code> property.
   */
 public void setOrgApacheSlingCommonsLogPattern(ConfigNodePropertyString orgApacheSlingCommonsLogPattern) {
    this.orgApacheSlingCommonsLogPattern = orgApacheSlingCommonsLogPattern;
  }

  /**
   * Sets the <code>orgApacheSlingCommonsLogPattern</code> property.
   */
  public OrgApacheSlingCommonsLogLogManagerProperties orgApacheSlingCommonsLogPattern(ConfigNodePropertyString orgApacheSlingCommonsLogPattern) {
    this.orgApacheSlingCommonsLogPattern = orgApacheSlingCommonsLogPattern;
    return this;
  }

 /**
  * Get orgApacheSlingCommonsLogConfigurationFile
  * @return orgApacheSlingCommonsLogConfigurationFile
  */
  @JsonProperty("org.apache.sling.commons.log.configurationFile")
  public ConfigNodePropertyString getOrgApacheSlingCommonsLogConfigurationFile() {
    return orgApacheSlingCommonsLogConfigurationFile;
  }

  /**
   * Sets the <code>orgApacheSlingCommonsLogConfigurationFile</code> property.
   */
 public void setOrgApacheSlingCommonsLogConfigurationFile(ConfigNodePropertyString orgApacheSlingCommonsLogConfigurationFile) {
    this.orgApacheSlingCommonsLogConfigurationFile = orgApacheSlingCommonsLogConfigurationFile;
  }

  /**
   * Sets the <code>orgApacheSlingCommonsLogConfigurationFile</code> property.
   */
  public OrgApacheSlingCommonsLogLogManagerProperties orgApacheSlingCommonsLogConfigurationFile(ConfigNodePropertyString orgApacheSlingCommonsLogConfigurationFile) {
    this.orgApacheSlingCommonsLogConfigurationFile = orgApacheSlingCommonsLogConfigurationFile;
    return this;
  }

 /**
  * Get orgApacheSlingCommonsLogPackagingDataEnabled
  * @return orgApacheSlingCommonsLogPackagingDataEnabled
  */
  @JsonProperty("org.apache.sling.commons.log.packagingDataEnabled")
  public ConfigNodePropertyBoolean getOrgApacheSlingCommonsLogPackagingDataEnabled() {
    return orgApacheSlingCommonsLogPackagingDataEnabled;
  }

  /**
   * Sets the <code>orgApacheSlingCommonsLogPackagingDataEnabled</code> property.
   */
 public void setOrgApacheSlingCommonsLogPackagingDataEnabled(ConfigNodePropertyBoolean orgApacheSlingCommonsLogPackagingDataEnabled) {
    this.orgApacheSlingCommonsLogPackagingDataEnabled = orgApacheSlingCommonsLogPackagingDataEnabled;
  }

  /**
   * Sets the <code>orgApacheSlingCommonsLogPackagingDataEnabled</code> property.
   */
  public OrgApacheSlingCommonsLogLogManagerProperties orgApacheSlingCommonsLogPackagingDataEnabled(ConfigNodePropertyBoolean orgApacheSlingCommonsLogPackagingDataEnabled) {
    this.orgApacheSlingCommonsLogPackagingDataEnabled = orgApacheSlingCommonsLogPackagingDataEnabled;
    return this;
  }

 /**
  * Get orgApacheSlingCommonsLogMaxCallerDataDepth
  * @return orgApacheSlingCommonsLogMaxCallerDataDepth
  */
  @JsonProperty("org.apache.sling.commons.log.maxCallerDataDepth")
  public ConfigNodePropertyInteger getOrgApacheSlingCommonsLogMaxCallerDataDepth() {
    return orgApacheSlingCommonsLogMaxCallerDataDepth;
  }

  /**
   * Sets the <code>orgApacheSlingCommonsLogMaxCallerDataDepth</code> property.
   */
 public void setOrgApacheSlingCommonsLogMaxCallerDataDepth(ConfigNodePropertyInteger orgApacheSlingCommonsLogMaxCallerDataDepth) {
    this.orgApacheSlingCommonsLogMaxCallerDataDepth = orgApacheSlingCommonsLogMaxCallerDataDepth;
  }

  /**
   * Sets the <code>orgApacheSlingCommonsLogMaxCallerDataDepth</code> property.
   */
  public OrgApacheSlingCommonsLogLogManagerProperties orgApacheSlingCommonsLogMaxCallerDataDepth(ConfigNodePropertyInteger orgApacheSlingCommonsLogMaxCallerDataDepth) {
    this.orgApacheSlingCommonsLogMaxCallerDataDepth = orgApacheSlingCommonsLogMaxCallerDataDepth;
    return this;
  }

 /**
  * Get orgApacheSlingCommonsLogMaxOldFileCountInDump
  * @return orgApacheSlingCommonsLogMaxOldFileCountInDump
  */
  @JsonProperty("org.apache.sling.commons.log.maxOldFileCountInDump")
  public ConfigNodePropertyInteger getOrgApacheSlingCommonsLogMaxOldFileCountInDump() {
    return orgApacheSlingCommonsLogMaxOldFileCountInDump;
  }

  /**
   * Sets the <code>orgApacheSlingCommonsLogMaxOldFileCountInDump</code> property.
   */
 public void setOrgApacheSlingCommonsLogMaxOldFileCountInDump(ConfigNodePropertyInteger orgApacheSlingCommonsLogMaxOldFileCountInDump) {
    this.orgApacheSlingCommonsLogMaxOldFileCountInDump = orgApacheSlingCommonsLogMaxOldFileCountInDump;
  }

  /**
   * Sets the <code>orgApacheSlingCommonsLogMaxOldFileCountInDump</code> property.
   */
  public OrgApacheSlingCommonsLogLogManagerProperties orgApacheSlingCommonsLogMaxOldFileCountInDump(ConfigNodePropertyInteger orgApacheSlingCommonsLogMaxOldFileCountInDump) {
    this.orgApacheSlingCommonsLogMaxOldFileCountInDump = orgApacheSlingCommonsLogMaxOldFileCountInDump;
    return this;
  }

 /**
  * Get orgApacheSlingCommonsLogNumOfLines
  * @return orgApacheSlingCommonsLogNumOfLines
  */
  @JsonProperty("org.apache.sling.commons.log.numOfLines")
  public ConfigNodePropertyInteger getOrgApacheSlingCommonsLogNumOfLines() {
    return orgApacheSlingCommonsLogNumOfLines;
  }

  /**
   * Sets the <code>orgApacheSlingCommonsLogNumOfLines</code> property.
   */
 public void setOrgApacheSlingCommonsLogNumOfLines(ConfigNodePropertyInteger orgApacheSlingCommonsLogNumOfLines) {
    this.orgApacheSlingCommonsLogNumOfLines = orgApacheSlingCommonsLogNumOfLines;
  }

  /**
   * Sets the <code>orgApacheSlingCommonsLogNumOfLines</code> property.
   */
  public OrgApacheSlingCommonsLogLogManagerProperties orgApacheSlingCommonsLogNumOfLines(ConfigNodePropertyInteger orgApacheSlingCommonsLogNumOfLines) {
    this.orgApacheSlingCommonsLogNumOfLines = orgApacheSlingCommonsLogNumOfLines;
    return this;
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
    return Objects.equals(this.orgApacheSlingCommonsLogLevel, orgApacheSlingCommonsLogLogManagerProperties.orgApacheSlingCommonsLogLevel) &&
        Objects.equals(this.orgApacheSlingCommonsLogFile, orgApacheSlingCommonsLogLogManagerProperties.orgApacheSlingCommonsLogFile) &&
        Objects.equals(this.orgApacheSlingCommonsLogFileNumber, orgApacheSlingCommonsLogLogManagerProperties.orgApacheSlingCommonsLogFileNumber) &&
        Objects.equals(this.orgApacheSlingCommonsLogFileSize, orgApacheSlingCommonsLogLogManagerProperties.orgApacheSlingCommonsLogFileSize) &&
        Objects.equals(this.orgApacheSlingCommonsLogPattern, orgApacheSlingCommonsLogLogManagerProperties.orgApacheSlingCommonsLogPattern) &&
        Objects.equals(this.orgApacheSlingCommonsLogConfigurationFile, orgApacheSlingCommonsLogLogManagerProperties.orgApacheSlingCommonsLogConfigurationFile) &&
        Objects.equals(this.orgApacheSlingCommonsLogPackagingDataEnabled, orgApacheSlingCommonsLogLogManagerProperties.orgApacheSlingCommonsLogPackagingDataEnabled) &&
        Objects.equals(this.orgApacheSlingCommonsLogMaxCallerDataDepth, orgApacheSlingCommonsLogLogManagerProperties.orgApacheSlingCommonsLogMaxCallerDataDepth) &&
        Objects.equals(this.orgApacheSlingCommonsLogMaxOldFileCountInDump, orgApacheSlingCommonsLogLogManagerProperties.orgApacheSlingCommonsLogMaxOldFileCountInDump) &&
        Objects.equals(this.orgApacheSlingCommonsLogNumOfLines, orgApacheSlingCommonsLogLogManagerProperties.orgApacheSlingCommonsLogNumOfLines);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

