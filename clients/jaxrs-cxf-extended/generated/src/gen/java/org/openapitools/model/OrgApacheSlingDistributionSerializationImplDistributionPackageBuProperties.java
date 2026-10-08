package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString name;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyDropDown type;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString formatTarget;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString tempFsFolder;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger fileThreshold;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyDropDown memoryUnit;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean useOffHeapMemory;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyDropDown digestAlgorithm;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger monitoringQueueSize;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger cleanupDelay;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray packageFilters;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray propertyFilters;
 /**
  * Get name
  * @return name
  */
  @JsonProperty("name")
  public ConfigNodePropertyString getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

 /**
  * Get type
  * @return type
  */
  @JsonProperty("type")
  public ConfigNodePropertyDropDown getType() {
    return type;
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(ConfigNodePropertyDropDown type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties type(ConfigNodePropertyDropDown type) {
    this.type = type;
    return this;
  }

 /**
  * Get formatTarget
  * @return formatTarget
  */
  @JsonProperty("format.target")
  public ConfigNodePropertyString getFormatTarget() {
    return formatTarget;
  }

  /**
   * Sets the <code>formatTarget</code> property.
   */
 public void setFormatTarget(ConfigNodePropertyString formatTarget) {
    this.formatTarget = formatTarget;
  }

  /**
   * Sets the <code>formatTarget</code> property.
   */
  public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties formatTarget(ConfigNodePropertyString formatTarget) {
    this.formatTarget = formatTarget;
    return this;
  }

 /**
  * Get tempFsFolder
  * @return tempFsFolder
  */
  @JsonProperty("tempFsFolder")
  public ConfigNodePropertyString getTempFsFolder() {
    return tempFsFolder;
  }

  /**
   * Sets the <code>tempFsFolder</code> property.
   */
 public void setTempFsFolder(ConfigNodePropertyString tempFsFolder) {
    this.tempFsFolder = tempFsFolder;
  }

  /**
   * Sets the <code>tempFsFolder</code> property.
   */
  public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties tempFsFolder(ConfigNodePropertyString tempFsFolder) {
    this.tempFsFolder = tempFsFolder;
    return this;
  }

 /**
  * Get fileThreshold
  * @return fileThreshold
  */
  @JsonProperty("fileThreshold")
  public ConfigNodePropertyInteger getFileThreshold() {
    return fileThreshold;
  }

  /**
   * Sets the <code>fileThreshold</code> property.
   */
 public void setFileThreshold(ConfigNodePropertyInteger fileThreshold) {
    this.fileThreshold = fileThreshold;
  }

  /**
   * Sets the <code>fileThreshold</code> property.
   */
  public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties fileThreshold(ConfigNodePropertyInteger fileThreshold) {
    this.fileThreshold = fileThreshold;
    return this;
  }

 /**
  * Get memoryUnit
  * @return memoryUnit
  */
  @JsonProperty("memoryUnit")
  public ConfigNodePropertyDropDown getMemoryUnit() {
    return memoryUnit;
  }

  /**
   * Sets the <code>memoryUnit</code> property.
   */
 public void setMemoryUnit(ConfigNodePropertyDropDown memoryUnit) {
    this.memoryUnit = memoryUnit;
  }

  /**
   * Sets the <code>memoryUnit</code> property.
   */
  public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties memoryUnit(ConfigNodePropertyDropDown memoryUnit) {
    this.memoryUnit = memoryUnit;
    return this;
  }

 /**
  * Get useOffHeapMemory
  * @return useOffHeapMemory
  */
  @JsonProperty("useOffHeapMemory")
  public ConfigNodePropertyBoolean getUseOffHeapMemory() {
    return useOffHeapMemory;
  }

  /**
   * Sets the <code>useOffHeapMemory</code> property.
   */
 public void setUseOffHeapMemory(ConfigNodePropertyBoolean useOffHeapMemory) {
    this.useOffHeapMemory = useOffHeapMemory;
  }

  /**
   * Sets the <code>useOffHeapMemory</code> property.
   */
  public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties useOffHeapMemory(ConfigNodePropertyBoolean useOffHeapMemory) {
    this.useOffHeapMemory = useOffHeapMemory;
    return this;
  }

 /**
  * Get digestAlgorithm
  * @return digestAlgorithm
  */
  @JsonProperty("digestAlgorithm")
  public ConfigNodePropertyDropDown getDigestAlgorithm() {
    return digestAlgorithm;
  }

  /**
   * Sets the <code>digestAlgorithm</code> property.
   */
 public void setDigestAlgorithm(ConfigNodePropertyDropDown digestAlgorithm) {
    this.digestAlgorithm = digestAlgorithm;
  }

  /**
   * Sets the <code>digestAlgorithm</code> property.
   */
  public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties digestAlgorithm(ConfigNodePropertyDropDown digestAlgorithm) {
    this.digestAlgorithm = digestAlgorithm;
    return this;
  }

 /**
  * Get monitoringQueueSize
  * @return monitoringQueueSize
  */
  @JsonProperty("monitoringQueueSize")
  public ConfigNodePropertyInteger getMonitoringQueueSize() {
    return monitoringQueueSize;
  }

  /**
   * Sets the <code>monitoringQueueSize</code> property.
   */
 public void setMonitoringQueueSize(ConfigNodePropertyInteger monitoringQueueSize) {
    this.monitoringQueueSize = monitoringQueueSize;
  }

  /**
   * Sets the <code>monitoringQueueSize</code> property.
   */
  public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties monitoringQueueSize(ConfigNodePropertyInteger monitoringQueueSize) {
    this.monitoringQueueSize = monitoringQueueSize;
    return this;
  }

 /**
  * Get cleanupDelay
  * @return cleanupDelay
  */
  @JsonProperty("cleanupDelay")
  public ConfigNodePropertyInteger getCleanupDelay() {
    return cleanupDelay;
  }

  /**
   * Sets the <code>cleanupDelay</code> property.
   */
 public void setCleanupDelay(ConfigNodePropertyInteger cleanupDelay) {
    this.cleanupDelay = cleanupDelay;
  }

  /**
   * Sets the <code>cleanupDelay</code> property.
   */
  public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties cleanupDelay(ConfigNodePropertyInteger cleanupDelay) {
    this.cleanupDelay = cleanupDelay;
    return this;
  }

 /**
  * Get packageFilters
  * @return packageFilters
  */
  @JsonProperty("package.filters")
  public ConfigNodePropertyArray getPackageFilters() {
    return packageFilters;
  }

  /**
   * Sets the <code>packageFilters</code> property.
   */
 public void setPackageFilters(ConfigNodePropertyArray packageFilters) {
    this.packageFilters = packageFilters;
  }

  /**
   * Sets the <code>packageFilters</code> property.
   */
  public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties packageFilters(ConfigNodePropertyArray packageFilters) {
    this.packageFilters = packageFilters;
    return this;
  }

 /**
  * Get propertyFilters
  * @return propertyFilters
  */
  @JsonProperty("property.filters")
  public ConfigNodePropertyArray getPropertyFilters() {
    return propertyFilters;
  }

  /**
   * Sets the <code>propertyFilters</code> property.
   */
 public void setPropertyFilters(ConfigNodePropertyArray propertyFilters) {
    this.propertyFilters = propertyFilters;
  }

  /**
   * Sets the <code>propertyFilters</code> property.
   */
  public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties propertyFilters(ConfigNodePropertyArray propertyFilters) {
    this.propertyFilters = propertyFilters;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

