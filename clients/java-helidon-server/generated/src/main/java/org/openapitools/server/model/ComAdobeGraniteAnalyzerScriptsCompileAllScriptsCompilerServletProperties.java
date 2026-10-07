package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties   {

    private ConfigNodePropertyBoolean disabled;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties.
     *
     * @param disabled disabled
     */
    public ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties(
        ConfigNodePropertyBoolean disabled
    ) {
        this.disabled = disabled;
    }



    /**
     * Get disabled
     * @return disabled
     */
    public ConfigNodePropertyBoolean getDisabled() {
        return disabled;
    }

    public void setDisabled(ConfigNodePropertyBoolean disabled) {
        this.disabled = disabled;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties {\n");
        
        sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
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

