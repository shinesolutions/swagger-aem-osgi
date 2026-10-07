@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties(
    @field:JsonProperty("oauth.client.revocation.active")
    val oauthClientRevocationActive: ConfigNodePropertyBoolean? = null,

)
