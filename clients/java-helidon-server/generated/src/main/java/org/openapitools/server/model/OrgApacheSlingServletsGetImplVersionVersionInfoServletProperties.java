package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties   {

    private ConfigNodePropertyArray slingServletSelectors;
    private ConfigNodePropertyBoolean ecmaSuport;

    /**
     * Default constructor.
     */
    public OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties.
     *
     * @param slingServletSelectors slingServletSelectors
     * @param ecmaSuport ecmaSuport
     */
    public OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties(
        ConfigNodePropertyArray slingServletSelectors, 
        ConfigNodePropertyBoolean ecmaSuport
    ) {
        this.slingServletSelectors = slingServletSelectors;
        this.ecmaSuport = ecmaSuport;
    }



    /**
     * Get slingServletSelectors
     * @return slingServletSelectors
     */
    public ConfigNodePropertyArray getSlingServletSelectors() {
        return slingServletSelectors;
    }

    public void setSlingServletSelectors(ConfigNodePropertyArray slingServletSelectors) {
        this.slingServletSelectors = slingServletSelectors;
    }

    /**
     * Get ecmaSuport
     * @return ecmaSuport
     */
    public ConfigNodePropertyBoolean getEcmaSuport() {
        return ecmaSuport;
    }

    public void setEcmaSuport(ConfigNodePropertyBoolean ecmaSuport) {
        this.ecmaSuport = ecmaSuport;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties {\n");
        
        sb.append("    slingServletSelectors: ").append(toIndentedString(slingServletSelectors)).append("\n");
        sb.append("    ecmaSuport: ").append(toIndentedString(ecmaSuport)).append("\n");
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

