package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties   {

    private ConfigNodePropertyBoolean queryAggregation;

    /**
     * Default constructor.
     */
    public OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties.
     *
     * @param queryAggregation queryAggregation
     */
    public OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties(
        ConfigNodePropertyBoolean queryAggregation
    ) {
        this.queryAggregation = queryAggregation;
    }



    /**
     * Get queryAggregation
     * @return queryAggregation
     */
    public ConfigNodePropertyBoolean getQueryAggregation() {
        return queryAggregation;
    }

    public void setQueryAggregation(ConfigNodePropertyBoolean queryAggregation) {
        this.queryAggregation = queryAggregation;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties {\n");
        
        sb.append("    queryAggregation: ").append(toIndentedString(queryAggregation)).append("\n");
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

