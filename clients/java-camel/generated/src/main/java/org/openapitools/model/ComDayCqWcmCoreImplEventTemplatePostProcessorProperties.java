package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyString;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCqWcmCoreImplEventTemplatePostProcessorProperties
 */

@JsonTypeName("comDayCqWcmCoreImplEventTemplatePostProcessorProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmCoreImplEventTemplatePostProcessorProperties {

  private ConfigNodePropertyString paths;

  public ComDayCqWcmCoreImplEventTemplatePostProcessorProperties paths(ConfigNodePropertyString paths) {
    this.paths = paths;
    return this;
  }

  /**
   * Get paths
   * @return paths
   */
  @Valid 
  @Schema(name = "paths", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paths")
  public ConfigNodePropertyString getPaths() {
    return paths;
  }

  public void setPaths(ConfigNodePropertyString paths) {
    this.paths = paths;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreImplEventTemplatePostProcessorProperties comDayCqWcmCoreImplEventTemplatePostProcessorProperties = (ComDayCqWcmCoreImplEventTemplatePostProcessorProperties) o;
    return Objects.equals(this.paths, comDayCqWcmCoreImplEventTemplatePostProcessorProperties.paths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paths);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplEventTemplatePostProcessorProperties {\n");
    sb.append("    paths: ").append(toIndentedString(paths)).append("\n");
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

