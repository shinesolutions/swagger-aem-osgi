package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("solr.http.url")
  private ConfigNodePropertyString solrHttpUrl;

  @JsonProperty("solr.zk.host")
  private ConfigNodePropertyString solrZkHost;

  @JsonProperty("solr.collection")
  private ConfigNodePropertyString solrCollection;

  @JsonProperty("solr.socket.timeout")
  private ConfigNodePropertyInteger solrSocketTimeout;

  @JsonProperty("solr.connection.timeout")
  private ConfigNodePropertyInteger solrConnectionTimeout;

  @JsonProperty("solr.shards.no")
  private ConfigNodePropertyInteger solrShardsNo;

  @JsonProperty("solr.replication.factor")
  private ConfigNodePropertyInteger solrReplicationFactor;

  @JsonProperty("solr.conf.dir")
  private ConfigNodePropertyString solrConfDir;

  /**
   * 
   * @return solrHttpUrl
   */
  public ConfigNodePropertyString getSolrHttpUrl() {
    return solrHttpUrl;
  }

  public void setSolrHttpUrl(ConfigNodePropertyString solrHttpUrl) {
    this.solrHttpUrl = solrHttpUrl;
  }

  /**
   * 
   * @return solrZkHost
   */
  public ConfigNodePropertyString getSolrZkHost() {
    return solrZkHost;
  }

  public void setSolrZkHost(ConfigNodePropertyString solrZkHost) {
    this.solrZkHost = solrZkHost;
  }

  /**
   * 
   * @return solrCollection
   */
  public ConfigNodePropertyString getSolrCollection() {
    return solrCollection;
  }

  public void setSolrCollection(ConfigNodePropertyString solrCollection) {
    this.solrCollection = solrCollection;
  }

  /**
   * 
   * @return solrSocketTimeout
   */
  public ConfigNodePropertyInteger getSolrSocketTimeout() {
    return solrSocketTimeout;
  }

  public void setSolrSocketTimeout(ConfigNodePropertyInteger solrSocketTimeout) {
    this.solrSocketTimeout = solrSocketTimeout;
  }

  /**
   * 
   * @return solrConnectionTimeout
   */
  public ConfigNodePropertyInteger getSolrConnectionTimeout() {
    return solrConnectionTimeout;
  }

  public void setSolrConnectionTimeout(ConfigNodePropertyInteger solrConnectionTimeout) {
    this.solrConnectionTimeout = solrConnectionTimeout;
  }

  /**
   * 
   * @return solrShardsNo
   */
  public ConfigNodePropertyInteger getSolrShardsNo() {
    return solrShardsNo;
  }

  public void setSolrShardsNo(ConfigNodePropertyInteger solrShardsNo) {
    this.solrShardsNo = solrShardsNo;
  }

  /**
   * 
   * @return solrReplicationFactor
   */
  public ConfigNodePropertyInteger getSolrReplicationFactor() {
    return solrReplicationFactor;
  }

  public void setSolrReplicationFactor(ConfigNodePropertyInteger solrReplicationFactor) {
    this.solrReplicationFactor = solrReplicationFactor;
  }

  /**
   * 
   * @return solrConfDir
   */
  public ConfigNodePropertyString getSolrConfDir() {
    return solrConfDir;
  }

  public void setSolrConfDir(ConfigNodePropertyString solrConfDir) {
    this.solrConfDir = solrConfDir;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties = (OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties) o;
    return Objects.equals(this.solrHttpUrl, orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties.solrHttpUrl) &&
        Objects.equals(this.solrZkHost, orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties.solrZkHost) &&
        Objects.equals(this.solrCollection, orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties.solrCollection) &&
        Objects.equals(this.solrSocketTimeout, orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties.solrSocketTimeout) &&
        Objects.equals(this.solrConnectionTimeout, orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties.solrConnectionTimeout) &&
        Objects.equals(this.solrShardsNo, orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties.solrShardsNo) &&
        Objects.equals(this.solrReplicationFactor, orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties.solrReplicationFactor) &&
        Objects.equals(this.solrConfDir, orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties.solrConfDir);
  }

  @Override
  public int hashCode() {
    return Objects.hash(solrHttpUrl, solrZkHost, solrCollection, solrSocketTimeout, solrConnectionTimeout, solrShardsNo, solrReplicationFactor, solrConfDir);
  }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
