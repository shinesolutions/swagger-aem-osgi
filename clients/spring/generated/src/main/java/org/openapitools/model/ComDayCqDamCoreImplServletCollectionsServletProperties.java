package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.springframework.lang.Nullable;
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
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamCoreImplServletCollectionsServletProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray cqDamBatchCollectionsProperties;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger cqDamBatchCollectionsLimit;

  public ComDayCqDamCoreImplServletCollectionsServletProperties cqDamBatchCollectionsProperties(@Nullable ConfigNodePropertyArray cqDamBatchCollectionsProperties) {
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
  public @Nullable ConfigNodePropertyArray getCqDamBatchCollectionsProperties() {
    return cqDamBatchCollectionsProperties;
  }

  @JsonProperty("cq.dam.batch.collections.properties")
  public void setCqDamBatchCollectionsProperties(@Nullable ConfigNodePropertyArray cqDamBatchCollectionsProperties) {
    this.cqDamBatchCollectionsProperties = cqDamBatchCollectionsProperties;
  }

  public ComDayCqDamCoreImplServletCollectionsServletProperties cqDamBatchCollectionsLimit(@Nullable ConfigNodePropertyInteger cqDamBatchCollectionsLimit) {
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
  public @Nullable ConfigNodePropertyInteger getCqDamBatchCollectionsLimit() {
    return cqDamBatchCollectionsLimit;
  }

  @JsonProperty("cq.dam.batch.collections.limit")
  public void setCqDamBatchCollectionsLimit(@Nullable ConfigNodePropertyInteger cqDamBatchCollectionsLimit) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

