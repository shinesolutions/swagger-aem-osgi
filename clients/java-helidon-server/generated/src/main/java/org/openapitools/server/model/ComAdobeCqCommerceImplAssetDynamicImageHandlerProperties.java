package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties   {

    private ConfigNodePropertyBoolean cqCommerceAssetHandlerActive;
    private ConfigNodePropertyString cqCommerceAssetHandlerName;

    /**
     * Default constructor.
     */
    public ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties.
     *
     * @param cqCommerceAssetHandlerActive cqCommerceAssetHandlerActive
     * @param cqCommerceAssetHandlerName cqCommerceAssetHandlerName
     */
    public ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties(
        ConfigNodePropertyBoolean cqCommerceAssetHandlerActive, 
        ConfigNodePropertyString cqCommerceAssetHandlerName
    ) {
        this.cqCommerceAssetHandlerActive = cqCommerceAssetHandlerActive;
        this.cqCommerceAssetHandlerName = cqCommerceAssetHandlerName;
    }



    /**
     * Get cqCommerceAssetHandlerActive
     * @return cqCommerceAssetHandlerActive
     */
    public ConfigNodePropertyBoolean getCqCommerceAssetHandlerActive() {
        return cqCommerceAssetHandlerActive;
    }

    public void setCqCommerceAssetHandlerActive(ConfigNodePropertyBoolean cqCommerceAssetHandlerActive) {
        this.cqCommerceAssetHandlerActive = cqCommerceAssetHandlerActive;
    }

    /**
     * Get cqCommerceAssetHandlerName
     * @return cqCommerceAssetHandlerName
     */
    public ConfigNodePropertyString getCqCommerceAssetHandlerName() {
        return cqCommerceAssetHandlerName;
    }

    public void setCqCommerceAssetHandlerName(ConfigNodePropertyString cqCommerceAssetHandlerName) {
        this.cqCommerceAssetHandlerName = cqCommerceAssetHandlerName;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties {\n");
        
        sb.append("    cqCommerceAssetHandlerActive: ").append(toIndentedString(cqCommerceAssetHandlerActive)).append("\n");
        sb.append("    cqCommerceAssetHandlerName: ").append(toIndentedString(cqCommerceAssetHandlerName)).append("\n");
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

