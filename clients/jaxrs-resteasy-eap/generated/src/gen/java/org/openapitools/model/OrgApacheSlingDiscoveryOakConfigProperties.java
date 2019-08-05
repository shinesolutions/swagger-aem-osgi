package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class OrgApacheSlingDiscoveryOakConfigProperties   {
  

  private ConfigNodePropertyInteger connectorPingTimeout = null;

  private ConfigNodePropertyInteger connectorPingInterval = null;

  private ConfigNodePropertyInteger discoveryLiteCheckInterval = null;

  private ConfigNodePropertyInteger clusterSyncServiceTimeout = null;

  private ConfigNodePropertyInteger clusterSyncServiceInterval = null;

  private ConfigNodePropertyBoolean enableSyncToken = null;

  private ConfigNodePropertyInteger minEventDelay = null;

  private ConfigNodePropertyInteger socketConnectTimeout = null;

  private ConfigNodePropertyInteger soTimeout = null;

  private ConfigNodePropertyArray topologyConnectorUrls = null;

  private ConfigNodePropertyArray topologyConnectorWhitelist = null;

  private ConfigNodePropertyBoolean autoStopLocalLoopEnabled = null;

  private ConfigNodePropertyBoolean gzipConnectorRequestsEnabled = null;

  private ConfigNodePropertyBoolean hmacEnabled = null;

  private ConfigNodePropertyBoolean enableEncryption = null;

  private ConfigNodePropertyString sharedKey = null;

  private ConfigNodePropertyInteger hmacSharedKeyTTL = null;

  private ConfigNodePropertyString backoffStandbyFactor = null;

  private ConfigNodePropertyString backoffStableFactor = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("connectorPingTimeout")
  public ConfigNodePropertyInteger getConnectorPingTimeout() {
    return connectorPingTimeout;
  }
  public void setConnectorPingTimeout(ConfigNodePropertyInteger connectorPingTimeout) {
    this.connectorPingTimeout = connectorPingTimeout;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("connectorPingInterval")
  public ConfigNodePropertyInteger getConnectorPingInterval() {
    return connectorPingInterval;
  }
  public void setConnectorPingInterval(ConfigNodePropertyInteger connectorPingInterval) {
    this.connectorPingInterval = connectorPingInterval;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("discoveryLiteCheckInterval")
  public ConfigNodePropertyInteger getDiscoveryLiteCheckInterval() {
    return discoveryLiteCheckInterval;
  }
  public void setDiscoveryLiteCheckInterval(ConfigNodePropertyInteger discoveryLiteCheckInterval) {
    this.discoveryLiteCheckInterval = discoveryLiteCheckInterval;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("clusterSyncServiceTimeout")
  public ConfigNodePropertyInteger getClusterSyncServiceTimeout() {
    return clusterSyncServiceTimeout;
  }
  public void setClusterSyncServiceTimeout(ConfigNodePropertyInteger clusterSyncServiceTimeout) {
    this.clusterSyncServiceTimeout = clusterSyncServiceTimeout;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("clusterSyncServiceInterval")
  public ConfigNodePropertyInteger getClusterSyncServiceInterval() {
    return clusterSyncServiceInterval;
  }
  public void setClusterSyncServiceInterval(ConfigNodePropertyInteger clusterSyncServiceInterval) {
    this.clusterSyncServiceInterval = clusterSyncServiceInterval;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("enableSyncToken")
  public ConfigNodePropertyBoolean getEnableSyncToken() {
    return enableSyncToken;
  }
  public void setEnableSyncToken(ConfigNodePropertyBoolean enableSyncToken) {
    this.enableSyncToken = enableSyncToken;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("minEventDelay")
  public ConfigNodePropertyInteger getMinEventDelay() {
    return minEventDelay;
  }
  public void setMinEventDelay(ConfigNodePropertyInteger minEventDelay) {
    this.minEventDelay = minEventDelay;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("socketConnectTimeout")
  public ConfigNodePropertyInteger getSocketConnectTimeout() {
    return socketConnectTimeout;
  }
  public void setSocketConnectTimeout(ConfigNodePropertyInteger socketConnectTimeout) {
    this.socketConnectTimeout = socketConnectTimeout;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("soTimeout")
  public ConfigNodePropertyInteger getSoTimeout() {
    return soTimeout;
  }
  public void setSoTimeout(ConfigNodePropertyInteger soTimeout) {
    this.soTimeout = soTimeout;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("topologyConnectorUrls")
  public ConfigNodePropertyArray getTopologyConnectorUrls() {
    return topologyConnectorUrls;
  }
  public void setTopologyConnectorUrls(ConfigNodePropertyArray topologyConnectorUrls) {
    this.topologyConnectorUrls = topologyConnectorUrls;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("topologyConnectorWhitelist")
  public ConfigNodePropertyArray getTopologyConnectorWhitelist() {
    return topologyConnectorWhitelist;
  }
  public void setTopologyConnectorWhitelist(ConfigNodePropertyArray topologyConnectorWhitelist) {
    this.topologyConnectorWhitelist = topologyConnectorWhitelist;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("autoStopLocalLoopEnabled")
  public ConfigNodePropertyBoolean getAutoStopLocalLoopEnabled() {
    return autoStopLocalLoopEnabled;
  }
  public void setAutoStopLocalLoopEnabled(ConfigNodePropertyBoolean autoStopLocalLoopEnabled) {
    this.autoStopLocalLoopEnabled = autoStopLocalLoopEnabled;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("gzipConnectorRequestsEnabled")
  public ConfigNodePropertyBoolean getGzipConnectorRequestsEnabled() {
    return gzipConnectorRequestsEnabled;
  }
  public void setGzipConnectorRequestsEnabled(ConfigNodePropertyBoolean gzipConnectorRequestsEnabled) {
    this.gzipConnectorRequestsEnabled = gzipConnectorRequestsEnabled;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("hmacEnabled")
  public ConfigNodePropertyBoolean getHmacEnabled() {
    return hmacEnabled;
  }
  public void setHmacEnabled(ConfigNodePropertyBoolean hmacEnabled) {
    this.hmacEnabled = hmacEnabled;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("enableEncryption")
  public ConfigNodePropertyBoolean getEnableEncryption() {
    return enableEncryption;
  }
  public void setEnableEncryption(ConfigNodePropertyBoolean enableEncryption) {
    this.enableEncryption = enableEncryption;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sharedKey")
  public ConfigNodePropertyString getSharedKey() {
    return sharedKey;
  }
  public void setSharedKey(ConfigNodePropertyString sharedKey) {
    this.sharedKey = sharedKey;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("hmacSharedKeyTTL")
  public ConfigNodePropertyInteger getHmacSharedKeyTTL() {
    return hmacSharedKeyTTL;
  }
  public void setHmacSharedKeyTTL(ConfigNodePropertyInteger hmacSharedKeyTTL) {
    this.hmacSharedKeyTTL = hmacSharedKeyTTL;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("backoffStandbyFactor")
  public ConfigNodePropertyString getBackoffStandbyFactor() {
    return backoffStandbyFactor;
  }
  public void setBackoffStandbyFactor(ConfigNodePropertyString backoffStandbyFactor) {
    this.backoffStandbyFactor = backoffStandbyFactor;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("backoffStableFactor")
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
    return Objects.equals(connectorPingTimeout, orgApacheSlingDiscoveryOakConfigProperties.connectorPingTimeout) &&
        Objects.equals(connectorPingInterval, orgApacheSlingDiscoveryOakConfigProperties.connectorPingInterval) &&
        Objects.equals(discoveryLiteCheckInterval, orgApacheSlingDiscoveryOakConfigProperties.discoveryLiteCheckInterval) &&
        Objects.equals(clusterSyncServiceTimeout, orgApacheSlingDiscoveryOakConfigProperties.clusterSyncServiceTimeout) &&
        Objects.equals(clusterSyncServiceInterval, orgApacheSlingDiscoveryOakConfigProperties.clusterSyncServiceInterval) &&
        Objects.equals(enableSyncToken, orgApacheSlingDiscoveryOakConfigProperties.enableSyncToken) &&
        Objects.equals(minEventDelay, orgApacheSlingDiscoveryOakConfigProperties.minEventDelay) &&
        Objects.equals(socketConnectTimeout, orgApacheSlingDiscoveryOakConfigProperties.socketConnectTimeout) &&
        Objects.equals(soTimeout, orgApacheSlingDiscoveryOakConfigProperties.soTimeout) &&
        Objects.equals(topologyConnectorUrls, orgApacheSlingDiscoveryOakConfigProperties.topologyConnectorUrls) &&
        Objects.equals(topologyConnectorWhitelist, orgApacheSlingDiscoveryOakConfigProperties.topologyConnectorWhitelist) &&
        Objects.equals(autoStopLocalLoopEnabled, orgApacheSlingDiscoveryOakConfigProperties.autoStopLocalLoopEnabled) &&
        Objects.equals(gzipConnectorRequestsEnabled, orgApacheSlingDiscoveryOakConfigProperties.gzipConnectorRequestsEnabled) &&
        Objects.equals(hmacEnabled, orgApacheSlingDiscoveryOakConfigProperties.hmacEnabled) &&
        Objects.equals(enableEncryption, orgApacheSlingDiscoveryOakConfigProperties.enableEncryption) &&
        Objects.equals(sharedKey, orgApacheSlingDiscoveryOakConfigProperties.sharedKey) &&
        Objects.equals(hmacSharedKeyTTL, orgApacheSlingDiscoveryOakConfigProperties.hmacSharedKeyTTL) &&
        Objects.equals(backoffStandbyFactor, orgApacheSlingDiscoveryOakConfigProperties.backoffStandbyFactor) &&
        Objects.equals(backoffStableFactor, orgApacheSlingDiscoveryOakConfigProperties.backoffStableFactor);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

