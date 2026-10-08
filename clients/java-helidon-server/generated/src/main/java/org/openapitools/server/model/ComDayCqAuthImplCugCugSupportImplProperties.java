package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqAuthImplCugCugSupportImplProperties   {

    private ConfigNodePropertyArray cugExemptedPrincipals;
    private ConfigNodePropertyBoolean cugEnabled;
    private ConfigNodePropertyString cugPrincipalsRegex;
    private ConfigNodePropertyString cugPrincipalsReplacement;

    /**
     * Default constructor.
     */
    public ComDayCqAuthImplCugCugSupportImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqAuthImplCugCugSupportImplProperties.
     *
     * @param cugExemptedPrincipals cugExemptedPrincipals
     * @param cugEnabled cugEnabled
     * @param cugPrincipalsRegex cugPrincipalsRegex
     * @param cugPrincipalsReplacement cugPrincipalsReplacement
     */
    public ComDayCqAuthImplCugCugSupportImplProperties(
        ConfigNodePropertyArray cugExemptedPrincipals, 
        ConfigNodePropertyBoolean cugEnabled, 
        ConfigNodePropertyString cugPrincipalsRegex, 
        ConfigNodePropertyString cugPrincipalsReplacement
    ) {
        this.cugExemptedPrincipals = cugExemptedPrincipals;
        this.cugEnabled = cugEnabled;
        this.cugPrincipalsRegex = cugPrincipalsRegex;
        this.cugPrincipalsReplacement = cugPrincipalsReplacement;
    }



    /**
     * Get cugExemptedPrincipals
     * @return cugExemptedPrincipals
     */
    public ConfigNodePropertyArray getCugExemptedPrincipals() {
        return cugExemptedPrincipals;
    }

    public void setCugExemptedPrincipals(ConfigNodePropertyArray cugExemptedPrincipals) {
        this.cugExemptedPrincipals = cugExemptedPrincipals;
    }

    /**
     * Get cugEnabled
     * @return cugEnabled
     */
    public ConfigNodePropertyBoolean getCugEnabled() {
        return cugEnabled;
    }

    public void setCugEnabled(ConfigNodePropertyBoolean cugEnabled) {
        this.cugEnabled = cugEnabled;
    }

    /**
     * Get cugPrincipalsRegex
     * @return cugPrincipalsRegex
     */
    public ConfigNodePropertyString getCugPrincipalsRegex() {
        return cugPrincipalsRegex;
    }

    public void setCugPrincipalsRegex(ConfigNodePropertyString cugPrincipalsRegex) {
        this.cugPrincipalsRegex = cugPrincipalsRegex;
    }

    /**
     * Get cugPrincipalsReplacement
     * @return cugPrincipalsReplacement
     */
    public ConfigNodePropertyString getCugPrincipalsReplacement() {
        return cugPrincipalsReplacement;
    }

    public void setCugPrincipalsReplacement(ConfigNodePropertyString cugPrincipalsReplacement) {
        this.cugPrincipalsReplacement = cugPrincipalsReplacement;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqAuthImplCugCugSupportImplProperties {\n");
        
        sb.append("    cugExemptedPrincipals: ").append(toIndentedString(cugExemptedPrincipals)).append("\n");
        sb.append("    cugEnabled: ").append(toIndentedString(cugEnabled)).append("\n");
        sb.append("    cugPrincipalsRegex: ").append(toIndentedString(cugPrincipalsRegex)).append("\n");
        sb.append("    cugPrincipalsReplacement: ").append(toIndentedString(cugPrincipalsReplacement)).append("\n");
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

