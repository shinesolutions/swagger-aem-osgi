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
public class OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties   {
  

  private ConfigNodePropertyString name = null;

  private ConfigNodePropertyDropDown type = null;

  private ConfigNodePropertyString importMode = null;

  private ConfigNodePropertyString aclHandling = null;

  private ConfigNodePropertyString packageRoots = null;

  private ConfigNodePropertyArray packageFilters = null;

  private ConfigNodePropertyArray propertyFilters = null;

  private ConfigNodePropertyString tempFsFolder = null;

  private ConfigNodePropertyBoolean useBinaryReferences = null;

  private ConfigNodePropertyInteger autoSaveThreshold = null;

  private ConfigNodePropertyInteger cleanupDelay = null;

  private ConfigNodePropertyInteger fileThreshold = null;

  private ConfigNodePropertyDropDown MEGA_BYTES = null;

  private ConfigNodePropertyBoolean useOffHeapMemory = null;

  private ConfigNodePropertyDropDown digestAlgorithm = null;

  private ConfigNodePropertyInteger monitoringQueueSize = null;

  private ConfigNodePropertyArray pathsMapping = null;

  private ConfigNodePropertyBoolean strictImport = null;

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
  @JsonProperty("importMode")
  public ConfigNodePropertyString getImportMode() {
    return importMode;
  }
  public void setImportMode(ConfigNodePropertyString importMode) {
    this.importMode = importMode;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("aclHandling")
  public ConfigNodePropertyString getAclHandling() {
    return aclHandling;
  }
  public void setAclHandling(ConfigNodePropertyString aclHandling) {
    this.aclHandling = aclHandling;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("package.roots")
  public ConfigNodePropertyString getPackageRoots() {
    return packageRoots;
  }
  public void setPackageRoots(ConfigNodePropertyString packageRoots) {
    this.packageRoots = packageRoots;
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
  @JsonProperty("useBinaryReferences")
  public ConfigNodePropertyBoolean getUseBinaryReferences() {
    return useBinaryReferences;
  }
  public void setUseBinaryReferences(ConfigNodePropertyBoolean useBinaryReferences) {
    this.useBinaryReferences = useBinaryReferences;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("autoSaveThreshold")
  public ConfigNodePropertyInteger getAutoSaveThreshold() {
    return autoSaveThreshold;
  }
  public void setAutoSaveThreshold(ConfigNodePropertyInteger autoSaveThreshold) {
    this.autoSaveThreshold = autoSaveThreshold;
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
  @JsonProperty("MEGA_BYTES")
  public ConfigNodePropertyDropDown getMEGABYTES() {
    return MEGA_BYTES;
  }
  public void setMEGABYTES(ConfigNodePropertyDropDown MEGA_BYTES) {
    this.MEGA_BYTES = MEGA_BYTES;
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
  @JsonProperty("pathsMapping")
  public ConfigNodePropertyArray getPathsMapping() {
    return pathsMapping;
  }
  public void setPathsMapping(ConfigNodePropertyArray pathsMapping) {
    this.pathsMapping = pathsMapping;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("strictImport")
  public ConfigNodePropertyBoolean getStrictImport() {
    return strictImport;
  }
  public void setStrictImport(ConfigNodePropertyBoolean strictImport) {
    this.strictImport = strictImport;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties = (OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) o;
    return Objects.equals(name, orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.name) &&
        Objects.equals(type, orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.type) &&
        Objects.equals(importMode, orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.importMode) &&
        Objects.equals(aclHandling, orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.aclHandling) &&
        Objects.equals(packageRoots, orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.packageRoots) &&
        Objects.equals(packageFilters, orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.packageFilters) &&
        Objects.equals(propertyFilters, orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.propertyFilters) &&
        Objects.equals(tempFsFolder, orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.tempFsFolder) &&
        Objects.equals(useBinaryReferences, orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.useBinaryReferences) &&
        Objects.equals(autoSaveThreshold, orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.autoSaveThreshold) &&
        Objects.equals(cleanupDelay, orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.cleanupDelay) &&
        Objects.equals(fileThreshold, orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.fileThreshold) &&
        Objects.equals(MEGA_BYTES, orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.MEGA_BYTES) &&
        Objects.equals(useOffHeapMemory, orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.useOffHeapMemory) &&
        Objects.equals(digestAlgorithm, orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.digestAlgorithm) &&
        Objects.equals(monitoringQueueSize, orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.monitoringQueueSize) &&
        Objects.equals(pathsMapping, orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.pathsMapping) &&
        Objects.equals(strictImport, orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.strictImport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, importMode, aclHandling, packageRoots, packageFilters, propertyFilters, tempFsFolder, useBinaryReferences, autoSaveThreshold, cleanupDelay, fileThreshold, MEGA_BYTES, useOffHeapMemory, digestAlgorithm, monitoringQueueSize, pathsMapping, strictImport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    importMode: ").append(toIndentedString(importMode)).append("\n");
    sb.append("    aclHandling: ").append(toIndentedString(aclHandling)).append("\n");
    sb.append("    packageRoots: ").append(toIndentedString(packageRoots)).append("\n");
    sb.append("    packageFilters: ").append(toIndentedString(packageFilters)).append("\n");
    sb.append("    propertyFilters: ").append(toIndentedString(propertyFilters)).append("\n");
    sb.append("    tempFsFolder: ").append(toIndentedString(tempFsFolder)).append("\n");
    sb.append("    useBinaryReferences: ").append(toIndentedString(useBinaryReferences)).append("\n");
    sb.append("    autoSaveThreshold: ").append(toIndentedString(autoSaveThreshold)).append("\n");
    sb.append("    cleanupDelay: ").append(toIndentedString(cleanupDelay)).append("\n");
    sb.append("    fileThreshold: ").append(toIndentedString(fileThreshold)).append("\n");
    sb.append("    MEGA_BYTES: ").append(toIndentedString(MEGA_BYTES)).append("\n");
    sb.append("    useOffHeapMemory: ").append(toIndentedString(useOffHeapMemory)).append("\n");
    sb.append("    digestAlgorithm: ").append(toIndentedString(digestAlgorithm)).append("\n");
    sb.append("    monitoringQueueSize: ").append(toIndentedString(monitoringQueueSize)).append("\n");
    sb.append("    pathsMapping: ").append(toIndentedString(pathsMapping)).append("\n");
    sb.append("    strictImport: ").append(toIndentedString(strictImport)).append("\n");
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

