package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties   {

    private ConfigNodePropertyBoolean enabled;
    private ConfigNodePropertyArray fallbackPaths;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties.
     *
     * @param enabled enabled
     * @param fallbackPaths fallbackPaths
     */
    public ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties(
        ConfigNodePropertyBoolean enabled, 
        ConfigNodePropertyArray fallbackPaths
    ) {
        this.enabled = enabled;
        this.fallbackPaths = fallbackPaths;
    }



    /**
     * Get enabled
     * @return enabled
     */
    public ConfigNodePropertyBoolean getEnabled() {
        return enabled;
    }

    public void setEnabled(ConfigNodePropertyBoolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Get fallbackPaths
     * @return fallbackPaths
     */
    public ConfigNodePropertyArray getFallbackPaths() {
        return fallbackPaths;
    }

    public void setFallbackPaths(ConfigNodePropertyArray fallbackPaths) {
        this.fallbackPaths = fallbackPaths;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties {\n");
        
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    fallbackPaths: ").append(toIndentedString(fallbackPaths)).append("\n");
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

