package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqDamDmProcessImagePTiffManagerImplProperties   {

    private ConfigNodePropertyInteger maxMemory;

    /**
     * Default constructor.
     */
    public ComAdobeCqDamDmProcessImagePTiffManagerImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqDamDmProcessImagePTiffManagerImplProperties.
     *
     * @param maxMemory maxMemory
     */
    public ComAdobeCqDamDmProcessImagePTiffManagerImplProperties(
        ConfigNodePropertyInteger maxMemory
    ) {
        this.maxMemory = maxMemory;
    }



    /**
     * Get maxMemory
     * @return maxMemory
     */
    public ConfigNodePropertyInteger getMaxMemory() {
        return maxMemory;
    }

    public void setMaxMemory(ConfigNodePropertyInteger maxMemory) {
        this.maxMemory = maxMemory;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqDamDmProcessImagePTiffManagerImplProperties {\n");
        
        sb.append("    maxMemory: ").append(toIndentedString(maxMemory)).append("\n");
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

