package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties   {

    private ConfigNodePropertyString cqCommercePromotionRoot;

    /**
     * Default constructor.
     */
    public ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties.
     *
     * @param cqCommercePromotionRoot cqCommercePromotionRoot
     */
    public ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties(
        ConfigNodePropertyString cqCommercePromotionRoot
    ) {
        this.cqCommercePromotionRoot = cqCommercePromotionRoot;
    }



    /**
     * Get cqCommercePromotionRoot
     * @return cqCommercePromotionRoot
     */
    public ConfigNodePropertyString getCqCommercePromotionRoot() {
        return cqCommercePromotionRoot;
    }

    public void setCqCommercePromotionRoot(ConfigNodePropertyString cqCommercePromotionRoot) {
        this.cqCommercePromotionRoot = cqCommercePromotionRoot;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties {\n");
        
        sb.append("    cqCommercePromotionRoot: ").append(toIndentedString(cqCommercePromotionRoot)).append("\n");
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

