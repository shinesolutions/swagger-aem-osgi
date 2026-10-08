package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties   {

    private ConfigNodePropertyBoolean forwardRequests;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties.
     *
     * @param forwardRequests forwardRequests
     */
    public ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties(
        ConfigNodePropertyBoolean forwardRequests
    ) {
        this.forwardRequests = forwardRequests;
    }



    /**
     * Get forwardRequests
     * @return forwardRequests
     */
    public ConfigNodePropertyBoolean getForwardRequests() {
        return forwardRequests;
    }

    public void setForwardRequests(ConfigNodePropertyBoolean forwardRequests) {
        this.forwardRequests = forwardRequests;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties {\n");
        
        sb.append("    forwardRequests: ").append(toIndentedString(forwardRequests)).append("\n");
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

