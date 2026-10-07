@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties(
    @field:JsonProperty("name")
    val name: ConfigNodePropertyString? = null,

    @field:JsonProperty("queue")
    val queue: ConfigNodePropertyString? = null,

    @field:JsonProperty("drop.invalid.items")
    val dropInvalidItems: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("agent.target")
    val agentTarget: ConfigNodePropertyString? = null,

)
