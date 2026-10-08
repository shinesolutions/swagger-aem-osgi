package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("name")
  private ConfigNodePropertyString name;

  @JsonProperty("type")
  private ConfigNodePropertyDropDown type;

  @JsonProperty("importMode")
  private ConfigNodePropertyString importMode;

  @JsonProperty("aclHandling")
  private ConfigNodePropertyString aclHandling;

  @JsonProperty("package.roots")
  private ConfigNodePropertyString packageRoots;

  @JsonProperty("package.filters")
  private ConfigNodePropertyArray packageFilters;

  @JsonProperty("property.filters")
  private ConfigNodePropertyArray propertyFilters;

  @JsonProperty("tempFsFolder")
  private ConfigNodePropertyString tempFsFolder;

  @JsonProperty("useBinaryReferences")
  private ConfigNodePropertyBoolean useBinaryReferences;

  @JsonProperty("autoSaveThreshold")
  private ConfigNodePropertyInteger autoSaveThreshold;

  @JsonProperty("cleanupDelay")
  private ConfigNodePropertyInteger cleanupDelay;

  @JsonProperty("fileThreshold")
  private ConfigNodePropertyInteger fileThreshold;

  @JsonProperty("MEGA_BYTES")
  private ConfigNodePropertyDropDown MEGA_BYTES;

  @JsonProperty("useOffHeapMemory")
  private ConfigNodePropertyBoolean useOffHeapMemory;

  @JsonProperty("digestAlgorithm")
  private ConfigNodePropertyDropDown digestAlgorithm;

  @JsonProperty("monitoringQueueSize")
  private ConfigNodePropertyInteger monitoringQueueSize;

  @JsonProperty("pathsMapping")
  private ConfigNodePropertyArray pathsMapping;

  @JsonProperty("strictImport")
  private ConfigNodePropertyBoolean strictImport;

  /**
   * 
   * @return name
   */
  public ConfigNodePropertyString getName() {
    return name;
  }

  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  /**
   * 
   * @return type
   */
  public ConfigNodePropertyDropDown getType() {
    return type;
  }

  public void setType(ConfigNodePropertyDropDown type) {
    this.type = type;
  }

  /**
   * 
   * @return importMode
   */
  public ConfigNodePropertyString getImportMode() {
    return importMode;
  }

  public void setImportMode(ConfigNodePropertyString importMode) {
    this.importMode = importMode;
  }

  /**
   * 
   * @return aclHandling
   */
  public ConfigNodePropertyString getAclHandling() {
    return aclHandling;
  }

  public void setAclHandling(ConfigNodePropertyString aclHandling) {
    this.aclHandling = aclHandling;
  }

  /**
   * 
   * @return packageRoots
   */
  public ConfigNodePropertyString getPackageRoots() {
    return packageRoots;
  }

  public void setPackageRoots(ConfigNodePropertyString packageRoots) {
    this.packageRoots = packageRoots;
  }

  /**
   * 
   * @return packageFilters
   */
  public ConfigNodePropertyArray getPackageFilters() {
    return packageFilters;
  }

  public void setPackageFilters(ConfigNodePropertyArray packageFilters) {
    this.packageFilters = packageFilters;
  }

  /**
   * 
   * @return propertyFilters
   */
  public ConfigNodePropertyArray getPropertyFilters() {
    return propertyFilters;
  }

  public void setPropertyFilters(ConfigNodePropertyArray propertyFilters) {
    this.propertyFilters = propertyFilters;
  }

  /**
   * 
   * @return tempFsFolder
   */
  public ConfigNodePropertyString getTempFsFolder() {
    return tempFsFolder;
  }

  public void setTempFsFolder(ConfigNodePropertyString tempFsFolder) {
    this.tempFsFolder = tempFsFolder;
  }

  /**
   * 
   * @return useBinaryReferences
   */
  public ConfigNodePropertyBoolean getUseBinaryReferences() {
    return useBinaryReferences;
  }

  public void setUseBinaryReferences(ConfigNodePropertyBoolean useBinaryReferences) {
    this.useBinaryReferences = useBinaryReferences;
  }

  /**
   * 
   * @return autoSaveThreshold
   */
  public ConfigNodePropertyInteger getAutoSaveThreshold() {
    return autoSaveThreshold;
  }

  public void setAutoSaveThreshold(ConfigNodePropertyInteger autoSaveThreshold) {
    this.autoSaveThreshold = autoSaveThreshold;
  }

  /**
   * 
   * @return cleanupDelay
   */
  public ConfigNodePropertyInteger getCleanupDelay() {
    return cleanupDelay;
  }

  public void setCleanupDelay(ConfigNodePropertyInteger cleanupDelay) {
    this.cleanupDelay = cleanupDelay;
  }

  /**
   * 
   * @return fileThreshold
   */
  public ConfigNodePropertyInteger getFileThreshold() {
    return fileThreshold;
  }

  public void setFileThreshold(ConfigNodePropertyInteger fileThreshold) {
    this.fileThreshold = fileThreshold;
  }

  /**
   * 
   * @return MEGA_BYTES
   */
  public ConfigNodePropertyDropDown getMEGABYTES() {
    return MEGA_BYTES;
  }

  public void setMEGABYTES(ConfigNodePropertyDropDown MEGA_BYTES) {
    this.MEGA_BYTES = MEGA_BYTES;
  }

  /**
   * 
   * @return useOffHeapMemory
   */
  public ConfigNodePropertyBoolean getUseOffHeapMemory() {
    return useOffHeapMemory;
  }

  public void setUseOffHeapMemory(ConfigNodePropertyBoolean useOffHeapMemory) {
    this.useOffHeapMemory = useOffHeapMemory;
  }

  /**
   * 
   * @return digestAlgorithm
   */
  public ConfigNodePropertyDropDown getDigestAlgorithm() {
    return digestAlgorithm;
  }

  public void setDigestAlgorithm(ConfigNodePropertyDropDown digestAlgorithm) {
    this.digestAlgorithm = digestAlgorithm;
  }

  /**
   * 
   * @return monitoringQueueSize
   */
  public ConfigNodePropertyInteger getMonitoringQueueSize() {
    return monitoringQueueSize;
  }

  public void setMonitoringQueueSize(ConfigNodePropertyInteger monitoringQueueSize) {
    this.monitoringQueueSize = monitoringQueueSize;
  }

  /**
   * 
   * @return pathsMapping
   */
  public ConfigNodePropertyArray getPathsMapping() {
    return pathsMapping;
  }

  public void setPathsMapping(ConfigNodePropertyArray pathsMapping) {
    this.pathsMapping = pathsMapping;
  }

  /**
   * 
   * @return strictImport
   */
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
