/*
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.shinesolutions.swaggeraemosgi4j.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyArray;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyBoolean;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyDropDown;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyInteger;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * OrgApacheSlingDistributionSerializationImplVltVaultDistributionPackageBuilderFactoryProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-06-26T12:10:03.209Z[GMT]")
public class OrgApacheSlingDistributionSerializationImplVltVaultDistributionPackageBuilderFactoryProperties {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private ConfigNodePropertyString name = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private ConfigNodePropertyDropDown type = null;

  public static final String SERIALIZED_NAME_IMPORT_MODE = "importMode";
  @SerializedName(SERIALIZED_NAME_IMPORT_MODE)
  private ConfigNodePropertyString importMode = null;

  public static final String SERIALIZED_NAME_ACL_HANDLING = "aclHandling";
  @SerializedName(SERIALIZED_NAME_ACL_HANDLING)
  private ConfigNodePropertyString aclHandling = null;

  public static final String SERIALIZED_NAME_PACKAGE_ROOTS = "package.roots";
  @SerializedName(SERIALIZED_NAME_PACKAGE_ROOTS)
  private ConfigNodePropertyString packageRoots = null;

  public static final String SERIALIZED_NAME_PACKAGE_FILTERS = "package.filters";
  @SerializedName(SERIALIZED_NAME_PACKAGE_FILTERS)
  private ConfigNodePropertyArray packageFilters = null;

  public static final String SERIALIZED_NAME_PROPERTY_FILTERS = "property.filters";
  @SerializedName(SERIALIZED_NAME_PROPERTY_FILTERS)
  private ConfigNodePropertyArray propertyFilters = null;

  public static final String SERIALIZED_NAME_TEMP_FS_FOLDER = "tempFsFolder";
  @SerializedName(SERIALIZED_NAME_TEMP_FS_FOLDER)
  private ConfigNodePropertyString tempFsFolder = null;

  public static final String SERIALIZED_NAME_USE_BINARY_REFERENCES = "useBinaryReferences";
  @SerializedName(SERIALIZED_NAME_USE_BINARY_REFERENCES)
  private ConfigNodePropertyBoolean useBinaryReferences = null;

  public static final String SERIALIZED_NAME_AUTO_SAVE_THRESHOLD = "autoSaveThreshold";
  @SerializedName(SERIALIZED_NAME_AUTO_SAVE_THRESHOLD)
  private ConfigNodePropertyInteger autoSaveThreshold = null;

  public static final String SERIALIZED_NAME_CLEANUP_DELAY = "cleanupDelay";
  @SerializedName(SERIALIZED_NAME_CLEANUP_DELAY)
  private ConfigNodePropertyInteger cleanupDelay = null;

  public static final String SERIALIZED_NAME_FILE_THRESHOLD = "fileThreshold";
  @SerializedName(SERIALIZED_NAME_FILE_THRESHOLD)
  private ConfigNodePropertyInteger fileThreshold = null;

  public static final String SERIALIZED_NAME_M_E_G_A_B_Y_T_E_S = "MEGA_BYTES";
  @SerializedName(SERIALIZED_NAME_M_E_G_A_B_Y_T_E_S)
  private ConfigNodePropertyDropDown MEGA_BYTES = null;

  public static final String SERIALIZED_NAME_USE_OFF_HEAP_MEMORY = "useOffHeapMemory";
  @SerializedName(SERIALIZED_NAME_USE_OFF_HEAP_MEMORY)
  private ConfigNodePropertyBoolean useOffHeapMemory = null;

  public static final String SERIALIZED_NAME_DIGEST_ALGORITHM = "digestAlgorithm";
  @SerializedName(SERIALIZED_NAME_DIGEST_ALGORITHM)
  private ConfigNodePropertyDropDown digestAlgorithm = null;

  public static final String SERIALIZED_NAME_MONITORING_QUEUE_SIZE = "monitoringQueueSize";
  @SerializedName(SERIALIZED_NAME_MONITORING_QUEUE_SIZE)
  private ConfigNodePropertyInteger monitoringQueueSize = null;

  public static final String SERIALIZED_NAME_PATHS_MAPPING = "pathsMapping";
  @SerializedName(SERIALIZED_NAME_PATHS_MAPPING)
  private ConfigNodePropertyArray pathsMapping = null;

  public static final String SERIALIZED_NAME_STRICT_IMPORT = "strictImport";
  @SerializedName(SERIALIZED_NAME_STRICT_IMPORT)
  private ConfigNodePropertyBoolean strictImport = null;

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionPackageBuilderFactoryProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getName() {
    return name;
  }

  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionPackageBuilderFactoryProperties type(ConfigNodePropertyDropDown type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyDropDown getType() {
    return type;
  }

  public void setType(ConfigNodePropertyDropDown type) {
    this.type = type;
  }

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionPackageBuilderFactoryProperties importMode(ConfigNodePropertyString importMode) {
    this.importMode = importMode;
    return this;
  }

   /**
   * Get importMode
   * @return importMode
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getImportMode() {
    return importMode;
  }

  public void setImportMode(ConfigNodePropertyString importMode) {
    this.importMode = importMode;
  }

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionPackageBuilderFactoryProperties aclHandling(ConfigNodePropertyString aclHandling) {
    this.aclHandling = aclHandling;
    return this;
  }

   /**
   * Get aclHandling
   * @return aclHandling
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getAclHandling() {
    return aclHandling;
  }

  public void setAclHandling(ConfigNodePropertyString aclHandling) {
    this.aclHandling = aclHandling;
  }

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionPackageBuilderFactoryProperties packageRoots(ConfigNodePropertyString packageRoots) {
    this.packageRoots = packageRoots;
    return this;
  }

   /**
   * Get packageRoots
   * @return packageRoots
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getPackageRoots() {
    return packageRoots;
  }

  public void setPackageRoots(ConfigNodePropertyString packageRoots) {
    this.packageRoots = packageRoots;
  }

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionPackageBuilderFactoryProperties packageFilters(ConfigNodePropertyArray packageFilters) {
    this.packageFilters = packageFilters;
    return this;
  }

   /**
   * Get packageFilters
   * @return packageFilters
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getPackageFilters() {
    return packageFilters;
  }

  public void setPackageFilters(ConfigNodePropertyArray packageFilters) {
    this.packageFilters = packageFilters;
  }

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionPackageBuilderFactoryProperties propertyFilters(ConfigNodePropertyArray propertyFilters) {
    this.propertyFilters = propertyFilters;
    return this;
  }

   /**
   * Get propertyFilters
   * @return propertyFilters
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getPropertyFilters() {
    return propertyFilters;
  }

  public void setPropertyFilters(ConfigNodePropertyArray propertyFilters) {
    this.propertyFilters = propertyFilters;
  }

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionPackageBuilderFactoryProperties tempFsFolder(ConfigNodePropertyString tempFsFolder) {
    this.tempFsFolder = tempFsFolder;
    return this;
  }

   /**
   * Get tempFsFolder
   * @return tempFsFolder
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getTempFsFolder() {
    return tempFsFolder;
  }

  public void setTempFsFolder(ConfigNodePropertyString tempFsFolder) {
    this.tempFsFolder = tempFsFolder;
  }

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionPackageBuilderFactoryProperties useBinaryReferences(ConfigNodePropertyBoolean useBinaryReferences) {
    this.useBinaryReferences = useBinaryReferences;
    return this;
  }

   /**
   * Get useBinaryReferences
   * @return useBinaryReferences
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getUseBinaryReferences() {
    return useBinaryReferences;
  }

  public void setUseBinaryReferences(ConfigNodePropertyBoolean useBinaryReferences) {
    this.useBinaryReferences = useBinaryReferences;
  }

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionPackageBuilderFactoryProperties autoSaveThreshold(ConfigNodePropertyInteger autoSaveThreshold) {
    this.autoSaveThreshold = autoSaveThreshold;
    return this;
  }

   /**
   * Get autoSaveThreshold
   * @return autoSaveThreshold
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getAutoSaveThreshold() {
    return autoSaveThreshold;
  }

  public void setAutoSaveThreshold(ConfigNodePropertyInteger autoSaveThreshold) {
    this.autoSaveThreshold = autoSaveThreshold;
  }

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionPackageBuilderFactoryProperties cleanupDelay(ConfigNodePropertyInteger cleanupDelay) {
    this.cleanupDelay = cleanupDelay;
    return this;
  }

   /**
   * Get cleanupDelay
   * @return cleanupDelay
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getCleanupDelay() {
    return cleanupDelay;
  }

  public void setCleanupDelay(ConfigNodePropertyInteger cleanupDelay) {
    this.cleanupDelay = cleanupDelay;
  }

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionPackageBuilderFactoryProperties fileThreshold(ConfigNodePropertyInteger fileThreshold) {
    this.fileThreshold = fileThreshold;
    return this;
  }

   /**
   * Get fileThreshold
   * @return fileThreshold
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getFileThreshold() {
    return fileThreshold;
  }

  public void setFileThreshold(ConfigNodePropertyInteger fileThreshold) {
    this.fileThreshold = fileThreshold;
  }

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionPackageBuilderFactoryProperties MEGA_BYTES(ConfigNodePropertyDropDown MEGA_BYTES) {
    this.MEGA_BYTES = MEGA_BYTES;
    return this;
  }

   /**
   * Get MEGA_BYTES
   * @return MEGA_BYTES
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyDropDown getMEGABYTES() {
    return MEGA_BYTES;
  }

  public void setMEGABYTES(ConfigNodePropertyDropDown MEGA_BYTES) {
    this.MEGA_BYTES = MEGA_BYTES;
  }

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionPackageBuilderFactoryProperties useOffHeapMemory(ConfigNodePropertyBoolean useOffHeapMemory) {
    this.useOffHeapMemory = useOffHeapMemory;
    return this;
  }

   /**
   * Get useOffHeapMemory
   * @return useOffHeapMemory
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getUseOffHeapMemory() {
    return useOffHeapMemory;
  }

  public void setUseOffHeapMemory(ConfigNodePropertyBoolean useOffHeapMemory) {
    this.useOffHeapMemory = useOffHeapMemory;
  }

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionPackageBuilderFactoryProperties digestAlgorithm(ConfigNodePropertyDropDown digestAlgorithm) {
    this.digestAlgorithm = digestAlgorithm;
    return this;
  }

   /**
   * Get digestAlgorithm
   * @return digestAlgorithm
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyDropDown getDigestAlgorithm() {
    return digestAlgorithm;
  }

  public void setDigestAlgorithm(ConfigNodePropertyDropDown digestAlgorithm) {
    this.digestAlgorithm = digestAlgorithm;
  }

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionPackageBuilderFactoryProperties monitoringQueueSize(ConfigNodePropertyInteger monitoringQueueSize) {
    this.monitoringQueueSize = monitoringQueueSize;
    return this;
  }

   /**
   * Get monitoringQueueSize
   * @return monitoringQueueSize
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getMonitoringQueueSize() {
    return monitoringQueueSize;
  }

  public void setMonitoringQueueSize(ConfigNodePropertyInteger monitoringQueueSize) {
    this.monitoringQueueSize = monitoringQueueSize;
  }

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionPackageBuilderFactoryProperties pathsMapping(ConfigNodePropertyArray pathsMapping) {
    this.pathsMapping = pathsMapping;
    return this;
  }

   /**
   * Get pathsMapping
   * @return pathsMapping
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getPathsMapping() {
    return pathsMapping;
  }

  public void setPathsMapping(ConfigNodePropertyArray pathsMapping) {
    this.pathsMapping = pathsMapping;
  }

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionPackageBuilderFactoryProperties strictImport(ConfigNodePropertyBoolean strictImport) {
    this.strictImport = strictImport;
    return this;
  }

   /**
   * Get strictImport
   * @return strictImport
  **/
  @ApiModelProperty(value = "")
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
    OrgApacheSlingDistributionSerializationImplVltVaultDistributionPackageBuilderFactoryProperties orgApacheSlingDistributionSerializationImplVltVaultDistributionPackageBuilderFactoryProperties = (OrgApacheSlingDistributionSerializationImplVltVaultDistributionPackageBuilderFactoryProperties) o;
    return Objects.equals(this.name, orgApacheSlingDistributionSerializationImplVltVaultDistributionPackageBuilderFactoryProperties.name) &&
        Objects.equals(this.type, orgApacheSlingDistributionSerializationImplVltVaultDistributionPackageBuilderFactoryProperties.type) &&
        Objects.equals(this.importMode, orgApacheSlingDistributionSerializationImplVltVaultDistributionPackageBuilderFactoryProperties.importMode) &&
        Objects.equals(this.aclHandling, orgApacheSlingDistributionSerializationImplVltVaultDistributionPackageBuilderFactoryProperties.aclHandling) &&
        Objects.equals(this.packageRoots, orgApacheSlingDistributionSerializationImplVltVaultDistributionPackageBuilderFactoryProperties.packageRoots) &&
        Objects.equals(this.packageFilters, orgApacheSlingDistributionSerializationImplVltVaultDistributionPackageBuilderFactoryProperties.packageFilters) &&
        Objects.equals(this.propertyFilters, orgApacheSlingDistributionSerializationImplVltVaultDistributionPackageBuilderFactoryProperties.propertyFilters) &&
        Objects.equals(this.tempFsFolder, orgApacheSlingDistributionSerializationImplVltVaultDistributionPackageBuilderFactoryProperties.tempFsFolder) &&
        Objects.equals(this.useBinaryReferences, orgApacheSlingDistributionSerializationImplVltVaultDistributionPackageBuilderFactoryProperties.useBinaryReferences) &&
        Objects.equals(this.autoSaveThreshold, orgApacheSlingDistributionSerializationImplVltVaultDistributionPackageBuilderFactoryProperties.autoSaveThreshold) &&
        Objects.equals(this.cleanupDelay, orgApacheSlingDistributionSerializationImplVltVaultDistributionPackageBuilderFactoryProperties.cleanupDelay) &&
        Objects.equals(this.fileThreshold, orgApacheSlingDistributionSerializationImplVltVaultDistributionPackageBuilderFactoryProperties.fileThreshold) &&
        Objects.equals(this.MEGA_BYTES, orgApacheSlingDistributionSerializationImplVltVaultDistributionPackageBuilderFactoryProperties.MEGA_BYTES) &&
        Objects.equals(this.useOffHeapMemory, orgApacheSlingDistributionSerializationImplVltVaultDistributionPackageBuilderFactoryProperties.useOffHeapMemory) &&
        Objects.equals(this.digestAlgorithm, orgApacheSlingDistributionSerializationImplVltVaultDistributionPackageBuilderFactoryProperties.digestAlgorithm) &&
        Objects.equals(this.monitoringQueueSize, orgApacheSlingDistributionSerializationImplVltVaultDistributionPackageBuilderFactoryProperties.monitoringQueueSize) &&
        Objects.equals(this.pathsMapping, orgApacheSlingDistributionSerializationImplVltVaultDistributionPackageBuilderFactoryProperties.pathsMapping) &&
        Objects.equals(this.strictImport, orgApacheSlingDistributionSerializationImplVltVaultDistributionPackageBuilderFactoryProperties.strictImport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, importMode, aclHandling, packageRoots, packageFilters, propertyFilters, tempFsFolder, useBinaryReferences, autoSaveThreshold, cleanupDelay, fileThreshold, MEGA_BYTES, useOffHeapMemory, digestAlgorithm, monitoringQueueSize, pathsMapping, strictImport);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingDistributionSerializationImplVltVaultDistributionPackageBuilderFactoryProperties {\n");
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

