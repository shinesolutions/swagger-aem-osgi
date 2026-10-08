@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties(
    @field:JsonProperty("service.ranking")
    val serviceRanking: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("global.size")
    val globalSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("max.disk.usage")
    val maxDiskUsage: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("persistence.enabled")
    val persistenceEnabled: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("thread.pool.max.size")
    val threadPoolMaxSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("scheduled.thread.pool.max.size")
    val scheduledThreadPoolMaxSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("graceful.shutdown.timeout")
    val gracefulShutdownTimeout: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("queues")
    val queues: ConfigNodePropertyArray? = null,

    @field:JsonProperty("topics")
    val topics: ConfigNodePropertyArray? = null,

    @field:JsonProperty("addresses.max.delivery.attempts")
    val addressesMaxDeliveryAttempts: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("addresses.expiry.delay")
    val addressesExpiryDelay: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("addresses.address.full.message.policy")
    val addressesAddressFullMessagePolicy: ConfigNodePropertyDropDown? = null,

    @field:JsonProperty("addresses.max.size.bytes")
    val addressesMaxSizeBytes: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("addresses.page.size.bytes")
    val addressesPageSizeBytes: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("addresses.page.cache.max.size")
    val addressesPageCacheMaxSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cluster.user")
    val clusterUser: ConfigNodePropertyString? = null,

    @field:JsonProperty("cluster.password")
    val clusterPassword: ConfigNodePropertyString? = null,

    @field:JsonProperty("cluster.call.timeout")
    val clusterCallTimeout: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cluster.call.failover.timeout")
    val clusterCallFailoverTimeout: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cluster.client.failure.check.period")
    val clusterClientFailureCheckPeriod: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cluster.notification.attempts")
    val clusterNotificationAttempts: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cluster.notification.interval")
    val clusterNotificationInterval: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("id.cache.size")
    val idCacheSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cluster.confirmation.window.size")
    val clusterConfirmationWindowSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cluster.connection.ttl")
    val clusterConnectionTtl: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cluster.duplicate.detection")
    val clusterDuplicateDetection: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("cluster.initial.connect.attempts")
    val clusterInitialConnectAttempts: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cluster.max.retry.interval")
    val clusterMaxRetryInterval: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cluster.min.large.message.size")
    val clusterMinLargeMessageSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cluster.producer.window.size")
    val clusterProducerWindowSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cluster.reconnect.attempts")
    val clusterReconnectAttempts: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cluster.retry.interval")
    val clusterRetryInterval: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cluster.retry.interval.multiplier")
    val clusterRetryIntervalMultiplier: ConfigNodePropertyFloat? = null,

)
