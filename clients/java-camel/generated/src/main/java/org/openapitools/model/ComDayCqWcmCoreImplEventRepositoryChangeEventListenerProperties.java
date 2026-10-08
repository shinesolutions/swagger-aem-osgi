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
 * ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties
 */

@JsonTypeName("comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties {

  private ConfigNodePropertyArray paths;

  private ConfigNodePropertyArray excludedPaths;

  public ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties paths(ConfigNodePropertyArray paths) {
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
  public ConfigNodePropertyArray getPaths() {
    return paths;
  }

  public void setPaths(ConfigNodePropertyArray paths) {
    this.paths = paths;
  }

  public ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties excludedPaths(ConfigNodePropertyArray excludedPaths) {
    this.excludedPaths = excludedPaths;
    return this;
  }

  /**
   * Get excludedPaths
   * @return excludedPaths
   */
  @Valid 
  @Schema(name = "excludedPaths", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("excludedPaths")
  public ConfigNodePropertyArray getExcludedPaths() {
    return excludedPaths;
  }

  public void setExcludedPaths(ConfigNodePropertyArray excludedPaths) {
    this.excludedPaths = excludedPaths;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties = (ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties) o;
    return Objects.equals(this.paths, comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties.paths) &&
        Objects.equals(this.excludedPaths, comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties.excludedPaths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paths, excludedPaths);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties {\n");
    sb.append("    paths: ").append(toIndentedString(paths)).append("\n");
    sb.append("    excludedPaths: ").append(toIndentedString(excludedPaths)).append("\n");
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

