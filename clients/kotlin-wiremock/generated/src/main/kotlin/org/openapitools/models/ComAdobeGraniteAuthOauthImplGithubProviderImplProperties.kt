@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteAuthOauthImplGithubProviderImplProperties(
    @field:JsonProperty("oauth.provider.id")
    val oauthProviderId: ConfigNodePropertyString? = null,

    @field:JsonProperty("oauth.provider.github.authorization.url")
    val oauthProviderGithubAuthorizationUrl: ConfigNodePropertyString? = null,

    @field:JsonProperty("oauth.provider.github.token.url")
    val oauthProviderGithubTokenUrl: ConfigNodePropertyString? = null,

    @field:JsonProperty("oauth.provider.github.profile.url")
    val oauthProviderGithubProfileUrl: ConfigNodePropertyString? = null,

)
