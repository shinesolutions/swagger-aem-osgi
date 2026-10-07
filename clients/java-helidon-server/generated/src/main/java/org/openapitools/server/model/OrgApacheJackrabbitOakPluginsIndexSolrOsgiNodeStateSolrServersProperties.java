package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties   {

    private ConfigNodePropertyBoolean enabled;

    /**
     * Default constructor.
     */
    public OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties.
     *
     * @param enabled enabled
     */
    public OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties(
        ConfigNodePropertyBoolean enabled
    ) {
        this.enabled = enabled;
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
        sb.append("class OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties {\n");
        
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

