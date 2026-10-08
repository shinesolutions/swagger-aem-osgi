package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties   {

    private ConfigNodePropertyInteger maxItems;
    private ConfigNodePropertyInteger maxPathDepth;
    private ConfigNodePropertyBoolean enabled;

    /**
     * Default constructor.
     */
    public OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties.
     *
     * @param maxItems maxItems
     * @param maxPathDepth maxPathDepth
     * @param enabled enabled
     */
    public OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties(
        ConfigNodePropertyInteger maxItems, 
        ConfigNodePropertyInteger maxPathDepth, 
        ConfigNodePropertyBoolean enabled
    ) {
        this.maxItems = maxItems;
        this.maxPathDepth = maxPathDepth;
        this.enabled = enabled;
    }



    /**
     * Get maxItems
     * @return maxItems
     */
    public ConfigNodePropertyInteger getMaxItems() {
        return maxItems;
    }

    public void setMaxItems(ConfigNodePropertyInteger maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * Get maxPathDepth
     * @return maxPathDepth
     */
    public ConfigNodePropertyInteger getMaxPathDepth() {
        return maxPathDepth;
    }

    public void setMaxPathDepth(ConfigNodePropertyInteger maxPathDepth) {
        this.maxPathDepth = maxPathDepth;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties {\n");
        
        sb.append("    maxItems: ").append(toIndentedString(maxItems)).append("\n");
        sb.append("    maxPathDepth: ").append(toIndentedString(maxPathDepth)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

