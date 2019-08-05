package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingTenantInternalTenantProviderImplProperties   {
  
  private @Valid ConfigNodePropertyString tenantRoot = null;
  private @Valid ConfigNodePropertyArray tenantPathMatcher = null;

  /**
   **/
  public OrgApacheSlingTenantInternalTenantProviderImplProperties tenantRoot(ConfigNodePropertyString tenantRoot) {
    this.tenantRoot = tenantRoot;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tenant.root")
  public ConfigNodePropertyString getTenantRoot() {
    return tenantRoot;
  }
  public void setTenantRoot(ConfigNodePropertyString tenantRoot) {
    this.tenantRoot = tenantRoot;
  }

  /**
   **/
  public OrgApacheSlingTenantInternalTenantProviderImplProperties tenantPathMatcher(ConfigNodePropertyArray tenantPathMatcher) {
    this.tenantPathMatcher = tenantPathMatcher;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tenant.path.matcher")
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
    return Objects.equals(tenantRoot, orgApacheSlingTenantInternalTenantProviderImplProperties.tenantRoot) &&
        Objects.equals(tenantPathMatcher, orgApacheSlingTenantInternalTenantProviderImplProperties.tenantPathMatcher);
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

