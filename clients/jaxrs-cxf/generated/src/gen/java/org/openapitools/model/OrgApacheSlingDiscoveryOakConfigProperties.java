package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrgApacheSlingDiscoveryOakConfigProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger connectorPingTimeout = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger connectorPingInterval = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger discoveryLiteCheckInterval = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger clusterSyncServiceTimeout = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger clusterSyncServiceInterval = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean enableSyncToken = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger minEventDelay = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger socketConnectTimeout = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger soTimeout = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray topologyConnectorUrls = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray topologyConnectorWhitelist = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean autoStopLocalLoopEnabled = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean gzipConnectorRequestsEnabled = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean hmacEnabled = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean enableEncryption = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString sharedKey = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger hmacSharedKeyTTL = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString backoffStandbyFactor = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString backoffStableFactor = null;
 /**
   * Get connectorPingTimeout
   * @return connectorPingTimeout
  **/
  @JsonProperty("connectorPingTimeout")
  public ConfigNodePropertyInteger getConnectorPingTimeout() {
    return connectorPingTimeout;
  }

  public void setConnectorPingTimeout(ConfigNodePropertyInteger connectorPingTimeout) {
    this.connectorPingTimeout = connectorPingTimeout;
  }

  public OrgApacheSlingDiscoveryOakConfigProperties connectorPingTimeout(ConfigNodePropertyInteger connectorPingTimeout) {
    this.connectorPingTimeout = connectorPingTimeout;
    return this;
  }

 /**
   * Get connectorPingInterval
   * @return connectorPingInterval
  **/
  @JsonProperty("connectorPingInterval")
  public ConfigNodePropertyInteger getConnectorPingInterval() {
    return connectorPingInterval;
  }

  public void setConnectorPingInterval(ConfigNodePropertyInteger connectorPingInterval) {
    this.connectorPingInterval = connectorPingInterval;
  }

  public OrgApacheSlingDiscoveryOakConfigProperties connectorPingInterval(ConfigNodePropertyInteger connectorPingInterval) {
    this.connectorPingInterval = connectorPingInterval;
    return this;
  }

 /**
   * Get discoveryLiteCheckInterval
   * @return discoveryLiteCheckInterval
  **/
  @JsonProperty("discoveryLiteCheckInterval")
  public ConfigNodePropertyInteger getDiscoveryLiteCheckInterval() {
    return discoveryLiteCheckInterval;
  }

  public void setDiscoveryLiteCheckInterval(ConfigNodePropertyInteger discoveryLiteCheckInterval) {
    this.discoveryLiteCheckInterval = discoveryLiteCheckInterval;
  }

  public OrgApacheSlingDiscoveryOakConfigProperties discoveryLiteCheckInterval(ConfigNodePropertyInteger discoveryLiteCheckInterval) {
    this.discoveryLiteCheckInterval = discoveryLiteCheckInterval;
    return this;
  }

 /**
   * Get clusterSyncServiceTimeout
   * @return clusterSyncServiceTimeout
  **/
  @JsonProperty("clusterSyncServiceTimeout")
  public ConfigNodePropertyInteger getClusterSyncServiceTimeout() {
    return clusterSyncServiceTimeout;
  }

  public void setClusterSyncServiceTimeout(ConfigNodePropertyInteger clusterSyncServiceTimeout) {
    this.clusterSyncServiceTimeout = clusterSyncServiceTimeout;
  }

  public OrgApacheSlingDiscoveryOakConfigProperties clusterSyncServiceTimeout(ConfigNodePropertyInteger clusterSyncServiceTimeout) {
    this.clusterSyncServiceTimeout = clusterSyncServiceTimeout;
    return this;
  }

 /**
   * Get clusterSyncServiceInterval
   * @return clusterSyncServiceInterval
  **/
  @JsonProperty("clusterSyncServiceInterval")
  public ConfigNodePropertyInteger getClusterSyncServiceInterval() {
    return clusterSyncServiceInterval;
  }

  public void setClusterSyncServiceInterval(ConfigNodePropertyInteger clusterSyncServiceInterval) {
    this.clusterSyncServiceInterval = clusterSyncServiceInterval;
  }

  public OrgApacheSlingDiscoveryOakConfigProperties clusterSyncServiceInterval(ConfigNodePropertyInteger clusterSyncServiceInterval) {
    this.clusterSyncServiceInterval = clusterSyncServiceInterval;
    return this;
  }

 /**
   * Get enableSyncToken
   * @return enableSyncToken
  **/
  @JsonProperty("enableSyncToken")
  public ConfigNodePropertyBoolean getEnableSyncToken() {
    return enableSyncToken;
  }

  public void setEnableSyncToken(ConfigNodePropertyBoolean enableSyncToken) {
    this.enableSyncToken = enableSyncToken;
  }

  public OrgApacheSlingDiscoveryOakConfigProperties enableSyncToken(ConfigNodePropertyBoolean enableSyncToken) {
    this.enableSyncToken = enableSyncToken;
    return this;
  }

 /**
   * Get minEventDelay
   * @return minEventDelay
  **/
  @JsonProperty("minEventDelay")
  public ConfigNodePropertyInteger getMinEventDelay() {
    return minEventDelay;
  }

  public void setMinEventDelay(ConfigNodePropertyInteger minEventDelay) {
    this.minEventDelay = minEventDelay;
  }

  public OrgApacheSlingDiscoveryOakConfigProperties minEventDelay(ConfigNodePropertyInteger minEventDelay) {
    this.minEventDelay = minEventDelay;
    return this;
  }

 /**
   * Get socketConnectTimeout
   * @return socketConnectTimeout
  **/
  @JsonProperty("socketConnectTimeout")
  public ConfigNodePropertyInteger getSocketConnectTimeout() {
    return socketConnectTimeout;
  }

  public void setSocketConnectTimeout(ConfigNodePropertyInteger socketConnectTimeout) {
    this.socketConnectTimeout = socketConnectTimeout;
  }

  public OrgApacheSlingDiscoveryOakConfigProperties socketConnectTimeout(ConfigNodePropertyInteger socketConnectTimeout) {
    this.socketConnectTimeout = socketConnectTimeout;
    return this;
  }

 /**
   * Get soTimeout
   * @return soTimeout
  **/
  @JsonProperty("soTimeout")
  public ConfigNodePropertyInteger getSoTimeout() {
    return soTimeout;
  }

  public void setSoTimeout(ConfigNodePropertyInteger soTimeout) {
    this.soTimeout = soTimeout;
  }

  public OrgApacheSlingDiscoveryOakConfigProperties soTimeout(ConfigNodePropertyInteger soTimeout) {
    this.soTimeout = soTimeout;
    return this;
  }

 /**
   * Get topologyConnectorUrls
   * @return topologyConnectorUrls
  **/
  @JsonProperty("topologyConnectorUrls")
  public ConfigNodePropertyArray getTopologyConnectorUrls() {
    return topologyConnectorUrls;
  }

  public void setTopologyConnectorUrls(ConfigNodePropertyArray topologyConnectorUrls) {
    this.topologyConnectorUrls = topologyConnectorUrls;
  }

  public OrgApacheSlingDiscoveryOakConfigProperties topologyConnectorUrls(ConfigNodePropertyArray topologyConnectorUrls) {
    this.topologyConnectorUrls = topologyConnectorUrls;
    return this;
  }

 /**
   * Get topologyConnectorWhitelist
   * @return topologyConnectorWhitelist
  **/
  @JsonProperty("topologyConnectorWhitelist")
  public ConfigNodePropertyArray getTopologyConnectorWhitelist() {
    return topologyConnectorWhitelist;
  }

  public void setTopologyConnectorWhitelist(ConfigNodePropertyArray topologyConnectorWhitelist) {
    this.topologyConnectorWhitelist = topologyConnectorWhitelist;
  }

  public OrgApacheSlingDiscoveryOakConfigProperties topologyConnectorWhitelist(ConfigNodePropertyArray topologyConnectorWhitelist) {
    this.topologyConnectorWhitelist = topologyConnectorWhitelist;
    return this;
  }

 /**
   * Get autoStopLocalLoopEnabled
   * @return autoStopLocalLoopEnabled
  **/
  @JsonProperty("autoStopLocalLoopEnabled")
  public ConfigNodePropertyBoolean getAutoStopLocalLoopEnabled() {
    return autoStopLocalLoopEnabled;
  }

  public void setAutoStopLocalLoopEnabled(ConfigNodePropertyBoolean autoStopLocalLoopEnabled) {
    this.autoStopLocalLoopEnabled = autoStopLocalLoopEnabled;
  }

  public OrgApacheSlingDiscoveryOakConfigProperties autoStopLocalLoopEnabled(ConfigNodePropertyBoolean autoStopLocalLoopEnabled) {
    this.autoStopLocalLoopEnabled = autoStopLocalLoopEnabled;
    return this;
  }

 /**
   * Get gzipConnectorRequestsEnabled
   * @return gzipConnectorRequestsEnabled
  **/
  @JsonProperty("gzipConnectorRequestsEnabled")
  public ConfigNodePropertyBoolean getGzipConnectorRequestsEnabled() {
    return gzipConnectorRequestsEnabled;
  }

  public void setGzipConnectorRequestsEnabled(ConfigNodePropertyBoolean gzipConnectorRequestsEnabled) {
    this.gzipConnectorRequestsEnabled = gzipConnectorRequestsEnabled;
  }

  public OrgApacheSlingDiscoveryOakConfigProperties gzipConnectorRequestsEnabled(ConfigNodePropertyBoolean gzipConnectorRequestsEnabled) {
    this.gzipConnectorRequestsEnabled = gzipConnectorRequestsEnabled;
    return this;
  }

 /**
   * Get hmacEnabled
   * @return hmacEnabled
  **/
  @JsonProperty("hmacEnabled")
  public ConfigNodePropertyBoolean getHmacEnabled() {
    return hmacEnabled;
  }

  public void setHmacEnabled(ConfigNodePropertyBoolean hmacEnabled) {
    this.hmacEnabled = hmacEnabled;
  }

  public OrgApacheSlingDiscoveryOakConfigProperties hmacEnabled(ConfigNodePropertyBoolean hmacEnabled) {
    this.hmacEnabled = hmacEnabled;
    return this;
  }

 /**
   * Get enableEncryption
   * @return enableEncryption
  **/
  @JsonProperty("enableEncryption")
  public ConfigNodePropertyBoolean getEnableEncryption() {
    return enableEncryption;
  }

  public void setEnableEncryption(ConfigNodePropertyBoolean enableEncryption) {
    this.enableEncryption = enableEncryption;
  }

  public OrgApacheSlingDiscoveryOakConfigProperties enableEncryption(ConfigNodePropertyBoolean enableEncryption) {
    this.enableEncryption = enableEncryption;
    return this;
  }

 /**
   * Get sharedKey
   * @return sharedKey
  **/
  @JsonProperty("sharedKey")
  public ConfigNodePropertyString getSharedKey() {
    return sharedKey;
  }

  public void setSharedKey(ConfigNodePropertyString sharedKey) {
    this.sharedKey = sharedKey;
  }

  public OrgApacheSlingDiscoveryOakConfigProperties sharedKey(ConfigNodePropertyString sharedKey) {
    this.sharedKey = sharedKey;
    return this;
  }

 /**
   * Get hmacSharedKeyTTL
   * @return hmacSharedKeyTTL
  **/
  @JsonProperty("hmacSharedKeyTTL")
  public ConfigNodePropertyInteger getHmacSharedKeyTTL() {
    return hmacSharedKeyTTL;
  }

  public void setHmacSharedKeyTTL(ConfigNodePropertyInteger hmacSharedKeyTTL) {
    this.hmacSharedKeyTTL = hmacSharedKeyTTL;
  }

  public OrgApacheSlingDiscoveryOakConfigProperties hmacSharedKeyTTL(ConfigNodePropertyInteger hmacSharedKeyTTL) {
    this.hmacSharedKeyTTL = hmacSharedKeyTTL;
    return this;
  }

 /**
   * Get backoffStandbyFactor
   * @return backoffStandbyFactor
  **/
  @JsonProperty("backoffStandbyFactor")
  public ConfigNodePropertyString getBackoffStandbyFactor() {
    return backoffStandbyFactor;
  }

  public void setBackoffStandbyFactor(ConfigNodePropertyString backoffStandbyFactor) {
    this.backoffStandbyFactor = backoffStandbyFactor;
  }

  public OrgApacheSlingDiscoveryOakConfigProperties backoffStandbyFactor(ConfigNodePropertyString backoffStandbyFactor) {
    this.backoffStandbyFactor = backoffStandbyFactor;
    return this;
  }

 /**
   * Get backoffStableFactor
   * @return backoffStableFactor
  **/
  @JsonProperty("backoffStableFactor")
  public ConfigNodePropertyString getBackoffStableFactor() {
    return backoffStableFactor;
  }

  public void setBackoffStableFactor(ConfigNodePropertyString backoffStableFactor) {
    this.backoffStableFactor = backoffStableFactor;
  }

  public OrgApacheSlingDiscoveryOakConfigProperties backoffStableFactor(ConfigNodePropertyString backoffStableFactor) {
    this.backoffStableFactor = backoffStableFactor;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

