package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteOptoutImplOptOutServiceImplProperties   {

    private ConfigNodePropertyArray optoutCookies;
    private ConfigNodePropertyArray optoutHeaders;
    private ConfigNodePropertyArray optoutWhitelistCookies;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteOptoutImplOptOutServiceImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteOptoutImplOptOutServiceImplProperties.
     *
     * @param optoutCookies optoutCookies
     * @param optoutHeaders optoutHeaders
     * @param optoutWhitelistCookies optoutWhitelistCookies
     */
    public ComAdobeGraniteOptoutImplOptOutServiceImplProperties(
        ConfigNodePropertyArray optoutCookies, 
        ConfigNodePropertyArray optoutHeaders, 
        ConfigNodePropertyArray optoutWhitelistCookies
    ) {
        this.optoutCookies = optoutCookies;
        this.optoutHeaders = optoutHeaders;
        this.optoutWhitelistCookies = optoutWhitelistCookies;
    }



    /**
     * Get optoutCookies
     * @return optoutCookies
     */
    public ConfigNodePropertyArray getOptoutCookies() {
        return optoutCookies;
    }

    public void setOptoutCookies(ConfigNodePropertyArray optoutCookies) {
        this.optoutCookies = optoutCookies;
    }

    /**
     * Get optoutHeaders
     * @return optoutHeaders
     */
    public ConfigNodePropertyArray getOptoutHeaders() {
        return optoutHeaders;
    }

    public void setOptoutHeaders(ConfigNodePropertyArray optoutHeaders) {
        this.optoutHeaders = optoutHeaders;
    }

    /**
     * Get optoutWhitelistCookies
     * @return optoutWhitelistCookies
     */
    public ConfigNodePropertyArray getOptoutWhitelistCookies() {
        return optoutWhitelistCookies;
    }

    public void setOptoutWhitelistCookies(ConfigNodePropertyArray optoutWhitelistCookies) {
        this.optoutWhitelistCookies = optoutWhitelistCookies;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteOptoutImplOptOutServiceImplProperties {\n");
        
        sb.append("    optoutCookies: ").append(toIndentedString(optoutCookies)).append("\n");
        sb.append("    optoutHeaders: ").append(toIndentedString(optoutHeaders)).append("\n");
        sb.append("    optoutWhitelistCookies: ").append(toIndentedString(optoutWhitelistCookies)).append("\n");
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

