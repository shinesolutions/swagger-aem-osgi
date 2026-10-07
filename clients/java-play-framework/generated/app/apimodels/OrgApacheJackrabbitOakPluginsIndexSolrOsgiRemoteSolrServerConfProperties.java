package apimodels;

import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties   {
  @JsonProperty("solr.http.url")
  @Valid

  private ConfigNodePropertyString solrHttpUrl;

  @JsonProperty("solr.zk.host")
  @Valid

  private ConfigNodePropertyString solrZkHost;

  @JsonProperty("solr.collection")
  @Valid

  private ConfigNodePropertyString solrCollection;

  @JsonProperty("solr.socket.timeout")
  @Valid

  private ConfigNodePropertyInteger solrSocketTimeout;

  @JsonProperty("solr.connection.timeout")
  @Valid

  private ConfigNodePropertyInteger solrConnectionTimeout;

  @JsonProperty("solr.shards.no")
  @Valid

  private ConfigNodePropertyInteger solrShardsNo;

  @JsonProperty("solr.replication.factor")
  @Valid

  private ConfigNodePropertyInteger solrReplicationFactor;

  @JsonProperty("solr.conf.dir")
  @Valid

  private ConfigNodePropertyString solrConfDir;

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties solrHttpUrl(ConfigNodePropertyString solrHttpUrl) {
    this.solrHttpUrl = solrHttpUrl;
    return this;
  }

   /**
   * Get solrHttpUrl
   * @return solrHttpUrl
  **/
  public ConfigNodePropertyString getSolrHttpUrl() {
    return solrHttpUrl;
  }

  public void setSolrHttpUrl(ConfigNodePropertyString solrHttpUrl) {
    this.solrHttpUrl = solrHttpUrl;
  }

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties solrZkHost(ConfigNodePropertyString solrZkHost) {
    this.solrZkHost = solrZkHost;
    return this;
  }

   /**
   * Get solrZkHost
   * @return solrZkHost
  **/
  public ConfigNodePropertyString getSolrZkHost() {
    return solrZkHost;
  }

  public void setSolrZkHost(ConfigNodePropertyString solrZkHost) {
    this.solrZkHost = solrZkHost;
  }

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties solrCollection(ConfigNodePropertyString solrCollection) {
    this.solrCollection = solrCollection;
    return this;
  }

   /**
   * Get solrCollection
   * @return solrCollection
  **/
  public ConfigNodePropertyString getSolrCollection() {
    return solrCollection;
  }

  public void setSolrCollection(ConfigNodePropertyString solrCollection) {
    this.solrCollection = solrCollection;
  }

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties solrSocketTimeout(ConfigNodePropertyInteger solrSocketTimeout) {
    this.solrSocketTimeout = solrSocketTimeout;
    return this;
  }

   /**
   * Get solrSocketTimeout
   * @return solrSocketTimeout
  **/
  public ConfigNodePropertyInteger getSolrSocketTimeout() {
    return solrSocketTimeout;
  }

  public void setSolrSocketTimeout(ConfigNodePropertyInteger solrSocketTimeout) {
    this.solrSocketTimeout = solrSocketTimeout;
  }

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties solrConnectionTimeout(ConfigNodePropertyInteger solrConnectionTimeout) {
    this.solrConnectionTimeout = solrConnectionTimeout;
    return this;
  }

   /**
   * Get solrConnectionTimeout
   * @return solrConnectionTimeout
  **/
  public ConfigNodePropertyInteger getSolrConnectionTimeout() {
    return solrConnectionTimeout;
  }

  public void setSolrConnectionTimeout(ConfigNodePropertyInteger solrConnectionTimeout) {
    this.solrConnectionTimeout = solrConnectionTimeout;
  }

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties solrShardsNo(ConfigNodePropertyInteger solrShardsNo) {
    this.solrShardsNo = solrShardsNo;
    return this;
  }

   /**
   * Get solrShardsNo
   * @return solrShardsNo
  **/
  public ConfigNodePropertyInteger getSolrShardsNo() {
    return solrShardsNo;
  }

  public void setSolrShardsNo(ConfigNodePropertyInteger solrShardsNo) {
    this.solrShardsNo = solrShardsNo;
  }

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties solrReplicationFactor(ConfigNodePropertyInteger solrReplicationFactor) {
    this.solrReplicationFactor = solrReplicationFactor;
    return this;
  }

   /**
   * Get solrReplicationFactor
   * @return solrReplicationFactor
  **/
  public ConfigNodePropertyInteger getSolrReplicationFactor() {
    return solrReplicationFactor;
  }

  public void setSolrReplicationFactor(ConfigNodePropertyInteger solrReplicationFactor) {
    this.solrReplicationFactor = solrReplicationFactor;
  }

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties solrConfDir(ConfigNodePropertyString solrConfDir) {
    this.solrConfDir = solrConfDir;
    return this;
  }

   /**
   * Get solrConfDir
   * @return solrConfDir
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

