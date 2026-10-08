@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqReplicationImplAgentManagerImplProperties(
    @field:JsonProperty("job.topics")
    val jobTopics: ConfigNodePropertyString? = null,

    @field:JsonProperty("serviceUser.target")
    val serviceUserTarget: ConfigNodePropertyString? = null,

    @field:JsonProperty("agentProvider.target")
    val agentProviderTarget: ConfigNodePropertyString? = null,

)
