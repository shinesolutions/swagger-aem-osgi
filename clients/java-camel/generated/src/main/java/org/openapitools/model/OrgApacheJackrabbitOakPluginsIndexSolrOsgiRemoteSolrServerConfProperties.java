package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties
 */

@JsonTypeName("orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties {

  private ConfigNodePropertyString solrHttpUrl;

  private ConfigNodePropertyString solrZkHost;

  private ConfigNodePropertyString solrCollection;

  private ConfigNodePropertyInteger solrSocketTimeout;

  private ConfigNodePropertyInteger solrConnectionTimeout;

  private ConfigNodePropertyInteger solrShardsNo;

  private ConfigNodePropertyInteger solrReplicationFactor;

  private ConfigNodePropertyString solrConfDir;

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties solrHttpUrl(ConfigNodePropertyString solrHttpUrl) {
    this.solrHttpUrl = solrHttpUrl;
    return this;
  }

  /**
   * Get solrHttpUrl
   * @return solrHttpUrl
   */
  @Valid 
  @Schema(name = "solr.http.url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("solr.http.url")
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
   */
  @Valid 
  @Schema(name = "solr.zk.host", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("solr.zk.host")
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
   */
  @Valid 
  @Schema(name = "solr.collection", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("solr.collection")
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
   */
  @Valid 
  @Schema(name = "solr.socket.timeout", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("solr.socket.timeout")
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
   */
  @Valid 
  @Schema(name = "solr.connection.timeout", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("solr.connection.timeout")
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
   */
  @Valid 
  @Schema(name = "solr.shards.no", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("solr.shards.no")
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
   */
  @Valid 
  @Schema(name = "solr.replication.factor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("solr.replication.factor")
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
   */
  @Valid 
  @Schema(name = "solr.conf.dir", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("solr.conf.dir")
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

