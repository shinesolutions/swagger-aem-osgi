package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
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
 * OrgApacheSlingDiscoveryOakConfigProperties
 */

@JsonTypeName("orgApacheSlingDiscoveryOakConfigProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingDiscoveryOakConfigProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger connectorPingTimeout;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger connectorPingInterval;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger discoveryLiteCheckInterval;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger clusterSyncServiceTimeout;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger clusterSyncServiceInterval;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean enableSyncToken;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger minEventDelay;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger socketConnectTimeout;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger soTimeout;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray topologyConnectorUrls;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray topologyConnectorWhitelist;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean autoStopLocalLoopEnabled;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean gzipConnectorRequestsEnabled;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean hmacEnabled;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean enableEncryption;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString sharedKey;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger hmacSharedKeyTTL;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString backoffStandbyFactor;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString backoffStableFactor;

  public OrgApacheSlingDiscoveryOakConfigProperties connectorPingTimeout(@Nullable ConfigNodePropertyInteger connectorPingTimeout) {
    this.connectorPingTimeout = connectorPingTimeout;
    return this;
  }

  /**
   * Get connectorPingTimeout
   * @return connectorPingTimeout
   */
  @Valid 
  @Schema(name = "connectorPingTimeout", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connectorPingTimeout")
  public @Nullable ConfigNodePropertyInteger getConnectorPingTimeout() {
    return connectorPingTimeout;
  }

  @JsonProperty("connectorPingTimeout")
  public void setConnectorPingTimeout(@Nullable ConfigNodePropertyInteger connectorPingTimeout) {
    this.connectorPingTimeout = connectorPingTimeout;
  }

  public OrgApacheSlingDiscoveryOakConfigProperties connectorPingInterval(@Nullable ConfigNodePropertyInteger connectorPingInterval) {
    this.connectorPingInterval = connectorPingInterval;
    return this;
  }

  /**
   * Get connectorPingInterval
   * @return connectorPingInterval
   */
  @Valid 
  @Schema(name = "connectorPingInterval", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connectorPingInterval")
  public @Nullable ConfigNodePropertyInteger getConnectorPingInterval() {
    return connectorPingInterval;
  }

  @JsonProperty("connectorPingInterval")
  public void setConnectorPingInterval(@Nullable ConfigNodePropertyInteger connectorPingInterval) {
    this.connectorPingInterval = connectorPingInterval;
  }

  public OrgApacheSlingDiscoveryOakConfigProperties discoveryLiteCheckInterval(@Nullable ConfigNodePropertyInteger discoveryLiteCheckInterval) {
    this.discoveryLiteCheckInterval = discoveryLiteCheckInterval;
    return this;
  }

  /**
   * Get discoveryLiteCheckInterval
   * @return discoveryLiteCheckInterval
   */
  @Valid 
  @Schema(name = "discoveryLiteCheckInterval", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("discoveryLiteCheckInterval")
  public @Nullable ConfigNodePropertyInteger getDiscoveryLiteCheckInterval() {
    return discoveryLiteCheckInterval;
  }

  @JsonProperty("discoveryLiteCheckInterval")
  public void setDiscoveryLiteCheckInterval(@Nullable ConfigNodePropertyInteger discoveryLiteCheckInterval) {
    this.discoveryLiteCheckInterval = discoveryLiteCheckInterval;
  }

  public OrgApacheSlingDiscoveryOakConfigProperties clusterSyncServiceTimeout(@Nullable ConfigNodePropertyInteger clusterSyncServiceTimeout) {
    this.clusterSyncServiceTimeout = clusterSyncServiceTimeout;
    return this;
  }

  /**
   * Get clusterSyncServiceTimeout
   * @return clusterSyncServiceTimeout
   */
  @Valid 
  @Schema(name = "clusterSyncServiceTimeout", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clusterSyncServiceTimeout")
  public @Nullable ConfigNodePropertyInteger getClusterSyncServiceTimeout() {
    return clusterSyncServiceTimeout;
  }

  @JsonProperty("clusterSyncServiceTimeout")
  public void setClusterSyncServiceTimeout(@Nullable ConfigNodePropertyInteger clusterSyncServiceTimeout) {
    this.clusterSyncServiceTimeout = clusterSyncServiceTimeout;
  }

  public OrgApacheSlingDiscoveryOakConfigProperties clusterSyncServiceInterval(@Nullable ConfigNodePropertyInteger clusterSyncServiceInterval) {
    this.clusterSyncServiceInterval = clusterSyncServiceInterval;
    return this;
  }

  /**
   * Get clusterSyncServiceInterval
   * @return clusterSyncServiceInterval
   */
  @Valid 
  @Schema(name = "clusterSyncServiceInterval", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clusterSyncServiceInterval")
  public @Nullable ConfigNodePropertyInteger getClusterSyncServiceInterval() {
    return clusterSyncServiceInterval;
  }

  @JsonProperty("clusterSyncServiceInterval")
  public void setClusterSyncServiceInterval(@Nullable ConfigNodePropertyInteger clusterSyncServiceInterval) {
    this.clusterSyncServiceInterval = clusterSyncServiceInterval;
  }

  public OrgApacheSlingDiscoveryOakConfigProperties enableSyncToken(@Nullable ConfigNodePropertyBoolean enableSyncToken) {
    this.enableSyncToken = enableSyncToken;
    return this;
  }

  /**
   * Get enableSyncToken
   * @return enableSyncToken
   */
  @Valid 
  @Schema(name = "enableSyncToken", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enableSyncToken")
  public @Nullable ConfigNodePropertyBoolean getEnableSyncToken() {
    return enableSyncToken;
  }

  @JsonProperty("enableSyncToken")
  public void setEnableSyncToken(@Nullable ConfigNodePropertyBoolean enableSyncToken) {
    this.enableSyncToken = enableSyncToken;
  }

  public OrgApacheSlingDiscoveryOakConfigProperties minEventDelay(@Nullable ConfigNodePropertyInteger minEventDelay) {
    this.minEventDelay = minEventDelay;
    return this;
  }

  /**
   * Get minEventDelay
   * @return minEventDelay
   */
  @Valid 
  @Schema(name = "minEventDelay", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minEventDelay")
  public @Nullable ConfigNodePropertyInteger getMinEventDelay() {
    return minEventDelay;
  }

  @JsonProperty("minEventDelay")
  public void setMinEventDelay(@Nullable ConfigNodePropertyInteger minEventDelay) {
    this.minEventDelay = minEventDelay;
  }

  public OrgApacheSlingDiscoveryOakConfigProperties socketConnectTimeout(@Nullable ConfigNodePropertyInteger socketConnectTimeout) {
    this.socketConnectTimeout = socketConnectTimeout;
    return this;
  }

  /**
   * Get socketConnectTimeout
   * @return socketConnectTimeout
   */
  @Valid 
  @Schema(name = "socketConnectTimeout", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("socketConnectTimeout")
  public @Nullable ConfigNodePropertyInteger getSocketConnectTimeout() {
    return socketConnectTimeout;
  }

  @JsonProperty("socketConnectTimeout")
  public void setSocketConnectTimeout(@Nullable ConfigNodePropertyInteger socketConnectTimeout) {
    this.socketConnectTimeout = socketConnectTimeout;
  }

  public OrgApacheSlingDiscoveryOakConfigProperties soTimeout(@Nullable ConfigNodePropertyInteger soTimeout) {
    this.soTimeout = soTimeout;
    return this;
  }

  /**
   * Get soTimeout
   * @return soTimeout
   */
  @Valid 
  @Schema(name = "soTimeout", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("soTimeout")
  public @Nullable ConfigNodePropertyInteger getSoTimeout() {
    return soTimeout;
  }

  @JsonProperty("soTimeout")
  public void setSoTimeout(@Nullable ConfigNodePropertyInteger soTimeout) {
    this.soTimeout = soTimeout;
  }

  public OrgApacheSlingDiscoveryOakConfigProperties topologyConnectorUrls(@Nullable ConfigNodePropertyArray topologyConnectorUrls) {
    this.topologyConnectorUrls = topologyConnectorUrls;
    return this;
  }

  /**
   * Get topologyConnectorUrls
   * @return topologyConnectorUrls
   */
  @Valid 
  @Schema(name = "topologyConnectorUrls", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("topologyConnectorUrls")
  public @Nullable ConfigNodePropertyArray getTopologyConnectorUrls() {
    return topologyConnectorUrls;
  }

  @JsonProperty("topologyConnectorUrls")
  public void setTopologyConnectorUrls(@Nullable ConfigNodePropertyArray topologyConnectorUrls) {
    this.topologyConnectorUrls = topologyConnectorUrls;
  }

  public OrgApacheSlingDiscoveryOakConfigProperties topologyConnectorWhitelist(@Nullable ConfigNodePropertyArray topologyConnectorWhitelist) {
    this.topologyConnectorWhitelist = topologyConnectorWhitelist;
    return this;
  }

  /**
   * Get topologyConnectorWhitelist
   * @return topologyConnectorWhitelist
   */
  @Valid 
  @Schema(name = "topologyConnectorWhitelist", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("topologyConnectorWhitelist")
  public @Nullable ConfigNodePropertyArray getTopologyConnectorWhitelist() {
    return topologyConnectorWhitelist;
  }

  @JsonProperty("topologyConnectorWhitelist")
  public void setTopologyConnectorWhitelist(@Nullable ConfigNodePropertyArray topologyConnectorWhitelist) {
    this.topologyConnectorWhitelist = topologyConnectorWhitelist;
  }

  public OrgApacheSlingDiscoveryOakConfigProperties autoStopLocalLoopEnabled(@Nullable ConfigNodePropertyBoolean autoStopLocalLoopEnabled) {
    this.autoStopLocalLoopEnabled = autoStopLocalLoopEnabled;
    return this;
  }

  /**
   * Get autoStopLocalLoopEnabled
   * @return autoStopLocalLoopEnabled
   */
  @Valid 
  @Schema(name = "autoStopLocalLoopEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("autoStopLocalLoopEnabled")
  public @Nullable ConfigNodePropertyBoolean getAutoStopLocalLoopEnabled() {
    return autoStopLocalLoopEnabled;
  }

  @JsonProperty("autoStopLocalLoopEnabled")
  public void setAutoStopLocalLoopEnabled(@Nullable ConfigNodePropertyBoolean autoStopLocalLoopEnabled) {
    this.autoStopLocalLoopEnabled = autoStopLocalLoopEnabled;
  }

  public OrgApacheSlingDiscoveryOakConfigProperties gzipConnectorRequestsEnabled(@Nullable ConfigNodePropertyBoolean gzipConnectorRequestsEnabled) {
    this.gzipConnectorRequestsEnabled = gzipConnectorRequestsEnabled;
    return this;
  }

  /**
   * Get gzipConnectorRequestsEnabled
   * @return gzipConnectorRequestsEnabled
   */
  @Valid 
  @Schema(name = "gzipConnectorRequestsEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gzipConnectorRequestsEnabled")
  public @Nullable ConfigNodePropertyBoolean getGzipConnectorRequestsEnabled() {
    return gzipConnectorRequestsEnabled;
  }

  @JsonProperty("gzipConnectorRequestsEnabled")
  public void setGzipConnectorRequestsEnabled(@Nullable ConfigNodePropertyBoolean gzipConnectorRequestsEnabled) {
    this.gzipConnectorRequestsEnabled = gzipConnectorRequestsEnabled;
  }

  public OrgApacheSlingDiscoveryOakConfigProperties hmacEnabled(@Nullable ConfigNodePropertyBoolean hmacEnabled) {
    this.hmacEnabled = hmacEnabled;
    return this;
  }

  /**
   * Get hmacEnabled
   * @return hmacEnabled
   */
  @Valid 
  @Schema(name = "hmacEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hmacEnabled")
  public @Nullable ConfigNodePropertyBoolean getHmacEnabled() {
    return hmacEnabled;
  }

  @JsonProperty("hmacEnabled")
  public void setHmacEnabled(@Nullable ConfigNodePropertyBoolean hmacEnabled) {
    this.hmacEnabled = hmacEnabled;
  }

  public OrgApacheSlingDiscoveryOakConfigProperties enableEncryption(@Nullable ConfigNodePropertyBoolean enableEncryption) {
    this.enableEncryption = enableEncryption;
    return this;
  }

  /**
   * Get enableEncryption
   * @return enableEncryption
   */
  @Valid 
  @Schema(name = "enableEncryption", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enableEncryption")
  public @Nullable ConfigNodePropertyBoolean getEnableEncryption() {
    return enableEncryption;
  }

  @JsonProperty("enableEncryption")
  public void setEnableEncryption(@Nullable ConfigNodePropertyBoolean enableEncryption) {
    this.enableEncryption = enableEncryption;
  }

  public OrgApacheSlingDiscoveryOakConfigProperties sharedKey(@Nullable ConfigNodePropertyString sharedKey) {
    this.sharedKey = sharedKey;
    return this;
  }

  /**
   * Get sharedKey
   * @return sharedKey
   */
  @Valid 
  @Schema(name = "sharedKey", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sharedKey")
  public @Nullable ConfigNodePropertyString getSharedKey() {
    return sharedKey;
  }

  @JsonProperty("sharedKey")
  public void setSharedKey(@Nullable ConfigNodePropertyString sharedKey) {
    this.sharedKey = sharedKey;
  }

  public OrgApacheSlingDiscoveryOakConfigProperties hmacSharedKeyTTL(@Nullable ConfigNodePropertyInteger hmacSharedKeyTTL) {
    this.hmacSharedKeyTTL = hmacSharedKeyTTL;
    return this;
  }

  /**
   * Get hmacSharedKeyTTL
   * @return hmacSharedKeyTTL
   */
  @Valid 
  @Schema(name = "hmacSharedKeyTTL", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hmacSharedKeyTTL")
  public @Nullable ConfigNodePropertyInteger getHmacSharedKeyTTL() {
    return hmacSharedKeyTTL;
  }

  @JsonProperty("hmacSharedKeyTTL")
  public void setHmacSharedKeyTTL(@Nullable ConfigNodePropertyInteger hmacSharedKeyTTL) {
    this.hmacSharedKeyTTL = hmacSharedKeyTTL;
  }

  public OrgApacheSlingDiscoveryOakConfigProperties backoffStandbyFactor(@Nullable ConfigNodePropertyString backoffStandbyFactor) {
    this.backoffStandbyFactor = backoffStandbyFactor;
    return this;
  }

  /**
   * Get backoffStandbyFactor
   * @return backoffStandbyFactor
   */
  @Valid 
  @Schema(name = "backoffStandbyFactor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("backoffStandbyFactor")
  public @Nullable ConfigNodePropertyString getBackoffStandbyFactor() {
    return backoffStandbyFactor;
  }

  @JsonProperty("backoffStandbyFactor")
  public void setBackoffStandbyFactor(@Nullable ConfigNodePropertyString backoffStandbyFactor) {
    this.backoffStandbyFactor = backoffStandbyFactor;
  }

  public OrgApacheSlingDiscoveryOakConfigProperties backoffStableFactor(@Nullable ConfigNodePropertyString backoffStableFactor) {
    this.backoffStableFactor = backoffStableFactor;
    return this;
  }

  /**
   * Get backoffStableFactor
   * @return backoffStableFactor
   */
  @Valid 
  @Schema(name = "backoffStableFactor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("backoffStableFactor")
  public @Nullable ConfigNodePropertyString getBackoffStableFactor() {
    return backoffStableFactor;
  }

  @JsonProperty("backoffStableFactor")
  public void setBackoffStableFactor(@Nullable ConfigNodePropertyString backoffStableFactor) {
    this.backoffStableFactor = backoffStableFactor;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingDiscoveryOakConfigProperties orgApacheSlingDiscoveryOakConfigProperties = (OrgApacheSlingDiscoveryOakConfigProperties) o;
    return Objects.equals(this.connectorPingTimeout, orgApacheSlingDiscoveryOakConfigProperties.connectorPingTimeout) &&
        Objects.equals(this.connectorPingInterval, orgApacheSlingDiscoveryOakConfigProperties.connectorPingInterval) &&
        Objects.equals(this.discoveryLiteCheckInterval, orgApacheSlingDiscoveryOakConfigProperties.discoveryLiteCheckInterval) &&
        Objects.equals(this.clusterSyncServiceTimeout, orgApacheSlingDiscoveryOakConfigProperties.clusterSyncServiceTimeout) &&
        Objects.equals(this.clusterSyncServiceInterval, orgApacheSlingDiscoveryOakConfigProperties.clusterSyncServiceInterval) &&
        Objects.equals(this.enableSyncToken, orgApacheSlingDiscoveryOakConfigProperties.enableSyncToken) &&
        Objects.equals(this.minEventDelay, orgApacheSlingDiscoveryOakConfigProperties.minEventDelay) &&
        Objects.equals(this.socketConnectTimeout, orgApacheSlingDiscoveryOakConfigProperties.socketConnectTimeout) &&
        Objects.equals(this.soTimeout, orgApacheSlingDiscoveryOakConfigProperties.soTimeout) &&
        Objects.equals(this.topologyConnectorUrls, orgApacheSlingDiscoveryOakConfigProperties.topologyConnectorUrls) &&
        Objects.equals(this.topologyConnectorWhitelist, orgApacheSlingDiscoveryOakConfigProperties.topologyConnectorWhitelist) &&
        Objects.equals(this.autoStopLocalLoopEnabled, orgApacheSlingDiscoveryOakConfigProperties.autoStopLocalLoopEnabled) &&
        Objects.equals(this.gzipConnectorRequestsEnabled, orgApacheSlingDiscoveryOakConfigProperties.gzipConnectorRequestsEnabled) &&
        Objects.equals(this.hmacEnabled, orgApacheSlingDiscoveryOakConfigProperties.hmacEnabled) &&
        Objects.equals(this.enableEncryption, orgApacheSlingDiscoveryOakConfigProperties.enableEncryption) &&
        Objects.equals(this.sharedKey, orgApacheSlingDiscoveryOakConfigProperties.sharedKey) &&
        Objects.equals(this.hmacSharedKeyTTL, orgApacheSlingDiscoveryOakConfigProperties.hmacSharedKeyTTL) &&
        Objects.equals(this.backoffStandbyFactor, orgApacheSlingDiscoveryOakConfigProperties.backoffStandbyFactor) &&
        Objects.equals(this.backoffStableFactor, orgApacheSlingDiscoveryOakConfigProperties.backoffStableFactor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectorPingTimeout, connectorPingInterval, discoveryLiteCheckInterval, clusterSyncServiceTimeout, clusterSyncServiceInterval, enableSyncToken, minEventDelay, socketConnectTimeout, soTimeout, topologyConnectorUrls, topologyConnectorWhitelist, autoStopLocalLoopEnabled, gzipConnectorRequestsEnabled, hmacEnabled, enableEncryption, sharedKey, hmacSharedKeyTTL, backoffStandbyFactor, backoffStableFactor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingDiscoveryOakConfigProperties {\n");
    sb.append("    connectorPingTimeout: ").append(toIndentedString(connectorPingTimeout)).append("\n");
    sb.append("    connectorPingInterval: ").append(toIndentedString(connectorPingInterval)).append("\n");
    sb.append("    discoveryLiteCheckInterval: ").append(toIndentedString(discoveryLiteCheckInterval)).append("\n");
    sb.append("    clusterSyncServiceTimeout: ").append(toIndentedString(clusterSyncServiceTimeout)).append("\n");
    sb.append("    clusterSyncServiceInterval: ").append(toIndentedString(clusterSyncServiceInterval)).append("\n");
    sb.append("    enableSyncToken: ").append(toIndentedString(enableSyncToken)).append("\n");
    sb.append("    minEventDelay: ").append(toIndentedString(minEventDelay)).append("\n");
    sb.append("    socketConnectTimeout: ").append(toIndentedString(socketConnectTimeout)).append("\n");
    sb.append("    soTimeout: ").append(toIndentedString(soTimeout)).append("\n");
    sb.append("    topologyConnectorUrls: ").append(toIndentedString(topologyConnectorUrls)).append("\n");
    sb.append("    topologyConnectorWhitelist: ").append(toIndentedString(topologyConnectorWhitelist)).append("\n");
    sb.append("    autoStopLocalLoopEnabled: ").append(toIndentedString(autoStopLocalLoopEnabled)).append("\n");
    sb.append("    gzipConnectorRequestsEnabled: ").append(toIndentedString(gzipConnectorRequestsEnabled)).append("\n");
    sb.append("    hmacEnabled: ").append(toIndentedString(hmacEnabled)).append("\n");
    sb.append("    enableEncryption: ").append(toIndentedString(enableEncryption)).append("\n");
    sb.append("    sharedKey: ").append(toIndentedString(sharedKey)).append("\n");
    sb.append("    hmacSharedKeyTTL: ").append(toIndentedString(hmacSharedKeyTTL)).append("\n");
    sb.append("    backoffStandbyFactor: ").append(toIndentedString(backoffStandbyFactor)).append("\n");
    sb.append("    backoffStableFactor: ").append(toIndentedString(backoffStableFactor)).append("\n");
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

