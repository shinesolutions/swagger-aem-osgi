package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties   {

    private ConfigNodePropertyString name;
    private ConfigNodePropertyArray endpoints;
    private ConfigNodePropertyString transportSecretProviderTarget;

    /**
     * Default constructor.
     */
    public OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties.
     *
     * @param name name
     * @param endpoints endpoints
     * @param transportSecretProviderTarget transportSecretProviderTarget
     */
    public OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties(
        ConfigNodePropertyString name, 
        ConfigNodePropertyArray endpoints, 
        ConfigNodePropertyString transportSecretProviderTarget
    ) {
        this.name = name;
        this.endpoints = endpoints;
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
     * Get endpoints
     * @return endpoints
     */
    public ConfigNodePropertyArray getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(ConfigNodePropertyArray endpoints) {
        this.endpoints = endpoints;
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
        sb.append("class OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
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

