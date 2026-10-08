package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties   {

    private ConfigNodePropertyInteger orgApacheSlingScriptingJavascriptRhinoOptLevel;

    /**
     * Default constructor.
     */
    public OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties.
     *
     * @param orgApacheSlingScriptingJavascriptRhinoOptLevel orgApacheSlingScriptingJavascriptRhinoOptLevel
     */
    public OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties(
        ConfigNodePropertyInteger orgApacheSlingScriptingJavascriptRhinoOptLevel
    ) {
        this.orgApacheSlingScriptingJavascriptRhinoOptLevel = orgApacheSlingScriptingJavascriptRhinoOptLevel;
    }



    /**
     * Get orgApacheSlingScriptingJavascriptRhinoOptLevel
     * @return orgApacheSlingScriptingJavascriptRhinoOptLevel
     */
    public ConfigNodePropertyInteger getOrgApacheSlingScriptingJavascriptRhinoOptLevel() {
        return orgApacheSlingScriptingJavascriptRhinoOptLevel;
    }

    public void setOrgApacheSlingScriptingJavascriptRhinoOptLevel(ConfigNodePropertyInteger orgApacheSlingScriptingJavascriptRhinoOptLevel) {
        this.orgApacheSlingScriptingJavascriptRhinoOptLevel = orgApacheSlingScriptingJavascriptRhinoOptLevel;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties {\n");
        
        sb.append("    orgApacheSlingScriptingJavascriptRhinoOptLevel: ").append(toIndentedString(orgApacheSlingScriptingJavascriptRhinoOptLevel)).append("\n");
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

