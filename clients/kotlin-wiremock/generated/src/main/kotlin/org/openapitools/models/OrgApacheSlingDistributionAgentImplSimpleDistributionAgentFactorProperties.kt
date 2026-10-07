@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties(
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

    @field:JsonProperty("packageExporter.target")
    val packageExporterTarget: ConfigNodePropertyString? = null,

    @field:JsonProperty("packageImporter.target")
    val packageImporterTarget: ConfigNodePropertyString? = null,

    @field:JsonProperty("requestAuthorizationStrategy.target")
    val requestAuthorizationStrategyTarget: ConfigNodePropertyString? = null,

    @field:JsonProperty("triggers.target")
    val triggersTarget: ConfigNodePropertyString? = null,

)
