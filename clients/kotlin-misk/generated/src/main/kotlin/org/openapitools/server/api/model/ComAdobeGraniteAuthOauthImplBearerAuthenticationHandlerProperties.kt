package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties(
    val path: ConfigNodePropertyString? = null,
    val oauthClientIdsAllowed: ConfigNodePropertyArray? = null,
    val authBearerSyncIms: ConfigNodePropertyBoolean? = null,
    val authTokenRequestParameter: ConfigNodePropertyString? = null,
    val oauthBearerConfigid: ConfigNodePropertyString? = null,
    val oauthJwtSupport: ConfigNodePropertyBoolean? = null
)
