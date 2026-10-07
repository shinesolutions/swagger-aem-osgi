package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingEventImplJobsDefaultJobManagerProperties   {

    private ConfigNodePropertyDropDown queuePriority;
    private ConfigNodePropertyInteger queueRetries;
    private ConfigNodePropertyInteger queueRetrydelay;
    private ConfigNodePropertyInteger queueMaxparallel;

    /**
     * Default constructor.
     */
    public OrgApacheSlingEventImplJobsDefaultJobManagerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingEventImplJobsDefaultJobManagerProperties.
     *
     * @param queuePriority queuePriority
     * @param queueRetries queueRetries
     * @param queueRetrydelay queueRetrydelay
     * @param queueMaxparallel queueMaxparallel
     */
    public OrgApacheSlingEventImplJobsDefaultJobManagerProperties(
        ConfigNodePropertyDropDown queuePriority, 
        ConfigNodePropertyInteger queueRetries, 
        ConfigNodePropertyInteger queueRetrydelay, 
        ConfigNodePropertyInteger queueMaxparallel
    ) {
        this.queuePriority = queuePriority;
        this.queueRetries = queueRetries;
        this.queueRetrydelay = queueRetrydelay;
        this.queueMaxparallel = queueMaxparallel;
    }



    /**
     * Get queuePriority
     * @return queuePriority
     */
    public ConfigNodePropertyDropDown getQueuePriority() {
        return queuePriority;
    }

    public void setQueuePriority(ConfigNodePropertyDropDown queuePriority) {
        this.queuePriority = queuePriority;
    }

    /**
     * Get queueRetries
     * @return queueRetries
     */
    public ConfigNodePropertyInteger getQueueRetries() {
        return queueRetries;
    }

    public void setQueueRetries(ConfigNodePropertyInteger queueRetries) {
        this.queueRetries = queueRetries;
    }

    /**
     * Get queueRetrydelay
     * @return queueRetrydelay
     */
    public ConfigNodePropertyInteger getQueueRetrydelay() {
        return queueRetrydelay;
    }

    public void setQueueRetrydelay(ConfigNodePropertyInteger queueRetrydelay) {
        this.queueRetrydelay = queueRetrydelay;
    }

    /**
     * Get queueMaxparallel
     * @return queueMaxparallel
     */
    public ConfigNodePropertyInteger getQueueMaxparallel() {
        return queueMaxparallel;
    }

    public void setQueueMaxparallel(ConfigNodePropertyInteger queueMaxparallel) {
        this.queueMaxparallel = queueMaxparallel;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingEventImplJobsDefaultJobManagerProperties {\n");
        
        sb.append("    queuePriority: ").append(toIndentedString(queuePriority)).append("\n");
        sb.append("    queueRetries: ").append(toIndentedString(queueRetries)).append("\n");
        sb.append("    queueRetrydelay: ").append(toIndentedString(queueRetrydelay)).append("\n");
        sb.append("    queueMaxparallel: ").append(toIndentedString(queueMaxparallel)).append("\n");
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

