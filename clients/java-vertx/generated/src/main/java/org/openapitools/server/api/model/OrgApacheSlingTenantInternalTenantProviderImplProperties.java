package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheSlingTenantInternalTenantProviderImplProperties   {
  
  private ConfigNodePropertyString tenantRoot = null;
  private ConfigNodePropertyArray tenantPathMatcher = null;

  public OrgApacheSlingTenantInternalTenantProviderImplProperties () {

  }

  public OrgApacheSlingTenantInternalTenantProviderImplProperties (ConfigNodePropertyString tenantRoot, ConfigNodePropertyArray tenantPathMatcher) {
    this.tenantRoot = tenantRoot;
    this.tenantPathMatcher = tenantPathMatcher;
  }

    
  @JsonProperty("tenant.root")
  public ConfigNodePropertyString getTenantRoot() {
    return tenantRoot;
  }
  public void setTenantRoot(ConfigNodePropertyString tenantRoot) {
    this.tenantRoot = tenantRoot;
  }

    
  @JsonProperty("tenant.path.matcher")
  public ConfigNodePropertyArray getTenantPathMatcher() {
    return tenantPathMatcher;
  }
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
