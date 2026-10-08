package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties   {

    private ConfigNodePropertyArray xmphandlerCqFormats;

    /**
     * Default constructor.
     */
    public ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties.
     *
     * @param xmphandlerCqFormats xmphandlerCqFormats
     */
    public ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties(
        ConfigNodePropertyArray xmphandlerCqFormats
    ) {
        this.xmphandlerCqFormats = xmphandlerCqFormats;
    }



    /**
     * Get xmphandlerCqFormats
     * @return xmphandlerCqFormats
     */
    public ConfigNodePropertyArray getXmphandlerCqFormats() {
        return xmphandlerCqFormats;
    }

    public void setXmphandlerCqFormats(ConfigNodePropertyArray xmphandlerCqFormats) {
        this.xmphandlerCqFormats = xmphandlerCqFormats;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties {\n");
        
        sb.append("    xmphandlerCqFormats: ").append(toIndentedString(xmphandlerCqFormats)).append("\n");
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

