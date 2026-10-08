package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties   {

    private ConfigNodePropertyArray commitsTrackerWriterGroups;

    /**
     * Default constructor.
     */
    public OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties.
     *
     * @param commitsTrackerWriterGroups commitsTrackerWriterGroups
     */
    public OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties(
        ConfigNodePropertyArray commitsTrackerWriterGroups
    ) {
        this.commitsTrackerWriterGroups = commitsTrackerWriterGroups;
    }



    /**
     * Get commitsTrackerWriterGroups
     * @return commitsTrackerWriterGroups
     */
    public ConfigNodePropertyArray getCommitsTrackerWriterGroups() {
        return commitsTrackerWriterGroups;
    }

    public void setCommitsTrackerWriterGroups(ConfigNodePropertyArray commitsTrackerWriterGroups) {
        this.commitsTrackerWriterGroups = commitsTrackerWriterGroups;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties {\n");
        
        sb.append("    commitsTrackerWriterGroups: ").append(toIndentedString(commitsTrackerWriterGroups)).append("\n");
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

