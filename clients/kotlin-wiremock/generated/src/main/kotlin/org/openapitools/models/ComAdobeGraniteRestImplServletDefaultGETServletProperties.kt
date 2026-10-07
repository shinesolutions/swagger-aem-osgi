@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteRestImplServletDefaultGETServletProperties(
    @field:JsonProperty("default.limit")
    val defaultLimit: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("use.absolute.uri")
    val useAbsoluteUri: ConfigNodePropertyBoolean? = null,

)
