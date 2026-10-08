package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeGraniteAuthOauthImplGithubProviderImplProperties(
    val oauthProviderId: ConfigNodePropertyString? = null,
    val oauthProviderGithubAuthorizationUrl: ConfigNodePropertyString? = null,
    val oauthProviderGithubTokenUrl: ConfigNodePropertyString? = null,
    val oauthProviderGithubProfileUrl: ConfigNodePropertyString? = null
)
