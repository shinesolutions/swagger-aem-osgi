@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteAuthOauthImplGraniteProviderProperties(
    @field:JsonProperty("oauth.provider.id")
    val oauthProviderId: ConfigNodePropertyString? = null,

    @field:JsonProperty("oauth.provider.granite.authorization.url")
    val oauthProviderGraniteAuthorizationUrl: ConfigNodePropertyString? = null,

    @field:JsonProperty("oauth.provider.granite.token.url")
    val oauthProviderGraniteTokenUrl: ConfigNodePropertyString? = null,

    @field:JsonProperty("oauth.provider.granite.profile.url")
    val oauthProviderGraniteProfileUrl: ConfigNodePropertyString? = null,

    @field:JsonProperty("oauth.provider.granite.extended.details.urls")
    val oauthProviderGraniteExtendedDetailsUrls: ConfigNodePropertyString? = null,

)
