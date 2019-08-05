package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString name = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyDropDown type = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString importMode = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString aclHandling = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString packageRoots = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray packageFilters = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray propertyFilters = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString tempFsFolder = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean useBinaryReferences = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger autoSaveThreshold = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger cleanupDelay = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger fileThreshold = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyDropDown MEGA_BYTES = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean useOffHeapMemory = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyDropDown digestAlgorithm = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger monitoringQueueSize = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray pathsMapping = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean strictImport = null;
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

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties name(ConfigNodePropertyString name) {
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

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties type(ConfigNodePropertyDropDown type) {
    this.type = type;
    return this;
  }

 /**
   * Get importMode
   * @return importMode
  **/
  @JsonProperty("importMode")
  public ConfigNodePropertyString getImportMode() {
    return importMode;
  }

  public void setImportMode(ConfigNodePropertyString importMode) {
    this.importMode = importMode;
  }

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties importMode(ConfigNodePropertyString importMode) {
    this.importMode = importMode;
    return this;
  }

 /**
   * Get aclHandling
   * @return aclHandling
  **/
  @JsonProperty("aclHandling")
  public ConfigNodePropertyString getAclHandling() {
    return aclHandling;
  }

  public void setAclHandling(ConfigNodePropertyString aclHandling) {
    this.aclHandling = aclHandling;
  }

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties aclHandling(ConfigNodePropertyString aclHandling) {
    this.aclHandling = aclHandling;
    return this;
  }

 /**
   * Get packageRoots
   * @return packageRoots
  **/
  @JsonProperty("package.roots")
  public ConfigNodePropertyString getPackageRoots() {
    return packageRoots;
  }

  public void setPackageRoots(ConfigNodePropertyString packageRoots) {
    this.packageRoots = packageRoots;
  }

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties packageRoots(ConfigNodePropertyString packageRoots) {
    this.packageRoots = packageRoots;
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

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties packageFilters(ConfigNodePropertyArray packageFilters) {
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

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties propertyFilters(ConfigNodePropertyArray propertyFilters) {
    this.propertyFilters = propertyFilters;
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

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties tempFsFolder(ConfigNodePropertyString tempFsFolder) {
    this.tempFsFolder = tempFsFolder;
    return this;
  }

 /**
   * Get useBinaryReferences
   * @return useBinaryReferences
  **/
  @JsonProperty("useBinaryReferences")
  public ConfigNodePropertyBoolean getUseBinaryReferences() {
    return useBinaryReferences;
  }

  public void setUseBinaryReferences(ConfigNodePropertyBoolean useBinaryReferences) {
    this.useBinaryReferences = useBinaryReferences;
  }

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties useBinaryReferences(ConfigNodePropertyBoolean useBinaryReferences) {
    this.useBinaryReferences = useBinaryReferences;
    return this;
  }

 /**
   * Get autoSaveThreshold
   * @return autoSaveThreshold
  **/
  @JsonProperty("autoSaveThreshold")
  public ConfigNodePropertyInteger getAutoSaveThreshold() {
    return autoSaveThreshold;
  }

  public void setAutoSaveThreshold(ConfigNodePropertyInteger autoSaveThreshold) {
    this.autoSaveThreshold = autoSaveThreshold;
  }

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties autoSaveThreshold(ConfigNodePropertyInteger autoSaveThreshold) {
    this.autoSaveThreshold = autoSaveThreshold;
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

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties cleanupDelay(ConfigNodePropertyInteger cleanupDelay) {
    this.cleanupDelay = cleanupDelay;
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

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties fileThreshold(ConfigNodePropertyInteger fileThreshold) {
    this.fileThreshold = fileThreshold;
    return this;
  }

 /**
   * Get MEGA_BYTES
   * @return MEGA_BYTES
  **/
  @JsonProperty("MEGA_BYTES")
  public ConfigNodePropertyDropDown getMEGABYTES() {
    return MEGA_BYTES;
  }

  public void setMEGABYTES(ConfigNodePropertyDropDown MEGA_BYTES) {
    this.MEGA_BYTES = MEGA_BYTES;
  }

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties MEGA_BYTES(ConfigNodePropertyDropDown MEGA_BYTES) {
    this.MEGA_BYTES = MEGA_BYTES;
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

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties useOffHeapMemory(ConfigNodePropertyBoolean useOffHeapMemory) {
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

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties digestAlgorithm(ConfigNodePropertyDropDown digestAlgorithm) {
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

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties monitoringQueueSize(ConfigNodePropertyInteger monitoringQueueSize) {
    this.monitoringQueueSize = monitoringQueueSize;
    return this;
  }

 /**
   * Get pathsMapping
   * @return pathsMapping
  **/
  @JsonProperty("pathsMapping")
  public ConfigNodePropertyArray getPathsMapping() {
    return pathsMapping;
  }

  public void setPathsMapping(ConfigNodePropertyArray pathsMapping) {
    this.pathsMapping = pathsMapping;
  }

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties pathsMapping(ConfigNodePropertyArray pathsMapping) {
    this.pathsMapping = pathsMapping;
    return this;
  }

 /**
   * Get strictImport
   * @return strictImport
  **/
  @JsonProperty("strictImport")
  public ConfigNodePropertyBoolean getStrictImport() {
    return strictImport;
  }

  public void setStrictImport(ConfigNodePropertyBoolean strictImport) {
    this.strictImport = strictImport;
  }

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties strictImport(ConfigNodePropertyBoolean strictImport) {
    this.strictImport = strictImport;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

