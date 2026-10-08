package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties   {

    private ConfigNodePropertyArray cqWcmQrcodeServletWhitelist;

    /**
     * Default constructor.
     */
    public ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties.
     *
     * @param cqWcmQrcodeServletWhitelist cqWcmQrcodeServletWhitelist
     */
    public ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties(
        ConfigNodePropertyArray cqWcmQrcodeServletWhitelist
    ) {
        this.cqWcmQrcodeServletWhitelist = cqWcmQrcodeServletWhitelist;
    }



    /**
     * Get cqWcmQrcodeServletWhitelist
     * @return cqWcmQrcodeServletWhitelist
     */
    public ConfigNodePropertyArray getCqWcmQrcodeServletWhitelist() {
        return cqWcmQrcodeServletWhitelist;
    }

    public void setCqWcmQrcodeServletWhitelist(ConfigNodePropertyArray cqWcmQrcodeServletWhitelist) {
        this.cqWcmQrcodeServletWhitelist = cqWcmQrcodeServletWhitelist;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties {\n");
        
        sb.append("    cqWcmQrcodeServletWhitelist: ").append(toIndentedString(cqWcmQrcodeServletWhitelist)).append("\n");
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

