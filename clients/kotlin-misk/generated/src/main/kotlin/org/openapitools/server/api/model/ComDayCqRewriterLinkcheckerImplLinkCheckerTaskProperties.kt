package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties(
    val schedulerPeriod: ConfigNodePropertyInteger? = null,
    val schedulerConcurrent: ConfigNodePropertyBoolean? = null,
    val goodLinkTestInterval: ConfigNodePropertyInteger? = null,
    val badLinkTestInterval: ConfigNodePropertyInteger? = null,
    val linkUnusedInterval: ConfigNodePropertyInteger? = null,
    val connectionTimeout: ConfigNodePropertyInteger? = null
)
