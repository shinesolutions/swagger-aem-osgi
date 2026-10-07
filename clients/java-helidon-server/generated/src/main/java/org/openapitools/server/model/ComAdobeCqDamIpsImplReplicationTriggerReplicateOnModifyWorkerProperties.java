package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties   {

    private ConfigNodePropertyBoolean dmreplicateonmodifyEnabled;
    private ConfigNodePropertyBoolean dmreplicateonmodifyForcesyncdeletes;

    /**
     * Default constructor.
     */
    public ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties.
     *
     * @param dmreplicateonmodifyEnabled dmreplicateonmodifyEnabled
     * @param dmreplicateonmodifyForcesyncdeletes dmreplicateonmodifyForcesyncdeletes
     */
    public ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties(
        ConfigNodePropertyBoolean dmreplicateonmodifyEnabled, 
        ConfigNodePropertyBoolean dmreplicateonmodifyForcesyncdeletes
    ) {
        this.dmreplicateonmodifyEnabled = dmreplicateonmodifyEnabled;
        this.dmreplicateonmodifyForcesyncdeletes = dmreplicateonmodifyForcesyncdeletes;
    }



    /**
     * Get dmreplicateonmodifyEnabled
     * @return dmreplicateonmodifyEnabled
     */
    public ConfigNodePropertyBoolean getDmreplicateonmodifyEnabled() {
        return dmreplicateonmodifyEnabled;
    }

    public void setDmreplicateonmodifyEnabled(ConfigNodePropertyBoolean dmreplicateonmodifyEnabled) {
        this.dmreplicateonmodifyEnabled = dmreplicateonmodifyEnabled;
    }

    /**
     * Get dmreplicateonmodifyForcesyncdeletes
     * @return dmreplicateonmodifyForcesyncdeletes
     */
    public ConfigNodePropertyBoolean getDmreplicateonmodifyForcesyncdeletes() {
        return dmreplicateonmodifyForcesyncdeletes;
    }

    public void setDmreplicateonmodifyForcesyncdeletes(ConfigNodePropertyBoolean dmreplicateonmodifyForcesyncdeletes) {
        this.dmreplicateonmodifyForcesyncdeletes = dmreplicateonmodifyForcesyncdeletes;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties {\n");
        
        sb.append("    dmreplicateonmodifyEnabled: ").append(toIndentedString(dmreplicateonmodifyEnabled)).append("\n");
        sb.append("    dmreplicateonmodifyForcesyncdeletes: ").append(toIndentedString(dmreplicateonmodifyForcesyncdeletes)).append("\n");
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

