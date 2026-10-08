package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteAuthImsProperties   {

    private ConfigNodePropertyString configid;
    private ConfigNodePropertyString scope;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteAuthImsProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteAuthImsProperties.
     *
     * @param configid configid
     * @param scope scope
     */
    public ComAdobeGraniteAuthImsProperties(
        ConfigNodePropertyString configid, 
        ConfigNodePropertyString scope
    ) {
        this.configid = configid;
        this.scope = scope;
    }



    /**
     * Get configid
     * @return configid
     */
    public ConfigNodePropertyString getConfigid() {
        return configid;
    }

    public void setConfigid(ConfigNodePropertyString configid) {
        this.configid = configid;
    }

    /**
     * Get scope
     * @return scope
     */
    public ConfigNodePropertyString getScope() {
        return scope;
    }

    public void setScope(ConfigNodePropertyString scope) {
        this.scope = scope;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteAuthImsProperties {\n");
        
        sb.append("    configid: ").append(toIndentedString(configid)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

