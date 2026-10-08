package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties   {

    private ConfigNodePropertyString oauthProviderId;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties.
     *
     * @param oauthProviderId oauthProviderId
     */
    public ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties(
        ConfigNodePropertyString oauthProviderId
    ) {
        this.oauthProviderId = oauthProviderId;
    }



    /**
     * Get oauthProviderId
     * @return oauthProviderId
     */
    public ConfigNodePropertyString getOauthProviderId() {
        return oauthProviderId;
    }

    public void setOauthProviderId(ConfigNodePropertyString oauthProviderId) {
        this.oauthProviderId = oauthProviderId;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties {\n");
        
        sb.append("    oauthProviderId: ").append(toIndentedString(oauthProviderId)).append("\n");
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

