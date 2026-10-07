package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties   {

    private ConfigNodePropertyBoolean nuiEnabled;
    private ConfigNodePropertyString nuiServiceUrl;
    private ConfigNodePropertyString nuiApiKey;

    /**
     * Default constructor.
     */
    public ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties.
     *
     * @param nuiEnabled nuiEnabled
     * @param nuiServiceUrl nuiServiceUrl
     * @param nuiApiKey nuiApiKey
     */
    public ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties(
        ConfigNodePropertyBoolean nuiEnabled, 
        ConfigNodePropertyString nuiServiceUrl, 
        ConfigNodePropertyString nuiApiKey
    ) {
        this.nuiEnabled = nuiEnabled;
        this.nuiServiceUrl = nuiServiceUrl;
        this.nuiApiKey = nuiApiKey;
    }



    /**
     * Get nuiEnabled
     * @return nuiEnabled
     */
    public ConfigNodePropertyBoolean getNuiEnabled() {
        return nuiEnabled;
    }

    public void setNuiEnabled(ConfigNodePropertyBoolean nuiEnabled) {
        this.nuiEnabled = nuiEnabled;
    }

    /**
     * Get nuiServiceUrl
     * @return nuiServiceUrl
     */
    public ConfigNodePropertyString getNuiServiceUrl() {
        return nuiServiceUrl;
    }

    public void setNuiServiceUrl(ConfigNodePropertyString nuiServiceUrl) {
        this.nuiServiceUrl = nuiServiceUrl;
    }

    /**
     * Get nuiApiKey
     * @return nuiApiKey
     */
    public ConfigNodePropertyString getNuiApiKey() {
        return nuiApiKey;
    }

    public void setNuiApiKey(ConfigNodePropertyString nuiApiKey) {
        this.nuiApiKey = nuiApiKey;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties {\n");
        
        sb.append("    nuiEnabled: ").append(toIndentedString(nuiEnabled)).append("\n");
        sb.append("    nuiServiceUrl: ").append(toIndentedString(nuiServiceUrl)).append("\n");
        sb.append("    nuiApiKey: ").append(toIndentedString(nuiApiKey)).append("\n");
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

