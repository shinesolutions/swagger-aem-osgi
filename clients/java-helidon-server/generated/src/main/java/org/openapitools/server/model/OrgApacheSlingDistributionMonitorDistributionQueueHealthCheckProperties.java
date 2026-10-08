package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties   {

    private ConfigNodePropertyString hcName;
    private ConfigNodePropertyArray hcTags;
    private ConfigNodePropertyString hcMbeanName;
    private ConfigNodePropertyInteger numberOfRetriesAllowed;

    /**
     * Default constructor.
     */
    public OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties.
     *
     * @param hcName hcName
     * @param hcTags hcTags
     * @param hcMbeanName hcMbeanName
     * @param numberOfRetriesAllowed numberOfRetriesAllowed
     */
    public OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties(
        ConfigNodePropertyString hcName, 
        ConfigNodePropertyArray hcTags, 
        ConfigNodePropertyString hcMbeanName, 
        ConfigNodePropertyInteger numberOfRetriesAllowed
    ) {
        this.hcName = hcName;
        this.hcTags = hcTags;
        this.hcMbeanName = hcMbeanName;
        this.numberOfRetriesAllowed = numberOfRetriesAllowed;
    }



    /**
     * Get hcName
     * @return hcName
     */
    public ConfigNodePropertyString getHcName() {
        return hcName;
    }

    public void setHcName(ConfigNodePropertyString hcName) {
        this.hcName = hcName;
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
     * Get hcMbeanName
     * @return hcMbeanName
     */
    public ConfigNodePropertyString getHcMbeanName() {
        return hcMbeanName;
    }

    public void setHcMbeanName(ConfigNodePropertyString hcMbeanName) {
        this.hcMbeanName = hcMbeanName;
    }

    /**
     * Get numberOfRetriesAllowed
     * @return numberOfRetriesAllowed
     */
    public ConfigNodePropertyInteger getNumberOfRetriesAllowed() {
        return numberOfRetriesAllowed;
    }

    public void setNumberOfRetriesAllowed(ConfigNodePropertyInteger numberOfRetriesAllowed) {
        this.numberOfRetriesAllowed = numberOfRetriesAllowed;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties {\n");
        
        sb.append("    hcName: ").append(toIndentedString(hcName)).append("\n");
        sb.append("    hcTags: ").append(toIndentedString(hcTags)).append("\n");
        sb.append("    hcMbeanName: ").append(toIndentedString(hcMbeanName)).append("\n");
        sb.append("    numberOfRetriesAllowed: ").append(toIndentedString(numberOfRetriesAllowed)).append("\n");
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

