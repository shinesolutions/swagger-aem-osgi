package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties(
    val cqAnalyticsTestandtargetApiUrl: ConfigNodePropertyString? = null,
    val cqAnalyticsTestandtargetTimeout: ConfigNodePropertyInteger? = null,
    val cqAnalyticsTestandtargetSockettimeout: ConfigNodePropertyInteger? = null,
    val cqAnalyticsTestandtargetRecommendationsUrlReplace: ConfigNodePropertyString? = null,
    val cqAnalyticsTestandtargetRecommendationsUrlReplacewith: ConfigNodePropertyString? = null
)
