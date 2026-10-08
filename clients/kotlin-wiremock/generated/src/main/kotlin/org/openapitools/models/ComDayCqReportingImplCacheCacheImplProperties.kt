@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqReportingImplCacheCacheImplProperties(
    @field:JsonProperty("repcache.enable")
    val repcacheEnable: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("repcache.ttl")
    val repcacheTtl: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("repcache.max")
    val repcacheMax: ConfigNodePropertyInteger? = null,

)
