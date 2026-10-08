@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties(
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

    @field:JsonProperty("requestAuthorizationStrategy.target")
    val requestAuthorizationStrategyTarget: ConfigNodePropertyString? = null,

    @field:JsonProperty("queueProviderFactory.target")
    val queueProviderFactoryTarget: ConfigNodePropertyString? = null,

    @field:JsonProperty("packageBuilder.target")
    val packageBuilderTarget: ConfigNodePropertyString? = null,

    @field:JsonProperty("triggers.target")
    val triggersTarget: ConfigNodePropertyString? = null,

    @field:JsonProperty("priorityQueues")
    val priorityQueues: ConfigNodePropertyArray? = null,

)
