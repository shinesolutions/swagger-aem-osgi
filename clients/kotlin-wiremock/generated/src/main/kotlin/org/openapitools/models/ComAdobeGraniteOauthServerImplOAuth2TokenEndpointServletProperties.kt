@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties(
    @field:JsonProperty("oauth.issuer")
    val oauthIssuer: ConfigNodePropertyString? = null,

    @field:JsonProperty("oauth.access.token.expires.in")
    val oauthAccessTokenExpiresIn: ConfigNodePropertyString? = null,

    @field:JsonProperty("osgi.http.whiteboard.servlet.pattern")
    val osgiHttpWhiteboardServletPattern: ConfigNodePropertyString? = null,

    @field:JsonProperty("osgi.http.whiteboard.context.select")
    val osgiHttpWhiteboardContextSelect: ConfigNodePropertyString? = null,

)
