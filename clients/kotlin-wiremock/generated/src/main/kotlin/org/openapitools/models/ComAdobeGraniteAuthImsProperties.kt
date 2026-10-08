@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteAuthImsProperties(
    @field:JsonProperty("configid")
    val configid: ConfigNodePropertyString? = null,

    @field:JsonProperty("scope")
    val scope: ConfigNodePropertyString? = null,

)
