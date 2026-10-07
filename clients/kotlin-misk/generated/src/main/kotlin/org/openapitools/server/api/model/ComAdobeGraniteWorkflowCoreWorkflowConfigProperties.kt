package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeGraniteWorkflowCoreWorkflowConfigProperties(
    val cqWorkflowConfigWorkflowPackagesRootPath: ConfigNodePropertyArray? = null,
    val cqWorkflowConfigWorkflowProcessLegacyMode: ConfigNodePropertyBoolean? = null,
    val cqWorkflowConfigAllowLocking: ConfigNodePropertyBoolean? = null
)
