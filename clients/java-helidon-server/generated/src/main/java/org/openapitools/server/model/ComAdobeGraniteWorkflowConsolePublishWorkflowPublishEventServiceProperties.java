package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties   {

    private ConfigNodePropertyBoolean graniteWorkflowWorkflowPublishEventServiceEnabled;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties.
     *
     * @param graniteWorkflowWorkflowPublishEventServiceEnabled graniteWorkflowWorkflowPublishEventServiceEnabled
     */
    public ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties(
        ConfigNodePropertyBoolean graniteWorkflowWorkflowPublishEventServiceEnabled
    ) {
        this.graniteWorkflowWorkflowPublishEventServiceEnabled = graniteWorkflowWorkflowPublishEventServiceEnabled;
    }



    /**
     * Get graniteWorkflowWorkflowPublishEventServiceEnabled
     * @return graniteWorkflowWorkflowPublishEventServiceEnabled
     */
    public ConfigNodePropertyBoolean getGraniteWorkflowWorkflowPublishEventServiceEnabled() {
        return graniteWorkflowWorkflowPublishEventServiceEnabled;
    }

    public void setGraniteWorkflowWorkflowPublishEventServiceEnabled(ConfigNodePropertyBoolean graniteWorkflowWorkflowPublishEventServiceEnabled) {
        this.graniteWorkflowWorkflowPublishEventServiceEnabled = graniteWorkflowWorkflowPublishEventServiceEnabled;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties {\n");
        
        sb.append("    graniteWorkflowWorkflowPublishEventServiceEnabled: ").append(toIndentedString(graniteWorkflowWorkflowPublishEventServiceEnabled)).append("\n");
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

