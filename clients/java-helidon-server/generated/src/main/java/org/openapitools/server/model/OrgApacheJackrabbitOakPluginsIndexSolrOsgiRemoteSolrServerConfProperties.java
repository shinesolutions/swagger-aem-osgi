package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties   {

    private ConfigNodePropertyString solrHttpUrl;
    private ConfigNodePropertyString solrZkHost;
    private ConfigNodePropertyString solrCollection;
    private ConfigNodePropertyInteger solrSocketTimeout;
    private ConfigNodePropertyInteger solrConnectionTimeout;
    private ConfigNodePropertyInteger solrShardsNo;
    private ConfigNodePropertyInteger solrReplicationFactor;
    private ConfigNodePropertyString solrConfDir;

    /**
     * Default constructor.
     */
    public OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties.
     *
     * @param solrHttpUrl solrHttpUrl
     * @param solrZkHost solrZkHost
     * @param solrCollection solrCollection
     * @param solrSocketTimeout solrSocketTimeout
     * @param solrConnectionTimeout solrConnectionTimeout
     * @param solrShardsNo solrShardsNo
     * @param solrReplicationFactor solrReplicationFactor
     * @param solrConfDir solrConfDir
     */
    public OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties(
        ConfigNodePropertyString solrHttpUrl, 
        ConfigNodePropertyString solrZkHost, 
        ConfigNodePropertyString solrCollection, 
        ConfigNodePropertyInteger solrSocketTimeout, 
        ConfigNodePropertyInteger solrConnectionTimeout, 
        ConfigNodePropertyInteger solrShardsNo, 
        ConfigNodePropertyInteger solrReplicationFactor, 
        ConfigNodePropertyString solrConfDir
    ) {
        this.solrHttpUrl = solrHttpUrl;
        this.solrZkHost = solrZkHost;
        this.solrCollection = solrCollection;
        this.solrSocketTimeout = solrSocketTimeout;
        this.solrConnectionTimeout = solrConnectionTimeout;
        this.solrShardsNo = solrShardsNo;
        this.solrReplicationFactor = solrReplicationFactor;
        this.solrConfDir = solrConfDir;
    }



    /**
     * Get solrHttpUrl
     * @return solrHttpUrl
     */
    public ConfigNodePropertyString getSolrHttpUrl() {
        return solrHttpUrl;
    }

    public void setSolrHttpUrl(ConfigNodePropertyString solrHttpUrl) {
        this.solrHttpUrl = solrHttpUrl;
    }

    /**
     * Get solrZkHost
     * @return solrZkHost
     */
    public ConfigNodePropertyString getSolrZkHost() {
        return solrZkHost;
    }

    public void setSolrZkHost(ConfigNodePropertyString solrZkHost) {
        this.solrZkHost = solrZkHost;
    }

    /**
     * Get solrCollection
     * @return solrCollection
     */
    public ConfigNodePropertyString getSolrCollection() {
        return solrCollection;
    }

    public void setSolrCollection(ConfigNodePropertyString solrCollection) {
        this.solrCollection = solrCollection;
    }

    /**
     * Get solrSocketTimeout
     * @return solrSocketTimeout
     */
    public ConfigNodePropertyInteger getSolrSocketTimeout() {
        return solrSocketTimeout;
    }

    public void setSolrSocketTimeout(ConfigNodePropertyInteger solrSocketTimeout) {
        this.solrSocketTimeout = solrSocketTimeout;
    }

    /**
     * Get solrConnectionTimeout
     * @return solrConnectionTimeout
     */
    public ConfigNodePropertyInteger getSolrConnectionTimeout() {
        return solrConnectionTimeout;
    }

    public void setSolrConnectionTimeout(ConfigNodePropertyInteger solrConnectionTimeout) {
        this.solrConnectionTimeout = solrConnectionTimeout;
    }

    /**
     * Get solrShardsNo
     * @return solrShardsNo
     */
    public ConfigNodePropertyInteger getSolrShardsNo() {
        return solrShardsNo;
    }

    public void setSolrShardsNo(ConfigNodePropertyInteger solrShardsNo) {
        this.solrShardsNo = solrShardsNo;
    }

    /**
     * Get solrReplicationFactor
     * @return solrReplicationFactor
     */
    public ConfigNodePropertyInteger getSolrReplicationFactor() {
        return solrReplicationFactor;
    }

    public void setSolrReplicationFactor(ConfigNodePropertyInteger solrReplicationFactor) {
        this.solrReplicationFactor = solrReplicationFactor;
    }

    /**
     * Get solrConfDir
     * @return solrConfDir
     */
    public ConfigNodePropertyString getSolrConfDir() {
        return solrConfDir;
    }

    public void setSolrConfDir(ConfigNodePropertyString solrConfDir) {
        this.solrConfDir = solrConfDir;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties {\n");
        
        sb.append("    solrHttpUrl: ").append(toIndentedString(solrHttpUrl)).append("\n");
        sb.append("    solrZkHost: ").append(toIndentedString(solrZkHost)).append("\n");
        sb.append("    solrCollection: ").append(toIndentedString(solrCollection)).append("\n");
        sb.append("    solrSocketTimeout: ").append(toIndentedString(solrSocketTimeout)).append("\n");
        sb.append("    solrConnectionTimeout: ").append(toIndentedString(solrConnectionTimeout)).append("\n");
        sb.append("    solrShardsNo: ").append(toIndentedString(solrShardsNo)).append("\n");
        sb.append("    solrReplicationFactor: ").append(toIndentedString(solrReplicationFactor)).append("\n");
        sb.append("    solrConfDir: ").append(toIndentedString(solrConfDir)).append("\n");
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

