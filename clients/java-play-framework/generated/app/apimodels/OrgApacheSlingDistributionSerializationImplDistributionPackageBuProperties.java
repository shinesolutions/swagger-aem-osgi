package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyDropDown;
import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties   {
  @JsonProperty("name")
  private ConfigNodePropertyString name = null;

  @JsonProperty("type")
  private ConfigNodePropertyDropDown type = null;

  @JsonProperty("format.target")
  private ConfigNodePropertyString formatTarget = null;

  @JsonProperty("tempFsFolder")
  private ConfigNodePropertyString tempFsFolder = null;

  @JsonProperty("fileThreshold")
  private ConfigNodePropertyInteger fileThreshold = null;

  @JsonProperty("memoryUnit")
  private ConfigNodePropertyDropDown memoryUnit = null;

  @JsonProperty("useOffHeapMemory")
  private ConfigNodePropertyBoolean useOffHeapMemory = null;

  @JsonProperty("digestAlgorithm")
  private ConfigNodePropertyDropDown digestAlgorithm = null;

  @JsonProperty("monitoringQueueSize")
  private ConfigNodePropertyInteger monitoringQueueSize = null;

  @JsonProperty("cleanupDelay")
  private ConfigNodePropertyInteger cleanupDelay = null;

  @JsonProperty("package.filters")
  private ConfigNodePropertyArray packageFilters = null;

  @JsonProperty("property.filters")
  private ConfigNodePropertyArray propertyFilters = null;

  public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
