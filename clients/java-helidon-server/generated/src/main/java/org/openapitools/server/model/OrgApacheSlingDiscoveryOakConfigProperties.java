package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingDiscoveryOakConfigProperties   {

    private ConfigNodePropertyInteger connectorPingTimeout;
    private ConfigNodePropertyInteger connectorPingInterval;
    private ConfigNodePropertyInteger discoveryLiteCheckInterval;
    private ConfigNodePropertyInteger clusterSyncServiceTimeout;
    private ConfigNodePropertyInteger clusterSyncServiceInterval;
    private ConfigNodePropertyBoolean enableSyncToken;
    private ConfigNodePropertyInteger minEventDelay;
    private ConfigNodePropertyInteger socketConnectTimeout;
    private ConfigNodePropertyInteger soTimeout;
    private ConfigNodePropertyArray topologyConnectorUrls;
    private ConfigNodePropertyArray topologyConnectorWhitelist;
    private ConfigNodePropertyBoolean autoStopLocalLoopEnabled;
    private ConfigNodePropertyBoolean gzipConnectorRequestsEnabled;
    private ConfigNodePropertyBoolean hmacEnabled;
    private ConfigNodePropertyBoolean enableEncryption;
    private ConfigNodePropertyString sharedKey;
    private ConfigNodePropertyInteger hmacSharedKeyTTL;
    private ConfigNodePropertyString backoffStandbyFactor;
    private ConfigNodePropertyString backoffStableFactor;

    /**
     * Default constructor.
     */
    public OrgApacheSlingDiscoveryOakConfigProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingDiscoveryOakConfigProperties.
     *
     * @param connectorPingTimeout connectorPingTimeout
     * @param connectorPingInterval connectorPingInterval
     * @param discoveryLiteCheckInterval discoveryLiteCheckInterval
     * @param clusterSyncServiceTimeout clusterSyncServiceTimeout
     * @param clusterSyncServiceInterval clusterSyncServiceInterval
     * @param enableSyncToken enableSyncToken
     * @param minEventDelay minEventDelay
     * @param socketConnectTimeout socketConnectTimeout
     * @param soTimeout soTimeout
     * @param topologyConnectorUrls topologyConnectorUrls
     * @param topologyConnectorWhitelist topologyConnectorWhitelist
     * @param autoStopLocalLoopEnabled autoStopLocalLoopEnabled
     * @param gzipConnectorRequestsEnabled gzipConnectorRequestsEnabled
     * @param hmacEnabled hmacEnabled
     * @param enableEncryption enableEncryption
     * @param sharedKey sharedKey
     * @param hmacSharedKeyTTL hmacSharedKeyTTL
     * @param backoffStandbyFactor backoffStandbyFactor
     * @param backoffStableFactor backoffStableFactor
     */
    public OrgApacheSlingDiscoveryOakConfigProperties(
        ConfigNodePropertyInteger connectorPingTimeout, 
        ConfigNodePropertyInteger connectorPingInterval, 
        ConfigNodePropertyInteger discoveryLiteCheckInterval, 
        ConfigNodePropertyInteger clusterSyncServiceTimeout, 
        ConfigNodePropertyInteger clusterSyncServiceInterval, 
        ConfigNodePropertyBoolean enableSyncToken, 
        ConfigNodePropertyInteger minEventDelay, 
        ConfigNodePropertyInteger socketConnectTimeout, 
        ConfigNodePropertyInteger soTimeout, 
        ConfigNodePropertyArray topologyConnectorUrls, 
        ConfigNodePropertyArray topologyConnectorWhitelist, 
        ConfigNodePropertyBoolean autoStopLocalLoopEnabled, 
        ConfigNodePropertyBoolean gzipConnectorRequestsEnabled, 
        ConfigNodePropertyBoolean hmacEnabled, 
        ConfigNodePropertyBoolean enableEncryption, 
        ConfigNodePropertyString sharedKey, 
        ConfigNodePropertyInteger hmacSharedKeyTTL, 
        ConfigNodePropertyString backoffStandbyFactor, 
        ConfigNodePropertyString backoffStableFactor
    ) {
        this.connectorPingTimeout = connectorPingTimeout;
        this.connectorPingInterval = connectorPingInterval;
        this.discoveryLiteCheckInterval = discoveryLiteCheckInterval;
        this.clusterSyncServiceTimeout = clusterSyncServiceTimeout;
        this.clusterSyncServiceInterval = clusterSyncServiceInterval;
        this.enableSyncToken = enableSyncToken;
        this.minEventDelay = minEventDelay;
        this.socketConnectTimeout = socketConnectTimeout;
        this.soTimeout = soTimeout;
        this.topologyConnectorUrls = topologyConnectorUrls;
        this.topologyConnectorWhitelist = topologyConnectorWhitelist;
        this.autoStopLocalLoopEnabled = autoStopLocalLoopEnabled;
        this.gzipConnectorRequestsEnabled = gzipConnectorRequestsEnabled;
        this.hmacEnabled = hmacEnabled;
        this.enableEncryption = enableEncryption;
        this.sharedKey = sharedKey;
        this.hmacSharedKeyTTL = hmacSharedKeyTTL;
        this.backoffStandbyFactor = backoffStandbyFactor;
        this.backoffStableFactor = backoffStableFactor;
    }



    /**
     * Get connectorPingTimeout
     * @return connectorPingTimeout
     */
    public ConfigNodePropertyInteger getConnectorPingTimeout() {
        return connectorPingTimeout;
    }

    public void setConnectorPingTimeout(ConfigNodePropertyInteger connectorPingTimeout) {
        this.connectorPingTimeout = connectorPingTimeout;
    }

    /**
     * Get connectorPingInterval
     * @return connectorPingInterval
     */
    public ConfigNodePropertyInteger getConnectorPingInterval() {
        return connectorPingInterval;
    }

    public void setConnectorPingInterval(ConfigNodePropertyInteger connectorPingInterval) {
        this.connectorPingInterval = connectorPingInterval;
    }

    /**
     * Get discoveryLiteCheckInterval
     * @return discoveryLiteCheckInterval
     */
    public ConfigNodePropertyInteger getDiscoveryLiteCheckInterval() {
        return discoveryLiteCheckInterval;
    }

    public void setDiscoveryLiteCheckInterval(ConfigNodePropertyInteger discoveryLiteCheckInterval) {
        this.discoveryLiteCheckInterval = discoveryLiteCheckInterval;
    }

    /**
     * Get clusterSyncServiceTimeout
     * @return clusterSyncServiceTimeout
     */
    public ConfigNodePropertyInteger getClusterSyncServiceTimeout() {
        return clusterSyncServiceTimeout;
    }

    public void setClusterSyncServiceTimeout(ConfigNodePropertyInteger clusterSyncServiceTimeout) {
        this.clusterSyncServiceTimeout = clusterSyncServiceTimeout;
    }

    /**
     * Get clusterSyncServiceInterval
     * @return clusterSyncServiceInterval
     */
    public ConfigNodePropertyInteger getClusterSyncServiceInterval() {
        return clusterSyncServiceInterval;
    }

    public void setClusterSyncServiceInterval(ConfigNodePropertyInteger clusterSyncServiceInterval) {
        this.clusterSyncServiceInterval = clusterSyncServiceInterval;
    }

    /**
     * Get enableSyncToken
     * @return enableSyncToken
     */
    public ConfigNodePropertyBoolean getEnableSyncToken() {
        return enableSyncToken;
    }

    public void setEnableSyncToken(ConfigNodePropertyBoolean enableSyncToken) {
        this.enableSyncToken = enableSyncToken;
    }

    /**
     * Get minEventDelay
     * @return minEventDelay
     */
    public ConfigNodePropertyInteger getMinEventDelay() {
        return minEventDelay;
    }

    public void setMinEventDelay(ConfigNodePropertyInteger minEventDelay) {
        this.minEventDelay = minEventDelay;
    }

    /**
     * Get socketConnectTimeout
     * @return socketConnectTimeout
     */
    public ConfigNodePropertyInteger getSocketConnectTimeout() {
        return socketConnectTimeout;
    }

    public void setSocketConnectTimeout(ConfigNodePropertyInteger socketConnectTimeout) {
        this.socketConnectTimeout = socketConnectTimeout;
    }

    /**
     * Get soTimeout
     * @return soTimeout
     */
    public ConfigNodePropertyInteger getSoTimeout() {
        return soTimeout;
    }

    public void setSoTimeout(ConfigNodePropertyInteger soTimeout) {
        this.soTimeout = soTimeout;
    }

    /**
     * Get topologyConnectorUrls
     * @return topologyConnectorUrls
     */
    public ConfigNodePropertyArray getTopologyConnectorUrls() {
        return topologyConnectorUrls;
    }

    public void setTopologyConnectorUrls(ConfigNodePropertyArray topologyConnectorUrls) {
        this.topologyConnectorUrls = topologyConnectorUrls;
    }

    /**
     * Get topologyConnectorWhitelist
     * @return topologyConnectorWhitelist
     */
    public ConfigNodePropertyArray getTopologyConnectorWhitelist() {
        return topologyConnectorWhitelist;
    }

    public void setTopologyConnectorWhitelist(ConfigNodePropertyArray topologyConnectorWhitelist) {
        this.topologyConnectorWhitelist = topologyConnectorWhitelist;
    }

    /**
     * Get autoStopLocalLoopEnabled
     * @return autoStopLocalLoopEnabled
     */
    public ConfigNodePropertyBoolean getAutoStopLocalLoopEnabled() {
        return autoStopLocalLoopEnabled;
    }

    public void setAutoStopLocalLoopEnabled(ConfigNodePropertyBoolean autoStopLocalLoopEnabled) {
        this.autoStopLocalLoopEnabled = autoStopLocalLoopEnabled;
    }

    /**
     * Get gzipConnectorRequestsEnabled
     * @return gzipConnectorRequestsEnabled
     */
    public ConfigNodePropertyBoolean getGzipConnectorRequestsEnabled() {
        return gzipConnectorRequestsEnabled;
    }

    public void setGzipConnectorRequestsEnabled(ConfigNodePropertyBoolean gzipConnectorRequestsEnabled) {
        this.gzipConnectorRequestsEnabled = gzipConnectorRequestsEnabled;
    }

    /**
     * Get hmacEnabled
     * @return hmacEnabled
     */
    public ConfigNodePropertyBoolean getHmacEnabled() {
        return hmacEnabled;
    }

    public void setHmacEnabled(ConfigNodePropertyBoolean hmacEnabled) {
        this.hmacEnabled = hmacEnabled;
    }

    /**
     * Get enableEncryption
     * @return enableEncryption
     */
    public ConfigNodePropertyBoolean getEnableEncryption() {
        return enableEncryption;
    }

    public void setEnableEncryption(ConfigNodePropertyBoolean enableEncryption) {
        this.enableEncryption = enableEncryption;
    }

    /**
     * Get sharedKey
     * @return sharedKey
     */
    public ConfigNodePropertyString getSharedKey() {
        return sharedKey;
    }

    public void setSharedKey(ConfigNodePropertyString sharedKey) {
        this.sharedKey = sharedKey;
    }

    /**
     * Get hmacSharedKeyTTL
     * @return hmacSharedKeyTTL
     */
    public ConfigNodePropertyInteger getHmacSharedKeyTTL() {
        return hmacSharedKeyTTL;
    }

    public void setHmacSharedKeyTTL(ConfigNodePropertyInteger hmacSharedKeyTTL) {
        this.hmacSharedKeyTTL = hmacSharedKeyTTL;
    }

    /**
     * Get backoffStandbyFactor
     * @return backoffStandbyFactor
     */
    public ConfigNodePropertyString getBackoffStandbyFactor() {
        return backoffStandbyFactor;
    }

    public void setBackoffStandbyFactor(ConfigNodePropertyString backoffStandbyFactor) {
        this.backoffStandbyFactor = backoffStandbyFactor;
    }

    /**
     * Get backoffStableFactor
     * @return backoffStableFactor
     */
    public ConfigNodePropertyString getBackoffStableFactor() {
        return backoffStableFactor;
    }

    public void setBackoffStableFactor(ConfigNodePropertyString backoffStableFactor) {
        this.backoffStableFactor = backoffStableFactor;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

