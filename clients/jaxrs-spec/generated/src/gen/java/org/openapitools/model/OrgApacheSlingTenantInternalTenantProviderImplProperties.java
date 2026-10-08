package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("orgApacheSlingTenantInternalTenantProviderImplProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingTenantInternalTenantProviderImplProperties   {
  private ConfigNodePropertyString tenantRoot;
  private ConfigNodePropertyArray tenantPathMatcher;

  public OrgApacheSlingTenantInternalTenantProviderImplProperties() {
  }

  /**
   **/
  public OrgApacheSlingTenantInternalTenantProviderImplProperties tenantRoot(ConfigNodePropertyString tenantRoot) {
    this.tenantRoot = tenantRoot;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tenant.root")
  @Valid public ConfigNodePropertyString getTenantRoot() {
    return tenantRoot;
  }

  @JsonProperty("tenant.root")
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
  @Valid public ConfigNodePropertyArray getTenantPathMatcher() {
    return tenantPathMatcher;
  }

  @JsonProperty("tenant.path.matcher")
  public void setTenantPathMatcher(ConfigNodePropertyArray tenantPathMatcher) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
