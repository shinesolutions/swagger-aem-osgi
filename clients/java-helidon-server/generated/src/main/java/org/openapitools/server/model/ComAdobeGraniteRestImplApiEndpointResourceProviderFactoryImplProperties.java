package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties   {

    private ConfigNodePropertyString providerRoots;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties.
     *
     * @param providerRoots providerRoots
     */
    public ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties(
        ConfigNodePropertyString providerRoots
    ) {
        this.providerRoots = providerRoots;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties {\n");
        
        sb.append("    providerRoots: ").append(toIndentedString(providerRoots)).append("\n");
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

