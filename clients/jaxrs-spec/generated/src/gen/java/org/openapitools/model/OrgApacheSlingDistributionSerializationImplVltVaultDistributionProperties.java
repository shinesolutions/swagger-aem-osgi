package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties   {
  
  private @Valid ConfigNodePropertyString name = null;
  private @Valid ConfigNodePropertyDropDown type = null;
  private @Valid ConfigNodePropertyString importMode = null;
  private @Valid ConfigNodePropertyString aclHandling = null;
  private @Valid ConfigNodePropertyString packageRoots = null;
  private @Valid ConfigNodePropertyArray packageFilters = null;
  private @Valid ConfigNodePropertyArray propertyFilters = null;
  private @Valid ConfigNodePropertyString tempFsFolder = null;
  private @Valid ConfigNodePropertyBoolean useBinaryReferences = null;
  private @Valid ConfigNodePropertyInteger autoSaveThreshold = null;
  private @Valid ConfigNodePropertyInteger cleanupDelay = null;
  private @Valid ConfigNodePropertyInteger fileThreshold = null;
  private @Valid ConfigNodePropertyDropDown MEGA_BYTES = null;
  private @Valid ConfigNodePropertyBoolean useOffHeapMemory = null;
  private @Valid ConfigNodePropertyDropDown digestAlgorithm = null;
  private @Valid ConfigNodePropertyInteger monitoringQueueSize = null;
  private @Valid ConfigNodePropertyArray pathsMapping = null;
  private @Valid ConfigNodePropertyBoolean strictImport = null;

  /**
   **/
  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

  
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
  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties type(ConfigNodePropertyDropDown type) {
    this.type = type;
    return this;
  }

  
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
  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties importMode(ConfigNodePropertyString importMode) {
    this.importMode = importMode;
    return this;
  }

  
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
  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties aclHandling(ConfigNodePropertyString aclHandling) {
    this.aclHandling = aclHandling;
    return this;
  }

  
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
  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties packageRoots(ConfigNodePropertyString packageRoots) {
    this.packageRoots = packageRoots;
    return this;
  }

  
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
  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties packageFilters(ConfigNodePropertyArray packageFilters) {
    this.packageFilters = packageFilters;
    return this;
  }

  
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
  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties propertyFilters(ConfigNodePropertyArray propertyFilters) {
    this.propertyFilters = propertyFilters;
    return this;
  }

  
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
  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties tempFsFolder(ConfigNodePropertyString tempFsFolder) {
    this.tempFsFolder = tempFsFolder;
    return this;
  }

  
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
  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties useBinaryReferences(ConfigNodePropertyBoolean useBinaryReferences) {
    this.useBinaryReferences = useBinaryReferences;
    return this;
  }

  
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
  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties autoSaveThreshold(ConfigNodePropertyInteger autoSaveThreshold) {
    this.autoSaveThreshold = autoSaveThreshold;
    return this;
  }

  
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
  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties cleanupDelay(ConfigNodePropertyInteger cleanupDelay) {
    this.cleanupDelay = cleanupDelay;
    return this;
  }

  
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
  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties fileThreshold(ConfigNodePropertyInteger fileThreshold) {
    this.fileThreshold = fileThreshold;
    return this;
  }

  
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
  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties MEGA_BYTES(ConfigNodePropertyDropDown MEGA_BYTES) {
    this.MEGA_BYTES = MEGA_BYTES;
    return this;
  }

  
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
  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties useOffHeapMemory(ConfigNodePropertyBoolean useOffHeapMemory) {
    this.useOffHeapMemory = useOffHeapMemory;
    return this;
  }

  
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
  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties digestAlgorithm(ConfigNodePropertyDropDown digestAlgorithm) {
    this.digestAlgorithm = digestAlgorithm;
    return this;
  }

  
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
  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties monitoringQueueSize(ConfigNodePropertyInteger monitoringQueueSize) {
    this.monitoringQueueSize = monitoringQueueSize;
    return this;
  }

  
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
  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties pathsMapping(ConfigNodePropertyArray pathsMapping) {
    this.pathsMapping = pathsMapping;
    return this;
  }

  
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
  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties strictImport(ConfigNodePropertyBoolean strictImport) {
    this.strictImport = strictImport;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("strictImport")
  public ConfigNodePropertyBoolean getStrictImport() {
    return strictImport;
  }
  public void setStrictImport(ConfigNodePropertyBoolean strictImport) {
    this.strictImport = strictImport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

