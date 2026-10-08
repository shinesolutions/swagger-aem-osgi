package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties   {

    private ConfigNodePropertyString providerRoots;
    private ConfigNodePropertyString kind;

    /**
     * Default constructor.
     */
    public OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties.
     *
     * @param providerRoots providerRoots
     * @param kind kind
     */
    public OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties(
        ConfigNodePropertyString providerRoots, 
        ConfigNodePropertyString kind
    ) {
        this.providerRoots = providerRoots;
        this.kind = kind;
    }



    /**
     * Get providerRoots
     * @return providerRoots
     */
    public ConfigNodePropertyString getProviderRoots() {
        return providerRoots;
    }

    public void setProviderRoots(ConfigNodePropertyString providerRoots) {
        this.providerRoots = providerRoots;
    }

    /**
     * Get kind
     * @return kind
     */
    public ConfigNodePropertyString getKind() {
        return kind;
    }

    public void setKind(ConfigNodePropertyString kind) {
        this.kind = kind;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties {\n");
        
        sb.append("    providerRoots: ").append(toIndentedString(providerRoots)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
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

