package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamHandlerStandardPsPostScriptHandlerProperties   {

    private ConfigNodePropertyBoolean rasterAnnotation;

    /**
     * Default constructor.
     */
    public ComDayCqDamHandlerStandardPsPostScriptHandlerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamHandlerStandardPsPostScriptHandlerProperties.
     *
     * @param rasterAnnotation rasterAnnotation
     */
    public ComDayCqDamHandlerStandardPsPostScriptHandlerProperties(
        ConfigNodePropertyBoolean rasterAnnotation
    ) {
        this.rasterAnnotation = rasterAnnotation;
    }



    /**
     * Get rasterAnnotation
     * @return rasterAnnotation
     */
    public ConfigNodePropertyBoolean getRasterAnnotation() {
        return rasterAnnotation;
    }

    public void setRasterAnnotation(ConfigNodePropertyBoolean rasterAnnotation) {
        this.rasterAnnotation = rasterAnnotation;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamHandlerStandardPsPostScriptHandlerProperties {\n");
        
        sb.append("    rasterAnnotation: ").append(toIndentedString(rasterAnnotation)).append("\n");
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

