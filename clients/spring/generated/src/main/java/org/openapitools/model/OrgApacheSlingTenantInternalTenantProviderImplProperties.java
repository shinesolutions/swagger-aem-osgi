package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OrgApacheSlingTenantInternalTenantProviderImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class OrgApacheSlingTenantInternalTenantProviderImplProperties   {
  @JsonProperty("tenant.root")
  private ConfigNodePropertyString tenantRoot = null;

  @JsonProperty("tenant.path.matcher")
  private ConfigNodePropertyArray tenantPathMatcher = null;

  public OrgApacheSlingTenantInternalTenantProviderImplProperties tenantRoot(ConfigNodePropertyString tenantRoot) {
    this.tenantRoot = tenantRoot;
    return this;
  }

  /**
   * Get tenantRoot
   * @return tenantRoot
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getTenantRoot() {
    return tenantRoot;
  }

  public void setTenantRoot(ConfigNodePropertyString tenantRoot) {
    this.tenantRoot = tenantRoot;
  }

  public OrgApacheSlingTenantInternalTenantProviderImplProperties tenantPathMatcher(ConfigNodePropertyArray tenantPathMatcher) {
    this.tenantPathMatcher = tenantPathMatcher;
    return this;
  }

  /**
   * Get tenantPathMatcher
   * @return tenantPathMatcher
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyArray getTenantPathMatcher() {
    return tenantPathMatcher;
  }

  public void setTenantPathMatcher(ConfigNodePropertyArray tenantPathMatcher) {
    this.tenantPathMatcher = tenantPathMatcher;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

