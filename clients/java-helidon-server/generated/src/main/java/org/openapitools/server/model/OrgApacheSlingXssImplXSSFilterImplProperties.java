package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingXssImplXSSFilterImplProperties   {

    private ConfigNodePropertyString policyPath;

    /**
     * Default constructor.
     */
    public OrgApacheSlingXssImplXSSFilterImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingXssImplXSSFilterImplProperties.
     *
     * @param policyPath policyPath
     */
    public OrgApacheSlingXssImplXSSFilterImplProperties(
        ConfigNodePropertyString policyPath
    ) {
        this.policyPath = policyPath;
    }



    /**
     * Get policyPath
     * @return policyPath
     */
    public ConfigNodePropertyString getPolicyPath() {
        return policyPath;
    }

    public void setPolicyPath(ConfigNodePropertyString policyPath) {
        this.policyPath = policyPath;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingXssImplXSSFilterImplProperties {\n");
        
        sb.append("    policyPath: ").append(toIndentedString(policyPath)).append("\n");
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

