@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteCompatrouterImplRoutingConfigProperties(
    @field:JsonProperty("id")
    val id: ConfigNodePropertyString? = null,

    @field:JsonProperty("compatPath")
    val compatPath: ConfigNodePropertyString? = null,

    @field:JsonProperty("newPath")
    val newPath: ConfigNodePropertyString? = null,

)
