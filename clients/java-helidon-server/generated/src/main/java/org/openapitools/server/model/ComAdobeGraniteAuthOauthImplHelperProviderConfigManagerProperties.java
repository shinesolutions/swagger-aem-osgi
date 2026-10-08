package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties   {

    private ConfigNodePropertyString oauthCookieLoginTimeout;
    private ConfigNodePropertyString oauthCookieMaxAge;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties.
     *
     * @param oauthCookieLoginTimeout oauthCookieLoginTimeout
     * @param oauthCookieMaxAge oauthCookieMaxAge
     */
    public ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties(
        ConfigNodePropertyString oauthCookieLoginTimeout, 
        ConfigNodePropertyString oauthCookieMaxAge
    ) {
        this.oauthCookieLoginTimeout = oauthCookieLoginTimeout;
        this.oauthCookieMaxAge = oauthCookieMaxAge;
    }



    /**
     * Get oauthCookieLoginTimeout
     * @return oauthCookieLoginTimeout
     */
    public ConfigNodePropertyString getOauthCookieLoginTimeout() {
        return oauthCookieLoginTimeout;
    }

    public void setOauthCookieLoginTimeout(ConfigNodePropertyString oauthCookieLoginTimeout) {
        this.oauthCookieLoginTimeout = oauthCookieLoginTimeout;
    }

    /**
     * Get oauthCookieMaxAge
     * @return oauthCookieMaxAge
     */
    public ConfigNodePropertyString getOauthCookieMaxAge() {
        return oauthCookieMaxAge;
    }

    public void setOauthCookieMaxAge(ConfigNodePropertyString oauthCookieMaxAge) {
        this.oauthCookieMaxAge = oauthCookieMaxAge;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties {\n");
        
        sb.append("    oauthCookieLoginTimeout: ").append(toIndentedString(oauthCookieLoginTimeout)).append("\n");
        sb.append("    oauthCookieMaxAge: ").append(toIndentedString(oauthCookieMaxAge)).append("\n");
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

