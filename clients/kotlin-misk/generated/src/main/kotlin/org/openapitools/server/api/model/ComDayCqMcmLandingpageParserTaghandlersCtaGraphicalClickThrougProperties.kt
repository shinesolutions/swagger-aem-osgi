package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties(
    val serviceRanking: ConfigNodePropertyInteger? = null,
    val tagpattern: ConfigNodePropertyString? = null,
    val componentResourceType: ConfigNodePropertyString? = null
)
