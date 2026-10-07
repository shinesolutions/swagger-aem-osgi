@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteAuthOauthProviderProperties(
    @field:JsonProperty("oauth.config.id")
    val oauthConfigId: ConfigNodePropertyString? = null,

    @field:JsonProperty("oauth.client.id")
    val oauthClientId: ConfigNodePropertyString? = null,

    @field:JsonProperty("oauth.client.secret")
    val oauthClientSecret: ConfigNodePropertyString? = null,

    @field:JsonProperty("oauth.scope")
    val oauthScope: ConfigNodePropertyArray? = null,

    @field:JsonProperty("oauth.config.provider.id")
    val oauthConfigProviderId: ConfigNodePropertyString? = null,

    @field:JsonProperty("oauth.create.users")
    val oauthCreateUsers: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("oauth.userid.property")
    val oauthUseridProperty: ConfigNodePropertyString? = null,

    @field:JsonProperty("force.strict.username.matching")
    val forceStrictUsernameMatching: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("oauth.encode.userids")
    val oauthEncodeUserids: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("oauth.hash.userids")
    val oauthHashUserids: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("oauth.callBackUrl")
    val oauthCallBackUrl: ConfigNodePropertyString? = null,

    @field:JsonProperty("oauth.access.token.persist")
    val oauthAccessTokenPersist: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("oauth.access.token.persist.cookie")
    val oauthAccessTokenPersistCookie: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("oauth.csrf.state.protection")
    val oauthCsrfStateProtection: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("oauth.redirect.request.params")
    val oauthRedirectRequestParams: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("oauth.config.siblings.allow")
    val oauthConfigSiblingsAllow: ConfigNodePropertyBoolean? = null,

)
