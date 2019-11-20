/**
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.ConfigNodePropertyArray;
import org.openapitools.client.model.ConfigNodePropertyBoolean;
import org.openapitools.client.model.ConfigNodePropertyInteger;
import org.openapitools.client.model.ConfigNodePropertyString;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class OrgApacheSlingDiscoveryOakConfigProperties {
  
  @SerializedName("connectorPingTimeout")
  private ConfigNodePropertyInteger connectorPingTimeout = null;
  @SerializedName("connectorPingInterval")
  private ConfigNodePropertyInteger connectorPingInterval = null;
  @SerializedName("discoveryLiteCheckInterval")
  private ConfigNodePropertyInteger discoveryLiteCheckInterval = null;
  @SerializedName("clusterSyncServiceTimeout")
  private ConfigNodePropertyInteger clusterSyncServiceTimeout = null;
  @SerializedName("clusterSyncServiceInterval")
  private ConfigNodePropertyInteger clusterSyncServiceInterval = null;
  @SerializedName("enableSyncToken")
  private ConfigNodePropertyBoolean enableSyncToken = null;
  @SerializedName("minEventDelay")
  private ConfigNodePropertyInteger minEventDelay = null;
  @SerializedName("socketConnectTimeout")
  private ConfigNodePropertyInteger socketConnectTimeout = null;
  @SerializedName("soTimeout")
  private ConfigNodePropertyInteger soTimeout = null;
  @SerializedName("topologyConnectorUrls")
  private ConfigNodePropertyArray topologyConnectorUrls = null;
  @SerializedName("topologyConnectorWhitelist")
  private ConfigNodePropertyArray topologyConnectorWhitelist = null;
  @SerializedName("autoStopLocalLoopEnabled")
  private ConfigNodePropertyBoolean autoStopLocalLoopEnabled = null;
  @SerializedName("gzipConnectorRequestsEnabled")
  private ConfigNodePropertyBoolean gzipConnectorRequestsEnabled = null;
  @SerializedName("hmacEnabled")
  private ConfigNodePropertyBoolean hmacEnabled = null;
  @SerializedName("enableEncryption")
  private ConfigNodePropertyBoolean enableEncryption = null;
  @SerializedName("sharedKey")
  private ConfigNodePropertyString sharedKey = null;
  @SerializedName("hmacSharedKeyTTL")
  private ConfigNodePropertyInteger hmacSharedKeyTTL = null;
  @SerializedName("backoffStandbyFactor")
  private ConfigNodePropertyString backoffStandbyFactor = null;
  @SerializedName("backoffStableFactor")
  private ConfigNodePropertyString backoffStableFactor = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getConnectorPingTimeout() {
    return connectorPingTimeout;
  }
  public void setConnectorPingTimeout(ConfigNodePropertyInteger connectorPingTimeout) {
    this.connectorPingTimeout = connectorPingTimeout;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getConnectorPingInterval() {
    return connectorPingInterval;
  }
  public void setConnectorPingInterval(ConfigNodePropertyInteger connectorPingInterval) {
    this.connectorPingInterval = connectorPingInterval;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getDiscoveryLiteCheckInterval() {
    return discoveryLiteCheckInterval;
  }
  public void setDiscoveryLiteCheckInterval(ConfigNodePropertyInteger discoveryLiteCheckInterval) {
    this.discoveryLiteCheckInterval = discoveryLiteCheckInterval;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getClusterSyncServiceTimeout() {
    return clusterSyncServiceTimeout;
  }
  public void setClusterSyncServiceTimeout(ConfigNodePropertyInteger clusterSyncServiceTimeout) {
    this.clusterSyncServiceTimeout = clusterSyncServiceTimeout;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getClusterSyncServiceInterval() {
    return clusterSyncServiceInterval;
  }
  public void setClusterSyncServiceInterval(ConfigNodePropertyInteger clusterSyncServiceInterval) {
    this.clusterSyncServiceInterval = clusterSyncServiceInterval;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getEnableSyncToken() {
    return enableSyncToken;
  }
  public void setEnableSyncToken(ConfigNodePropertyBoolean enableSyncToken) {
    this.enableSyncToken = enableSyncToken;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getMinEventDelay() {
    return minEventDelay;
  }
  public void setMinEventDelay(ConfigNodePropertyInteger minEventDelay) {
    this.minEventDelay = minEventDelay;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getSocketConnectTimeout() {
    return socketConnectTimeout;
  }
  public void setSocketConnectTimeout(ConfigNodePropertyInteger socketConnectTimeout) {
    this.socketConnectTimeout = socketConnectTimeout;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getSoTimeout() {
    return soTimeout;
  }
  public void setSoTimeout(ConfigNodePropertyInteger soTimeout) {
    this.soTimeout = soTimeout;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getTopologyConnectorUrls() {
    return topologyConnectorUrls;
  }
  public void setTopologyConnectorUrls(ConfigNodePropertyArray topologyConnectorUrls) {
    this.topologyConnectorUrls = topologyConnectorUrls;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getTopologyConnectorWhitelist() {
    return topologyConnectorWhitelist;
  }
  public void setTopologyConnectorWhitelist(ConfigNodePropertyArray topologyConnectorWhitelist) {
    this.topologyConnectorWhitelist = topologyConnectorWhitelist;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getAutoStopLocalLoopEnabled() {
    return autoStopLocalLoopEnabled;
  }
  public void setAutoStopLocalLoopEnabled(ConfigNodePropertyBoolean autoStopLocalLoopEnabled) {
    this.autoStopLocalLoopEnabled = autoStopLocalLoopEnabled;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getGzipConnectorRequestsEnabled() {
    return gzipConnectorRequestsEnabled;
  }
  public void setGzipConnectorRequestsEnabled(ConfigNodePropertyBoolean gzipConnectorRequestsEnabled) {
    this.gzipConnectorRequestsEnabled = gzipConnectorRequestsEnabled;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getHmacEnabled() {
    return hmacEnabled;
  }
  public void setHmacEnabled(ConfigNodePropertyBoolean hmacEnabled) {
    this.hmacEnabled = hmacEnabled;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getEnableEncryption() {
    return enableEncryption;
  }
  public void setEnableEncryption(ConfigNodePropertyBoolean enableEncryption) {
    this.enableEncryption = enableEncryption;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getSharedKey() {
    return sharedKey;
  }
  public void setSharedKey(ConfigNodePropertyString sharedKey) {
    this.sharedKey = sharedKey;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getHmacSharedKeyTTL() {
    return hmacSharedKeyTTL;
  }
  public void setHmacSharedKeyTTL(ConfigNodePropertyInteger hmacSharedKeyTTL) {
    this.hmacSharedKeyTTL = hmacSharedKeyTTL;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getBackoffStandbyFactor() {
    return backoffStandbyFactor;
  }
  public void setBackoffStandbyFactor(ConfigNodePropertyString backoffStandbyFactor) {
    this.backoffStandbyFactor = backoffStandbyFactor;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getBackoffStableFactor() {
    return backoffStableFactor;
  }
  public void setBackoffStableFactor(ConfigNodePropertyString backoffStableFactor) {
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
    return (this.connectorPingTimeout == null ? orgApacheSlingDiscoveryOakConfigProperties.connectorPingTimeout == null : this.connectorPingTimeout.equals(orgApacheSlingDiscoveryOakConfigProperties.connectorPingTimeout)) &&
        (this.connectorPingInterval == null ? orgApacheSlingDiscoveryOakConfigProperties.connectorPingInterval == null : this.connectorPingInterval.equals(orgApacheSlingDiscoveryOakConfigProperties.connectorPingInterval)) &&
        (this.discoveryLiteCheckInterval == null ? orgApacheSlingDiscoveryOakConfigProperties.discoveryLiteCheckInterval == null : this.discoveryLiteCheckInterval.equals(orgApacheSlingDiscoveryOakConfigProperties.discoveryLiteCheckInterval)) &&
        (this.clusterSyncServiceTimeout == null ? orgApacheSlingDiscoveryOakConfigProperties.clusterSyncServiceTimeout == null : this.clusterSyncServiceTimeout.equals(orgApacheSlingDiscoveryOakConfigProperties.clusterSyncServiceTimeout)) &&
        (this.clusterSyncServiceInterval == null ? orgApacheSlingDiscoveryOakConfigProperties.clusterSyncServiceInterval == null : this.clusterSyncServiceInterval.equals(orgApacheSlingDiscoveryOakConfigProperties.clusterSyncServiceInterval)) &&
        (this.enableSyncToken == null ? orgApacheSlingDiscoveryOakConfigProperties.enableSyncToken == null : this.enableSyncToken.equals(orgApacheSlingDiscoveryOakConfigProperties.enableSyncToken)) &&
        (this.minEventDelay == null ? orgApacheSlingDiscoveryOakConfigProperties.minEventDelay == null : this.minEventDelay.equals(orgApacheSlingDiscoveryOakConfigProperties.minEventDelay)) &&
        (this.socketConnectTimeout == null ? orgApacheSlingDiscoveryOakConfigProperties.socketConnectTimeout == null : this.socketConnectTimeout.equals(orgApacheSlingDiscoveryOakConfigProperties.socketConnectTimeout)) &&
        (this.soTimeout == null ? orgApacheSlingDiscoveryOakConfigProperties.soTimeout == null : this.soTimeout.equals(orgApacheSlingDiscoveryOakConfigProperties.soTimeout)) &&
        (this.topologyConnectorUrls == null ? orgApacheSlingDiscoveryOakConfigProperties.topologyConnectorUrls == null : this.topologyConnectorUrls.equals(orgApacheSlingDiscoveryOakConfigProperties.topologyConnectorUrls)) &&
        (this.topologyConnectorWhitelist == null ? orgApacheSlingDiscoveryOakConfigProperties.topologyConnectorWhitelist == null : this.topologyConnectorWhitelist.equals(orgApacheSlingDiscoveryOakConfigProperties.topologyConnectorWhitelist)) &&
        (this.autoStopLocalLoopEnabled == null ? orgApacheSlingDiscoveryOakConfigProperties.autoStopLocalLoopEnabled == null : this.autoStopLocalLoopEnabled.equals(orgApacheSlingDiscoveryOakConfigProperties.autoStopLocalLoopEnabled)) &&
        (this.gzipConnectorRequestsEnabled == null ? orgApacheSlingDiscoveryOakConfigProperties.gzipConnectorRequestsEnabled == null : this.gzipConnectorRequestsEnabled.equals(orgApacheSlingDiscoveryOakConfigProperties.gzipConnectorRequestsEnabled)) &&
        (this.hmacEnabled == null ? orgApacheSlingDiscoveryOakConfigProperties.hmacEnabled == null : this.hmacEnabled.equals(orgApacheSlingDiscoveryOakConfigProperties.hmacEnabled)) &&
        (this.enableEncryption == null ? orgApacheSlingDiscoveryOakConfigProperties.enableEncryption == null : this.enableEncryption.equals(orgApacheSlingDiscoveryOakConfigProperties.enableEncryption)) &&
        (this.sharedKey == null ? orgApacheSlingDiscoveryOakConfigProperties.sharedKey == null : this.sharedKey.equals(orgApacheSlingDiscoveryOakConfigProperties.sharedKey)) &&
        (this.hmacSharedKeyTTL == null ? orgApacheSlingDiscoveryOakConfigProperties.hmacSharedKeyTTL == null : this.hmacSharedKeyTTL.equals(orgApacheSlingDiscoveryOakConfigProperties.hmacSharedKeyTTL)) &&
        (this.backoffStandbyFactor == null ? orgApacheSlingDiscoveryOakConfigProperties.backoffStandbyFactor == null : this.backoffStandbyFactor.equals(orgApacheSlingDiscoveryOakConfigProperties.backoffStandbyFactor)) &&
        (this.backoffStableFactor == null ? orgApacheSlingDiscoveryOakConfigProperties.backoffStableFactor == null : this.backoffStableFactor.equals(orgApacheSlingDiscoveryOakConfigProperties.backoffStableFactor));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.connectorPingTimeout == null ? 0: this.connectorPingTimeout.hashCode());
    result = 31 * result + (this.connectorPingInterval == null ? 0: this.connectorPingInterval.hashCode());
    result = 31 * result + (this.discoveryLiteCheckInterval == null ? 0: this.discoveryLiteCheckInterval.hashCode());
    result = 31 * result + (this.clusterSyncServiceTimeout == null ? 0: this.clusterSyncServiceTimeout.hashCode());
    result = 31 * result + (this.clusterSyncServiceInterval == null ? 0: this.clusterSyncServiceInterval.hashCode());
    result = 31 * result + (this.enableSyncToken == null ? 0: this.enableSyncToken.hashCode());
    result = 31 * result + (this.minEventDelay == null ? 0: this.minEventDelay.hashCode());
    result = 31 * result + (this.socketConnectTimeout == null ? 0: this.socketConnectTimeout.hashCode());
    result = 31 * result + (this.soTimeout == null ? 0: this.soTimeout.hashCode());
    result = 31 * result + (this.topologyConnectorUrls == null ? 0: this.topologyConnectorUrls.hashCode());
    result = 31 * result + (this.topologyConnectorWhitelist == null ? 0: this.topologyConnectorWhitelist.hashCode());
    result = 31 * result + (this.autoStopLocalLoopEnabled == null ? 0: this.autoStopLocalLoopEnabled.hashCode());
    result = 31 * result + (this.gzipConnectorRequestsEnabled == null ? 0: this.gzipConnectorRequestsEnabled.hashCode());
    result = 31 * result + (this.hmacEnabled == null ? 0: this.hmacEnabled.hashCode());
    result = 31 * result + (this.enableEncryption == null ? 0: this.enableEncryption.hashCode());
    result = 31 * result + (this.sharedKey == null ? 0: this.sharedKey.hashCode());
    result = 31 * result + (this.hmacSharedKeyTTL == null ? 0: this.hmacSharedKeyTTL.hashCode());
    result = 31 * result + (this.backoffStandbyFactor == null ? 0: this.backoffStandbyFactor.hashCode());
    result = 31 * result + (this.backoffStableFactor == null ? 0: this.backoffStableFactor.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingDiscoveryOakConfigProperties {\n");
    
    sb.append("  connectorPingTimeout: ").append(connectorPingTimeout).append("\n");
    sb.append("  connectorPingInterval: ").append(connectorPingInterval).append("\n");
    sb.append("  discoveryLiteCheckInterval: ").append(discoveryLiteCheckInterval).append("\n");
    sb.append("  clusterSyncServiceTimeout: ").append(clusterSyncServiceTimeout).append("\n");
    sb.append("  clusterSyncServiceInterval: ").append(clusterSyncServiceInterval).append("\n");
    sb.append("  enableSyncToken: ").append(enableSyncToken).append("\n");
    sb.append("  minEventDelay: ").append(minEventDelay).append("\n");
    sb.append("  socketConnectTimeout: ").append(socketConnectTimeout).append("\n");
    sb.append("  soTimeout: ").append(soTimeout).append("\n");
    sb.append("  topologyConnectorUrls: ").append(topologyConnectorUrls).append("\n");
    sb.append("  topologyConnectorWhitelist: ").append(topologyConnectorWhitelist).append("\n");
    sb.append("  autoStopLocalLoopEnabled: ").append(autoStopLocalLoopEnabled).append("\n");
    sb.append("  gzipConnectorRequestsEnabled: ").append(gzipConnectorRequestsEnabled).append("\n");
    sb.append("  hmacEnabled: ").append(hmacEnabled).append("\n");
    sb.append("  enableEncryption: ").append(enableEncryption).append("\n");
    sb.append("  sharedKey: ").append(sharedKey).append("\n");
    sb.append("  hmacSharedKeyTTL: ").append(hmacSharedKeyTTL).append("\n");
    sb.append("  backoffStandbyFactor: ").append(backoffStandbyFactor).append("\n");
    sb.append("  backoffStableFactor: ").append(backoffStableFactor).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}