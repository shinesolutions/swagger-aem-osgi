@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties(
    @field:JsonProperty("path")
    val path: ConfigNodePropertyString? = null,

    @field:JsonProperty("oauth.clientIds.allowed")
    val oauthClientIdsAllowed: ConfigNodePropertyArray? = null,

    @field:JsonProperty("auth.bearer.sync.ims")
    val authBearerSyncIms: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("auth.tokenRequestParameter")
    val authTokenRequestParameter: ConfigNodePropertyString? = null,

    @field:JsonProperty("oauth.bearer.configid")
    val oauthBearerConfigid: ConfigNodePropertyString? = null,

    @field:JsonProperty("oauth.jwt.support")
    val oauthJwtSupport: ConfigNodePropertyBoolean? = null,

)
