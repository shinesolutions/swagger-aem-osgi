package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties   {

    private ConfigNodePropertyBoolean oauthClientRevocationActive;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties.
     *
     * @param oauthClientRevocationActive oauthClientRevocationActive
     */
    public ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties(
        ConfigNodePropertyBoolean oauthClientRevocationActive
    ) {
        this.oauthClientRevocationActive = oauthClientRevocationActive;
    }



    /**
     * Get oauthClientRevocationActive
     * @return oauthClientRevocationActive
     */
    public ConfigNodePropertyBoolean getOauthClientRevocationActive() {
        return oauthClientRevocationActive;
    }

    public void setOauthClientRevocationActive(ConfigNodePropertyBoolean oauthClientRevocationActive) {
        this.oauthClientRevocationActive = oauthClientRevocationActive;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties {\n");
        
        sb.append("    oauthClientRevocationActive: ").append(toIndentedString(oauthClientRevocationActive)).append("\n");
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

