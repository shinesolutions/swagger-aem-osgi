@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqWcmCoreStatsPageViewStatisticsImplProperties(
    @field:JsonProperty("pageviewstatistics.trackingurl")
    val pageviewstatisticsTrackingurl: ConfigNodePropertyString? = null,

    @field:JsonProperty("pageviewstatistics.trackingscript.enabled")
    val pageviewstatisticsTrackingscriptEnabled: ConfigNodePropertyString? = null,

)
