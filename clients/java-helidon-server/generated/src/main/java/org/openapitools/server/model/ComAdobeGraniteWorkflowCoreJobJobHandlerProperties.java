package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteWorkflowCoreJobJobHandlerProperties   {

    private ConfigNodePropertyArray jobTopics;
    private ConfigNodePropertyBoolean allowSelfProcessTermination;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteWorkflowCoreJobJobHandlerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteWorkflowCoreJobJobHandlerProperties.
     *
     * @param jobTopics jobTopics
     * @param allowSelfProcessTermination allowSelfProcessTermination
     */
    public ComAdobeGraniteWorkflowCoreJobJobHandlerProperties(
        ConfigNodePropertyArray jobTopics, 
        ConfigNodePropertyBoolean allowSelfProcessTermination
    ) {
        this.jobTopics = jobTopics;
        this.allowSelfProcessTermination = allowSelfProcessTermination;
    }



    /**
     * Get jobTopics
     * @return jobTopics
     */
    public ConfigNodePropertyArray getJobTopics() {
        return jobTopics;
    }

    public void setJobTopics(ConfigNodePropertyArray jobTopics) {
        this.jobTopics = jobTopics;
    }

    /**
     * Get allowSelfProcessTermination
     * @return allowSelfProcessTermination
     */
    public ConfigNodePropertyBoolean getAllowSelfProcessTermination() {
        return allowSelfProcessTermination;
    }

    public void setAllowSelfProcessTermination(ConfigNodePropertyBoolean allowSelfProcessTermination) {
        this.allowSelfProcessTermination = allowSelfProcessTermination;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteWorkflowCoreJobJobHandlerProperties {\n");
        
        sb.append("    jobTopics: ").append(toIndentedString(jobTopics)).append("\n");
        sb.append("    allowSelfProcessTermination: ").append(toIndentedString(allowSelfProcessTermination)).append("\n");
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

