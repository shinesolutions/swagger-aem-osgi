package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties   {

    private ConfigNodePropertyString name;
    private ConfigNodePropertyString endpoint;
    private ConfigNodePropertyString transportSecretProviderTarget;

    /**
     * Default constructor.
     */
    public OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties.
     *
     * @param name name
     * @param endpoint endpoint
     * @param transportSecretProviderTarget transportSecretProviderTarget
     */
    public OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties(
        ConfigNodePropertyString name, 
        ConfigNodePropertyString endpoint, 
        ConfigNodePropertyString transportSecretProviderTarget
    ) {
        this.name = name;
        this.endpoint = endpoint;
        this.transportSecretProviderTarget = transportSecretProviderTarget;
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
     * Get endpoint
     * @return endpoint
     */
    public ConfigNodePropertyString getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(ConfigNodePropertyString endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * Get transportSecretProviderTarget
     * @return transportSecretProviderTarget
     */
    public ConfigNodePropertyString getTransportSecretProviderTarget() {
        return transportSecretProviderTarget;
    }

    public void setTransportSecretProviderTarget(ConfigNodePropertyString transportSecretProviderTarget) {
        this.transportSecretProviderTarget = transportSecretProviderTarget;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    transportSecretProviderTarget: ").append(toIndentedString(transportSecretProviderTarget)).append("\n");
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

