package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties   {

    private ConfigNodePropertyArray orgApacheSlingScriptingSightlyJsBindings;

    /**
     * Default constructor.
     */
    public OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties.
     *
     * @param orgApacheSlingScriptingSightlyJsBindings orgApacheSlingScriptingSightlyJsBindings
     */
    public OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties(
        ConfigNodePropertyArray orgApacheSlingScriptingSightlyJsBindings
    ) {
        this.orgApacheSlingScriptingSightlyJsBindings = orgApacheSlingScriptingSightlyJsBindings;
    }



    /**
     * Get orgApacheSlingScriptingSightlyJsBindings
     * @return orgApacheSlingScriptingSightlyJsBindings
     */
    public ConfigNodePropertyArray getOrgApacheSlingScriptingSightlyJsBindings() {
        return orgApacheSlingScriptingSightlyJsBindings;
    }

    public void setOrgApacheSlingScriptingSightlyJsBindings(ConfigNodePropertyArray orgApacheSlingScriptingSightlyJsBindings) {
        this.orgApacheSlingScriptingSightlyJsBindings = orgApacheSlingScriptingSightlyJsBindings;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties {\n");
        
        sb.append("    orgApacheSlingScriptingSightlyJsBindings: ").append(toIndentedString(orgApacheSlingScriptingSightlyJsBindings)).append("\n");
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

