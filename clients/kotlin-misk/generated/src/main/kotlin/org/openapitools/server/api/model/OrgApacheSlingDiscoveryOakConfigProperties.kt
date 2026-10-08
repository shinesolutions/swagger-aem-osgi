package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingDiscoveryOakConfigProperties(
    val connectorPingTimeout: ConfigNodePropertyInteger? = null,
    val connectorPingInterval: ConfigNodePropertyInteger? = null,
    val discoveryLiteCheckInterval: ConfigNodePropertyInteger? = null,
    val clusterSyncServiceTimeout: ConfigNodePropertyInteger? = null,
    val clusterSyncServiceInterval: ConfigNodePropertyInteger? = null,
    val enableSyncToken: ConfigNodePropertyBoolean? = null,
    val minEventDelay: ConfigNodePropertyInteger? = null,
    val socketConnectTimeout: ConfigNodePropertyInteger? = null,
    val soTimeout: ConfigNodePropertyInteger? = null,
    val topologyConnectorUrls: ConfigNodePropertyArray? = null,
    val topologyConnectorWhitelist: ConfigNodePropertyArray? = null,
    val autoStopLocalLoopEnabled: ConfigNodePropertyBoolean? = null,
    val gzipConnectorRequestsEnabled: ConfigNodePropertyBoolean? = null,
    val hmacEnabled: ConfigNodePropertyBoolean? = null,
    val enableEncryption: ConfigNodePropertyBoolean? = null,
    val sharedKey: ConfigNodePropertyString? = null,
    val hmacSharedKeyTTL: ConfigNodePropertyInteger? = null,
    val backoffStandbyFactor: ConfigNodePropertyString? = null,
    val backoffStableFactor: ConfigNodePropertyString? = null
)
