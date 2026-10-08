package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties   {

    private ConfigNodePropertyArray activeRunModes;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties.
     *
     * @param activeRunModes activeRunModes
     */
    public ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties(
        ConfigNodePropertyArray activeRunModes
    ) {
        this.activeRunModes = activeRunModes;
    }



    /**
     * Get activeRunModes
     * @return activeRunModes
     */
    public ConfigNodePropertyArray getActiveRunModes() {
        return activeRunModes;
    }

    public void setActiveRunModes(ConfigNodePropertyArray activeRunModes) {
        this.activeRunModes = activeRunModes;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties {\n");
        
        sb.append("    activeRunModes: ").append(toIndentedString(activeRunModes)).append("\n");
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

