package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties   {

    private ConfigNodePropertyString authImsClientSecret;
    private ConfigNodePropertyString customizerType;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties.
     *
     * @param authImsClientSecret authImsClientSecret
     * @param customizerType customizerType
     */
    public ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties(
        ConfigNodePropertyString authImsClientSecret, 
        ConfigNodePropertyString customizerType
    ) {
        this.authImsClientSecret = authImsClientSecret;
        this.customizerType = customizerType;
    }



    /**
     * Get authImsClientSecret
     * @return authImsClientSecret
     */
    public ConfigNodePropertyString getAuthImsClientSecret() {
        return authImsClientSecret;
    }

    public void setAuthImsClientSecret(ConfigNodePropertyString authImsClientSecret) {
        this.authImsClientSecret = authImsClientSecret;
    }

    /**
     * Get customizerType
     * @return customizerType
     */
    public ConfigNodePropertyString getCustomizerType() {
        return customizerType;
    }

    public void setCustomizerType(ConfigNodePropertyString customizerType) {
        this.customizerType = customizerType;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties {\n");
        
        sb.append("    authImsClientSecret: ").append(toIndentedString(authImsClientSecret)).append("\n");
        sb.append("    customizerType: ").append(toIndentedString(customizerType)).append("\n");
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

