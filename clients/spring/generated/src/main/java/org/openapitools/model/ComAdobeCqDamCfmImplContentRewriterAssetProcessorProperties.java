package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties
 */

@JsonTypeName("comAdobeCqDamCfmImplContentRewriterAssetProcessorProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString pipelineType;

  public ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties pipelineType(@Nullable ConfigNodePropertyString pipelineType) {
    this.pipelineType = pipelineType;
    return this;
  }

  /**
   * Get pipelineType
   * @return pipelineType
   */
  @Valid 
  @Schema(name = "pipeline.type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pipeline.type")
  public @Nullable ConfigNodePropertyString getPipelineType() {
    return pipelineType;
  }

  @JsonProperty("pipeline.type")
  public void setPipelineType(@Nullable ConfigNodePropertyString pipelineType) {
    this.pipelineType = pipelineType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties comAdobeCqDamCfmImplContentRewriterAssetProcessorProperties = (ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties) o;
    return Objects.equals(this.pipelineType, comAdobeCqDamCfmImplContentRewriterAssetProcessorProperties.pipelineType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pipelineType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties {\n");
    sb.append("    pipelineType: ").append(toIndentedString(pipelineType)).append("\n");
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

