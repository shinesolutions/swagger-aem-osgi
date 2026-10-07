package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties   {

    private ConfigNodePropertyInteger maxQuartzJobDurationAcceptable;

    /**
     * Default constructor.
     */
    public OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties.
     *
     * @param maxQuartzJobDurationAcceptable maxQuartzJobDurationAcceptable
     */
    public OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties(
        ConfigNodePropertyInteger maxQuartzJobDurationAcceptable
    ) {
        this.maxQuartzJobDurationAcceptable = maxQuartzJobDurationAcceptable;
    }



    /**
     * Get maxQuartzJobDurationAcceptable
     * @return maxQuartzJobDurationAcceptable
     */
    public ConfigNodePropertyInteger getMaxQuartzJobDurationAcceptable() {
        return maxQuartzJobDurationAcceptable;
    }

    public void setMaxQuartzJobDurationAcceptable(ConfigNodePropertyInteger maxQuartzJobDurationAcceptable) {
        this.maxQuartzJobDurationAcceptable = maxQuartzJobDurationAcceptable;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties {\n");
        
        sb.append("    maxQuartzJobDurationAcceptable: ").append(toIndentedString(maxQuartzJobDurationAcceptable)).append("\n");
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

