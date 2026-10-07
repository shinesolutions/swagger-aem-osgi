@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties(
    @field:JsonProperty("sling.servlet.paths")
    val slingServletPaths: ConfigNodePropertyString? = null,

    @field:JsonProperty("oauth.revocation.active")
    val oauthRevocationActive: ConfigNodePropertyBoolean? = null,

)
