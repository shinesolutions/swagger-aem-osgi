package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyDropDown;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
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

  public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties () {

  }

  public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties (ConfigNodePropertyString name, ConfigNodePropertyDropDown type, ConfigNodePropertyString formatTarget, ConfigNodePropertyString tempFsFolder, ConfigNodePropertyInteger fileThreshold, ConfigNodePropertyDropDown memoryUnit, ConfigNodePropertyBoolean useOffHeapMemory, ConfigNodePropertyDropDown digestAlgorithm, ConfigNodePropertyInteger monitoringQueueSize, ConfigNodePropertyInteger cleanupDelay, ConfigNodePropertyArray packageFilters, ConfigNodePropertyArray propertyFilters) {
    this.name = name;
    this.type = type;
    this.formatTarget = formatTarget;
    this.tempFsFolder = tempFsFolder;
    this.fileThreshold = fileThreshold;
    this.memoryUnit = memoryUnit;
    this.useOffHeapMemory = useOffHeapMemory;
    this.digestAlgorithm = digestAlgorithm;
    this.monitoringQueueSize = monitoringQueueSize;
    this.cleanupDelay = cleanupDelay;
    this.packageFilters = packageFilters;
    this.propertyFilters = propertyFilters;
  }

    
  @JsonProperty("name")
  public ConfigNodePropertyString getName() {
    return name;
  }
  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

    
  @JsonProperty("type")
  public ConfigNodePropertyDropDown getType() {
    return type;
  }
  public void setType(ConfigNodePropertyDropDown type) {
    this.type = type;
  }

    
  @JsonProperty("format.target")
  public ConfigNodePropertyString getFormatTarget() {
    return formatTarget;
  }
  public void setFormatTarget(ConfigNodePropertyString formatTarget) {
    this.formatTarget = formatTarget;
  }

    
  @JsonProperty("tempFsFolder")
  public ConfigNodePropertyString getTempFsFolder() {
    return tempFsFolder;
  }
  public void setTempFsFolder(ConfigNodePropertyString tempFsFolder) {
    this.tempFsFolder = tempFsFolder;
  }

    
  @JsonProperty("fileThreshold")
  public ConfigNodePropertyInteger getFileThreshold() {
    return fileThreshold;
  }
  public void setFileThreshold(ConfigNodePropertyInteger fileThreshold) {
    this.fileThreshold = fileThreshold;
  }

    
  @JsonProperty("memoryUnit")
  public ConfigNodePropertyDropDown getMemoryUnit() {
    return memoryUnit;
  }
  public void setMemoryUnit(ConfigNodePropertyDropDown memoryUnit) {
    this.memoryUnit = memoryUnit;
  }

    
  @JsonProperty("useOffHeapMemory")
  public ConfigNodePropertyBoolean getUseOffHeapMemory() {
    return useOffHeapMemory;
  }
  public void setUseOffHeapMemory(ConfigNodePropertyBoolean useOffHeapMemory) {
    this.useOffHeapMemory = useOffHeapMemory;
  }

    
  @JsonProperty("digestAlgorithm")
  public ConfigNodePropertyDropDown getDigestAlgorithm() {
    return digestAlgorithm;
  }
  public void setDigestAlgorithm(ConfigNodePropertyDropDown digestAlgorithm) {
    this.digestAlgorithm = digestAlgorithm;
  }

    
  @JsonProperty("monitoringQueueSize")
  public ConfigNodePropertyInteger getMonitoringQueueSize() {
    return monitoringQueueSize;
  }
  public void setMonitoringQueueSize(ConfigNodePropertyInteger monitoringQueueSize) {
    this.monitoringQueueSize = monitoringQueueSize;
  }

    
  @JsonProperty("cleanupDelay")
  public ConfigNodePropertyInteger getCleanupDelay() {
    return cleanupDelay;
  }
  public void setCleanupDelay(ConfigNodePropertyInteger cleanupDelay) {
    this.cleanupDelay = cleanupDelay;
  }

    
  @JsonProperty("package.filters")
  public ConfigNodePropertyArray getPackageFilters() {
    return packageFilters;
  }
  public void setPackageFilters(ConfigNodePropertyArray packageFilters) {
    this.packageFilters = packageFilters;
  }

    
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
