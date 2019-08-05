package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties   {
  

  private ConfigNodePropertyString name = null;

  private ConfigNodePropertyDropDown type = null;

  private ConfigNodePropertyString formatTarget = null;

  private ConfigNodePropertyString tempFsFolder = null;

  private ConfigNodePropertyInteger fileThreshold = null;

  private ConfigNodePropertyDropDown memoryUnit = null;

  private ConfigNodePropertyBoolean useOffHeapMemory = null;

  private ConfigNodePropertyDropDown digestAlgorithm = null;

  private ConfigNodePropertyInteger monitoringQueueSize = null;

  private ConfigNodePropertyInteger cleanupDelay = null;

  private ConfigNodePropertyArray packageFilters = null;

  private ConfigNodePropertyArray propertyFilters = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public ConfigNodePropertyString getName() {
    return name;
  }
  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  public ConfigNodePropertyDropDown getType() {
    return type;
  }
  public void setType(ConfigNodePropertyDropDown type) {
    this.type = type;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("format.target")
  public ConfigNodePropertyString getFormatTarget() {
    return formatTarget;
  }
  public void setFormatTarget(ConfigNodePropertyString formatTarget) {
    this.formatTarget = formatTarget;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tempFsFolder")
  public ConfigNodePropertyString getTempFsFolder() {
    return tempFsFolder;
  }
  public void setTempFsFolder(ConfigNodePropertyString tempFsFolder) {
    this.tempFsFolder = tempFsFolder;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("fileThreshold")
  public ConfigNodePropertyInteger getFileThreshold() {
    return fileThreshold;
  }
  public void setFileThreshold(ConfigNodePropertyInteger fileThreshold) {
    this.fileThreshold = fileThreshold;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("memoryUnit")
  public ConfigNodePropertyDropDown getMemoryUnit() {
    return memoryUnit;
  }
  public void setMemoryUnit(ConfigNodePropertyDropDown memoryUnit) {
    this.memoryUnit = memoryUnit;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("useOffHeapMemory")
  public ConfigNodePropertyBoolean getUseOffHeapMemory() {
    return useOffHeapMemory;
  }
  public void setUseOffHeapMemory(ConfigNodePropertyBoolean useOffHeapMemory) {
    this.useOffHeapMemory = useOffHeapMemory;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("digestAlgorithm")
  public ConfigNodePropertyDropDown getDigestAlgorithm() {
    return digestAlgorithm;
  }
  public void setDigestAlgorithm(ConfigNodePropertyDropDown digestAlgorithm) {
    this.digestAlgorithm = digestAlgorithm;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("monitoringQueueSize")
  public ConfigNodePropertyInteger getMonitoringQueueSize() {
    return monitoringQueueSize;
  }
  public void setMonitoringQueueSize(ConfigNodePropertyInteger monitoringQueueSize) {
    this.monitoringQueueSize = monitoringQueueSize;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cleanupDelay")
  public ConfigNodePropertyInteger getCleanupDelay() {
    return cleanupDelay;
  }
  public void setCleanupDelay(ConfigNodePropertyInteger cleanupDelay) {
    this.cleanupDelay = cleanupDelay;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("package.filters")
  public ConfigNodePropertyArray getPackageFilters() {
    return packageFilters;
  }
  public void setPackageFilters(ConfigNodePropertyArray packageFilters) {
    this.packageFilters = packageFilters;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("property.filters")
  public ConfigNodePropertyArray getPropertyFilters() {
    return propertyFilters;
  }
  public void setPropertyFilters(ConfigNodePropertyArray propertyFilters) {
    this.propertyFilters = propertyFilters;
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
    return Objects.equals(name, orgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.name) &&
        Objects.equals(type, orgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.type) &&
        Objects.equals(formatTarget, orgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.formatTarget) &&
        Objects.equals(tempFsFolder, orgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.tempFsFolder) &&
        Objects.equals(fileThreshold, orgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.fileThreshold) &&
        Objects.equals(memoryUnit, orgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.memoryUnit) &&
        Objects.equals(useOffHeapMemory, orgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.useOffHeapMemory) &&
        Objects.equals(digestAlgorithm, orgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.digestAlgorithm) &&
        Objects.equals(monitoringQueueSize, orgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.monitoringQueueSize) &&
        Objects.equals(cleanupDelay, orgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.cleanupDelay) &&
        Objects.equals(packageFilters, orgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.packageFilters) &&
        Objects.equals(propertyFilters, orgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.propertyFilters);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

