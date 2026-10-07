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


public class OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString name;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyDropDown type;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString importMode;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString aclHandling;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString packageRoots;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray packageFilters;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray propertyFilters;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString tempFsFolder;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean useBinaryReferences;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger autoSaveThreshold;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger cleanupDelay;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger fileThreshold;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyDropDown MEGA_BYTES;

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
  private ConfigNodePropertyArray pathsMapping;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean strictImport;
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
  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties name(ConfigNodePropertyString name) {
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
  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties type(ConfigNodePropertyDropDown type) {
    this.type = type;
    return this;
  }

 /**
  * Get importMode
  * @return importMode
  */
  @JsonProperty("importMode")
  public ConfigNodePropertyString getImportMode() {
    return importMode;
  }

  /**
   * Sets the <code>importMode</code> property.
   */
 public void setImportMode(ConfigNodePropertyString importMode) {
    this.importMode = importMode;
  }

  /**
   * Sets the <code>importMode</code> property.
   */
  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties importMode(ConfigNodePropertyString importMode) {
    this.importMode = importMode;
    return this;
  }

 /**
  * Get aclHandling
  * @return aclHandling
  */
  @JsonProperty("aclHandling")
  public ConfigNodePropertyString getAclHandling() {
    return aclHandling;
  }

  /**
   * Sets the <code>aclHandling</code> property.
   */
 public void setAclHandling(ConfigNodePropertyString aclHandling) {
    this.aclHandling = aclHandling;
  }

  /**
   * Sets the <code>aclHandling</code> property.
   */
  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties aclHandling(ConfigNodePropertyString aclHandling) {
    this.aclHandling = aclHandling;
    return this;
  }

 /**
  * Get packageRoots
  * @return packageRoots
  */
  @JsonProperty("package.roots")
  public ConfigNodePropertyString getPackageRoots() {
    return packageRoots;
  }

  /**
   * Sets the <code>packageRoots</code> property.
   */
 public void setPackageRoots(ConfigNodePropertyString packageRoots) {
    this.packageRoots = packageRoots;
  }

  /**
   * Sets the <code>packageRoots</code> property.
   */
  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties packageRoots(ConfigNodePropertyString packageRoots) {
    this.packageRoots = packageRoots;
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
  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties packageFilters(ConfigNodePropertyArray packageFilters) {
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
  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties propertyFilters(ConfigNodePropertyArray propertyFilters) {
    this.propertyFilters = propertyFilters;
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
  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties tempFsFolder(ConfigNodePropertyString tempFsFolder) {
    this.tempFsFolder = tempFsFolder;
    return this;
  }

 /**
  * Get useBinaryReferences
  * @return useBinaryReferences
  */
  @JsonProperty("useBinaryReferences")
  public ConfigNodePropertyBoolean getUseBinaryReferences() {
    return useBinaryReferences;
  }

  /**
   * Sets the <code>useBinaryReferences</code> property.
   */
 public void setUseBinaryReferences(ConfigNodePropertyBoolean useBinaryReferences) {
    this.useBinaryReferences = useBinaryReferences;
  }

  /**
   * Sets the <code>useBinaryReferences</code> property.
   */
  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties useBinaryReferences(ConfigNodePropertyBoolean useBinaryReferences) {
    this.useBinaryReferences = useBinaryReferences;
    return this;
  }

 /**
  * Get autoSaveThreshold
  * @return autoSaveThreshold
  */
  @JsonProperty("autoSaveThreshold")
  public ConfigNodePropertyInteger getAutoSaveThreshold() {
    return autoSaveThreshold;
  }

  /**
   * Sets the <code>autoSaveThreshold</code> property.
   */
 public void setAutoSaveThreshold(ConfigNodePropertyInteger autoSaveThreshold) {
    this.autoSaveThreshold = autoSaveThreshold;
  }

  /**
   * Sets the <code>autoSaveThreshold</code> property.
   */
  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties autoSaveThreshold(ConfigNodePropertyInteger autoSaveThreshold) {
    this.autoSaveThreshold = autoSaveThreshold;
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
  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties cleanupDelay(ConfigNodePropertyInteger cleanupDelay) {
    this.cleanupDelay = cleanupDelay;
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
  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties fileThreshold(ConfigNodePropertyInteger fileThreshold) {
    this.fileThreshold = fileThreshold;
    return this;
  }

 /**
  * Get MEGA_BYTES
  * @return MEGA_BYTES
  */
  @JsonProperty("MEGA_BYTES")
  public ConfigNodePropertyDropDown getMEGABYTES() {
    return MEGA_BYTES;
  }

  /**
   * Sets the <code>MEGA_BYTES</code> property.
   */
 public void setMEGABYTES(ConfigNodePropertyDropDown MEGA_BYTES) {
    this.MEGA_BYTES = MEGA_BYTES;
  }

  /**
   * Sets the <code>MEGA_BYTES</code> property.
   */
  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties MEGA_BYTES(ConfigNodePropertyDropDown MEGA_BYTES) {
    this.MEGA_BYTES = MEGA_BYTES;
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
  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties useOffHeapMemory(ConfigNodePropertyBoolean useOffHeapMemory) {
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
  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties digestAlgorithm(ConfigNodePropertyDropDown digestAlgorithm) {
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
  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties monitoringQueueSize(ConfigNodePropertyInteger monitoringQueueSize) {
    this.monitoringQueueSize = monitoringQueueSize;
    return this;
  }

 /**
  * Get pathsMapping
  * @return pathsMapping
  */
  @JsonProperty("pathsMapping")
  public ConfigNodePropertyArray getPathsMapping() {
    return pathsMapping;
  }

  /**
   * Sets the <code>pathsMapping</code> property.
   */
 public void setPathsMapping(ConfigNodePropertyArray pathsMapping) {
    this.pathsMapping = pathsMapping;
  }

  /**
   * Sets the <code>pathsMapping</code> property.
   */
  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties pathsMapping(ConfigNodePropertyArray pathsMapping) {
    this.pathsMapping = pathsMapping;
    return this;
  }

 /**
  * Get strictImport
  * @return strictImport
  */
  @JsonProperty("strictImport")
  public ConfigNodePropertyBoolean getStrictImport() {
    return strictImport;
  }

  /**
   * Sets the <code>strictImport</code> property.
   */
 public void setStrictImport(ConfigNodePropertyBoolean strictImport) {
    this.strictImport = strictImport;
  }

  /**
   * Sets the <code>strictImport</code> property.
   */
  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties strictImport(ConfigNodePropertyBoolean strictImport) {
    this.strictImport = strictImport;
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
    OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties = (OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) o;
    return Objects.equals(this.name, orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.name) &&
        Objects.equals(this.type, orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.type) &&
        Objects.equals(this.importMode, orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.importMode) &&
        Objects.equals(this.aclHandling, orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.aclHandling) &&
        Objects.equals(this.packageRoots, orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.packageRoots) &&
        Objects.equals(this.packageFilters, orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.packageFilters) &&
        Objects.equals(this.propertyFilters, orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.propertyFilters) &&
        Objects.equals(this.tempFsFolder, orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.tempFsFolder) &&
        Objects.equals(this.useBinaryReferences, orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.useBinaryReferences) &&
        Objects.equals(this.autoSaveThreshold, orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.autoSaveThreshold) &&
        Objects.equals(this.cleanupDelay, orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.cleanupDelay) &&
        Objects.equals(this.fileThreshold, orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.fileThreshold) &&
        Objects.equals(this.MEGA_BYTES, orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.MEGA_BYTES) &&
        Objects.equals(this.useOffHeapMemory, orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.useOffHeapMemory) &&
        Objects.equals(this.digestAlgorithm, orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.digestAlgorithm) &&
        Objects.equals(this.monitoringQueueSize, orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.monitoringQueueSize) &&
        Objects.equals(this.pathsMapping, orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.pathsMapping) &&
        Objects.equals(this.strictImport, orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.strictImport);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

