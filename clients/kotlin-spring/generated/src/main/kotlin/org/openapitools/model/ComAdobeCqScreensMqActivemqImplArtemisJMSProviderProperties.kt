package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ConfigNodePropertyArray
import org.openapitools.model.ConfigNodePropertyBoolean
import org.openapitools.model.ConfigNodePropertyDropDown
import org.openapitools.model.ConfigNodePropertyFloat
import org.openapitools.model.ConfigNodePropertyInteger
import org.openapitools.model.ConfigNodePropertyString
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param serviceRanking 
 * @param globalSize 
 * @param maxDiskUsage 
 * @param persistenceEnabled 
 * @param threadPoolMaxSize 
 * @param scheduledThreadPoolMaxSize 
 * @param gracefulShutdownTimeout 
 * @param queues 
 * @param topics 
 * @param addressesMaxDeliveryAttempts 
 * @param addressesExpiryDelay 
 * @param addressesAddressFullMessagePolicy 
 * @param addressesMaxSizeBytes 
 * @param addressesPageSizeBytes 
 * @param addressesPageCacheMaxSize 
 * @param clusterUser 
 * @param clusterPassword 
 * @param clusterCallTimeout 
 * @param clusterCallFailoverTimeout 
 * @param clusterClientFailureCheckPeriod 
 * @param clusterNotificationAttempts 
 * @param clusterNotificationInterval 
 * @param idCacheSize 
 * @param clusterConfirmationWindowSize 
 * @param clusterConnectionTtl 
 * @param clusterDuplicateDetection 
 * @param clusterInitialConnectAttempts 
 * @param clusterMaxRetryInterval 
 * @param clusterMinLargeMessageSize 
 * @param clusterProducerWindowSize 
 * @param clusterReconnectAttempts 
 * @param clusterRetryInterval 
 * @param clusterRetryIntervalMultiplier 
 */
data class ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("service.ranking")
    @get:JsonProperty("service.ranking") val serviceRanking: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("global.size")
    @get:JsonProperty("global.size") val globalSize: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("max.disk.usage")
    @get:JsonProperty("max.disk.usage") val maxDiskUsage: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("persistence.enabled")
    @get:JsonProperty("persistence.enabled") val persistenceEnabled: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("thread.pool.max.size")
    @get:JsonProperty("thread.pool.max.size") val threadPoolMaxSize: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("scheduled.thread.pool.max.size")
    @get:JsonProperty("scheduled.thread.pool.max.size") val scheduledThreadPoolMaxSize: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("graceful.shutdown.timeout")
    @get:JsonProperty("graceful.shutdown.timeout") val gracefulShutdownTimeout: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("queues")
    @get:JsonProperty("queues") val queues: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("topics")
    @get:JsonProperty("topics") val topics: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("addresses.max.delivery.attempts")
    @get:JsonProperty("addresses.max.delivery.attempts") val addressesMaxDeliveryAttempts: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("addresses.expiry.delay")
    @get:JsonProperty("addresses.expiry.delay") val addressesExpiryDelay: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("addresses.address.full.message.policy")
    @get:JsonProperty("addresses.address.full.message.policy") val addressesAddressFullMessagePolicy: ConfigNodePropertyDropDown? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("addresses.max.size.bytes")
    @get:JsonProperty("addresses.max.size.bytes") val addressesMaxSizeBytes: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("addresses.page.size.bytes")
    @get:JsonProperty("addresses.page.size.bytes") val addressesPageSizeBytes: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("addresses.page.cache.max.size")
    @get:JsonProperty("addresses.page.cache.max.size") val addressesPageCacheMaxSize: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cluster.user")
    @get:JsonProperty("cluster.user") val clusterUser: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cluster.password")
    @get:JsonProperty("cluster.password") val clusterPassword: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cluster.call.timeout")
    @get:JsonProperty("cluster.call.timeout") val clusterCallTimeout: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cluster.call.failover.timeout")
    @get:JsonProperty("cluster.call.failover.timeout") val clusterCallFailoverTimeout: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cluster.client.failure.check.period")
    @get:JsonProperty("cluster.client.failure.check.period") val clusterClientFailureCheckPeriod: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cluster.notification.attempts")
    @get:JsonProperty("cluster.notification.attempts") val clusterNotificationAttempts: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cluster.notification.interval")
    @get:JsonProperty("cluster.notification.interval") val clusterNotificationInterval: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("id.cache.size")
    @get:JsonProperty("id.cache.size") val idCacheSize: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cluster.confirmation.window.size")
    @get:JsonProperty("cluster.confirmation.window.size") val clusterConfirmationWindowSize: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cluster.connection.ttl")
    @get:JsonProperty("cluster.connection.ttl") val clusterConnectionTtl: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cluster.duplicate.detection")
    @get:JsonProperty("cluster.duplicate.detection") val clusterDuplicateDetection: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cluster.initial.connect.attempts")
    @get:JsonProperty("cluster.initial.connect.attempts") val clusterInitialConnectAttempts: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cluster.max.retry.interval")
    @get:JsonProperty("cluster.max.retry.interval") val clusterMaxRetryInterval: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cluster.min.large.message.size")
    @get:JsonProperty("cluster.min.large.message.size") val clusterMinLargeMessageSize: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cluster.producer.window.size")
    @get:JsonProperty("cluster.producer.window.size") val clusterProducerWindowSize: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cluster.reconnect.attempts")
    @get:JsonProperty("cluster.reconnect.attempts") val clusterReconnectAttempts: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cluster.retry.interval")
    @get:JsonProperty("cluster.retry.interval") val clusterRetryInterval: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cluster.retry.interval.multiplier")
    @get:JsonProperty("cluster.retry.interval.multiplier") val clusterRetryIntervalMultiplier: ConfigNodePropertyFloat? = null
) {

}

