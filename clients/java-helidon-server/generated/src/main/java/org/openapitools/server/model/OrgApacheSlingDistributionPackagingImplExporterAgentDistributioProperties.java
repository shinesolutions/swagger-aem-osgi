package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties   {

    private ConfigNodePropertyString name;
    private ConfigNodePropertyString queue;
    private ConfigNodePropertyBoolean dropInvalidItems;
    private ConfigNodePropertyString agentTarget;

    /**
     * Default constructor.
     */
    public OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties.
     *
     * @param name name
     * @param queue queue
     * @param dropInvalidItems dropInvalidItems
     * @param agentTarget agentTarget
     */
    public OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties(
        ConfigNodePropertyString name, 
        ConfigNodePropertyString queue, 
        ConfigNodePropertyBoolean dropInvalidItems, 
        ConfigNodePropertyString agentTarget
    ) {
        this.name = name;
        this.queue = queue;
        this.dropInvalidItems = dropInvalidItems;
        this.agentTarget = agentTarget;
    }



    /**
     * Get name
     * @return name
     */
    public ConfigNodePropertyString getName() {
        return name;
    }

    public void setName(ConfigNodePropertyString name) {
        this.name = name;
    }

    /**
     * Get queue
     * @return queue
     */
    public ConfigNodePropertyString getQueue() {
        return queue;
    }

    public void setQueue(ConfigNodePropertyString queue) {
        this.queue = queue;
    }

    /**
     * Get dropInvalidItems
     * @return dropInvalidItems
     */
    public ConfigNodePropertyBoolean getDropInvalidItems() {
        return dropInvalidItems;
    }

    public void setDropInvalidItems(ConfigNodePropertyBoolean dropInvalidItems) {
        this.dropInvalidItems = dropInvalidItems;
    }

    /**
     * Get agentTarget
     * @return agentTarget
     */
    public ConfigNodePropertyString getAgentTarget() {
        return agentTarget;
    }

    public void setAgentTarget(ConfigNodePropertyString agentTarget) {
        this.agentTarget = agentTarget;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
        sb.append("    dropInvalidItems: ").append(toIndentedString(dropInvalidItems)).append("\n");
        sb.append("    agentTarget: ").append(toIndentedString(agentTarget)).append("\n");
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

