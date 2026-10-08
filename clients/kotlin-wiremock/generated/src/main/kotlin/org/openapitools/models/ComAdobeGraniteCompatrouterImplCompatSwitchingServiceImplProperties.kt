@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties(
    @field:JsonProperty("compatgroups")
    val compatgroups: ConfigNodePropertyArray? = null,

    @field:JsonProperty("enabled")
    val enabled: ConfigNodePropertyBoolean? = null,

)
