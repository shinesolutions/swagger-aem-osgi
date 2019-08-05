package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties   {
  
  private @Valid ConfigNodePropertyString solrHttpUrl = null;
  private @Valid ConfigNodePropertyString solrZkHost = null;
  private @Valid ConfigNodePropertyString solrCollection = null;
  private @Valid ConfigNodePropertyInteger solrSocketTimeout = null;
  private @Valid ConfigNodePropertyInteger solrConnectionTimeout = null;
  private @Valid ConfigNodePropertyInteger solrShardsNo = null;
  private @Valid ConfigNodePropertyInteger solrReplicationFactor = null;
  private @Valid ConfigNodePropertyString solrConfDir = null;

  /**
   **/
  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties solrHttpUrl(ConfigNodePropertyString solrHttpUrl) {
    this.solrHttpUrl = solrHttpUrl;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("solr.http.url")
  public ConfigNodePropertyString getSolrHttpUrl() {
    return solrHttpUrl;
  }
  public void setSolrHttpUrl(ConfigNodePropertyString solrHttpUrl) {
    this.solrHttpUrl = solrHttpUrl;
  }

  /**
   **/
  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties solrZkHost(ConfigNodePropertyString solrZkHost) {
    this.solrZkHost = solrZkHost;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("solr.zk.host")
  public ConfigNodePropertyString getSolrZkHost() {
    return solrZkHost;
  }
  public void setSolrZkHost(ConfigNodePropertyString solrZkHost) {
    this.solrZkHost = solrZkHost;
  }

  /**
   **/
  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties solrCollection(ConfigNodePropertyString solrCollection) {
    this.solrCollection = solrCollection;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("solr.collection")
  public ConfigNodePropertyString getSolrCollection() {
    return solrCollection;
  }
  public void setSolrCollection(ConfigNodePropertyString solrCollection) {
    this.solrCollection = solrCollection;
  }

  /**
   **/
  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties solrSocketTimeout(ConfigNodePropertyInteger solrSocketTimeout) {
    this.solrSocketTimeout = solrSocketTimeout;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("solr.socket.timeout")
  public ConfigNodePropertyInteger getSolrSocketTimeout() {
    return solrSocketTimeout;
  }
  public void setSolrSocketTimeout(ConfigNodePropertyInteger solrSocketTimeout) {
    this.solrSocketTimeout = solrSocketTimeout;
  }

  /**
   **/
  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties solrConnectionTimeout(ConfigNodePropertyInteger solrConnectionTimeout) {
    this.solrConnectionTimeout = solrConnectionTimeout;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("solr.connection.timeout")
  public ConfigNodePropertyInteger getSolrConnectionTimeout() {
    return solrConnectionTimeout;
  }
  public void setSolrConnectionTimeout(ConfigNodePropertyInteger solrConnectionTimeout) {
    this.solrConnectionTimeout = solrConnectionTimeout;
  }

  /**
   **/
  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties solrShardsNo(ConfigNodePropertyInteger solrShardsNo) {
    this.solrShardsNo = solrShardsNo;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("solr.shards.no")
  public ConfigNodePropertyInteger getSolrShardsNo() {
    return solrShardsNo;
  }
  public void setSolrShardsNo(ConfigNodePropertyInteger solrShardsNo) {
    this.solrShardsNo = solrShardsNo;
  }

  /**
   **/
  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties solrReplicationFactor(ConfigNodePropertyInteger solrReplicationFactor) {
    this.solrReplicationFactor = solrReplicationFactor;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("solr.replication.factor")
  public ConfigNodePropertyInteger getSolrReplicationFactor() {
    return solrReplicationFactor;
  }
  public void setSolrReplicationFactor(ConfigNodePropertyInteger solrReplicationFactor) {
    this.solrReplicationFactor = solrReplicationFactor;
  }

  /**
   **/
  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties solrConfDir(ConfigNodePropertyString solrConfDir) {
    this.solrConfDir = solrConfDir;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("solr.conf.dir")
  public ConfigNodePropertyString getSolrConfDir() {
    return solrConfDir;
  }
  public void setSolrConfDir(ConfigNodePropertyString solrConfDir) {
    this.solrConfDir = solrConfDir;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties = (OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties) o;
    return Objects.equals(solrHttpUrl, orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties.solrHttpUrl) &&
        Objects.equals(solrZkHost, orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties.solrZkHost) &&
        Objects.equals(solrCollection, orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties.solrCollection) &&
        Objects.equals(solrSocketTimeout, orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties.solrSocketTimeout) &&
        Objects.equals(solrConnectionTimeout, orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties.solrConnectionTimeout) &&
        Objects.equals(solrShardsNo, orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties.solrShardsNo) &&
        Objects.equals(solrReplicationFactor, orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties.solrReplicationFactor) &&
        Objects.equals(solrConfDir, orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties.solrConfDir);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

