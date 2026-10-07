package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties   {

    private ConfigNodePropertyString authTokenValidatorType;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties.
     *
     * @param authTokenValidatorType authTokenValidatorType
     */
    public ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties(
        ConfigNodePropertyString authTokenValidatorType
    ) {
        this.authTokenValidatorType = authTokenValidatorType;
    }



    /**
     * Get authTokenValidatorType
     * @return authTokenValidatorType
     */
    public ConfigNodePropertyString getAuthTokenValidatorType() {
        return authTokenValidatorType;
    }

    public void setAuthTokenValidatorType(ConfigNodePropertyString authTokenValidatorType) {
        this.authTokenValidatorType = authTokenValidatorType;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties {\n");
        
        sb.append("    authTokenValidatorType: ").append(toIndentedString(authTokenValidatorType)).append("\n");
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

