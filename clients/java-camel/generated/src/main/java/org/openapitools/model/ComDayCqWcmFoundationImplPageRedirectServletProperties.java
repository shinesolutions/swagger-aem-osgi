package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCqWcmFoundationImplPageRedirectServletProperties
 */

@JsonTypeName("comDayCqWcmFoundationImplPageRedirectServletProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmFoundationImplPageRedirectServletProperties {

  private ConfigNodePropertyArray excludedResourceTypes;

  public ComDayCqWcmFoundationImplPageRedirectServletProperties excludedResourceTypes(ConfigNodePropertyArray excludedResourceTypes) {
    this.excludedResourceTypes = excludedResourceTypes;
    return this;
  }

  /**
   * Get excludedResourceTypes
   * @return excludedResourceTypes
   */
  @Valid 
  @Schema(name = "excluded.resource.types", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("excluded.resource.types")
  public ConfigNodePropertyArray getExcludedResourceTypes() {
    return excludedResourceTypes;
  }

  public void setExcludedResourceTypes(ConfigNodePropertyArray excludedResourceTypes) {
    this.excludedResourceTypes = excludedResourceTypes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmFoundationImplPageRedirectServletProperties comDayCqWcmFoundationImplPageRedirectServletProperties = (ComDayCqWcmFoundationImplPageRedirectServletProperties) o;
    return Objects.equals(this.excludedResourceTypes, comDayCqWcmFoundationImplPageRedirectServletProperties.excludedResourceTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(excludedResourceTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmFoundationImplPageRedirectServletProperties {\n");
    sb.append("    excludedResourceTypes: ").append(toIndentedString(excludedResourceTypes)).append("\n");
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

