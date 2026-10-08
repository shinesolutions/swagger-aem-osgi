package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties
 */

@JsonTypeName("orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString name;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown type;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString importMode;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString aclHandling;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString packageRoots;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray packageFilters;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray propertyFilters;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString tempFsFolder;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean useBinaryReferences;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger autoSaveThreshold;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger cleanupDelay;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger fileThreshold;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown MEGA_BYTES;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean useOffHeapMemory;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown digestAlgorithm;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger monitoringQueueSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray pathsMapping;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean strictImport;

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties name(@Nullable ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @Valid 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable ConfigNodePropertyString getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(@Nullable ConfigNodePropertyString name) {
    this.name = name;
  }

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties type(@Nullable ConfigNodePropertyDropDown type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @Valid 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public @Nullable ConfigNodePropertyDropDown getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(@Nullable ConfigNodePropertyDropDown type) {
    this.type = type;
  }

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties importMode(@Nullable ConfigNodePropertyString importMode) {
    this.importMode = importMode;
    return this;
  }

  /**
   * Get importMode
   * @return importMode
   */
  @Valid 
  @Schema(name = "importMode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("importMode")
  public @Nullable ConfigNodePropertyString getImportMode() {
    return importMode;
  }

  @JsonProperty("importMode")
  public void setImportMode(@Nullable ConfigNodePropertyString importMode) {
    this.importMode = importMode;
  }

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties aclHandling(@Nullable ConfigNodePropertyString aclHandling) {
    this.aclHandling = aclHandling;
    return this;
  }

  /**
   * Get aclHandling
   * @return aclHandling
   */
  @Valid 
  @Schema(name = "aclHandling", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aclHandling")
  public @Nullable ConfigNodePropertyString getAclHandling() {
    return aclHandling;
  }

  @JsonProperty("aclHandling")
  public void setAclHandling(@Nullable ConfigNodePropertyString aclHandling) {
    this.aclHandling = aclHandling;
  }

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties packageRoots(@Nullable ConfigNodePropertyString packageRoots) {
    this.packageRoots = packageRoots;
    return this;
  }

  /**
   * Get packageRoots
   * @return packageRoots
   */
  @Valid 
  @Schema(name = "package.roots", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("package.roots")
  public @Nullable ConfigNodePropertyString getPackageRoots() {
    return packageRoots;
  }

  @JsonProperty("package.roots")
  public void setPackageRoots(@Nullable ConfigNodePropertyString packageRoots) {
    this.packageRoots = packageRoots;
  }

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties packageFilters(@Nullable ConfigNodePropertyArray packageFilters) {
    this.packageFilters = packageFilters;
    return this;
  }

  /**
   * Get packageFilters
   * @return packageFilters
   */
  @Valid 
  @Schema(name = "package.filters", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("package.filters")
  public @Nullable ConfigNodePropertyArray getPackageFilters() {
    return packageFilters;
  }

  @JsonProperty("package.filters")
  public void setPackageFilters(@Nullable ConfigNodePropertyArray packageFilters) {
    this.packageFilters = packageFilters;
  }

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties propertyFilters(@Nullable ConfigNodePropertyArray propertyFilters) {
    this.propertyFilters = propertyFilters;
    return this;
  }

  /**
   * Get propertyFilters
   * @return propertyFilters
   */
  @Valid 
  @Schema(name = "property.filters", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("property.filters")
  public @Nullable ConfigNodePropertyArray getPropertyFilters() {
    return propertyFilters;
  }

  @JsonProperty("property.filters")
  public void setPropertyFilters(@Nullable ConfigNodePropertyArray propertyFilters) {
    this.propertyFilters = propertyFilters;
  }

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties tempFsFolder(@Nullable ConfigNodePropertyString tempFsFolder) {
    this.tempFsFolder = tempFsFolder;
    return this;
  }

  /**
   * Get tempFsFolder
   * @return tempFsFolder
   */
  @Valid 
  @Schema(name = "tempFsFolder", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tempFsFolder")
  public @Nullable ConfigNodePropertyString getTempFsFolder() {
    return tempFsFolder;
  }

  @JsonProperty("tempFsFolder")
  public void setTempFsFolder(@Nullable ConfigNodePropertyString tempFsFolder) {
    this.tempFsFolder = tempFsFolder;
  }

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties useBinaryReferences(@Nullable ConfigNodePropertyBoolean useBinaryReferences) {
    this.useBinaryReferences = useBinaryReferences;
    return this;
  }

  /**
   * Get useBinaryReferences
   * @return useBinaryReferences
   */
  @Valid 
  @Schema(name = "useBinaryReferences", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("useBinaryReferences")
  public @Nullable ConfigNodePropertyBoolean getUseBinaryReferences() {
    return useBinaryReferences;
  }

  @JsonProperty("useBinaryReferences")
  public void setUseBinaryReferences(@Nullable ConfigNodePropertyBoolean useBinaryReferences) {
    this.useBinaryReferences = useBinaryReferences;
  }

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties autoSaveThreshold(@Nullable ConfigNodePropertyInteger autoSaveThreshold) {
    this.autoSaveThreshold = autoSaveThreshold;
    return this;
  }

  /**
   * Get autoSaveThreshold
   * @return autoSaveThreshold
   */
  @Valid 
  @Schema(name = "autoSaveThreshold", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("autoSaveThreshold")
  public @Nullable ConfigNodePropertyInteger getAutoSaveThreshold() {
    return autoSaveThreshold;
  }

  @JsonProperty("autoSaveThreshold")
  public void setAutoSaveThreshold(@Nullable ConfigNodePropertyInteger autoSaveThreshold) {
    this.autoSaveThreshold = autoSaveThreshold;
  }

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties cleanupDelay(@Nullable ConfigNodePropertyInteger cleanupDelay) {
    this.cleanupDelay = cleanupDelay;
    return this;
  }

  /**
   * Get cleanupDelay
   * @return cleanupDelay
   */
  @Valid 
  @Schema(name = "cleanupDelay", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cleanupDelay")
  public @Nullable ConfigNodePropertyInteger getCleanupDelay() {
    return cleanupDelay;
  }

  @JsonProperty("cleanupDelay")
  public void setCleanupDelay(@Nullable ConfigNodePropertyInteger cleanupDelay) {
    this.cleanupDelay = cleanupDelay;
  }

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties fileThreshold(@Nullable ConfigNodePropertyInteger fileThreshold) {
    this.fileThreshold = fileThreshold;
    return this;
  }

  /**
   * Get fileThreshold
   * @return fileThreshold
   */
  @Valid 
  @Schema(name = "fileThreshold", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fileThreshold")
  public @Nullable ConfigNodePropertyInteger getFileThreshold() {
    return fileThreshold;
  }

  @JsonProperty("fileThreshold")
  public void setFileThreshold(@Nullable ConfigNodePropertyInteger fileThreshold) {
    this.fileThreshold = fileThreshold;
  }

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties MEGA_BYTES(@Nullable ConfigNodePropertyDropDown MEGA_BYTES) {
    this.MEGA_BYTES = MEGA_BYTES;
    return this;
  }

  /**
   * Get MEGA_BYTES
   * @return MEGA_BYTES
   */
  @Valid 
  @Schema(name = "MEGA_BYTES", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MEGA_BYTES")
  public @Nullable ConfigNodePropertyDropDown getMEGABYTES() {
    return MEGA_BYTES;
  }

  @JsonProperty("MEGA_BYTES")
  public void setMEGABYTES(@Nullable ConfigNodePropertyDropDown MEGA_BYTES) {
    this.MEGA_BYTES = MEGA_BYTES;
  }

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties useOffHeapMemory(@Nullable ConfigNodePropertyBoolean useOffHeapMemory) {
    this.useOffHeapMemory = useOffHeapMemory;
    return this;
  }

  /**
   * Get useOffHeapMemory
   * @return useOffHeapMemory
   */
  @Valid 
  @Schema(name = "useOffHeapMemory", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("useOffHeapMemory")
  public @Nullable ConfigNodePropertyBoolean getUseOffHeapMemory() {
    return useOffHeapMemory;
  }

  @JsonProperty("useOffHeapMemory")
  public void setUseOffHeapMemory(@Nullable ConfigNodePropertyBoolean useOffHeapMemory) {
    this.useOffHeapMemory = useOffHeapMemory;
  }

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties digestAlgorithm(@Nullable ConfigNodePropertyDropDown digestAlgorithm) {
    this.digestAlgorithm = digestAlgorithm;
    return this;
  }

  /**
   * Get digestAlgorithm
   * @return digestAlgorithm
   */
  @Valid 
  @Schema(name = "digestAlgorithm", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("digestAlgorithm")
  public @Nullable ConfigNodePropertyDropDown getDigestAlgorithm() {
    return digestAlgorithm;
  }

  @JsonProperty("digestAlgorithm")
  public void setDigestAlgorithm(@Nullable ConfigNodePropertyDropDown digestAlgorithm) {
    this.digestAlgorithm = digestAlgorithm;
  }

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties monitoringQueueSize(@Nullable ConfigNodePropertyInteger monitoringQueueSize) {
    this.monitoringQueueSize = monitoringQueueSize;
    return this;
  }

  /**
   * Get monitoringQueueSize
   * @return monitoringQueueSize
   */
  @Valid 
  @Schema(name = "monitoringQueueSize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("monitoringQueueSize")
  public @Nullable ConfigNodePropertyInteger getMonitoringQueueSize() {
    return monitoringQueueSize;
  }

  @JsonProperty("monitoringQueueSize")
  public void setMonitoringQueueSize(@Nullable ConfigNodePropertyInteger monitoringQueueSize) {
    this.monitoringQueueSize = monitoringQueueSize;
  }

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties pathsMapping(@Nullable ConfigNodePropertyArray pathsMapping) {
    this.pathsMapping = pathsMapping;
    return this;
  }

  /**
   * Get pathsMapping
   * @return pathsMapping
   */
  @Valid 
  @Schema(name = "pathsMapping", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pathsMapping")
  public @Nullable ConfigNodePropertyArray getPathsMapping() {
    return pathsMapping;
  }

  @JsonProperty("pathsMapping")
  public void setPathsMapping(@Nullable ConfigNodePropertyArray pathsMapping) {
    this.pathsMapping = pathsMapping;
  }

  public OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties strictImport(@Nullable ConfigNodePropertyBoolean strictImport) {
    this.strictImport = strictImport;
    return this;
  }

  /**
   * Get strictImport
   * @return strictImport
   */
  @Valid 
  @Schema(name = "strictImport", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("strictImport")
  public @Nullable ConfigNodePropertyBoolean getStrictImport() {
    return strictImport;
  }

  @JsonProperty("strictImport")
  public void setStrictImport(@Nullable ConfigNodePropertyBoolean strictImport) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

