package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties   {

    private ConfigNodePropertyString mimetype;

    /**
     * Default constructor.
     */
    public ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties.
     *
     * @param mimetype mimetype
     */
    public ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties(
        ConfigNodePropertyString mimetype
    ) {
        this.mimetype = mimetype;
    }



    /**
     * Get mimetype
     * @return mimetype
     */
    public ConfigNodePropertyString getMimetype() {
        return mimetype;
    }

    public void setMimetype(ConfigNodePropertyString mimetype) {
        this.mimetype = mimetype;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties {\n");
        
        sb.append("    mimetype: ").append(toIndentedString(mimetype)).append("\n");
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

