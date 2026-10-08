package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties   {

    private ConfigNodePropertyArray hcTags;
    private ConfigNodePropertyInteger maxQueuedJobs;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties.
     *
     * @param hcTags hcTags
     * @param maxQueuedJobs maxQueuedJobs
     */
    public ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties(
        ConfigNodePropertyArray hcTags, 
        ConfigNodePropertyInteger maxQueuedJobs
    ) {
        this.hcTags = hcTags;
        this.maxQueuedJobs = maxQueuedJobs;
    }



    /**
     * Get hcTags
     * @return hcTags
     */
    public ConfigNodePropertyArray getHcTags() {
        return hcTags;
    }

    public void setHcTags(ConfigNodePropertyArray hcTags) {
        this.hcTags = hcTags;
    }

    /**
     * Get maxQueuedJobs
     * @return maxQueuedJobs
     */
    public ConfigNodePropertyInteger getMaxQueuedJobs() {
        return maxQueuedJobs;
    }

    public void setMaxQueuedJobs(ConfigNodePropertyInteger maxQueuedJobs) {
        this.maxQueuedJobs = maxQueuedJobs;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties {\n");
        
        sb.append("    hcTags: ").append(toIndentedString(hcTags)).append("\n");
        sb.append("    maxQueuedJobs: ").append(toIndentedString(maxQueuedJobs)).append("\n");
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

