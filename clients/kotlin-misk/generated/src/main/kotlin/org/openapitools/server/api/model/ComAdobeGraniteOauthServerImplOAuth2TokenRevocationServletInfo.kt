package org.openapitools.server.api.model

import org.openapitools.server.api.model.ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo(
    val pid: kotlin.String? = null,
    val title: kotlin.String? = null,
    val description: kotlin.String? = null,
    val properties: ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties? = null
)
