package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingAuthCoreImplLogoutServletProperties   {

    private ConfigNodePropertyArray slingServletMethods;
    private ConfigNodePropertyString slingServletPaths;

    /**
     * Default constructor.
     */
    public OrgApacheSlingAuthCoreImplLogoutServletProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingAuthCoreImplLogoutServletProperties.
     *
     * @param slingServletMethods slingServletMethods
     * @param slingServletPaths slingServletPaths
     */
    public OrgApacheSlingAuthCoreImplLogoutServletProperties(
        ConfigNodePropertyArray slingServletMethods, 
        ConfigNodePropertyString slingServletPaths
    ) {
        this.slingServletMethods = slingServletMethods;
        this.slingServletPaths = slingServletPaths;
    }



    /**
     * Get slingServletMethods
     * @return slingServletMethods
     */
    public ConfigNodePropertyArray getSlingServletMethods() {
        return slingServletMethods;
    }

    public void setSlingServletMethods(ConfigNodePropertyArray slingServletMethods) {
        this.slingServletMethods = slingServletMethods;
    }

    /**
     * Get slingServletPaths
     * @return slingServletPaths
     */
    public ConfigNodePropertyString getSlingServletPaths() {
        return slingServletPaths;
    }

    public void setSlingServletPaths(ConfigNodePropertyString slingServletPaths) {
        this.slingServletPaths = slingServletPaths;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingAuthCoreImplLogoutServletProperties {\n");
        
        sb.append("    slingServletMethods: ").append(toIndentedString(slingServletMethods)).append("\n");
        sb.append("    slingServletPaths: ").append(toIndentedString(slingServletPaths)).append("\n");
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

