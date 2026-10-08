package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties   {

    private ConfigNodePropertyBoolean logStacktraceOnclose;

    /**
     * Default constructor.
     */
    public OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties.
     *
     * @param logStacktraceOnclose logStacktraceOnclose
     */
    public OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties(
        ConfigNodePropertyBoolean logStacktraceOnclose
    ) {
        this.logStacktraceOnclose = logStacktraceOnclose;
    }



    /**
     * Get logStacktraceOnclose
     * @return logStacktraceOnclose
     */
    public ConfigNodePropertyBoolean getLogStacktraceOnclose() {
        return logStacktraceOnclose;
    }

    public void setLogStacktraceOnclose(ConfigNodePropertyBoolean logStacktraceOnclose) {
        this.logStacktraceOnclose = logStacktraceOnclose;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties {\n");
        
        sb.append("    logStacktraceOnclose: ").append(toIndentedString(logStacktraceOnclose)).append("\n");
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

