package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeGraniteAuthOauthProviderProperties(
    val oauthConfigId: ConfigNodePropertyString? = null,
    val oauthClientId: ConfigNodePropertyString? = null,
    val oauthClientSecret: ConfigNodePropertyString? = null,
    val oauthScope: ConfigNodePropertyArray? = null,
    val oauthConfigProviderId: ConfigNodePropertyString? = null,
    val oauthCreateUsers: ConfigNodePropertyBoolean? = null,
    val oauthUseridProperty: ConfigNodePropertyString? = null,
    val forceStrictUsernameMatching: ConfigNodePropertyBoolean? = null,
    val oauthEncodeUserids: ConfigNodePropertyBoolean? = null,
    val oauthHashUserids: ConfigNodePropertyBoolean? = null,
    val oauthCallBackUrl: ConfigNodePropertyString? = null,
    val oauthAccessTokenPersist: ConfigNodePropertyBoolean? = null,
    val oauthAccessTokenPersistCookie: ConfigNodePropertyBoolean? = null,
    val oauthCsrfStateProtection: ConfigNodePropertyBoolean? = null,
    val oauthRedirectRequestParams: ConfigNodePropertyBoolean? = null,
    val oauthConfigSiblingsAllow: ConfigNodePropertyBoolean? = null
)
