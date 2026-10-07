package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties   {

    private ConfigNodePropertyBoolean corsEnabling;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties.
     *
     * @param corsEnabling corsEnabling
     */
    public ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties(
        ConfigNodePropertyBoolean corsEnabling
    ) {
        this.corsEnabling = corsEnabling;
    }



    /**
     * Get corsEnabling
     * @return corsEnabling
     */
    public ConfigNodePropertyBoolean getCorsEnabling() {
        return corsEnabling;
    }

    public void setCorsEnabling(ConfigNodePropertyBoolean corsEnabling) {
        this.corsEnabling = corsEnabling;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties {\n");
        
        sb.append("    corsEnabling: ").append(toIndentedString(corsEnabling)).append("\n");
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

