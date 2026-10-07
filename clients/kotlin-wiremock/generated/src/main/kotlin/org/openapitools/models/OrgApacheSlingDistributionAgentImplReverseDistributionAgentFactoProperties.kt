@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties(
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

    @field:JsonProperty("queue.processing.enabled")
    val queueProcessingEnabled: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("packageExporter.endpoints")
    val packageExporterEndpoints: ConfigNodePropertyArray? = null,

    @field:JsonProperty("pull.items")
    val pullItems: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("http.conn.timeout")
    val httpConnTimeout: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("requestAuthorizationStrategy.target")
    val requestAuthorizationStrategyTarget: ConfigNodePropertyString? = null,

    @field:JsonProperty("transportSecretProvider.target")
    val transportSecretProviderTarget: ConfigNodePropertyString? = null,

    @field:JsonProperty("packageBuilder.target")
    val packageBuilderTarget: ConfigNodePropertyString? = null,

    @field:JsonProperty("triggers.target")
    val triggersTarget: ConfigNodePropertyString? = null,

)
