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
 * ComDayCqCommonsServletsRootMappingServletProperties
 */

@JsonTypeName("comDayCqCommonsServletsRootMappingServletProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqCommonsServletsRootMappingServletProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString rootmappingTarget;

  public ComDayCqCommonsServletsRootMappingServletProperties rootmappingTarget(@Nullable ConfigNodePropertyString rootmappingTarget) {
    this.rootmappingTarget = rootmappingTarget;
    return this;
  }

  /**
   * Get rootmappingTarget
   * @return rootmappingTarget
   */
  @Valid 
  @Schema(name = "rootmapping.target", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rootmapping.target")
  public @Nullable ConfigNodePropertyString getRootmappingTarget() {
    return rootmappingTarget;
  }

  @JsonProperty("rootmapping.target")
  public void setRootmappingTarget(@Nullable ConfigNodePropertyString rootmappingTarget) {
    this.rootmappingTarget = rootmappingTarget;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqCommonsServletsRootMappingServletProperties comDayCqCommonsServletsRootMappingServletProperties = (ComDayCqCommonsServletsRootMappingServletProperties) o;
    return Objects.equals(this.rootmappingTarget, comDayCqCommonsServletsRootMappingServletProperties.rootmappingTarget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rootmappingTarget);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqCommonsServletsRootMappingServletProperties {\n");
    sb.append("    rootmappingTarget: ").append(toIndentedString(rootmappingTarget)).append("\n");
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

