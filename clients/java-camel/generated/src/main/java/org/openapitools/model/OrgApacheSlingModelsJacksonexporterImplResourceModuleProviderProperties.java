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
 * OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties
 */

@JsonTypeName("orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties {

  private ConfigNodePropertyInteger maxRecursionLevels;

  public OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties maxRecursionLevels(ConfigNodePropertyInteger maxRecursionLevels) {
    this.maxRecursionLevels = maxRecursionLevels;
    return this;
  }

  /**
   * Get maxRecursionLevels
   * @return maxRecursionLevels
   */
  @Valid 
  @Schema(name = "max.recursion.levels", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("max.recursion.levels")
  public ConfigNodePropertyInteger getMaxRecursionLevels() {
    return maxRecursionLevels;
  }

  public void setMaxRecursionLevels(ConfigNodePropertyInteger maxRecursionLevels) {
    this.maxRecursionLevels = maxRecursionLevels;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties = (OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties) o;
    return Objects.equals(this.maxRecursionLevels, orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties.maxRecursionLevels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxRecursionLevels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties {\n");
    sb.append("    maxRecursionLevels: ").append(toIndentedString(maxRecursionLevels)).append("\n");
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

