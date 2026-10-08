package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeGraniteWorkflowCorePayloadMapCacheProperties(
    val getSystemWorkflowModels: ConfigNodePropertyArray? = null,
    val getPackageRootPath: ConfigNodePropertyString? = null
)
