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
 * OrgApacheSlingEventImplEventingThreadPoolProperties
 */

@JsonTypeName("orgApacheSlingEventImplEventingThreadPoolProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingEventImplEventingThreadPoolProperties {

  private ConfigNodePropertyInteger minPoolSize;

  public OrgApacheSlingEventImplEventingThreadPoolProperties minPoolSize(ConfigNodePropertyInteger minPoolSize) {
    this.minPoolSize = minPoolSize;
    return this;
  }

  /**
   * Get minPoolSize
   * @return minPoolSize
   */
  @Valid 
  @Schema(name = "minPoolSize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minPoolSize")
  public ConfigNodePropertyInteger getMinPoolSize() {
    return minPoolSize;
  }

  public void setMinPoolSize(ConfigNodePropertyInteger minPoolSize) {
    this.minPoolSize = minPoolSize;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingEventImplEventingThreadPoolProperties orgApacheSlingEventImplEventingThreadPoolProperties = (OrgApacheSlingEventImplEventingThreadPoolProperties) o;
    return Objects.equals(this.minPoolSize, orgApacheSlingEventImplEventingThreadPoolProperties.minPoolSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minPoolSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingEventImplEventingThreadPoolProperties {\n");
    sb.append("    minPoolSize: ").append(toIndentedString(minPoolSize)).append("\n");
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

