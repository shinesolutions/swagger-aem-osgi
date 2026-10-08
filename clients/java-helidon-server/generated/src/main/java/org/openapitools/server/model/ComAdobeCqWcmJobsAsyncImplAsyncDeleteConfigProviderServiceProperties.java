package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties   {

    private ConfigNodePropertyInteger threshold;
    private ConfigNodePropertyString jobTopicName;
    private ConfigNodePropertyBoolean emailEnabled;

    /**
     * Default constructor.
     */
    public ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties.
     *
     * @param threshold threshold
     * @param jobTopicName jobTopicName
     * @param emailEnabled emailEnabled
     */
    public ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties(
        ConfigNodePropertyInteger threshold, 
        ConfigNodePropertyString jobTopicName, 
        ConfigNodePropertyBoolean emailEnabled
    ) {
        this.threshold = threshold;
        this.jobTopicName = jobTopicName;
        this.emailEnabled = emailEnabled;
    }



    /**
     * Get threshold
     * @return threshold
     */
    public ConfigNodePropertyInteger getThreshold() {
        return threshold;
    }

    public void setThreshold(ConfigNodePropertyInteger threshold) {
        this.threshold = threshold;
    }

    /**
     * Get jobTopicName
     * @return jobTopicName
     */
    public ConfigNodePropertyString getJobTopicName() {
        return jobTopicName;
    }

    public void setJobTopicName(ConfigNodePropertyString jobTopicName) {
        this.jobTopicName = jobTopicName;
    }

    /**
     * Get emailEnabled
     * @return emailEnabled
     */
    public ConfigNodePropertyBoolean getEmailEnabled() {
        return emailEnabled;
    }

    public void setEmailEnabled(ConfigNodePropertyBoolean emailEnabled) {
        this.emailEnabled = emailEnabled;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties {\n");
        
        sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
        sb.append("    jobTopicName: ").append(toIndentedString(jobTopicName)).append("\n");
        sb.append("    emailEnabled: ").append(toIndentedString(emailEnabled)).append("\n");
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

