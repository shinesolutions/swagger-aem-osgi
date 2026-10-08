package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties   {

    private ConfigNodePropertyString providerName;
    private ConfigNodePropertyBoolean forwardRequests;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties.
     *
     * @param providerName providerName
     * @param forwardRequests forwardRequests
     */
    public ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties(
        ConfigNodePropertyString providerName, 
        ConfigNodePropertyBoolean forwardRequests
    ) {
        this.providerName = providerName;
        this.forwardRequests = forwardRequests;
    }



    /**
     * Get providerName
     * @return providerName
     */
    public ConfigNodePropertyString getProviderName() {
        return providerName;
    }

    public void setProviderName(ConfigNodePropertyString providerName) {
        this.providerName = providerName;
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
        sb.append("class ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties {\n");
        
        sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
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

