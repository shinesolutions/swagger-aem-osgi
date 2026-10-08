package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties(
    val nuiEnabled: ConfigNodePropertyBoolean? = null,
    val nuiServiceUrl: ConfigNodePropertyString? = null,
    val nuiApiKey: ConfigNodePropertyString? = null
)
