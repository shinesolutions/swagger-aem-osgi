package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqReplicationImplAgentManagerImplProperties(
    val jobTopics: ConfigNodePropertyString? = null,
    val serviceUserTarget: ConfigNodePropertyString? = null,
    val agentProviderTarget: ConfigNodePropertyString? = null
)
