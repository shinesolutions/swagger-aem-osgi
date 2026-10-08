package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingTenantInternalTenantProviderImplProperties   {

    private ConfigNodePropertyString tenantRoot;
    private ConfigNodePropertyArray tenantPathMatcher;

    /**
     * Default constructor.
     */
    public OrgApacheSlingTenantInternalTenantProviderImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingTenantInternalTenantProviderImplProperties.
     *
     * @param tenantRoot tenantRoot
     * @param tenantPathMatcher tenantPathMatcher
     */
    public OrgApacheSlingTenantInternalTenantProviderImplProperties(
        ConfigNodePropertyString tenantRoot, 
        ConfigNodePropertyArray tenantPathMatcher
    ) {
        this.tenantRoot = tenantRoot;
        this.tenantPathMatcher = tenantPathMatcher;
    }



    /**
     * Get tenantRoot
     * @return tenantRoot
     */
    public ConfigNodePropertyString getTenantRoot() {
        return tenantRoot;
    }

    public void setTenantRoot(ConfigNodePropertyString tenantRoot) {
        this.tenantRoot = tenantRoot;
    }

    /**
     * Get tenantPathMatcher
     * @return tenantPathMatcher
     */
    public ConfigNodePropertyArray getTenantPathMatcher() {
        return tenantPathMatcher;
    }

    public void setTenantPathMatcher(ConfigNodePropertyArray tenantPathMatcher) {
        this.tenantPathMatcher = tenantPathMatcher;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

