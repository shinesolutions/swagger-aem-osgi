/*
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.shinesolutions.swaggeraemosgi4j.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyArray;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyBoolean;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyInteger;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * OrgApacheSlingDiscoveryOakConfigProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-06-27T11:23:34.688Z[GMT]")
public class OrgApacheSlingDiscoveryOakConfigProperties {
  public static final String SERIALIZED_NAME_CONNECTOR_PING_TIMEOUT = "connectorPingTimeout";
  @SerializedName(SERIALIZED_NAME_CONNECTOR_PING_TIMEOUT)
  private ConfigNodePropertyInteger connectorPingTimeout = null;

  public static final String SERIALIZED_NAME_CONNECTOR_PING_INTERVAL = "connectorPingInterval";
  @SerializedName(SERIALIZED_NAME_CONNECTOR_PING_INTERVAL)
  private ConfigNodePropertyInteger connectorPingInterval = null;

  public static final String SERIALIZED_NAME_DISCOVERY_LITE_CHECK_INTERVAL = "discoveryLiteCheckInterval";
  @SerializedName(SERIALIZED_NAME_DISCOVERY_LITE_CHECK_INTERVAL)
  private ConfigNodePropertyInteger discoveryLiteCheckInterval = null;

  public static final String SERIALIZED_NAME_CLUSTER_SYNC_SERVICE_TIMEOUT = "clusterSyncServiceTimeout";
  @SerializedName(SERIALIZED_NAME_CLUSTER_SYNC_SERVICE_TIMEOUT)
  private ConfigNodePropertyInteger clusterSyncServiceTimeout = null;

  public static final String SERIALIZED_NAME_CLUSTER_SYNC_SERVICE_INTERVAL = "clusterSyncServiceInterval";
  @SerializedName(SERIALIZED_NAME_CLUSTER_SYNC_SERVICE_INTERVAL)
  private ConfigNodePropertyInteger clusterSyncServiceInterval = null;

  public static final String SERIALIZED_NAME_ENABLE_SYNC_TOKEN = "enableSyncToken";
  @SerializedName(SERIALIZED_NAME_ENABLE_SYNC_TOKEN)
  private ConfigNodePropertyBoolean enableSyncToken = null;

  public static final String SERIALIZED_NAME_MIN_EVENT_DELAY = "minEventDelay";
  @SerializedName(SERIALIZED_NAME_MIN_EVENT_DELAY)
  private ConfigNodePropertyInteger minEventDelay = null;

  public static final String SERIALIZED_NAME_SOCKET_CONNECT_TIMEOUT = "socketConnectTimeout";
  @SerializedName(SERIALIZED_NAME_SOCKET_CONNECT_TIMEOUT)
  private ConfigNodePropertyInteger socketConnectTimeout = null;

  public static final String SERIALIZED_NAME_SO_TIMEOUT = "soTimeout";
  @SerializedName(SERIALIZED_NAME_SO_TIMEOUT)
  private ConfigNodePropertyInteger soTimeout = null;

  public static final String SERIALIZED_NAME_TOPOLOGY_CONNECTOR_URLS = "topologyConnectorUrls";
  @SerializedName(SERIALIZED_NAME_TOPOLOGY_CONNECTOR_URLS)
  private ConfigNodePropertyArray topologyConnectorUrls = null;

  public static final String SERIALIZED_NAME_TOPOLOGY_CONNECTOR_WHITELIST = "topologyConnectorWhitelist";
  @SerializedName(SERIALIZED_NAME_TOPOLOGY_CONNECTOR_WHITELIST)
  private ConfigNodePropertyArray topologyConnectorWhitelist = null;

  public static final String SERIALIZED_NAME_AUTO_STOP_LOCAL_LOOP_ENABLED = "autoStopLocalLoopEnabled";
  @SerializedName(SERIALIZED_NAME_AUTO_STOP_LOCAL_LOOP_ENABLED)
  private ConfigNodePropertyBoolean autoStopLocalLoopEnabled = null;

  public static final String SERIALIZED_NAME_GZIP_CONNECTOR_REQUESTS_ENABLED = "gzipConnectorRequestsEnabled";
  @SerializedName(SERIALIZED_NAME_GZIP_CONNECTOR_REQUESTS_ENABLED)
  private ConfigNodePropertyBoolean gzipConnectorRequestsEnabled = null;

  public static final String SERIALIZED_NAME_HMAC_ENABLED = "hmacEnabled";
  @SerializedName(SERIALIZED_NAME_HMAC_ENABLED)
  private ConfigNodePropertyBoolean hmacEnabled = null;

  public static final String SERIALIZED_NAME_ENABLE_ENCRYPTION = "enableEncryption";
  @SerializedName(SERIALIZED_NAME_ENABLE_ENCRYPTION)
  private ConfigNodePropertyBoolean enableEncryption = null;

  public static final String SERIALIZED_NAME_SHARED_KEY = "sharedKey";
  @SerializedName(SERIALIZED_NAME_SHARED_KEY)
  private ConfigNodePropertyString sharedKey = null;

  public static final String SERIALIZED_NAME_HMAC_SHARED_KEY_T_T_L = "hmacSharedKeyTTL";
  @SerializedName(SERIALIZED_NAME_HMAC_SHARED_KEY_T_T_L)
  private ConfigNodePropertyInteger hmacSharedKeyTTL = null;

  public static final String SERIALIZED_NAME_BACKOFF_STANDBY_FACTOR = "backoffStandbyFactor";
  @SerializedName(SERIALIZED_NAME_BACKOFF_STANDBY_FACTOR)
  private ConfigNodePropertyString backoffStandbyFactor = null;

  public static final String SERIALIZED_NAME_BACKOFF_STABLE_FACTOR = "backoffStableFactor";
  @SerializedName(SERIALIZED_NAME_BACKOFF_STABLE_FACTOR)
  private ConfigNodePropertyString backoffStableFactor = null;

  public OrgApacheSlingDiscoveryOakConfigProperties connectorPingTimeout(ConfigNodePropertyInteger connectorPingTimeout) {
    this.connectorPingTimeout = connectorPingTimeout;
    return this;
  }

   /**
   * Get connectorPingTimeout
   * @return connectorPingTimeout
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getConnectorPingTimeout() {
    return connectorPingTimeout;
  }

  public void setConnectorPingTimeout(ConfigNodePropertyInteger connectorPingTimeout) {
    this.connectorPingTimeout = connectorPingTimeout;
  }

  public OrgApacheSlingDiscoveryOakConfigProperties connectorPingInterval(ConfigNodePropertyInteger connectorPingInterval) {
    this.connectorPingInterval = connectorPingInterval;
    return this;
  }

   /**
   * Get connectorPingInterval
   * @return connectorPingInterval
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getConnectorPingInterval() {
    return connectorPingInterval;
  }

  public void setConnectorPingInterval(ConfigNodePropertyInteger connectorPingInterval) {
    this.connectorPingInterval = connectorPingInterval;
  }

  public OrgApacheSlingDiscoveryOakConfigProperties discoveryLiteCheckInterval(ConfigNodePropertyInteger discoveryLiteCheckInterval) {
    this.discoveryLiteCheckInterval = discoveryLiteCheckInterval;
    return this;
  }

   /**
   * Get discoveryLiteCheckInterval
   * @return discoveryLiteCheckInterval
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getDiscoveryLiteCheckInterval() {
    return discoveryLiteCheckInterval;
  }

  public void setDiscoveryLiteCheckInterval(ConfigNodePropertyInteger discoveryLiteCheckInterval) {
    this.discoveryLiteCheckInterval = discoveryLiteCheckInterval;
  }

  public OrgApacheSlingDiscoveryOakConfigProperties clusterSyncServiceTimeout(ConfigNodePropertyInteger clusterSyncServiceTimeout) {
    this.clusterSyncServiceTimeout = clusterSyncServiceTimeout;
    return this;
  }

   /**
   * Get clusterSyncServiceTimeout
   * @return clusterSyncServiceTimeout
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getClusterSyncServiceTimeout() {
    return clusterSyncServiceTimeout;
  }

  public void setClusterSyncServiceTimeout(ConfigNodePropertyInteger clusterSyncServiceTimeout) {
    this.clusterSyncServiceTimeout = clusterSyncServiceTimeout;
  }

  public OrgApacheSlingDiscoveryOakConfigProperties clusterSyncServiceInterval(ConfigNodePropertyInteger clusterSyncServiceInterval) {
    this.clusterSyncServiceInterval = clusterSyncServiceInterval;
    return this;
  }

   /**
   * Get clusterSyncServiceInterval
   * @return clusterSyncServiceInterval
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getClusterSyncServiceInterval() {
    return clusterSyncServiceInterval;
  }

  public void setClusterSyncServiceInterval(ConfigNodePropertyInteger clusterSyncServiceInterval) {
    this.clusterSyncServiceInterval = clusterSyncServiceInterval;
  }

  public OrgApacheSlingDiscoveryOakConfigProperties enableSyncToken(ConfigNodePropertyBoolean enableSyncToken) {
    this.enableSyncToken = enableSyncToken;
    return this;
  }

   /**
   * Get enableSyncToken
   * @return enableSyncToken
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getEnableSyncToken() {
    return enableSyncToken;
  }

  public void setEnableSyncToken(ConfigNodePropertyBoolean enableSyncToken) {
    this.enableSyncToken = enableSyncToken;
  }

  public OrgApacheSlingDiscoveryOakConfigProperties minEventDelay(ConfigNodePropertyInteger minEventDelay) {
    this.minEventDelay = minEventDelay;
    return this;
  }

   /**
   * Get minEventDelay
   * @return minEventDelay
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getMinEventDelay() {
    return minEventDelay;
  }

  public void setMinEventDelay(ConfigNodePropertyInteger minEventDelay) {
    this.minEventDelay = minEventDelay;
  }

  public OrgApacheSlingDiscoveryOakConfigProperties socketConnectTimeout(ConfigNodePropertyInteger socketConnectTimeout) {
    this.socketConnectTimeout = socketConnectTimeout;
    return this;
  }

   /**
   * Get socketConnectTimeout
   * @return socketConnectTimeout
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getSocketConnectTimeout() {
    return socketConnectTimeout;
  }

  public void setSocketConnectTimeout(ConfigNodePropertyInteger socketConnectTimeout) {
    this.socketConnectTimeout = socketConnectTimeout;
  }

  public OrgApacheSlingDiscoveryOakConfigProperties soTimeout(ConfigNodePropertyInteger soTimeout) {
    this.soTimeout = soTimeout;
    return this;
  }

   /**
   * Get soTimeout
   * @return soTimeout
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getSoTimeout() {
    return soTimeout;
  }

  public void setSoTimeout(ConfigNodePropertyInteger soTimeout) {
    this.soTimeout = soTimeout;
  }

  public OrgApacheSlingDiscoveryOakConfigProperties topologyConnectorUrls(ConfigNodePropertyArray topologyConnectorUrls) {
    this.topologyConnectorUrls = topologyConnectorUrls;
    return this;
  }

   /**
   * Get topologyConnectorUrls
   * @return topologyConnectorUrls
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getTopologyConnectorUrls() {
    return topologyConnectorUrls;
  }

  public void setTopologyConnectorUrls(ConfigNodePropertyArray topologyConnectorUrls) {
    this.topologyConnectorUrls = topologyConnectorUrls;
  }

  public OrgApacheSlingDiscoveryOakConfigProperties topologyConnectorWhitelist(ConfigNodePropertyArray topologyConnectorWhitelist) {
    this.topologyConnectorWhitelist = topologyConnectorWhitelist;
    return this;
  }

   /**
   * Get topologyConnectorWhitelist
   * @return topologyConnectorWhitelist
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getTopologyConnectorWhitelist() {
    return topologyConnectorWhitelist;
  }

  public void setTopologyConnectorWhitelist(ConfigNodePropertyArray topologyConnectorWhitelist) {
    this.topologyConnectorWhitelist = topologyConnectorWhitelist;
  }

  public OrgApacheSlingDiscoveryOakConfigProperties autoStopLocalLoopEnabled(ConfigNodePropertyBoolean autoStopLocalLoopEnabled) {
    this.autoStopLocalLoopEnabled = autoStopLocalLoopEnabled;
    return this;
  }

   /**
   * Get autoStopLocalLoopEnabled
   * @return autoStopLocalLoopEnabled
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getAutoStopLocalLoopEnabled() {
    return autoStopLocalLoopEnabled;
  }

  public void setAutoStopLocalLoopEnabled(ConfigNodePropertyBoolean autoStopLocalLoopEnabled) {
    this.autoStopLocalLoopEnabled = autoStopLocalLoopEnabled;
  }

  public OrgApacheSlingDiscoveryOakConfigProperties gzipConnectorRequestsEnabled(ConfigNodePropertyBoolean gzipConnectorRequestsEnabled) {
    this.gzipConnectorRequestsEnabled = gzipConnectorRequestsEnabled;
    return this;
  }

   /**
   * Get gzipConnectorRequestsEnabled
   * @return gzipConnectorRequestsEnabled
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getGzipConnectorRequestsEnabled() {
    return gzipConnectorRequestsEnabled;
  }

  public void setGzipConnectorRequestsEnabled(ConfigNodePropertyBoolean gzipConnectorRequestsEnabled) {
    this.gzipConnectorRequestsEnabled = gzipConnectorRequestsEnabled;
  }

  public OrgApacheSlingDiscoveryOakConfigProperties hmacEnabled(ConfigNodePropertyBoolean hmacEnabled) {
    this.hmacEnabled = hmacEnabled;
    return this;
  }

   /**
   * Get hmacEnabled
   * @return hmacEnabled
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getHmacEnabled() {
    return hmacEnabled;
  }

  public void setHmacEnabled(ConfigNodePropertyBoolean hmacEnabled) {
    this.hmacEnabled = hmacEnabled;
  }

  public OrgApacheSlingDiscoveryOakConfigProperties enableEncryption(ConfigNodePropertyBoolean enableEncryption) {
    this.enableEncryption = enableEncryption;
    return this;
  }

   /**
   * Get enableEncryption
   * @return enableEncryption
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getEnableEncryption() {
    return enableEncryption;
  }

  public void setEnableEncryption(ConfigNodePropertyBoolean enableEncryption) {
    this.enableEncryption = enableEncryption;
  }

  public OrgApacheSlingDiscoveryOakConfigProperties sharedKey(ConfigNodePropertyString sharedKey) {
    this.sharedKey = sharedKey;
    return this;
  }

   /**
   * Get sharedKey
   * @return sharedKey
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getSharedKey() {
    return sharedKey;
  }

  public void setSharedKey(ConfigNodePropertyString sharedKey) {
    this.sharedKey = sharedKey;
  }

  public OrgApacheSlingDiscoveryOakConfigProperties hmacSharedKeyTTL(ConfigNodePropertyInteger hmacSharedKeyTTL) {
    this.hmacSharedKeyTTL = hmacSharedKeyTTL;
    return this;
  }

   /**
   * Get hmacSharedKeyTTL
   * @return hmacSharedKeyTTL
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getHmacSharedKeyTTL() {
    return hmacSharedKeyTTL;
  }

  public void setHmacSharedKeyTTL(ConfigNodePropertyInteger hmacSharedKeyTTL) {
    this.hmacSharedKeyTTL = hmacSharedKeyTTL;
  }

  public OrgApacheSlingDiscoveryOakConfigProperties backoffStandbyFactor(ConfigNodePropertyString backoffStandbyFactor) {
    this.backoffStandbyFactor = backoffStandbyFactor;
    return this;
  }

   /**
   * Get backoffStandbyFactor
   * @return backoffStandbyFactor
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getBackoffStandbyFactor() {
    return backoffStandbyFactor;
  }

  public void setBackoffStandbyFactor(ConfigNodePropertyString backoffStandbyFactor) {
    this.backoffStandbyFactor = backoffStandbyFactor;
  }

  public OrgApacheSlingDiscoveryOakConfigProperties backoffStableFactor(ConfigNodePropertyString backoffStableFactor) {
    this.backoffStableFactor = backoffStableFactor;
    return this;
  }

   /**
   * Get backoffStableFactor
   * @return backoffStableFactor
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getBackoffStableFactor() {
    return backoffStableFactor;
  }

  public void setBackoffStableFactor(ConfigNodePropertyString backoffStableFactor) {
    this.backoffStableFactor = backoffStableFactor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

