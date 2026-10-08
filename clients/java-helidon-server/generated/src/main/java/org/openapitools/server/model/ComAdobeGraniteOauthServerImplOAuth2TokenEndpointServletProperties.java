package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties   {

    private ConfigNodePropertyString oauthIssuer;
    private ConfigNodePropertyString oauthAccessTokenExpiresIn;
    private ConfigNodePropertyString osgiHttpWhiteboardServletPattern;
    private ConfigNodePropertyString osgiHttpWhiteboardContextSelect;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties.
     *
     * @param oauthIssuer oauthIssuer
     * @param oauthAccessTokenExpiresIn oauthAccessTokenExpiresIn
     * @param osgiHttpWhiteboardServletPattern osgiHttpWhiteboardServletPattern
     * @param osgiHttpWhiteboardContextSelect osgiHttpWhiteboardContextSelect
     */
    public ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties(
        ConfigNodePropertyString oauthIssuer, 
        ConfigNodePropertyString oauthAccessTokenExpiresIn, 
        ConfigNodePropertyString osgiHttpWhiteboardServletPattern, 
        ConfigNodePropertyString osgiHttpWhiteboardContextSelect
    ) {
        this.oauthIssuer = oauthIssuer;
        this.oauthAccessTokenExpiresIn = oauthAccessTokenExpiresIn;
        this.osgiHttpWhiteboardServletPattern = osgiHttpWhiteboardServletPattern;
        this.osgiHttpWhiteboardContextSelect = osgiHttpWhiteboardContextSelect;
    }



    /**
     * Get oauthIssuer
     * @return oauthIssuer
     */
    public ConfigNodePropertyString getOauthIssuer() {
        return oauthIssuer;
    }

    public void setOauthIssuer(ConfigNodePropertyString oauthIssuer) {
        this.oauthIssuer = oauthIssuer;
    }

    /**
     * Get oauthAccessTokenExpiresIn
     * @return oauthAccessTokenExpiresIn
     */
    public ConfigNodePropertyString getOauthAccessTokenExpiresIn() {
        return oauthAccessTokenExpiresIn;
    }

    public void setOauthAccessTokenExpiresIn(ConfigNodePropertyString oauthAccessTokenExpiresIn) {
        this.oauthAccessTokenExpiresIn = oauthAccessTokenExpiresIn;
    }

    /**
     * Get osgiHttpWhiteboardServletPattern
     * @return osgiHttpWhiteboardServletPattern
     */
    public ConfigNodePropertyString getOsgiHttpWhiteboardServletPattern() {
        return osgiHttpWhiteboardServletPattern;
    }

    public void setOsgiHttpWhiteboardServletPattern(ConfigNodePropertyString osgiHttpWhiteboardServletPattern) {
        this.osgiHttpWhiteboardServletPattern = osgiHttpWhiteboardServletPattern;
    }

    /**
     * Get osgiHttpWhiteboardContextSelect
     * @return osgiHttpWhiteboardContextSelect
     */
    public ConfigNodePropertyString getOsgiHttpWhiteboardContextSelect() {
        return osgiHttpWhiteboardContextSelect;
    }

    public void setOsgiHttpWhiteboardContextSelect(ConfigNodePropertyString osgiHttpWhiteboardContextSelect) {
        this.osgiHttpWhiteboardContextSelect = osgiHttpWhiteboardContextSelect;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties {\n");
        
        sb.append("    oauthIssuer: ").append(toIndentedString(oauthIssuer)).append("\n");
        sb.append("    oauthAccessTokenExpiresIn: ").append(toIndentedString(oauthAccessTokenExpiresIn)).append("\n");
        sb.append("    osgiHttpWhiteboardServletPattern: ").append(toIndentedString(osgiHttpWhiteboardServletPattern)).append("\n");
        sb.append("    osgiHttpWhiteboardContextSelect: ").append(toIndentedString(osgiHttpWhiteboardContextSelect)).append("\n");
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

