package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties   {

    private ConfigNodePropertyString providerRoot;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties.
     *
     * @param providerRoot providerRoot
     */
    public ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties(
        ConfigNodePropertyString providerRoot
    ) {
        this.providerRoot = providerRoot;
    }



    /**
     * Get providerRoot
     * @return providerRoot
     */
    public ConfigNodePropertyString getProviderRoot() {
        return providerRoot;
    }

    public void setProviderRoot(ConfigNodePropertyString providerRoot) {
        this.providerRoot = providerRoot;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties {\n");
        
        sb.append("    providerRoot: ").append(toIndentedString(providerRoot)).append("\n");
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

