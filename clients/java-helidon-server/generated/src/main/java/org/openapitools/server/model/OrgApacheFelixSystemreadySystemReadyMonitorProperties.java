package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheFelixSystemreadySystemReadyMonitorProperties   {

    private ConfigNodePropertyInteger pollInterval;

    /**
     * Default constructor.
     */
    public OrgApacheFelixSystemreadySystemReadyMonitorProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheFelixSystemreadySystemReadyMonitorProperties.
     *
     * @param pollInterval pollInterval
     */
    public OrgApacheFelixSystemreadySystemReadyMonitorProperties(
        ConfigNodePropertyInteger pollInterval
    ) {
        this.pollInterval = pollInterval;
    }



    /**
     * Get pollInterval
     * @return pollInterval
     */
    public ConfigNodePropertyInteger getPollInterval() {
        return pollInterval;
    }

    public void setPollInterval(ConfigNodePropertyInteger pollInterval) {
        this.pollInterval = pollInterval;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheFelixSystemreadySystemReadyMonitorProperties {\n");
        
        sb.append("    pollInterval: ").append(toIndentedString(pollInterval)).append("\n");
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

