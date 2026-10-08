package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties   {

    private ConfigNodePropertyArray mimetype;

    /**
     * Default constructor.
     */
    public ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties.
     *
     * @param mimetype mimetype
     */
    public ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties(
        ConfigNodePropertyArray mimetype
    ) {
        this.mimetype = mimetype;
    }



    /**
     * Get mimetype
     * @return mimetype
     */
    public ConfigNodePropertyArray getMimetype() {
        return mimetype;
    }

    public void setMimetype(ConfigNodePropertyArray mimetype) {
        this.mimetype = mimetype;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties {\n");
        
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

