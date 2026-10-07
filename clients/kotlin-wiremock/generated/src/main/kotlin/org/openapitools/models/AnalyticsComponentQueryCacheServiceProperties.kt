@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AnalyticsComponentQueryCacheServiceProperties(
    @field:JsonProperty("cq.analytics.component.query.cache.size")
    val cqAnalyticsComponentQueryCacheSize: ConfigNodePropertyInteger? = null,

)
