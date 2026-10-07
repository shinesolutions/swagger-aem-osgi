package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties   {

    private ConfigNodePropertyBoolean offloadingAgentmanagerEnabled;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties.
     *
     * @param offloadingAgentmanagerEnabled offloadingAgentmanagerEnabled
     */
    public ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties(
        ConfigNodePropertyBoolean offloadingAgentmanagerEnabled
    ) {
        this.offloadingAgentmanagerEnabled = offloadingAgentmanagerEnabled;
    }



    /**
     * Get offloadingAgentmanagerEnabled
     * @return offloadingAgentmanagerEnabled
     */
    public ConfigNodePropertyBoolean getOffloadingAgentmanagerEnabled() {
        return offloadingAgentmanagerEnabled;
    }

    public void setOffloadingAgentmanagerEnabled(ConfigNodePropertyBoolean offloadingAgentmanagerEnabled) {
        this.offloadingAgentmanagerEnabled = offloadingAgentmanagerEnabled;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties {\n");
        
        sb.append("    offloadingAgentmanagerEnabled: ").append(toIndentedString(offloadingAgentmanagerEnabled)).append("\n");
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

