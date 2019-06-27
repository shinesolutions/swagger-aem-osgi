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
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyArray;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyBoolean;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyDropDown;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyInteger;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-06-27T02:21:59.870Z[GMT]")
public class OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private ConfigNodePropertyString name = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private ConfigNodePropertyDropDown type = null;

  public static final String SERIALIZED_NAME_FORMAT_TARGET = "format.target";
  @SerializedName(SERIALIZED_NAME_FORMAT_TARGET)
  private ConfigNodePropertyString formatTarget = null;

  public static final String SERIALIZED_NAME_TEMP_FS_FOLDER = "tempFsFolder";
  @SerializedName(SERIALIZED_NAME_TEMP_FS_FOLDER)
  private ConfigNodePropertyString tempFsFolder = null;

  public static final String SERIALIZED_NAME_FILE_THRESHOLD = "fileThreshold";
  @SerializedName(SERIALIZED_NAME_FILE_THRESHOLD)
  private ConfigNodePropertyInteger fileThreshold = null;

  public static final String SERIALIZED_NAME_MEMORY_UNIT = "memoryUnit";
  @SerializedName(SERIALIZED_NAME_MEMORY_UNIT)
  private ConfigNodePropertyDropDown memoryUnit = null;

  public static final String SERIALIZED_NAME_USE_OFF_HEAP_MEMORY = "useOffHeapMemory";
  @SerializedName(SERIALIZED_NAME_USE_OFF_HEAP_MEMORY)
  private ConfigNodePropertyBoolean useOffHeapMemory = null;

  public static final String SERIALIZED_NAME_DIGEST_ALGORITHM = "digestAlgorithm";
  @SerializedName(SERIALIZED_NAME_DIGEST_ALGORITHM)
  private ConfigNodePropertyDropDown digestAlgorithm = null;

  public static final String SERIALIZED_NAME_MONITORING_QUEUE_SIZE = "monitoringQueueSize";
  @SerializedName(SERIALIZED_NAME_MONITORING_QUEUE_SIZE)
  private ConfigNodePropertyInteger monitoringQueueSize = null;

  public static final String SERIALIZED_NAME_CLEANUP_DELAY = "cleanupDelay";
  @SerializedName(SERIALIZED_NAME_CLEANUP_DELAY)
  private ConfigNodePropertyInteger cleanupDelay = null;

  public static final String SERIALIZED_NAME_PACKAGE_FILTERS = "package.filters";
  @SerializedName(SERIALIZED_NAME_PACKAGE_FILTERS)
  private ConfigNodePropertyArray packageFilters = null;

  public static final String SERIALIZED_NAME_PROPERTY_FILTERS = "property.filters";
  @SerializedName(SERIALIZED_NAME_PROPERTY_FILTERS)
  private ConfigNodePropertyArray propertyFilters = null;

  public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getName() {
    return name;
  }

  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties type(ConfigNodePropertyDropDown type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyDropDown getType() {
    return type;
  }

  public void setType(ConfigNodePropertyDropDown type) {
    this.type = type;
  }

  public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties formatTarget(ConfigNodePropertyString formatTarget) {
    this.formatTarget = formatTarget;
    return this;
  }

   /**
   * Get formatTarget
   * @return formatTarget
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getFormatTarget() {
    return formatTarget;
  }

  public void setFormatTarget(ConfigNodePropertyString formatTarget) {
    this.formatTarget = formatTarget;
  }

  public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties tempFsFolder(ConfigNodePropertyString tempFsFolder) {
    this.tempFsFolder = tempFsFolder;
    return this;
  }

   /**
   * Get tempFsFolder
   * @return tempFsFolder
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getTempFsFolder() {
    return tempFsFolder;
  }

  public void setTempFsFolder(ConfigNodePropertyString tempFsFolder) {
    this.tempFsFolder = tempFsFolder;
  }

  public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties fileThreshold(ConfigNodePropertyInteger fileThreshold) {
    this.fileThreshold = fileThreshold;
    return this;
  }

   /**
   * Get fileThreshold
   * @return fileThreshold
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getFileThreshold() {
    return fileThreshold;
  }

  public void setFileThreshold(ConfigNodePropertyInteger fileThreshold) {
    this.fileThreshold = fileThreshold;
  }

  public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties memoryUnit(ConfigNodePropertyDropDown memoryUnit) {
    this.memoryUnit = memoryUnit;
    return this;
  }

   /**
   * Get memoryUnit
   * @return memoryUnit
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyDropDown getMemoryUnit() {
    return memoryUnit;
  }

  public void setMemoryUnit(ConfigNodePropertyDropDown memoryUnit) {
    this.memoryUnit = memoryUnit;
  }

  public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties useOffHeapMemory(ConfigNodePropertyBoolean useOffHeapMemory) {
    this.useOffHeapMemory = useOffHeapMemory;
    return this;
  }

   /**
   * Get useOffHeapMemory
   * @return useOffHeapMemory
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getUseOffHeapMemory() {
    return useOffHeapMemory;
  }

  public void setUseOffHeapMemory(ConfigNodePropertyBoolean useOffHeapMemory) {
    this.useOffHeapMemory = useOffHeapMemory;
  }

  public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties digestAlgorithm(ConfigNodePropertyDropDown digestAlgorithm) {
    this.digestAlgorithm = digestAlgorithm;
    return this;
  }

   /**
   * Get digestAlgorithm
   * @return digestAlgorithm
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyDropDown getDigestAlgorithm() {
    return digestAlgorithm;
  }

  public void setDigestAlgorithm(ConfigNodePropertyDropDown digestAlgorithm) {
    this.digestAlgorithm = digestAlgorithm;
  }

  public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties monitoringQueueSize(ConfigNodePropertyInteger monitoringQueueSize) {
    this.monitoringQueueSize = monitoringQueueSize;
    return this;
  }

   /**
   * Get monitoringQueueSize
   * @return monitoringQueueSize
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getMonitoringQueueSize() {
    return monitoringQueueSize;
  }

  public void setMonitoringQueueSize(ConfigNodePropertyInteger monitoringQueueSize) {
    this.monitoringQueueSize = monitoringQueueSize;
  }

  public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties cleanupDelay(ConfigNodePropertyInteger cleanupDelay) {
    this.cleanupDelay = cleanupDelay;
    return this;
  }

   /**
   * Get cleanupDelay
   * @return cleanupDelay
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getCleanupDelay() {
    return cleanupDelay;
  }

  public void setCleanupDelay(ConfigNodePropertyInteger cleanupDelay) {
    this.cleanupDelay = cleanupDelay;
  }

  public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties packageFilters(ConfigNodePropertyArray packageFilters) {
    this.packageFilters = packageFilters;
    return this;
  }

   /**
   * Get packageFilters
   * @return packageFilters
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getPackageFilters() {
    return packageFilters;
  }

  public void setPackageFilters(ConfigNodePropertyArray packageFilters) {
    this.packageFilters = packageFilters;
  }

  public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties propertyFilters(ConfigNodePropertyArray propertyFilters) {
    this.propertyFilters = propertyFilters;
    return this;
  }

   /**
   * Get propertyFilters
   * @return propertyFilters
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getPropertyFilters() {
    return propertyFilters;
  }

  public void setPropertyFilters(ConfigNodePropertyArray propertyFilters) {
    this.propertyFilters = propertyFilters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties orgApacheSlingDistributionSerializationImplDistributionPackageBuProperties = (OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties) o;
    return Objects.equals(this.name, orgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.name) &&
        Objects.equals(this.type, orgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.type) &&
        Objects.equals(this.formatTarget, orgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.formatTarget) &&
        Objects.equals(this.tempFsFolder, orgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.tempFsFolder) &&
        Objects.equals(this.fileThreshold, orgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.fileThreshold) &&
        Objects.equals(this.memoryUnit, orgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.memoryUnit) &&
        Objects.equals(this.useOffHeapMemory, orgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.useOffHeapMemory) &&
        Objects.equals(this.digestAlgorithm, orgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.digestAlgorithm) &&
        Objects.equals(this.monitoringQueueSize, orgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.monitoringQueueSize) &&
        Objects.equals(this.cleanupDelay, orgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.cleanupDelay) &&
        Objects.equals(this.packageFilters, orgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.packageFilters) &&
        Objects.equals(this.propertyFilters, orgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.propertyFilters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, formatTarget, tempFsFolder, fileThreshold, memoryUnit, useOffHeapMemory, digestAlgorithm, monitoringQueueSize, cleanupDelay, packageFilters, propertyFilters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    formatTarget: ").append(toIndentedString(formatTarget)).append("\n");
    sb.append("    tempFsFolder: ").append(toIndentedString(tempFsFolder)).append("\n");
    sb.append("    fileThreshold: ").append(toIndentedString(fileThreshold)).append("\n");
    sb.append("    memoryUnit: ").append(toIndentedString(memoryUnit)).append("\n");
    sb.append("    useOffHeapMemory: ").append(toIndentedString(useOffHeapMemory)).append("\n");
    sb.append("    digestAlgorithm: ").append(toIndentedString(digestAlgorithm)).append("\n");
    sb.append("    monitoringQueueSize: ").append(toIndentedString(monitoringQueueSize)).append("\n");
    sb.append("    cleanupDelay: ").append(toIndentedString(cleanupDelay)).append("\n");
    sb.append("    packageFilters: ").append(toIndentedString(packageFilters)).append("\n");
    sb.append("    propertyFilters: ").append(toIndentedString(propertyFilters)).append("\n");
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

