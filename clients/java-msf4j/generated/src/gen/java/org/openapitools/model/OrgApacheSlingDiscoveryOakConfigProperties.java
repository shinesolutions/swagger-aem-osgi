package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

/**
 * OrgApacheSlingDiscoveryOakConfigProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
public class OrgApacheSlingDiscoveryOakConfigProperties   {
  @JsonProperty("connectorPingTimeout")
  private ConfigNodePropertyInteger connectorPingTimeout = null;

  @JsonProperty("connectorPingInterval")
  private ConfigNodePropertyInteger connectorPingInterval = null;

  @JsonProperty("discoveryLiteCheckInterval")
  private ConfigNodePropertyInteger discoveryLiteCheckInterval = null;

  @JsonProperty("clusterSyncServiceTimeout")
  private ConfigNodePropertyInteger clusterSyncServiceTimeout = null;

  @JsonProperty("clusterSyncServiceInterval")
  private ConfigNodePropertyInteger clusterSyncServiceInterval = null;

  @JsonProperty("enableSyncToken")
  private ConfigNodePropertyBoolean enableSyncToken = null;

  @JsonProperty("minEventDelay")
  private ConfigNodePropertyInteger minEventDelay = null;

  @JsonProperty("socketConnectTimeout")
  private ConfigNodePropertyInteger socketConnectTimeout = null;

  @JsonProperty("soTimeout")
  private ConfigNodePropertyInteger soTimeout = null;

  @JsonProperty("topologyConnectorUrls")
  private ConfigNodePropertyArray topologyConnectorUrls = null;

  @JsonProperty("topologyConnectorWhitelist")
  private ConfigNodePropertyArray topologyConnectorWhitelist = null;

  @JsonProperty("autoStopLocalLoopEnabled")
  private ConfigNodePropertyBoolean autoStopLocalLoopEnabled = null;

  @JsonProperty("gzipConnectorRequestsEnabled")
  private ConfigNodePropertyBoolean gzipConnectorRequestsEnabled = null;

  @JsonProperty("hmacEnabled")
  private ConfigNodePropertyBoolean hmacEnabled = null;

  @JsonProperty("enableEncryption")
  private ConfigNodePropertyBoolean enableEncryption = null;

  @JsonProperty("sharedKey")
  private ConfigNodePropertyString sharedKey = null;

  @JsonProperty("hmacSharedKeyTTL")
  private ConfigNodePropertyInteger hmacSharedKeyTTL = null;

  @JsonProperty("backoffStandbyFactor")
  private ConfigNodePropertyString backoffStandbyFactor = null;

  @JsonProperty("backoffStableFactor")
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

