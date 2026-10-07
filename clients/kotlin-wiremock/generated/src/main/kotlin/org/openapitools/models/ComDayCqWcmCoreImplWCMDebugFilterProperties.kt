@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqWcmCoreImplWCMDebugFilterProperties(
    @field:JsonProperty("wcmdbgfilter.enabled")
    val wcmdbgfilterEnabled: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("wcmdbgfilter.jspDebug")
    val wcmdbgfilterJspDebug: ConfigNodePropertyBoolean? = null,

)
