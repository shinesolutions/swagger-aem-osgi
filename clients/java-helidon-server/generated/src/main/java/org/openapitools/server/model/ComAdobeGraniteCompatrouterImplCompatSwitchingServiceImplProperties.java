package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties   {

    private ConfigNodePropertyArray compatgroups;
    private ConfigNodePropertyBoolean enabled;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties.
     *
     * @param compatgroups compatgroups
     * @param enabled enabled
     */
    public ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties(
        ConfigNodePropertyArray compatgroups, 
        ConfigNodePropertyBoolean enabled
    ) {
        this.compatgroups = compatgroups;
        this.enabled = enabled;
    }



    /**
     * Get compatgroups
     * @return compatgroups
     */
    public ConfigNodePropertyArray getCompatgroups() {
        return compatgroups;
    }

    public void setCompatgroups(ConfigNodePropertyArray compatgroups) {
        this.compatgroups = compatgroups;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties {\n");
        
        sb.append("    compatgroups: ").append(toIndentedString(compatgroups)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

