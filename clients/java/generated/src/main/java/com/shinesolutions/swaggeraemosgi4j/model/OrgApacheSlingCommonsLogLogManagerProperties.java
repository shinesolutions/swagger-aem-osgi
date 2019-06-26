/*
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.shinesolutions.swaggeraemosgi4j.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyBoolean;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyDropDown;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyInteger;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * OrgApacheSlingCommonsLogLogManagerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-06-26T12:10:03.209Z[GMT]")
public class OrgApacheSlingCommonsLogLogManagerProperties {
  public static final String SERIALIZED_NAME_ORG_APACHE_SLING_COMMONS_LOG_LEVEL = "org.apache.sling.commons.log.level";
  @SerializedName(SERIALIZED_NAME_ORG_APACHE_SLING_COMMONS_LOG_LEVEL)
  private ConfigNodePropertyDropDown orgApacheSlingCommonsLogLevel = null;

  public static final String SERIALIZED_NAME_ORG_APACHE_SLING_COMMONS_LOG_FILE = "org.apache.sling.commons.log.file";
  @SerializedName(SERIALIZED_NAME_ORG_APACHE_SLING_COMMONS_LOG_FILE)
  private ConfigNodePropertyString orgApacheSlingCommonsLogFile = null;

  public static final String SERIALIZED_NAME_ORG_APACHE_SLING_COMMONS_LOG_FILE_NUMBER = "org.apache.sling.commons.log.file.number";
  @SerializedName(SERIALIZED_NAME_ORG_APACHE_SLING_COMMONS_LOG_FILE_NUMBER)
  private ConfigNodePropertyInteger orgApacheSlingCommonsLogFileNumber = null;

  public static final String SERIALIZED_NAME_ORG_APACHE_SLING_COMMONS_LOG_FILE_SIZE = "org.apache.sling.commons.log.file.size";
  @SerializedName(SERIALIZED_NAME_ORG_APACHE_SLING_COMMONS_LOG_FILE_SIZE)
  private ConfigNodePropertyString orgApacheSlingCommonsLogFileSize = null;

  public static final String SERIALIZED_NAME_ORG_APACHE_SLING_COMMONS_LOG_PATTERN = "org.apache.sling.commons.log.pattern";
  @SerializedName(SERIALIZED_NAME_ORG_APACHE_SLING_COMMONS_LOG_PATTERN)
  private ConfigNodePropertyString orgApacheSlingCommonsLogPattern = null;

  public static final String SERIALIZED_NAME_ORG_APACHE_SLING_COMMONS_LOG_CONFIGURATION_FILE = "org.apache.sling.commons.log.configurationFile";
  @SerializedName(SERIALIZED_NAME_ORG_APACHE_SLING_COMMONS_LOG_CONFIGURATION_FILE)
  private ConfigNodePropertyString orgApacheSlingCommonsLogConfigurationFile = null;

  public static final String SERIALIZED_NAME_ORG_APACHE_SLING_COMMONS_LOG_PACKAGING_DATA_ENABLED = "org.apache.sling.commons.log.packagingDataEnabled";
  @SerializedName(SERIALIZED_NAME_ORG_APACHE_SLING_COMMONS_LOG_PACKAGING_DATA_ENABLED)
  private ConfigNodePropertyBoolean orgApacheSlingCommonsLogPackagingDataEnabled = null;

  public static final String SERIALIZED_NAME_ORG_APACHE_SLING_COMMONS_LOG_MAX_CALLER_DATA_DEPTH = "org.apache.sling.commons.log.maxCallerDataDepth";
  @SerializedName(SERIALIZED_NAME_ORG_APACHE_SLING_COMMONS_LOG_MAX_CALLER_DATA_DEPTH)
  private ConfigNodePropertyInteger orgApacheSlingCommonsLogMaxCallerDataDepth = null;

  public static final String SERIALIZED_NAME_ORG_APACHE_SLING_COMMONS_LOG_MAX_OLD_FILE_COUNT_IN_DUMP = "org.apache.sling.commons.log.maxOldFileCountInDump";
  @SerializedName(SERIALIZED_NAME_ORG_APACHE_SLING_COMMONS_LOG_MAX_OLD_FILE_COUNT_IN_DUMP)
  private ConfigNodePropertyInteger orgApacheSlingCommonsLogMaxOldFileCountInDump = null;

  public static final String SERIALIZED_NAME_ORG_APACHE_SLING_COMMONS_LOG_NUM_OF_LINES = "org.apache.sling.commons.log.numOfLines";
  @SerializedName(SERIALIZED_NAME_ORG_APACHE_SLING_COMMONS_LOG_NUM_OF_LINES)
  private ConfigNodePropertyInteger orgApacheSlingCommonsLogNumOfLines = null;

  public OrgApacheSlingCommonsLogLogManagerProperties orgApacheSlingCommonsLogLevel(ConfigNodePropertyDropDown orgApacheSlingCommonsLogLevel) {
    this.orgApacheSlingCommonsLogLevel = orgApacheSlingCommonsLogLevel;
    return this;
  }

   /**
   * Get orgApacheSlingCommonsLogLevel
   * @return orgApacheSlingCommonsLogLevel
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

