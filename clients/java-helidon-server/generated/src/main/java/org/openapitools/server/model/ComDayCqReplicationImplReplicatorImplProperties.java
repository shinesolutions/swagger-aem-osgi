package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqReplicationImplReplicatorImplProperties   {

    private ConfigNodePropertyBoolean distributeEvents;

    /**
     * Default constructor.
     */
    public ComDayCqReplicationImplReplicatorImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqReplicationImplReplicatorImplProperties.
     *
     * @param distributeEvents distributeEvents
     */
    public ComDayCqReplicationImplReplicatorImplProperties(
        ConfigNodePropertyBoolean distributeEvents
    ) {
        this.distributeEvents = distributeEvents;
    }



    /**
     * Get distributeEvents
     * @return distributeEvents
     */
    public ConfigNodePropertyBoolean getDistributeEvents() {
        return distributeEvents;
    }

    public void setDistributeEvents(ConfigNodePropertyBoolean distributeEvents) {
        this.distributeEvents = distributeEvents;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqReplicationImplReplicatorImplProperties {\n");
        
        sb.append("    distributeEvents: ").append(toIndentedString(distributeEvents)).append("\n");
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

