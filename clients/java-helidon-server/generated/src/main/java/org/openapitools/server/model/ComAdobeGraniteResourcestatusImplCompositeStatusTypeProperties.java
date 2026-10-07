package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties   {

    private ConfigNodePropertyString name;
    private ConfigNodePropertyArray types;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties.
     *
     * @param name name
     * @param types types
     */
    public ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties(
        ConfigNodePropertyString name, 
        ConfigNodePropertyArray types
    ) {
        this.name = name;
        this.types = types;
    }



    /**
     * Get name
     * @return name
     */
    public ConfigNodePropertyString getName() {
        return name;
    }

    public void setName(ConfigNodePropertyString name) {
        this.name = name;
    }

    /**
     * Get types
     * @return types
     */
    public ConfigNodePropertyArray getTypes() {
        return types;
    }

    public void setTypes(ConfigNodePropertyArray types) {
        this.types = types;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    types: ").append(toIndentedString(types)).append("\n");
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

