package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties   {

    private ConfigNodePropertyString slingServletPaths;
    private ConfigNodePropertyBoolean oauthRevocationActive;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties.
     *
     * @param slingServletPaths slingServletPaths
     * @param oauthRevocationActive oauthRevocationActive
     */
    public ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties(
        ConfigNodePropertyString slingServletPaths, 
        ConfigNodePropertyBoolean oauthRevocationActive
    ) {
        this.slingServletPaths = slingServletPaths;
        this.oauthRevocationActive = oauthRevocationActive;
    }



    /**
     * Get slingServletPaths
     * @return slingServletPaths
     */
    public ConfigNodePropertyString getSlingServletPaths() {
        return slingServletPaths;
    }

    public void setSlingServletPaths(ConfigNodePropertyString slingServletPaths) {
        this.slingServletPaths = slingServletPaths;
    }

    /**
     * Get oauthRevocationActive
     * @return oauthRevocationActive
     */
    public ConfigNodePropertyBoolean getOauthRevocationActive() {
        return oauthRevocationActive;
    }

    public void setOauthRevocationActive(ConfigNodePropertyBoolean oauthRevocationActive) {
        this.oauthRevocationActive = oauthRevocationActive;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties {\n");
        
        sb.append("    slingServletPaths: ").append(toIndentedString(slingServletPaths)).append("\n");
        sb.append("    oauthRevocationActive: ").append(toIndentedString(oauthRevocationActive)).append("\n");
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

