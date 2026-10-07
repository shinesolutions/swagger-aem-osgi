package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeGraniteOptoutImplOptOutServiceImplProperties(
    val optoutCookies: ConfigNodePropertyArray? = null,
    val optoutHeaders: ConfigNodePropertyArray? = null,
    val optoutWhitelistCookies: ConfigNodePropertyArray? = null
)
