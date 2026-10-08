package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamCoreImplRenditionMakerImplProperties   {

    private ConfigNodePropertyBoolean xmpPropagate;
    private ConfigNodePropertyArray xmpExcludes;

    /**
     * Default constructor.
     */
    public ComDayCqDamCoreImplRenditionMakerImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamCoreImplRenditionMakerImplProperties.
     *
     * @param xmpPropagate xmpPropagate
     * @param xmpExcludes xmpExcludes
     */
    public ComDayCqDamCoreImplRenditionMakerImplProperties(
        ConfigNodePropertyBoolean xmpPropagate, 
        ConfigNodePropertyArray xmpExcludes
    ) {
        this.xmpPropagate = xmpPropagate;
        this.xmpExcludes = xmpExcludes;
    }



    /**
     * Get xmpPropagate
     * @return xmpPropagate
     */
    public ConfigNodePropertyBoolean getXmpPropagate() {
        return xmpPropagate;
    }

    public void setXmpPropagate(ConfigNodePropertyBoolean xmpPropagate) {
        this.xmpPropagate = xmpPropagate;
    }

    /**
     * Get xmpExcludes
     * @return xmpExcludes
     */
    public ConfigNodePropertyArray getXmpExcludes() {
        return xmpExcludes;
    }

    public void setXmpExcludes(ConfigNodePropertyArray xmpExcludes) {
        this.xmpExcludes = xmpExcludes;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamCoreImplRenditionMakerImplProperties {\n");
        
        sb.append("    xmpPropagate: ").append(toIndentedString(xmpPropagate)).append("\n");
        sb.append("    xmpExcludes: ").append(toIndentedString(xmpExcludes)).append("\n");
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

