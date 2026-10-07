package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties   {

    private ConfigNodePropertyBoolean enableFallback;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties.
     *
     * @param enableFallback enableFallback
     */
    public ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties(
        ConfigNodePropertyBoolean enableFallback
    ) {
        this.enableFallback = enableFallback;
    }



    /**
     * Get enableFallback
     * @return enableFallback
     */
    public ConfigNodePropertyBoolean getEnableFallback() {
        return enableFallback;
    }

    public void setEnableFallback(ConfigNodePropertyBoolean enableFallback) {
        this.enableFallback = enableFallback;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties {\n");
        
        sb.append("    enableFallback: ").append(toIndentedString(enableFallback)).append("\n");
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

