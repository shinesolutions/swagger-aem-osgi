package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqDamCoreImplServletMetadataGetServletProperties(
    val slingServletResourceTypes: ConfigNodePropertyString? = null,
    val slingServletMethods: ConfigNodePropertyString? = null,
    val slingServletExtensions: ConfigNodePropertyString? = null,
    val slingServletSelectors: ConfigNodePropertyString? = null
)
