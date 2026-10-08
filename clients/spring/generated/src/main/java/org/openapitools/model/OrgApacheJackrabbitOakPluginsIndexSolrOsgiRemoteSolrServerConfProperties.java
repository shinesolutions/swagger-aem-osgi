package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
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
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString solrHttpUrl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString solrZkHost;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString solrCollection;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger solrSocketTimeout;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger solrConnectionTimeout;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger solrShardsNo;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger solrReplicationFactor;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString solrConfDir;

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties solrHttpUrl(@Nullable ConfigNodePropertyString solrHttpUrl) {
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
  public @Nullable ConfigNodePropertyString getSolrHttpUrl() {
    return solrHttpUrl;
  }

  @JsonProperty("solr.http.url")
  public void setSolrHttpUrl(@Nullable ConfigNodePropertyString solrHttpUrl) {
    this.solrHttpUrl = solrHttpUrl;
  }

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties solrZkHost(@Nullable ConfigNodePropertyString solrZkHost) {
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
  public @Nullable ConfigNodePropertyString getSolrZkHost() {
    return solrZkHost;
  }

  @JsonProperty("solr.zk.host")
  public void setSolrZkHost(@Nullable ConfigNodePropertyString solrZkHost) {
    this.solrZkHost = solrZkHost;
  }

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties solrCollection(@Nullable ConfigNodePropertyString solrCollection) {
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
  public @Nullable ConfigNodePropertyString getSolrCollection() {
    return solrCollection;
  }

  @JsonProperty("solr.collection")
  public void setSolrCollection(@Nullable ConfigNodePropertyString solrCollection) {
    this.solrCollection = solrCollection;
  }

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties solrSocketTimeout(@Nullable ConfigNodePropertyInteger solrSocketTimeout) {
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
  public @Nullable ConfigNodePropertyInteger getSolrSocketTimeout() {
    return solrSocketTimeout;
  }

  @JsonProperty("solr.socket.timeout")
  public void setSolrSocketTimeout(@Nullable ConfigNodePropertyInteger solrSocketTimeout) {
    this.solrSocketTimeout = solrSocketTimeout;
  }

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties solrConnectionTimeout(@Nullable ConfigNodePropertyInteger solrConnectionTimeout) {
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
  public @Nullable ConfigNodePropertyInteger getSolrConnectionTimeout() {
    return solrConnectionTimeout;
  }

  @JsonProperty("solr.connection.timeout")
  public void setSolrConnectionTimeout(@Nullable ConfigNodePropertyInteger solrConnectionTimeout) {
    this.solrConnectionTimeout = solrConnectionTimeout;
  }

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties solrShardsNo(@Nullable ConfigNodePropertyInteger solrShardsNo) {
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
  public @Nullable ConfigNodePropertyInteger getSolrShardsNo() {
    return solrShardsNo;
  }

  @JsonProperty("solr.shards.no")
  public void setSolrShardsNo(@Nullable ConfigNodePropertyInteger solrShardsNo) {
    this.solrShardsNo = solrShardsNo;
  }

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties solrReplicationFactor(@Nullable ConfigNodePropertyInteger solrReplicationFactor) {
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
  public @Nullable ConfigNodePropertyInteger getSolrReplicationFactor() {
    return solrReplicationFactor;
  }

  @JsonProperty("solr.replication.factor")
  public void setSolrReplicationFactor(@Nullable ConfigNodePropertyInteger solrReplicationFactor) {
    this.solrReplicationFactor = solrReplicationFactor;
  }

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties solrConfDir(@Nullable ConfigNodePropertyString solrConfDir) {
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
  public @Nullable ConfigNodePropertyString getSolrConfDir() {
    return solrConfDir;
  }

  @JsonProperty("solr.conf.dir")
  public void setSolrConfDir(@Nullable ConfigNodePropertyString solrConfDir) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

