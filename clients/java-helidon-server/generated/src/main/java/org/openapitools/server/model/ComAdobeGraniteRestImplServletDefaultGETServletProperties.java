package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteRestImplServletDefaultGETServletProperties   {

    private ConfigNodePropertyInteger defaultLimit;
    private ConfigNodePropertyBoolean useAbsoluteUri;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteRestImplServletDefaultGETServletProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteRestImplServletDefaultGETServletProperties.
     *
     * @param defaultLimit defaultLimit
     * @param useAbsoluteUri useAbsoluteUri
     */
    public ComAdobeGraniteRestImplServletDefaultGETServletProperties(
        ConfigNodePropertyInteger defaultLimit, 
        ConfigNodePropertyBoolean useAbsoluteUri
    ) {
        this.defaultLimit = defaultLimit;
        this.useAbsoluteUri = useAbsoluteUri;
    }



    /**
     * Get defaultLimit
     * @return defaultLimit
     */
    public ConfigNodePropertyInteger getDefaultLimit() {
        return defaultLimit;
    }

    public void setDefaultLimit(ConfigNodePropertyInteger defaultLimit) {
        this.defaultLimit = defaultLimit;
    }

    /**
     * Get useAbsoluteUri
     * @return useAbsoluteUri
     */
    public ConfigNodePropertyBoolean getUseAbsoluteUri() {
        return useAbsoluteUri;
    }

    public void setUseAbsoluteUri(ConfigNodePropertyBoolean useAbsoluteUri) {
        this.useAbsoluteUri = useAbsoluteUri;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteRestImplServletDefaultGETServletProperties {\n");
        
        sb.append("    defaultLimit: ").append(toIndentedString(defaultLimit)).append("\n");
        sb.append("    useAbsoluteUri: ").append(toIndentedString(useAbsoluteUri)).append("\n");
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

