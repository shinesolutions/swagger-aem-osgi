package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties   {

    private ConfigNodePropertyBoolean oauthTokenRevocationActive;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties.
     *
     * @param oauthTokenRevocationActive oauthTokenRevocationActive
     */
    public ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties(
        ConfigNodePropertyBoolean oauthTokenRevocationActive
    ) {
        this.oauthTokenRevocationActive = oauthTokenRevocationActive;
    }



    /**
     * Get oauthTokenRevocationActive
     * @return oauthTokenRevocationActive
     */
    public ConfigNodePropertyBoolean getOauthTokenRevocationActive() {
        return oauthTokenRevocationActive;
    }

    public void setOauthTokenRevocationActive(ConfigNodePropertyBoolean oauthTokenRevocationActive) {
        this.oauthTokenRevocationActive = oauthTokenRevocationActive;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties {\n");
        
        sb.append("    oauthTokenRevocationActive: ").append(toIndentedString(oauthTokenRevocationActive)).append("\n");
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

