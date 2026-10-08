package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties   {

    private ConfigNodePropertyArray flushAgents;

    /**
     * Default constructor.
     */
    public ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties.
     *
     * @param flushAgents flushAgents
     */
    public ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties(
        ConfigNodePropertyArray flushAgents
    ) {
        this.flushAgents = flushAgents;
    }



    /**
     * Get flushAgents
     * @return flushAgents
     */
    public ConfigNodePropertyArray getFlushAgents() {
        return flushAgents;
    }

    public void setFlushAgents(ConfigNodePropertyArray flushAgents) {
        this.flushAgents = flushAgents;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties {\n");
        
        sb.append("    flushAgents: ").append(toIndentedString(flushAgents)).append("\n");
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

