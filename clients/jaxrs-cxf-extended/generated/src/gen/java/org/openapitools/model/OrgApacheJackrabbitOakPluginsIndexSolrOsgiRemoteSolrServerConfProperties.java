package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString solrHttpUrl;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString solrZkHost;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString solrCollection;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger solrSocketTimeout;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger solrConnectionTimeout;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger solrShardsNo;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger solrReplicationFactor;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString solrConfDir;
 /**
  * Get solrHttpUrl
  * @return solrHttpUrl
  */
  @JsonProperty("solr.http.url")
  public ConfigNodePropertyString getSolrHttpUrl() {
    return solrHttpUrl;
  }

  /**
   * Sets the <code>solrHttpUrl</code> property.
   */
 public void setSolrHttpUrl(ConfigNodePropertyString solrHttpUrl) {
    this.solrHttpUrl = solrHttpUrl;
  }

  /**
   * Sets the <code>solrHttpUrl</code> property.
   */
  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties solrHttpUrl(ConfigNodePropertyString solrHttpUrl) {
    this.solrHttpUrl = solrHttpUrl;
    return this;
  }

 /**
  * Get solrZkHost
  * @return solrZkHost
  */
  @JsonProperty("solr.zk.host")
  public ConfigNodePropertyString getSolrZkHost() {
    return solrZkHost;
  }

  /**
   * Sets the <code>solrZkHost</code> property.
   */
 public void setSolrZkHost(ConfigNodePropertyString solrZkHost) {
    this.solrZkHost = solrZkHost;
  }

  /**
   * Sets the <code>solrZkHost</code> property.
   */
  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties solrZkHost(ConfigNodePropertyString solrZkHost) {
    this.solrZkHost = solrZkHost;
    return this;
  }

 /**
  * Get solrCollection
  * @return solrCollection
  */
  @JsonProperty("solr.collection")
  public ConfigNodePropertyString getSolrCollection() {
    return solrCollection;
  }

  /**
   * Sets the <code>solrCollection</code> property.
   */
 public void setSolrCollection(ConfigNodePropertyString solrCollection) {
    this.solrCollection = solrCollection;
  }

  /**
   * Sets the <code>solrCollection</code> property.
   */
  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties solrCollection(ConfigNodePropertyString solrCollection) {
    this.solrCollection = solrCollection;
    return this;
  }

 /**
  * Get solrSocketTimeout
  * @return solrSocketTimeout
  */
  @JsonProperty("solr.socket.timeout")
  public ConfigNodePropertyInteger getSolrSocketTimeout() {
    return solrSocketTimeout;
  }

  /**
   * Sets the <code>solrSocketTimeout</code> property.
   */
 public void setSolrSocketTimeout(ConfigNodePropertyInteger solrSocketTimeout) {
    this.solrSocketTimeout = solrSocketTimeout;
  }

  /**
   * Sets the <code>solrSocketTimeout</code> property.
   */
  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties solrSocketTimeout(ConfigNodePropertyInteger solrSocketTimeout) {
    this.solrSocketTimeout = solrSocketTimeout;
    return this;
  }

 /**
  * Get solrConnectionTimeout
  * @return solrConnectionTimeout
  */
  @JsonProperty("solr.connection.timeout")
  public ConfigNodePropertyInteger getSolrConnectionTimeout() {
    return solrConnectionTimeout;
  }

  /**
   * Sets the <code>solrConnectionTimeout</code> property.
   */
 public void setSolrConnectionTimeout(ConfigNodePropertyInteger solrConnectionTimeout) {
    this.solrConnectionTimeout = solrConnectionTimeout;
  }

  /**
   * Sets the <code>solrConnectionTimeout</code> property.
   */
  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties solrConnectionTimeout(ConfigNodePropertyInteger solrConnectionTimeout) {
    this.solrConnectionTimeout = solrConnectionTimeout;
    return this;
  }

 /**
  * Get solrShardsNo
  * @return solrShardsNo
  */
  @JsonProperty("solr.shards.no")
  public ConfigNodePropertyInteger getSolrShardsNo() {
    return solrShardsNo;
  }

  /**
   * Sets the <code>solrShardsNo</code> property.
   */
 public void setSolrShardsNo(ConfigNodePropertyInteger solrShardsNo) {
    this.solrShardsNo = solrShardsNo;
  }

  /**
   * Sets the <code>solrShardsNo</code> property.
   */
  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties solrShardsNo(ConfigNodePropertyInteger solrShardsNo) {
    this.solrShardsNo = solrShardsNo;
    return this;
  }

 /**
  * Get solrReplicationFactor
  * @return solrReplicationFactor
  */
  @JsonProperty("solr.replication.factor")
  public ConfigNodePropertyInteger getSolrReplicationFactor() {
    return solrReplicationFactor;
  }

  /**
   * Sets the <code>solrReplicationFactor</code> property.
   */
 public void setSolrReplicationFactor(ConfigNodePropertyInteger solrReplicationFactor) {
    this.solrReplicationFactor = solrReplicationFactor;
  }

  /**
   * Sets the <code>solrReplicationFactor</code> property.
   */
  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties solrReplicationFactor(ConfigNodePropertyInteger solrReplicationFactor) {
    this.solrReplicationFactor = solrReplicationFactor;
    return this;
  }

 /**
  * Get solrConfDir
  * @return solrConfDir
  */
  @JsonProperty("solr.conf.dir")
  public ConfigNodePropertyString getSolrConfDir() {
    return solrConfDir;
  }

  /**
   * Sets the <code>solrConfDir</code> property.
   */
 public void setSolrConfDir(ConfigNodePropertyString solrConfDir) {
    this.solrConfDir = solrConfDir;
  }

  /**
   * Sets the <code>solrConfDir</code> property.
   */
  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties solrConfDir(ConfigNodePropertyString solrConfDir) {
    this.solrConfDir = solrConfDir;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

