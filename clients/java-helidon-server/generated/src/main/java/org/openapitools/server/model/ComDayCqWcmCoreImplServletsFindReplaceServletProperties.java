package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWcmCoreImplServletsFindReplaceServletProperties   {

    private ConfigNodePropertyArray scope;

    /**
     * Default constructor.
     */
    public ComDayCqWcmCoreImplServletsFindReplaceServletProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWcmCoreImplServletsFindReplaceServletProperties.
     *
     * @param scope scope
     */
    public ComDayCqWcmCoreImplServletsFindReplaceServletProperties(
        ConfigNodePropertyArray scope
    ) {
        this.scope = scope;
    }



    /**
     * Get scope
     * @return scope
     */
    public ConfigNodePropertyArray getScope() {
        return scope;
    }

    public void setScope(ConfigNodePropertyArray scope) {
        this.scope = scope;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqWcmCoreImplServletsFindReplaceServletProperties {\n");
        
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

