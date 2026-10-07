@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties(
    @field:JsonProperty("oauth.token.revocation.active")
    val oauthTokenRevocationActive: ConfigNodePropertyBoolean? = null,

)
