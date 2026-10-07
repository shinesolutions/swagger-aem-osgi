package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties(
    val oauthIssuer: ConfigNodePropertyString? = null,
    val oauthAccessTokenExpiresIn: ConfigNodePropertyString? = null,
    val osgiHttpWhiteboardServletPattern: ConfigNodePropertyString? = null,
    val osgiHttpWhiteboardContextSelect: ConfigNodePropertyString? = null
)
