package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties(
    val name: ConfigNodePropertyString? = null,
    val queue: ConfigNodePropertyString? = null,
    val dropInvalidItems: ConfigNodePropertyBoolean? = null,
    val agentTarget: ConfigNodePropertyString? = null
)
