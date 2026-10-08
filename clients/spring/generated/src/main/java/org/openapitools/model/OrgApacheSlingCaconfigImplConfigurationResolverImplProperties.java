package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheSlingCaconfigImplConfigurationResolverImplProperties
 */

@JsonTypeName("orgApacheSlingCaconfigImplConfigurationResolverImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingCaconfigImplConfigurationResolverImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray configBucketNames;

  public OrgApacheSlingCaconfigImplConfigurationResolverImplProperties configBucketNames(@Nullable ConfigNodePropertyArray configBucketNames) {
    this.configBucketNames = configBucketNames;
    return this;
  }

  /**
   * Get configBucketNames
   * @return configBucketNames
   */
  @Valid 
  @Schema(name = "configBucketNames", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("configBucketNames")
  public @Nullable ConfigNodePropertyArray getConfigBucketNames() {
    return configBucketNames;
  }

  @JsonProperty("configBucketNames")
  public void setConfigBucketNames(@Nullable ConfigNodePropertyArray configBucketNames) {
    this.configBucketNames = configBucketNames;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingCaconfigImplConfigurationResolverImplProperties orgApacheSlingCaconfigImplConfigurationResolverImplProperties = (OrgApacheSlingCaconfigImplConfigurationResolverImplProperties) o;
    return Objects.equals(this.configBucketNames, orgApacheSlingCaconfigImplConfigurationResolverImplProperties.configBucketNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configBucketNames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingCaconfigImplConfigurationResolverImplProperties {\n");
    sb.append("    configBucketNames: ").append(toIndentedString(configBucketNames)).append("\n");
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

