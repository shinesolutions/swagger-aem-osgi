package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties   {

    private ConfigNodePropertyString securityPreferencesName;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties.
     *
     * @param securityPreferencesName securityPreferencesName
     */
    public ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties(
        ConfigNodePropertyString securityPreferencesName
    ) {
        this.securityPreferencesName = securityPreferencesName;
    }



    /**
     * Get securityPreferencesName
     * @return securityPreferencesName
     */
    public ConfigNodePropertyString getSecurityPreferencesName() {
        return securityPreferencesName;
    }

    public void setSecurityPreferencesName(ConfigNodePropertyString securityPreferencesName) {
        this.securityPreferencesName = securityPreferencesName;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties {\n");
        
        sb.append("    securityPreferencesName: ").append(toIndentedString(securityPreferencesName)).append("\n");
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

