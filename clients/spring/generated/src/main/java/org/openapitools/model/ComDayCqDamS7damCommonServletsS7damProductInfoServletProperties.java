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
 * ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties
 */

@JsonTypeName("comDayCqDamS7damCommonServletsS7damProductInfoServletProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString slingServletPaths;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString slingServletMethods;

  public ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties slingServletPaths(@Nullable ConfigNodePropertyString slingServletPaths) {
    this.slingServletPaths = slingServletPaths;
    return this;
  }

  /**
   * Get slingServletPaths
   * @return slingServletPaths
   */
  @Valid 
  @Schema(name = "sling.servlet.paths", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sling.servlet.paths")
  public @Nullable ConfigNodePropertyString getSlingServletPaths() {
    return slingServletPaths;
  }

  @JsonProperty("sling.servlet.paths")
  public void setSlingServletPaths(@Nullable ConfigNodePropertyString slingServletPaths) {
    this.slingServletPaths = slingServletPaths;
  }

  public ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties slingServletMethods(@Nullable ConfigNodePropertyString slingServletMethods) {
    this.slingServletMethods = slingServletMethods;
    return this;
  }

  /**
   * Get slingServletMethods
   * @return slingServletMethods
   */
  @Valid 
  @Schema(name = "sling.servlet.methods", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sling.servlet.methods")
  public @Nullable ConfigNodePropertyString getSlingServletMethods() {
    return slingServletMethods;
  }

  @JsonProperty("sling.servlet.methods")
  public void setSlingServletMethods(@Nullable ConfigNodePropertyString slingServletMethods) {
    this.slingServletMethods = slingServletMethods;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties comDayCqDamS7damCommonServletsS7damProductInfoServletProperties = (ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties) o;
    return Objects.equals(this.slingServletPaths, comDayCqDamS7damCommonServletsS7damProductInfoServletProperties.slingServletPaths) &&
        Objects.equals(this.slingServletMethods, comDayCqDamS7damCommonServletsS7damProductInfoServletProperties.slingServletMethods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slingServletPaths, slingServletMethods);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties {\n");
    sb.append("    slingServletPaths: ").append(toIndentedString(slingServletPaths)).append("\n");
    sb.append("    slingServletMethods: ").append(toIndentedString(slingServletMethods)).append("\n");
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

