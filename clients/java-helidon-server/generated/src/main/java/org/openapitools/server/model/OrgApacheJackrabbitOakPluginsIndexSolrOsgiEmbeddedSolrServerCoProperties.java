package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties   {

    private ConfigNodePropertyString solrHomePath;
    private ConfigNodePropertyString solrCoreName;

    /**
     * Default constructor.
     */
    public OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties.
     *
     * @param solrHomePath solrHomePath
     * @param solrCoreName solrCoreName
     */
    public OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties(
        ConfigNodePropertyString solrHomePath, 
        ConfigNodePropertyString solrCoreName
    ) {
        this.solrHomePath = solrHomePath;
        this.solrCoreName = solrCoreName;
    }



    /**
     * Get solrHomePath
     * @return solrHomePath
     */
    public ConfigNodePropertyString getSolrHomePath() {
        return solrHomePath;
    }

    public void setSolrHomePath(ConfigNodePropertyString solrHomePath) {
        this.solrHomePath = solrHomePath;
    }

    /**
     * Get solrCoreName
     * @return solrCoreName
     */
    public ConfigNodePropertyString getSolrCoreName() {
        return solrCoreName;
    }

    public void setSolrCoreName(ConfigNodePropertyString solrCoreName) {
        this.solrCoreName = solrCoreName;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties {\n");
        
        sb.append("    solrHomePath: ").append(toIndentedString(solrHomePath)).append("\n");
        sb.append("    solrCoreName: ").append(toIndentedString(solrCoreName)).append("\n");
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

