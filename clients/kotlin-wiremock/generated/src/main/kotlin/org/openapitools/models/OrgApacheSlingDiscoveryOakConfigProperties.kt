@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingDiscoveryOakConfigProperties(
    @field:JsonProperty("connectorPingTimeout")
    val connectorPingTimeout: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("connectorPingInterval")
    val connectorPingInterval: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("discoveryLiteCheckInterval")
    val discoveryLiteCheckInterval: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("clusterSyncServiceTimeout")
    val clusterSyncServiceTimeout: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("clusterSyncServiceInterval")
    val clusterSyncServiceInterval: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("enableSyncToken")
    val enableSyncToken: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("minEventDelay")
    val minEventDelay: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("socketConnectTimeout")
    val socketConnectTimeout: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("soTimeout")
    val soTimeout: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("topologyConnectorUrls")
    val topologyConnectorUrls: ConfigNodePropertyArray? = null,

    @field:JsonProperty("topologyConnectorWhitelist")
    val topologyConnectorWhitelist: ConfigNodePropertyArray? = null,

    @field:JsonProperty("autoStopLocalLoopEnabled")
    val autoStopLocalLoopEnabled: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("gzipConnectorRequestsEnabled")
    val gzipConnectorRequestsEnabled: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("hmacEnabled")
    val hmacEnabled: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("enableEncryption")
    val enableEncryption: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("sharedKey")
    val sharedKey: ConfigNodePropertyString? = null,

    @field:JsonProperty("hmacSharedKeyTTL")
    val hmacSharedKeyTTL: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("backoffStandbyFactor")
    val backoffStandbyFactor: ConfigNodePropertyString? = null,

    @field:JsonProperty("backoffStableFactor")
    val backoffStableFactor: ConfigNodePropertyString? = null,

)
