package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
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
 * ComDayCqDamCoreProcessMetadataProcessorProcessProperties
 */

@JsonTypeName("comDayCqDamCoreProcessMetadataProcessorProcessProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamCoreProcessMetadataProcessorProcessProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString processLabel;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean cqDamEnableSha1;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray cqDamMetadataXssprotectedProperties;

  public ComDayCqDamCoreProcessMetadataProcessorProcessProperties processLabel(@Nullable ConfigNodePropertyString processLabel) {
    this.processLabel = processLabel;
    return this;
  }

  /**
   * Get processLabel
   * @return processLabel
   */
  @Valid 
  @Schema(name = "process.label", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("process.label")
  public @Nullable ConfigNodePropertyString getProcessLabel() {
    return processLabel;
  }

  @JsonProperty("process.label")
  public void setProcessLabel(@Nullable ConfigNodePropertyString processLabel) {
    this.processLabel = processLabel;
  }

  public ComDayCqDamCoreProcessMetadataProcessorProcessProperties cqDamEnableSha1(@Nullable ConfigNodePropertyBoolean cqDamEnableSha1) {
    this.cqDamEnableSha1 = cqDamEnableSha1;
    return this;
  }

  /**
   * Get cqDamEnableSha1
   * @return cqDamEnableSha1
   */
  @Valid 
  @Schema(name = "cq.dam.enable.sha1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.dam.enable.sha1")
  public @Nullable ConfigNodePropertyBoolean getCqDamEnableSha1() {
    return cqDamEnableSha1;
  }

  @JsonProperty("cq.dam.enable.sha1")
  public void setCqDamEnableSha1(@Nullable ConfigNodePropertyBoolean cqDamEnableSha1) {
    this.cqDamEnableSha1 = cqDamEnableSha1;
  }

  public ComDayCqDamCoreProcessMetadataProcessorProcessProperties cqDamMetadataXssprotectedProperties(@Nullable ConfigNodePropertyArray cqDamMetadataXssprotectedProperties) {
    this.cqDamMetadataXssprotectedProperties = cqDamMetadataXssprotectedProperties;
    return this;
  }

  /**
   * Get cqDamMetadataXssprotectedProperties
   * @return cqDamMetadataXssprotectedProperties
   */
  @Valid 
  @Schema(name = "cq.dam.metadata.xssprotected.properties", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.dam.metadata.xssprotected.properties")
  public @Nullable ConfigNodePropertyArray getCqDamMetadataXssprotectedProperties() {
    return cqDamMetadataXssprotectedProperties;
  }

  @JsonProperty("cq.dam.metadata.xssprotected.properties")
  public void setCqDamMetadataXssprotectedProperties(@Nullable ConfigNodePropertyArray cqDamMetadataXssprotectedProperties) {
    this.cqDamMetadataXssprotectedProperties = cqDamMetadataXssprotectedProperties;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreProcessMetadataProcessorProcessProperties comDayCqDamCoreProcessMetadataProcessorProcessProperties = (ComDayCqDamCoreProcessMetadataProcessorProcessProperties) o;
    return Objects.equals(this.processLabel, comDayCqDamCoreProcessMetadataProcessorProcessProperties.processLabel) &&
        Objects.equals(this.cqDamEnableSha1, comDayCqDamCoreProcessMetadataProcessorProcessProperties.cqDamEnableSha1) &&
        Objects.equals(this.cqDamMetadataXssprotectedProperties, comDayCqDamCoreProcessMetadataProcessorProcessProperties.cqDamMetadataXssprotectedProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processLabel, cqDamEnableSha1, cqDamMetadataXssprotectedProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreProcessMetadataProcessorProcessProperties {\n");
    sb.append("    processLabel: ").append(toIndentedString(processLabel)).append("\n");
    sb.append("    cqDamEnableSha1: ").append(toIndentedString(cqDamEnableSha1)).append("\n");
    sb.append("    cqDamMetadataXssprotectedProperties: ").append(toIndentedString(cqDamMetadataXssprotectedProperties)).append("\n");
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

