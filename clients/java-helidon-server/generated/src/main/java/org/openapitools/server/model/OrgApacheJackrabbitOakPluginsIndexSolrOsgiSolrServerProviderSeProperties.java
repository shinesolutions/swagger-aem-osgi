package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties   {

    private ConfigNodePropertyDropDown serverType;

    /**
     * Default constructor.
     */
    public OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties.
     *
     * @param serverType serverType
     */
    public OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties(
        ConfigNodePropertyDropDown serverType
    ) {
        this.serverType = serverType;
    }



    /**
     * Get serverType
     * @return serverType
     */
    public ConfigNodePropertyDropDown getServerType() {
        return serverType;
    }

    public void setServerType(ConfigNodePropertyDropDown serverType) {
        this.serverType = serverType;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties {\n");
        
        sb.append("    serverType: ").append(toIndentedString(serverType)).append("\n");
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

