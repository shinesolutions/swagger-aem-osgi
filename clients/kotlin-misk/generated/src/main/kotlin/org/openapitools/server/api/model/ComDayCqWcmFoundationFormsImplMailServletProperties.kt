package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqWcmFoundationFormsImplMailServletProperties(
    val slingServletResourceTypes: ConfigNodePropertyString? = null,
    val slingServletSelectors: ConfigNodePropertyString? = null,
    val resourceWhitelist: ConfigNodePropertyArray? = null,
    val resourceBlacklist: ConfigNodePropertyString? = null
)
