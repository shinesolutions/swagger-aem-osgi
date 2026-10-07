@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteOptoutImplOptOutServiceImplProperties(
    @field:JsonProperty("optout.cookies")
    val optoutCookies: ConfigNodePropertyArray? = null,

    @field:JsonProperty("optout.headers")
    val optoutHeaders: ConfigNodePropertyArray? = null,

    @field:JsonProperty("optout.whitelist.cookies")
    val optoutWhitelistCookies: ConfigNodePropertyArray? = null,

)
