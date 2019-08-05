package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString name = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyDropDown type = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString formatTarget = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString tempFsFolder = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger fileThreshold = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyDropDown memoryUnit = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean useOffHeapMemory = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyDropDown digestAlgorithm = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger monitoringQueueSize = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger cleanupDelay = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray packageFilters = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray propertyFilters = null;
 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public ConfigNodePropertyString getName() {
    return name;
  }

  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public ConfigNodePropertyDropDown getType() {
    return type;
  }

  public void setType(ConfigNodePropertyDropDown type) {
    this.type = type;
  }

  public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties type(ConfigNodePropertyDropDown type) {
    this.type = type;
    return this;
  }

 /**
   * Get formatTarget
   * @return formatTarget
  **/
  @JsonProperty("format.target")
  public ConfigNodePropertyString getFormatTarget() {
    return formatTarget;
  }

  public void setFormatTarget(ConfigNodePropertyString formatTarget) {
    this.formatTarget = formatTarget;
  }

  public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties formatTarget(ConfigNodePropertyString formatTarget) {
    this.formatTarget = formatTarget;
    return this;
  }

 /**
   * Get tempFsFolder
   * @return tempFsFolder
  **/
  @JsonProperty("tempFsFolder")
  public ConfigNodePropertyString getTempFsFolder() {
    return tempFsFolder;
  }

  public void setTempFsFolder(ConfigNodePropertyString tempFsFolder) {
    this.tempFsFolder = tempFsFolder;
  }

  public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties tempFsFolder(ConfigNodePropertyString tempFsFolder) {
    this.tempFsFolder = tempFsFolder;
    return this;
  }

 /**
   * Get fileThreshold
   * @return fileThreshold
  **/
  @JsonProperty("fileThreshold")
  public ConfigNodePropertyInteger getFileThreshold() {
    return fileThreshold;
  }

  public void setFileThreshold(ConfigNodePropertyInteger fileThreshold) {
    this.fileThreshold = fileThreshold;
  }

  public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties fileThreshold(ConfigNodePropertyInteger fileThreshold) {
    this.fileThreshold = fileThreshold;
    return this;
  }

 /**
   * Get memoryUnit
   * @return memoryUnit
  **/
  @JsonProperty("memoryUnit")
  public ConfigNodePropertyDropDown getMemoryUnit() {
    return memoryUnit;
  }

  public void setMemoryUnit(ConfigNodePropertyDropDown memoryUnit) {
    this.memoryUnit = memoryUnit;
  }

  public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties memoryUnit(ConfigNodePropertyDropDown memoryUnit) {
    this.memoryUnit = memoryUnit;
    return this;
  }

 /**
   * Get useOffHeapMemory
   * @return useOffHeapMemory
  **/
  @JsonProperty("useOffHeapMemory")
  public ConfigNodePropertyBoolean getUseOffHeapMemory() {
    return useOffHeapMemory;
  }

  public void setUseOffHeapMemory(ConfigNodePropertyBoolean useOffHeapMemory) {
    this.useOffHeapMemory = useOffHeapMemory;
  }

  public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties useOffHeapMemory(ConfigNodePropertyBoolean useOffHeapMemory) {
    this.useOffHeapMemory = useOffHeapMemory;
    return this;
  }

 /**
   * Get digestAlgorithm
   * @return digestAlgorithm
  **/
  @JsonProperty("digestAlgorithm")
  public ConfigNodePropertyDropDown getDigestAlgorithm() {
    return digestAlgorithm;
  }

  public void setDigestAlgorithm(ConfigNodePropertyDropDown digestAlgorithm) {
    this.digestAlgorithm = digestAlgorithm;
  }

  public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties digestAlgorithm(ConfigNodePropertyDropDown digestAlgorithm) {
    this.digestAlgorithm = digestAlgorithm;
    return this;
  }

 /**
   * Get monitoringQueueSize
   * @return monitoringQueueSize
  **/
  @JsonProperty("monitoringQueueSize")
  public ConfigNodePropertyInteger getMonitoringQueueSize() {
    return monitoringQueueSize;
  }

  public void setMonitoringQueueSize(ConfigNodePropertyInteger monitoringQueueSize) {
    this.monitoringQueueSize = monitoringQueueSize;
  }

  public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties monitoringQueueSize(ConfigNodePropertyInteger monitoringQueueSize) {
    this.monitoringQueueSize = monitoringQueueSize;
    return this;
  }

 /**
   * Get cleanupDelay
   * @return cleanupDelay
  **/
  @JsonProperty("cleanupDelay")
  public ConfigNodePropertyInteger getCleanupDelay() {
    return cleanupDelay;
  }

  public void setCleanupDelay(ConfigNodePropertyInteger cleanupDelay) {
    this.cleanupDelay = cleanupDelay;
  }

  public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties cleanupDelay(ConfigNodePropertyInteger cleanupDelay) {
    this.cleanupDelay = cleanupDelay;
    return this;
  }

 /**
   * Get packageFilters
   * @return packageFilters
  **/
  @JsonProperty("package.filters")
  public ConfigNodePropertyArray getPackageFilters() {
    return packageFilters;
  }

  public void setPackageFilters(ConfigNodePropertyArray packageFilters) {
    this.packageFilters = packageFilters;
  }

  public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties packageFilters(ConfigNodePropertyArray packageFilters) {
    this.packageFilters = packageFilters;
    return this;
  }

 /**
   * Get propertyFilters
   * @return propertyFilters
  **/
  @JsonProperty("property.filters")
  public ConfigNodePropertyArray getPropertyFilters() {
    return propertyFilters;
  }

  public void setPropertyFilters(ConfigNodePropertyArray propertyFilters) {
    this.propertyFilters = propertyFilters;
  }

  public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties propertyFilters(ConfigNodePropertyArray propertyFilters) {
    this.propertyFilters = propertyFilters;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

