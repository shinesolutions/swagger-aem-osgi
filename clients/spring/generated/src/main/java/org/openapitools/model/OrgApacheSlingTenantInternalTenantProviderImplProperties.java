package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
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
 * OrgApacheSlingTenantInternalTenantProviderImplProperties
 */

@JsonTypeName("orgApacheSlingTenantInternalTenantProviderImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingTenantInternalTenantProviderImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString tenantRoot;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray tenantPathMatcher;

  public OrgApacheSlingTenantInternalTenantProviderImplProperties tenantRoot(@Nullable ConfigNodePropertyString tenantRoot) {
    this.tenantRoot = tenantRoot;
    return this;
  }

  /**
   * Get tenantRoot
   * @return tenantRoot
   */
  @Valid 
  @Schema(name = "tenant.root", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tenant.root")
  public @Nullable ConfigNodePropertyString getTenantRoot() {
    return tenantRoot;
  }

  @JsonProperty("tenant.root")
  public void setTenantRoot(@Nullable ConfigNodePropertyString tenantRoot) {
    this.tenantRoot = tenantRoot;
  }

  public OrgApacheSlingTenantInternalTenantProviderImplProperties tenantPathMatcher(@Nullable ConfigNodePropertyArray tenantPathMatcher) {
    this.tenantPathMatcher = tenantPathMatcher;
    return this;
  }

  /**
   * Get tenantPathMatcher
   * @return tenantPathMatcher
   */
  @Valid 
  @Schema(name = "tenant.path.matcher", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tenant.path.matcher")
  public @Nullable ConfigNodePropertyArray getTenantPathMatcher() {
    return tenantPathMatcher;
  }

  @JsonProperty("tenant.path.matcher")
  public void setTenantPathMatcher(@Nullable ConfigNodePropertyArray tenantPathMatcher) {
    this.tenantPathMatcher = tenantPathMatcher;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingTenantInternalTenantProviderImplProperties orgApacheSlingTenantInternalTenantProviderImplProperties = (OrgApacheSlingTenantInternalTenantProviderImplProperties) o;
    return Objects.equals(this.tenantRoot, orgApacheSlingTenantInternalTenantProviderImplProperties.tenantRoot) &&
        Objects.equals(this.tenantPathMatcher, orgApacheSlingTenantInternalTenantProviderImplProperties.tenantPathMatcher);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantRoot, tenantPathMatcher);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingTenantInternalTenantProviderImplProperties {\n");
    sb.append("    tenantRoot: ").append(toIndentedString(tenantRoot)).append("\n");
    sb.append("    tenantPathMatcher: ").append(toIndentedString(tenantPathMatcher)).append("\n");
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

