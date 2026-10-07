package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyDropDown
import org.openapitools.server.api.model.ConfigNodePropertyFloat
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties(
    val serviceRanking: ConfigNodePropertyInteger? = null,
    val globalSize: ConfigNodePropertyInteger? = null,
    val maxDiskUsage: ConfigNodePropertyInteger? = null,
    val persistenceEnabled: ConfigNodePropertyBoolean? = null,
    val threadPoolMaxSize: ConfigNodePropertyInteger? = null,
    val scheduledThreadPoolMaxSize: ConfigNodePropertyInteger? = null,
    val gracefulShutdownTimeout: ConfigNodePropertyInteger? = null,
    val queues: ConfigNodePropertyArray? = null,
    val topics: ConfigNodePropertyArray? = null,
    val addressesMaxDeliveryAttempts: ConfigNodePropertyInteger? = null,
    val addressesExpiryDelay: ConfigNodePropertyInteger? = null,
    val addressesAddressFullMessagePolicy: ConfigNodePropertyDropDown? = null,
    val addressesMaxSizeBytes: ConfigNodePropertyInteger? = null,
    val addressesPageSizeBytes: ConfigNodePropertyInteger? = null,
    val addressesPageCacheMaxSize: ConfigNodePropertyInteger? = null,
    val clusterUser: ConfigNodePropertyString? = null,
    val clusterPassword: ConfigNodePropertyString? = null,
    val clusterCallTimeout: ConfigNodePropertyInteger? = null,
    val clusterCallFailoverTimeout: ConfigNodePropertyInteger? = null,
    val clusterClientFailureCheckPeriod: ConfigNodePropertyInteger? = null,
    val clusterNotificationAttempts: ConfigNodePropertyInteger? = null,
    val clusterNotificationInterval: ConfigNodePropertyInteger? = null,
    val idCacheSize: ConfigNodePropertyInteger? = null,
    val clusterConfirmationWindowSize: ConfigNodePropertyInteger? = null,
    val clusterConnectionTtl: ConfigNodePropertyInteger? = null,
    val clusterDuplicateDetection: ConfigNodePropertyBoolean? = null,
    val clusterInitialConnectAttempts: ConfigNodePropertyInteger? = null,
    val clusterMaxRetryInterval: ConfigNodePropertyInteger? = null,
    val clusterMinLargeMessageSize: ConfigNodePropertyInteger? = null,
    val clusterProducerWindowSize: ConfigNodePropertyInteger? = null,
    val clusterReconnectAttempts: ConfigNodePropertyInteger? = null,
    val clusterRetryInterval: ConfigNodePropertyInteger? = null,
    val clusterRetryIntervalMultiplier: ConfigNodePropertyFloat? = null
)
