package org.openapitools.server.api.model

import org.openapitools.server.api.model.ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo(
    val pid: kotlin.String? = null,
    val title: kotlin.String? = null,
    val description: kotlin.String? = null,
    val properties: ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties? = null
)
