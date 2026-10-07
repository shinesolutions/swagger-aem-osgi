package org.openapitools.server.api.model

import org.openapitools.server.api.model.ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo(
    val pid: kotlin.String? = null,
    val title: kotlin.String? = null,
    val description: kotlin.String? = null,
    val properties: ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties? = null
)
