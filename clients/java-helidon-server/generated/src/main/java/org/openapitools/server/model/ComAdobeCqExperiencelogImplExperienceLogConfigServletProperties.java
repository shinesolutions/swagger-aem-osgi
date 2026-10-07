package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties   {

    private ConfigNodePropertyBoolean enabled;
    private ConfigNodePropertyArray disabledForGroups;

    /**
     * Default constructor.
     */
    public ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties.
     *
     * @param enabled enabled
     * @param disabledForGroups disabledForGroups
     */
    public ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties(
        ConfigNodePropertyBoolean enabled, 
        ConfigNodePropertyArray disabledForGroups
    ) {
        this.enabled = enabled;
        this.disabledForGroups = disabledForGroups;
    }



    /**
     * Get enabled
     * @return enabled
     */
    public ConfigNodePropertyBoolean getEnabled() {
        return enabled;
    }

    public void setEnabled(ConfigNodePropertyBoolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Get disabledForGroups
     * @return disabledForGroups
     */
    public ConfigNodePropertyArray getDisabledForGroups() {
        return disabledForGroups;
    }

    public void setDisabledForGroups(ConfigNodePropertyArray disabledForGroups) {
        this.disabledForGroups = disabledForGroups;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties {\n");
        
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    disabledForGroups: ").append(toIndentedString(disabledForGroups)).append("\n");
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

