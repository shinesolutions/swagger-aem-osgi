package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCqDamCoreImplServletAssetStatusServletProperties
 */

@JsonTypeName("comDayCqDamCoreImplServletAssetStatusServletProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamCoreImplServletAssetStatusServletProperties {

  private ConfigNodePropertyInteger cqDamBatchStatusMaxassets;

  public ComDayCqDamCoreImplServletAssetStatusServletProperties cqDamBatchStatusMaxassets(ConfigNodePropertyInteger cqDamBatchStatusMaxassets) {
    this.cqDamBatchStatusMaxassets = cqDamBatchStatusMaxassets;
    return this;
  }

  /**
   * Get cqDamBatchStatusMaxassets
   * @return cqDamBatchStatusMaxassets
   */
  @Valid 
  @Schema(name = "cq.dam.batch.status.maxassets", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.dam.batch.status.maxassets")
  public ConfigNodePropertyInteger getCqDamBatchStatusMaxassets() {
    return cqDamBatchStatusMaxassets;
  }

  public void setCqDamBatchStatusMaxassets(ConfigNodePropertyInteger cqDamBatchStatusMaxassets) {
    this.cqDamBatchStatusMaxassets = cqDamBatchStatusMaxassets;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplServletAssetStatusServletProperties comDayCqDamCoreImplServletAssetStatusServletProperties = (ComDayCqDamCoreImplServletAssetStatusServletProperties) o;
    return Objects.equals(this.cqDamBatchStatusMaxassets, comDayCqDamCoreImplServletAssetStatusServletProperties.cqDamBatchStatusMaxassets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqDamBatchStatusMaxassets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplServletAssetStatusServletProperties {\n");
    sb.append("    cqDamBatchStatusMaxassets: ").append(toIndentedString(cqDamBatchStatusMaxassets)).append("\n");
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

