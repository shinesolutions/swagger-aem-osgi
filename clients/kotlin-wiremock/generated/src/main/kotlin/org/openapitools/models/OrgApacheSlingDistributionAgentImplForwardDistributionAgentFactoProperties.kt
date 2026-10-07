@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties(
    @field:JsonProperty("name")
    val name: ConfigNodePropertyString? = null,

    @field:JsonProperty("title")
    val title: ConfigNodePropertyString? = null,

    @field:JsonProperty("details")
    val details: ConfigNodePropertyString? = null,

    @field:JsonProperty("enabled")
    val enabled: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("serviceName")
    val serviceName: ConfigNodePropertyString? = null,

    @field:JsonProperty("log.level")
    val logLevel: ConfigNodePropertyDropDown? = null,

    @field:JsonProperty("allowed.roots")
    val allowedRoots: ConfigNodePropertyArray? = null,

    @field:JsonProperty("queue.processing.enabled")
    val queueProcessingEnabled: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("packageImporter.endpoints")
    val packageImporterEndpoints: ConfigNodePropertyArray? = null,

    @field:JsonProperty("passiveQueues")
    val passiveQueues: ConfigNodePropertyArray? = null,

    @field:JsonProperty("priorityQueues")
    val priorityQueues: ConfigNodePropertyArray? = null,

    @field:JsonProperty("retry.strategy")
    val retryStrategy: ConfigNodePropertyDropDown? = null,

    @field:JsonProperty("retry.attempts")
    val retryAttempts: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("requestAuthorizationStrategy.target")
    val requestAuthorizationStrategyTarget: ConfigNodePropertyString? = null,

    @field:JsonProperty("transportSecretProvider.target")
    val transportSecretProviderTarget: ConfigNodePropertyString? = null,

    @field:JsonProperty("packageBuilder.target")
    val packageBuilderTarget: ConfigNodePropertyString? = null,

    @field:JsonProperty("triggers.target")
    val triggersTarget: ConfigNodePropertyString? = null,

    @field:JsonProperty("queue.provider")
    val queueProvider: ConfigNodePropertyDropDown? = null,

    @field:JsonProperty("async.delivery")
    val asyncDelivery: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("http.conn.timeout")
    val httpConnTimeout: ConfigNodePropertyInteger? = null,

)
