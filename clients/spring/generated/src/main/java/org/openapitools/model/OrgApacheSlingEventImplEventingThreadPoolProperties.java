package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * OrgApacheSlingEventImplEventingThreadPoolProperties
 */

@JsonTypeName("orgApacheSlingEventImplEventingThreadPoolProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingEventImplEventingThreadPoolProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger minPoolSize;

  public OrgApacheSlingEventImplEventingThreadPoolProperties minPoolSize(@Nullable ConfigNodePropertyInteger minPoolSize) {
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
  public @Nullable ConfigNodePropertyInteger getMinPoolSize() {
    return minPoolSize;
  }

  @JsonProperty("minPoolSize")
  public void setMinPoolSize(@Nullable ConfigNodePropertyInteger minPoolSize) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

