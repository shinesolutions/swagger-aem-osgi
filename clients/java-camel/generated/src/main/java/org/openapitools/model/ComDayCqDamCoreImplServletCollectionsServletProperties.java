package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCqDamCoreImplServletCollectionsServletProperties
 */

@JsonTypeName("comDayCqDamCoreImplServletCollectionsServletProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamCoreImplServletCollectionsServletProperties {

  private ConfigNodePropertyArray cqDamBatchCollectionsProperties;

  private ConfigNodePropertyInteger cqDamBatchCollectionsLimit;

  public ComDayCqDamCoreImplServletCollectionsServletProperties cqDamBatchCollectionsProperties(ConfigNodePropertyArray cqDamBatchCollectionsProperties) {
    this.cqDamBatchCollectionsProperties = cqDamBatchCollectionsProperties;
    return this;
  }

  /**
   * Get cqDamBatchCollectionsProperties
   * @return cqDamBatchCollectionsProperties
   */
  @Valid 
  @Schema(name = "cq.dam.batch.collections.properties", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.dam.batch.collections.properties")
  public ConfigNodePropertyArray getCqDamBatchCollectionsProperties() {
    return cqDamBatchCollectionsProperties;
  }

  public void setCqDamBatchCollectionsProperties(ConfigNodePropertyArray cqDamBatchCollectionsProperties) {
    this.cqDamBatchCollectionsProperties = cqDamBatchCollectionsProperties;
  }

  public ComDayCqDamCoreImplServletCollectionsServletProperties cqDamBatchCollectionsLimit(ConfigNodePropertyInteger cqDamBatchCollectionsLimit) {
    this.cqDamBatchCollectionsLimit = cqDamBatchCollectionsLimit;
    return this;
  }

  /**
   * Get cqDamBatchCollectionsLimit
   * @return cqDamBatchCollectionsLimit
   */
  @Valid 
  @Schema(name = "cq.dam.batch.collections.limit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.dam.batch.collections.limit")
  public ConfigNodePropertyInteger getCqDamBatchCollectionsLimit() {
    return cqDamBatchCollectionsLimit;
  }

  public void setCqDamBatchCollectionsLimit(ConfigNodePropertyInteger cqDamBatchCollectionsLimit) {
    this.cqDamBatchCollectionsLimit = cqDamBatchCollectionsLimit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplServletCollectionsServletProperties comDayCqDamCoreImplServletCollectionsServletProperties = (ComDayCqDamCoreImplServletCollectionsServletProperties) o;
    return Objects.equals(this.cqDamBatchCollectionsProperties, comDayCqDamCoreImplServletCollectionsServletProperties.cqDamBatchCollectionsProperties) &&
        Objects.equals(this.cqDamBatchCollectionsLimit, comDayCqDamCoreImplServletCollectionsServletProperties.cqDamBatchCollectionsLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqDamBatchCollectionsProperties, cqDamBatchCollectionsLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplServletCollectionsServletProperties {\n");
    sb.append("    cqDamBatchCollectionsProperties: ").append(toIndentedString(cqDamBatchCollectionsProperties)).append("\n");
    sb.append("    cqDamBatchCollectionsLimit: ").append(toIndentedString(cqDamBatchCollectionsLimit)).append("\n");
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

