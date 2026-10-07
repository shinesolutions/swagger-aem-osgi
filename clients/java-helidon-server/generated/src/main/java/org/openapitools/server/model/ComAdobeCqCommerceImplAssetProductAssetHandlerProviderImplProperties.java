package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties   {

    private ConfigNodePropertyString cqCommerceAssetHandlerFallback;

    /**
     * Default constructor.
     */
    public ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties.
     *
     * @param cqCommerceAssetHandlerFallback cqCommerceAssetHandlerFallback
     */
    public ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties(
        ConfigNodePropertyString cqCommerceAssetHandlerFallback
    ) {
        this.cqCommerceAssetHandlerFallback = cqCommerceAssetHandlerFallback;
    }



    /**
     * Get cqCommerceAssetHandlerFallback
     * @return cqCommerceAssetHandlerFallback
     */
    public ConfigNodePropertyString getCqCommerceAssetHandlerFallback() {
        return cqCommerceAssetHandlerFallback;
    }

    public void setCqCommerceAssetHandlerFallback(ConfigNodePropertyString cqCommerceAssetHandlerFallback) {
        this.cqCommerceAssetHandlerFallback = cqCommerceAssetHandlerFallback;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties {\n");
        
        sb.append("    cqCommerceAssetHandlerFallback: ").append(toIndentedString(cqCommerceAssetHandlerFallback)).append("\n");
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

