package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties   {

    private ConfigNodePropertyInteger size;

    /**
     * Default constructor.
     */
    public ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties.
     *
     * @param size size
     */
    public ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties(
        ConfigNodePropertyInteger size
    ) {
        this.size = size;
    }



    /**
     * Get size
     * @return size
     */
    public ConfigNodePropertyInteger getSize() {
        return size;
    }

    public void setSize(ConfigNodePropertyInteger size) {
        this.size = size;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties {\n");
        
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

