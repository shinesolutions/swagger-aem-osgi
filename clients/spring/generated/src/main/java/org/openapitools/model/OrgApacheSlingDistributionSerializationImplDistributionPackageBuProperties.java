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
 * OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties
 */

@JsonTypeName("orgApacheSlingDistributionSerializationImplDistributionPackageBuProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString name;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown type;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString formatTarget;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString tempFsFolder;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger fileThreshold;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown memoryUnit;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean useOffHeapMemory;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown digestAlgorithm;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger monitoringQueueSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger cleanupDelay;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray packageFilters;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray propertyFilters;

  public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties name(@Nullable ConfigNodePropertyString name) {
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

  public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties type(@Nullable ConfigNodePropertyDropDown type) {
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

  public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties formatTarget(@Nullable ConfigNodePropertyString formatTarget) {
    this.formatTarget = formatTarget;
    return this;
  }

  /**
   * Get formatTarget
   * @return formatTarget
   */
  @Valid 
  @Schema(name = "format.target", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("format.target")
  public @Nullable ConfigNodePropertyString getFormatTarget() {
    return formatTarget;
  }

  @JsonProperty("format.target")
  public void setFormatTarget(@Nullable ConfigNodePropertyString formatTarget) {
    this.formatTarget = formatTarget;
  }

  public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties tempFsFolder(@Nullable ConfigNodePropertyString tempFsFolder) {
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

  public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties fileThreshold(@Nullable ConfigNodePropertyInteger fileThreshold) {
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

  public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties memoryUnit(@Nullable ConfigNodePropertyDropDown memoryUnit) {
    this.memoryUnit = memoryUnit;
    return this;
  }

  /**
   * Get memoryUnit
   * @return memoryUnit
   */
  @Valid 
  @Schema(name = "memoryUnit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("memoryUnit")
  public @Nullable ConfigNodePropertyDropDown getMemoryUnit() {
    return memoryUnit;
  }

  @JsonProperty("memoryUnit")
  public void setMemoryUnit(@Nullable ConfigNodePropertyDropDown memoryUnit) {
    this.memoryUnit = memoryUnit;
  }

  public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties useOffHeapMemory(@Nullable ConfigNodePropertyBoolean useOffHeapMemory) {
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

  public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties digestAlgorithm(@Nullable ConfigNodePropertyDropDown digestAlgorithm) {
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

  public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties monitoringQueueSize(@Nullable ConfigNodePropertyInteger monitoringQueueSize) {
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

  public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties cleanupDelay(@Nullable ConfigNodePropertyInteger cleanupDelay) {
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

  public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties packageFilters(@Nullable ConfigNodePropertyArray packageFilters) {
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

  public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties propertyFilters(@Nullable ConfigNodePropertyArray propertyFilters) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties orgApacheSlingDistributionSerializationImplDistributionPackageBuProperties = (OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties) o;
    return Objects.equals(this.name, orgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.name) &&
        Objects.equals(this.type, orgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.type) &&
        Objects.equals(this.formatTarget, orgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.formatTarget) &&
        Objects.equals(this.tempFsFolder, orgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.tempFsFolder) &&
        Objects.equals(this.fileThreshold, orgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.fileThreshold) &&
        Objects.equals(this.memoryUnit, orgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.memoryUnit) &&
        Objects.equals(this.useOffHeapMemory, orgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.useOffHeapMemory) &&
        Objects.equals(this.digestAlgorithm, orgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.digestAlgorithm) &&
        Objects.equals(this.monitoringQueueSize, orgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.monitoringQueueSize) &&
        Objects.equals(this.cleanupDelay, orgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.cleanupDelay) &&
        Objects.equals(this.packageFilters, orgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.packageFilters) &&
        Objects.equals(this.propertyFilters, orgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.propertyFilters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, formatTarget, tempFsFolder, fileThreshold, memoryUnit, useOffHeapMemory, digestAlgorithm, monitoringQueueSize, cleanupDelay, packageFilters, propertyFilters);
  }

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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

