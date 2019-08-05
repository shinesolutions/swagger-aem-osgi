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
 * OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties   {
  @JsonProperty("name")
  private ConfigNodePropertyString name = null;

  @JsonProperty("type")
  private ConfigNodePropertyDropDown type = null;

  @JsonProperty("importMode")
  private ConfigNodePropertyString importMode = null;

  @JsonProperty("aclHandling")
  private ConfigNodePropertyString aclHandling = null;

  @JsonProperty("package.roots")
  private ConfigNodePropertyString packageRoots = null;

  @JsonProperty("package.filters")
  private ConfigNodePropertyArray packageFilters = null;

  @JsonProperty("property.filters")
  private ConfigNodePropertyArray propertyFilters = null;

  @JsonProperty("tempFsFolder")
  private ConfigNodePropertyString tempFsFolder = null;

  @JsonProperty("useBinaryReferences")
  private ConfigNodePropertyBoolean useBinaryReferences = null;

  @JsonProperty("autoSaveThreshold")
  private ConfigNodePropertyInteger autoSaveThreshold = null;

  @JsonProperty("cleanupDelay")
  private ConfigNodePropertyInteger cleanupDelay = null;

  @JsonProperty("fileThreshold")
  private ConfigNodePropertyInteger fileThreshold = null;

  @JsonProperty("MEGA_BYTES")
  private ConfigNodePropertyDropDown MEGA_BYTES = null;

  @JsonProperty("useOffHeapMemory")
  private ConfigNodePropertyBoolean useOffHeapMemory = null;

  @JsonProperty("digestAlgorithm")
  private ConfigNodePropertyDropDown digestAlgorithm = null;

  @JsonProperty("monitoringQueueSize")
  private ConfigNodePropertyInteger monitoringQueueSize = null;

  @JsonProperty("pathsMapping")
  private ConfigNodePropertyArray pathsMapping = null;

  @JsonProperty("strictImport")
  private ConfigNodePropertyBoolean strictImport = null;

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties name(ConfigNodePropertyString name) {
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

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties type(ConfigNodePropertyDropDown type) {
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

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties importMode(ConfigNodePropertyString importMode) {
    this.importMode = importMode;
    return this;
  }

   /**
   * Get importMode
   * @return importMode
  **/
  @Valid
  public ConfigNodePropertyString getImportMode() {
    return importMode;
  }

  public void setImportMode(ConfigNodePropertyString importMode) {
    this.importMode = importMode;
  }

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties aclHandling(ConfigNodePropertyString aclHandling) {
    this.aclHandling = aclHandling;
    return this;
  }

   /**
   * Get aclHandling
   * @return aclHandling
  **/
  @Valid
  public ConfigNodePropertyString getAclHandling() {
    return aclHandling;
  }

  public void setAclHandling(ConfigNodePropertyString aclHandling) {
    this.aclHandling = aclHandling;
  }

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties packageRoots(ConfigNodePropertyString packageRoots) {
    this.packageRoots = packageRoots;
    return this;
  }

   /**
   * Get packageRoots
   * @return packageRoots
  **/
  @Valid
  public ConfigNodePropertyString getPackageRoots() {
    return packageRoots;
  }

  public void setPackageRoots(ConfigNodePropertyString packageRoots) {
    this.packageRoots = packageRoots;
  }

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties packageFilters(ConfigNodePropertyArray packageFilters) {
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

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties propertyFilters(ConfigNodePropertyArray propertyFilters) {
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

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties tempFsFolder(ConfigNodePropertyString tempFsFolder) {
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

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties useBinaryReferences(ConfigNodePropertyBoolean useBinaryReferences) {
    this.useBinaryReferences = useBinaryReferences;
    return this;
  }

   /**
   * Get useBinaryReferences
   * @return useBinaryReferences
  **/
  @Valid
  public ConfigNodePropertyBoolean getUseBinaryReferences() {
    return useBinaryReferences;
  }

  public void setUseBinaryReferences(ConfigNodePropertyBoolean useBinaryReferences) {
    this.useBinaryReferences = useBinaryReferences;
  }

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties autoSaveThreshold(ConfigNodePropertyInteger autoSaveThreshold) {
    this.autoSaveThreshold = autoSaveThreshold;
    return this;
  }

   /**
   * Get autoSaveThreshold
   * @return autoSaveThreshold
  **/
  @Valid
  public ConfigNodePropertyInteger getAutoSaveThreshold() {
    return autoSaveThreshold;
  }

  public void setAutoSaveThreshold(ConfigNodePropertyInteger autoSaveThreshold) {
    this.autoSaveThreshold = autoSaveThreshold;
  }

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties cleanupDelay(ConfigNodePropertyInteger cleanupDelay) {
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

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties fileThreshold(ConfigNodePropertyInteger fileThreshold) {
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

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties MEGA_BYTES(ConfigNodePropertyDropDown MEGA_BYTES) {
    this.MEGA_BYTES = MEGA_BYTES;
    return this;
  }

   /**
   * Get MEGA_BYTES
   * @return MEGA_BYTES
  **/
  @Valid
  public ConfigNodePropertyDropDown getMEGABYTES() {
    return MEGA_BYTES;
  }

  public void setMEGABYTES(ConfigNodePropertyDropDown MEGA_BYTES) {
    this.MEGA_BYTES = MEGA_BYTES;
  }

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties useOffHeapMemory(ConfigNodePropertyBoolean useOffHeapMemory) {
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

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties digestAlgorithm(ConfigNodePropertyDropDown digestAlgorithm) {
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

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties monitoringQueueSize(ConfigNodePropertyInteger monitoringQueueSize) {
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

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties pathsMapping(ConfigNodePropertyArray pathsMapping) {
    this.pathsMapping = pathsMapping;
    return this;
  }

   /**
   * Get pathsMapping
   * @return pathsMapping
  **/
  @Valid
  public ConfigNodePropertyArray getPathsMapping() {
    return pathsMapping;
  }

  public void setPathsMapping(ConfigNodePropertyArray pathsMapping) {
    this.pathsMapping = pathsMapping;
  }

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties strictImport(ConfigNodePropertyBoolean strictImport) {
    this.strictImport = strictImport;
    return this;
  }

   /**
   * Get strictImport
   * @return strictImport
  **/
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

