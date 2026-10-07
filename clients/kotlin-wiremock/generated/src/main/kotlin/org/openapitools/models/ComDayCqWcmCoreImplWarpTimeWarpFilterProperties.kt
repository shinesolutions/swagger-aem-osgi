@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqWcmCoreImplWarpTimeWarpFilterProperties(
    @field:JsonProperty("filter.order")
    val filterOrder: ConfigNodePropertyString? = null,

    @field:JsonProperty("filter.scope")
    val filterScope: ConfigNodePropertyString? = null,

)
