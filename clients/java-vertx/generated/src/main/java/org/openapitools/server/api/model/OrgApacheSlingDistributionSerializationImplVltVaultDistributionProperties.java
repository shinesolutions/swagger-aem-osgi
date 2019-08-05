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

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties () {

  }

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties (ConfigNodePropertyString name, ConfigNodePropertyDropDown type, ConfigNodePropertyString importMode, ConfigNodePropertyString aclHandling, ConfigNodePropertyString packageRoots, ConfigNodePropertyArray packageFilters, ConfigNodePropertyArray propertyFilters, ConfigNodePropertyString tempFsFolder, ConfigNodePropertyBoolean useBinaryReferences, ConfigNodePropertyInteger autoSaveThreshold, ConfigNodePropertyInteger cleanupDelay, ConfigNodePropertyInteger fileThreshold, ConfigNodePropertyDropDown MEGA_BYTES, ConfigNodePropertyBoolean useOffHeapMemory, ConfigNodePropertyDropDown digestAlgorithm, ConfigNodePropertyInteger monitoringQueueSize, ConfigNodePropertyArray pathsMapping, ConfigNodePropertyBoolean strictImport) {
    this.name = name;
    this.type = type;
    this.importMode = importMode;
    this.aclHandling = aclHandling;
    this.packageRoots = packageRoots;
    this.packageFilters = packageFilters;
    this.propertyFilters = propertyFilters;
    this.tempFsFolder = tempFsFolder;
    this.useBinaryReferences = useBinaryReferences;
    this.autoSaveThreshold = autoSaveThreshold;
    this.cleanupDelay = cleanupDelay;
    this.fileThreshold = fileThreshold;
    this.MEGA_BYTES = MEGA_BYTES;
    this.useOffHeapMemory = useOffHeapMemory;
    this.digestAlgorithm = digestAlgorithm;
    this.monitoringQueueSize = monitoringQueueSize;
    this.pathsMapping = pathsMapping;
    this.strictImport = strictImport;
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

    
  @JsonProperty("importMode")
  public ConfigNodePropertyString getImportMode() {
    return importMode;
  }
  public void setImportMode(ConfigNodePropertyString importMode) {
    this.importMode = importMode;
  }

    
  @JsonProperty("aclHandling")
  public ConfigNodePropertyString getAclHandling() {
    return aclHandling;
  }
  public void setAclHandling(ConfigNodePropertyString aclHandling) {
    this.aclHandling = aclHandling;
  }

    
  @JsonProperty("package.roots")
  public ConfigNodePropertyString getPackageRoots() {
    return packageRoots;
  }
  public void setPackageRoots(ConfigNodePropertyString packageRoots) {
    this.packageRoots = packageRoots;
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

    
  @JsonProperty("tempFsFolder")
  public ConfigNodePropertyString getTempFsFolder() {
    return tempFsFolder;
  }
  public void setTempFsFolder(ConfigNodePropertyString tempFsFolder) {
    this.tempFsFolder = tempFsFolder;
  }

    
  @JsonProperty("useBinaryReferences")
  public ConfigNodePropertyBoolean getUseBinaryReferences() {
    return useBinaryReferences;
  }
  public void setUseBinaryReferences(ConfigNodePropertyBoolean useBinaryReferences) {
    this.useBinaryReferences = useBinaryReferences;
  }

    
  @JsonProperty("autoSaveThreshold")
  public ConfigNodePropertyInteger getAutoSaveThreshold() {
    return autoSaveThreshold;
  }
  public void setAutoSaveThreshold(ConfigNodePropertyInteger autoSaveThreshold) {
    this.autoSaveThreshold = autoSaveThreshold;
  }

    
  @JsonProperty("cleanupDelay")
  public ConfigNodePropertyInteger getCleanupDelay() {
    return cleanupDelay;
  }
  public void setCleanupDelay(ConfigNodePropertyInteger cleanupDelay) {
    this.cleanupDelay = cleanupDelay;
  }

    
  @JsonProperty("fileThreshold")
  public ConfigNodePropertyInteger getFileThreshold() {
    return fileThreshold;
  }
  public void setFileThreshold(ConfigNodePropertyInteger fileThreshold) {
    this.fileThreshold = fileThreshold;
  }

    
  @JsonProperty("MEGA_BYTES")
  public ConfigNodePropertyDropDown getMEGABYTES() {
    return MEGA_BYTES;
  }
  public void setMEGABYTES(ConfigNodePropertyDropDown MEGA_BYTES) {
    this.MEGA_BYTES = MEGA_BYTES;
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

    
  @JsonProperty("pathsMapping")
  public ConfigNodePropertyArray getPathsMapping() {
    return pathsMapping;
  }
  public void setPathsMapping(ConfigNodePropertyArray pathsMapping) {
    this.pathsMapping = pathsMapping;
  }

    
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
