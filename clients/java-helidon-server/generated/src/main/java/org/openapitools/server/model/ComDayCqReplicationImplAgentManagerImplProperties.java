package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqReplicationImplAgentManagerImplProperties   {

    private ConfigNodePropertyString jobTopics;
    private ConfigNodePropertyString serviceUserTarget;
    private ConfigNodePropertyString agentProviderTarget;

    /**
     * Default constructor.
     */
    public ComDayCqReplicationImplAgentManagerImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqReplicationImplAgentManagerImplProperties.
     *
     * @param jobTopics jobTopics
     * @param serviceUserTarget serviceUserTarget
     * @param agentProviderTarget agentProviderTarget
     */
    public ComDayCqReplicationImplAgentManagerImplProperties(
        ConfigNodePropertyString jobTopics, 
        ConfigNodePropertyString serviceUserTarget, 
        ConfigNodePropertyString agentProviderTarget
    ) {
        this.jobTopics = jobTopics;
        this.serviceUserTarget = serviceUserTarget;
        this.agentProviderTarget = agentProviderTarget;
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
     * Get serviceUserTarget
     * @return serviceUserTarget
     */
    public ConfigNodePropertyString getServiceUserTarget() {
        return serviceUserTarget;
    }

    public void setServiceUserTarget(ConfigNodePropertyString serviceUserTarget) {
        this.serviceUserTarget = serviceUserTarget;
    }

    /**
     * Get agentProviderTarget
     * @return agentProviderTarget
     */
    public ConfigNodePropertyString getAgentProviderTarget() {
        return agentProviderTarget;
    }

    public void setAgentProviderTarget(ConfigNodePropertyString agentProviderTarget) {
        this.agentProviderTarget = agentProviderTarget;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqReplicationImplAgentManagerImplProperties {\n");
        
        sb.append("    jobTopics: ").append(toIndentedString(jobTopics)).append("\n");
        sb.append("    serviceUserTarget: ").append(toIndentedString(serviceUserTarget)).append("\n");
        sb.append("    agentProviderTarget: ").append(toIndentedString(agentProviderTarget)).append("\n");
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

