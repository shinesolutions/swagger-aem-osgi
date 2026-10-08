package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties   {

    private ConfigNodePropertyString jobTopics;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties.
     *
     * @param jobTopics jobTopics
     */
    public ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties(
        ConfigNodePropertyString jobTopics
    ) {
        this.jobTopics = jobTopics;
    }



    /**
     * Get jobTopics
     * @return jobTopics
     */
    public ConfigNodePropertyString getJobTopics() {
        return jobTopics;
    }

    public void setJobTopics(ConfigNodePropertyString jobTopics) {
        this.jobTopics = jobTopics;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties {\n");
        
        sb.append("    jobTopics: ").append(toIndentedString(jobTopics)).append("\n");
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

