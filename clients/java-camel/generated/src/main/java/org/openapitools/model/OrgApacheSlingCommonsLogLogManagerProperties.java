package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheSlingCommonsLogLogManagerProperties
 */

@JsonTypeName("orgApacheSlingCommonsLogLogManagerProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingCommonsLogLogManagerProperties {

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

  public OrgApacheSlingCommonsLogLogManagerProperties orgApacheSlingCommonsLogLevel(ConfigNodePropertyDropDown orgApacheSlingCommonsLogLevel) {
    this.orgApacheSlingCommonsLogLevel = orgApacheSlingCommonsLogLevel;
    return this;
  }

  /**
   * Get orgApacheSlingCommonsLogLevel
   * @return orgApacheSlingCommonsLogLevel
   */
  @Valid 
  @Schema(name = "org.apache.sling.commons.log.level", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.commons.log.level")
  public ConfigNodePropertyDropDown getOrgApacheSlingCommonsLogLevel() {
    return orgApacheSlingCommonsLogLevel;
  }

  public void setOrgApacheSlingCommonsLogLevel(ConfigNodePropertyDropDown orgApacheSlingCommonsLogLevel) {
    this.orgApacheSlingCommonsLogLevel = orgApacheSlingCommonsLogLevel;
  }

  public OrgApacheSlingCommonsLogLogManagerProperties orgApacheSlingCommonsLogFile(ConfigNodePropertyString orgApacheSlingCommonsLogFile) {
    this.orgApacheSlingCommonsLogFile = orgApacheSlingCommonsLogFile;
    return this;
  }

  /**
   * Get orgApacheSlingCommonsLogFile
   * @return orgApacheSlingCommonsLogFile
   */
  @Valid 
  @Schema(name = "org.apache.sling.commons.log.file", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.commons.log.file")
  public ConfigNodePropertyString getOrgApacheSlingCommonsLogFile() {
    return orgApacheSlingCommonsLogFile;
  }

  public void setOrgApacheSlingCommonsLogFile(ConfigNodePropertyString orgApacheSlingCommonsLogFile) {
    this.orgApacheSlingCommonsLogFile = orgApacheSlingCommonsLogFile;
  }

  public OrgApacheSlingCommonsLogLogManagerProperties orgApacheSlingCommonsLogFileNumber(ConfigNodePropertyInteger orgApacheSlingCommonsLogFileNumber) {
    this.orgApacheSlingCommonsLogFileNumber = orgApacheSlingCommonsLogFileNumber;
    return this;
  }

  /**
   * Get orgApacheSlingCommonsLogFileNumber
   * @return orgApacheSlingCommonsLogFileNumber
   */
  @Valid 
  @Schema(name = "org.apache.sling.commons.log.file.number", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.commons.log.file.number")
  public ConfigNodePropertyInteger getOrgApacheSlingCommonsLogFileNumber() {
    return orgApacheSlingCommonsLogFileNumber;
  }

  public void setOrgApacheSlingCommonsLogFileNumber(ConfigNodePropertyInteger orgApacheSlingCommonsLogFileNumber) {
    this.orgApacheSlingCommonsLogFileNumber = orgApacheSlingCommonsLogFileNumber;
  }

  public OrgApacheSlingCommonsLogLogManagerProperties orgApacheSlingCommonsLogFileSize(ConfigNodePropertyString orgApacheSlingCommonsLogFileSize) {
    this.orgApacheSlingCommonsLogFileSize = orgApacheSlingCommonsLogFileSize;
    return this;
  }

  /**
   * Get orgApacheSlingCommonsLogFileSize
   * @return orgApacheSlingCommonsLogFileSize
   */
  @Valid 
  @Schema(name = "org.apache.sling.commons.log.file.size", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.commons.log.file.size")
  public ConfigNodePropertyString getOrgApacheSlingCommonsLogFileSize() {
    return orgApacheSlingCommonsLogFileSize;
  }

  public void setOrgApacheSlingCommonsLogFileSize(ConfigNodePropertyString orgApacheSlingCommonsLogFileSize) {
    this.orgApacheSlingCommonsLogFileSize = orgApacheSlingCommonsLogFileSize;
  }

  public OrgApacheSlingCommonsLogLogManagerProperties orgApacheSlingCommonsLogPattern(ConfigNodePropertyString orgApacheSlingCommonsLogPattern) {
    this.orgApacheSlingCommonsLogPattern = orgApacheSlingCommonsLogPattern;
    return this;
  }

  /**
   * Get orgApacheSlingCommonsLogPattern
   * @return orgApacheSlingCommonsLogPattern
   */
  @Valid 
  @Schema(name = "org.apache.sling.commons.log.pattern", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.commons.log.pattern")
  public ConfigNodePropertyString getOrgApacheSlingCommonsLogPattern() {
    return orgApacheSlingCommonsLogPattern;
  }

  public void setOrgApacheSlingCommonsLogPattern(ConfigNodePropertyString orgApacheSlingCommonsLogPattern) {
    this.orgApacheSlingCommonsLogPattern = orgApacheSlingCommonsLogPattern;
  }

  public OrgApacheSlingCommonsLogLogManagerProperties orgApacheSlingCommonsLogConfigurationFile(ConfigNodePropertyString orgApacheSlingCommonsLogConfigurationFile) {
    this.orgApacheSlingCommonsLogConfigurationFile = orgApacheSlingCommonsLogConfigurationFile;
    return this;
  }

  /**
   * Get orgApacheSlingCommonsLogConfigurationFile
   * @return orgApacheSlingCommonsLogConfigurationFile
   */
  @Valid 
  @Schema(name = "org.apache.sling.commons.log.configurationFile", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.commons.log.configurationFile")
  public ConfigNodePropertyString getOrgApacheSlingCommonsLogConfigurationFile() {
    return orgApacheSlingCommonsLogConfigurationFile;
  }

  public void setOrgApacheSlingCommonsLogConfigurationFile(ConfigNodePropertyString orgApacheSlingCommonsLogConfigurationFile) {
    this.orgApacheSlingCommonsLogConfigurationFile = orgApacheSlingCommonsLogConfigurationFile;
  }

  public OrgApacheSlingCommonsLogLogManagerProperties orgApacheSlingCommonsLogPackagingDataEnabled(ConfigNodePropertyBoolean orgApacheSlingCommonsLogPackagingDataEnabled) {
    this.orgApacheSlingCommonsLogPackagingDataEnabled = orgApacheSlingCommonsLogPackagingDataEnabled;
    return this;
  }

  /**
   * Get orgApacheSlingCommonsLogPackagingDataEnabled
   * @return orgApacheSlingCommonsLogPackagingDataEnabled
   */
  @Valid 
  @Schema(name = "org.apache.sling.commons.log.packagingDataEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.commons.log.packagingDataEnabled")
  public ConfigNodePropertyBoolean getOrgApacheSlingCommonsLogPackagingDataEnabled() {
    return orgApacheSlingCommonsLogPackagingDataEnabled;
  }

  public void setOrgApacheSlingCommonsLogPackagingDataEnabled(ConfigNodePropertyBoolean orgApacheSlingCommonsLogPackagingDataEnabled) {
    this.orgApacheSlingCommonsLogPackagingDataEnabled = orgApacheSlingCommonsLogPackagingDataEnabled;
  }

  public OrgApacheSlingCommonsLogLogManagerProperties orgApacheSlingCommonsLogMaxCallerDataDepth(ConfigNodePropertyInteger orgApacheSlingCommonsLogMaxCallerDataDepth) {
    this.orgApacheSlingCommonsLogMaxCallerDataDepth = orgApacheSlingCommonsLogMaxCallerDataDepth;
    return this;
  }

  /**
   * Get orgApacheSlingCommonsLogMaxCallerDataDepth
   * @return orgApacheSlingCommonsLogMaxCallerDataDepth
   */
  @Valid 
  @Schema(name = "org.apache.sling.commons.log.maxCallerDataDepth", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.commons.log.maxCallerDataDepth")
  public ConfigNodePropertyInteger getOrgApacheSlingCommonsLogMaxCallerDataDepth() {
    return orgApacheSlingCommonsLogMaxCallerDataDepth;
  }

  public void setOrgApacheSlingCommonsLogMaxCallerDataDepth(ConfigNodePropertyInteger orgApacheSlingCommonsLogMaxCallerDataDepth) {
    this.orgApacheSlingCommonsLogMaxCallerDataDepth = orgApacheSlingCommonsLogMaxCallerDataDepth;
  }

  public OrgApacheSlingCommonsLogLogManagerProperties orgApacheSlingCommonsLogMaxOldFileCountInDump(ConfigNodePropertyInteger orgApacheSlingCommonsLogMaxOldFileCountInDump) {
    this.orgApacheSlingCommonsLogMaxOldFileCountInDump = orgApacheSlingCommonsLogMaxOldFileCountInDump;
    return this;
  }

  /**
   * Get orgApacheSlingCommonsLogMaxOldFileCountInDump
   * @return orgApacheSlingCommonsLogMaxOldFileCountInDump
   */
  @Valid 
  @Schema(name = "org.apache.sling.commons.log.maxOldFileCountInDump", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.commons.log.maxOldFileCountInDump")
  public ConfigNodePropertyInteger getOrgApacheSlingCommonsLogMaxOldFileCountInDump() {
    return orgApacheSlingCommonsLogMaxOldFileCountInDump;
  }

  public void setOrgApacheSlingCommonsLogMaxOldFileCountInDump(ConfigNodePropertyInteger orgApacheSlingCommonsLogMaxOldFileCountInDump) {
    this.orgApacheSlingCommonsLogMaxOldFileCountInDump = orgApacheSlingCommonsLogMaxOldFileCountInDump;
  }

  public OrgApacheSlingCommonsLogLogManagerProperties orgApacheSlingCommonsLogNumOfLines(ConfigNodePropertyInteger orgApacheSlingCommonsLogNumOfLines) {
    this.orgApacheSlingCommonsLogNumOfLines = orgApacheSlingCommonsLogNumOfLines;
    return this;
  }

  /**
   * Get orgApacheSlingCommonsLogNumOfLines
   * @return orgApacheSlingCommonsLogNumOfLines
   */
  @Valid 
  @Schema(name = "org.apache.sling.commons.log.numOfLines", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

