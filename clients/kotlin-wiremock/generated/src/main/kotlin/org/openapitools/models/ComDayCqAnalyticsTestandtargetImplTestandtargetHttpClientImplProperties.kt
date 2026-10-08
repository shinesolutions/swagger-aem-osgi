@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties(
    @field:JsonProperty("cq.analytics.testandtarget.api.url")
    val cqAnalyticsTestandtargetApiUrl: ConfigNodePropertyString? = null,

    @field:JsonProperty("cq.analytics.testandtarget.timeout")
    val cqAnalyticsTestandtargetTimeout: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cq.analytics.testandtarget.sockettimeout")
    val cqAnalyticsTestandtargetSockettimeout: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cq.analytics.testandtarget.recommendations.url.replace")
    val cqAnalyticsTestandtargetRecommendationsUrlReplace: ConfigNodePropertyString? = null,

    @field:JsonProperty("cq.analytics.testandtarget.recommendations.url.replacewith")
    val cqAnalyticsTestandtargetRecommendationsUrlReplacewith: ConfigNodePropertyString? = null,

)
