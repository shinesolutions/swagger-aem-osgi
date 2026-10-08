package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyFloat;
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
 * ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties
 */

@JsonTypeName("comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString jmxObjectname;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean propertyMeasureEnabled;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString propertyName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger propertyMaxWaitMs;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyFloat propertyMaxRate;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean fulltextMeasureEnabled;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString fulltextName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger fulltextMaxWaitMs;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyFloat fulltextMaxRate;

  public ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties jmxObjectname(@Nullable ConfigNodePropertyString jmxObjectname) {
    this.jmxObjectname = jmxObjectname;
    return this;
  }

  /**
   * Get jmxObjectname
   * @return jmxObjectname
   */
  @Valid 
  @Schema(name = "jmx.objectname", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jmx.objectname")
  public @Nullable ConfigNodePropertyString getJmxObjectname() {
    return jmxObjectname;
  }

  @JsonProperty("jmx.objectname")
  public void setJmxObjectname(@Nullable ConfigNodePropertyString jmxObjectname) {
    this.jmxObjectname = jmxObjectname;
  }

  public ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties propertyMeasureEnabled(@Nullable ConfigNodePropertyBoolean propertyMeasureEnabled) {
    this.propertyMeasureEnabled = propertyMeasureEnabled;
    return this;
  }

  /**
   * Get propertyMeasureEnabled
   * @return propertyMeasureEnabled
   */
  @Valid 
  @Schema(name = "property.measure.enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("property.measure.enabled")
  public @Nullable ConfigNodePropertyBoolean getPropertyMeasureEnabled() {
    return propertyMeasureEnabled;
  }

  @JsonProperty("property.measure.enabled")
  public void setPropertyMeasureEnabled(@Nullable ConfigNodePropertyBoolean propertyMeasureEnabled) {
    this.propertyMeasureEnabled = propertyMeasureEnabled;
  }

  public ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties propertyName(@Nullable ConfigNodePropertyString propertyName) {
    this.propertyName = propertyName;
    return this;
  }

  /**
   * Get propertyName
   * @return propertyName
   */
  @Valid 
  @Schema(name = "property.name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("property.name")
  public @Nullable ConfigNodePropertyString getPropertyName() {
    return propertyName;
  }

  @JsonProperty("property.name")
  public void setPropertyName(@Nullable ConfigNodePropertyString propertyName) {
    this.propertyName = propertyName;
  }

  public ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties propertyMaxWaitMs(@Nullable ConfigNodePropertyInteger propertyMaxWaitMs) {
    this.propertyMaxWaitMs = propertyMaxWaitMs;
    return this;
  }

  /**
   * Get propertyMaxWaitMs
   * @return propertyMaxWaitMs
   */
  @Valid 
  @Schema(name = "property.max.wait.ms", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("property.max.wait.ms")
  public @Nullable ConfigNodePropertyInteger getPropertyMaxWaitMs() {
    return propertyMaxWaitMs;
  }

  @JsonProperty("property.max.wait.ms")
  public void setPropertyMaxWaitMs(@Nullable ConfigNodePropertyInteger propertyMaxWaitMs) {
    this.propertyMaxWaitMs = propertyMaxWaitMs;
  }

  public ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties propertyMaxRate(@Nullable ConfigNodePropertyFloat propertyMaxRate) {
    this.propertyMaxRate = propertyMaxRate;
    return this;
  }

  /**
   * Get propertyMaxRate
   * @return propertyMaxRate
   */
  @Valid 
  @Schema(name = "property.max.rate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("property.max.rate")
  public @Nullable ConfigNodePropertyFloat getPropertyMaxRate() {
    return propertyMaxRate;
  }

  @JsonProperty("property.max.rate")
  public void setPropertyMaxRate(@Nullable ConfigNodePropertyFloat propertyMaxRate) {
    this.propertyMaxRate = propertyMaxRate;
  }

  public ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties fulltextMeasureEnabled(@Nullable ConfigNodePropertyBoolean fulltextMeasureEnabled) {
    this.fulltextMeasureEnabled = fulltextMeasureEnabled;
    return this;
  }

  /**
   * Get fulltextMeasureEnabled
   * @return fulltextMeasureEnabled
   */
  @Valid 
  @Schema(name = "fulltext.measure.enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fulltext.measure.enabled")
  public @Nullable ConfigNodePropertyBoolean getFulltextMeasureEnabled() {
    return fulltextMeasureEnabled;
  }

  @JsonProperty("fulltext.measure.enabled")
  public void setFulltextMeasureEnabled(@Nullable ConfigNodePropertyBoolean fulltextMeasureEnabled) {
    this.fulltextMeasureEnabled = fulltextMeasureEnabled;
  }

  public ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties fulltextName(@Nullable ConfigNodePropertyString fulltextName) {
    this.fulltextName = fulltextName;
    return this;
  }

  /**
   * Get fulltextName
   * @return fulltextName
   */
  @Valid 
  @Schema(name = "fulltext.name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fulltext.name")
  public @Nullable ConfigNodePropertyString getFulltextName() {
    return fulltextName;
  }

  @JsonProperty("fulltext.name")
  public void setFulltextName(@Nullable ConfigNodePropertyString fulltextName) {
    this.fulltextName = fulltextName;
  }

  public ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties fulltextMaxWaitMs(@Nullable ConfigNodePropertyInteger fulltextMaxWaitMs) {
    this.fulltextMaxWaitMs = fulltextMaxWaitMs;
    return this;
  }

  /**
   * Get fulltextMaxWaitMs
   * @return fulltextMaxWaitMs
   */
  @Valid 
  @Schema(name = "fulltext.max.wait.ms", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fulltext.max.wait.ms")
  public @Nullable ConfigNodePropertyInteger getFulltextMaxWaitMs() {
    return fulltextMaxWaitMs;
  }

  @JsonProperty("fulltext.max.wait.ms")
  public void setFulltextMaxWaitMs(@Nullable ConfigNodePropertyInteger fulltextMaxWaitMs) {
    this.fulltextMaxWaitMs = fulltextMaxWaitMs;
  }

  public ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties fulltextMaxRate(@Nullable ConfigNodePropertyFloat fulltextMaxRate) {
    this.fulltextMaxRate = fulltextMaxRate;
    return this;
  }

  /**
   * Get fulltextMaxRate
   * @return fulltextMaxRate
   */
  @Valid 
  @Schema(name = "fulltext.max.rate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fulltext.max.rate")
  public @Nullable ConfigNodePropertyFloat getFulltextMaxRate() {
    return fulltextMaxRate;
  }

  @JsonProperty("fulltext.max.rate")
  public void setFulltextMaxRate(@Nullable ConfigNodePropertyFloat fulltextMaxRate) {
    this.fulltextMaxRate = fulltextMaxRate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties = (ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties) o;
    return Objects.equals(this.jmxObjectname, comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties.jmxObjectname) &&
        Objects.equals(this.propertyMeasureEnabled, comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties.propertyMeasureEnabled) &&
        Objects.equals(this.propertyName, comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties.propertyName) &&
        Objects.equals(this.propertyMaxWaitMs, comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties.propertyMaxWaitMs) &&
        Objects.equals(this.propertyMaxRate, comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties.propertyMaxRate) &&
        Objects.equals(this.fulltextMeasureEnabled, comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties.fulltextMeasureEnabled) &&
        Objects.equals(this.fulltextName, comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties.fulltextName) &&
        Objects.equals(this.fulltextMaxWaitMs, comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties.fulltextMaxWaitMs) &&
        Objects.equals(this.fulltextMaxRate, comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties.fulltextMaxRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jmxObjectname, propertyMeasureEnabled, propertyName, propertyMaxWaitMs, propertyMaxRate, fulltextMeasureEnabled, fulltextName, fulltextMaxWaitMs, fulltextMaxRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties {\n");
    sb.append("    jmxObjectname: ").append(toIndentedString(jmxObjectname)).append("\n");
    sb.append("    propertyMeasureEnabled: ").append(toIndentedString(propertyMeasureEnabled)).append("\n");
    sb.append("    propertyName: ").append(toIndentedString(propertyName)).append("\n");
    sb.append("    propertyMaxWaitMs: ").append(toIndentedString(propertyMaxWaitMs)).append("\n");
    sb.append("    propertyMaxRate: ").append(toIndentedString(propertyMaxRate)).append("\n");
    sb.append("    fulltextMeasureEnabled: ").append(toIndentedString(fulltextMeasureEnabled)).append("\n");
    sb.append("    fulltextName: ").append(toIndentedString(fulltextName)).append("\n");
    sb.append("    fulltextMaxWaitMs: ").append(toIndentedString(fulltextMaxWaitMs)).append("\n");
    sb.append("    fulltextMaxRate: ").append(toIndentedString(fulltextMaxRate)).append("\n");
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

