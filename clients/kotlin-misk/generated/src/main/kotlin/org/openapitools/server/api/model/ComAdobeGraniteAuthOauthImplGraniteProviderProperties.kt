package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeGraniteAuthOauthImplGraniteProviderProperties(
    val oauthProviderId: ConfigNodePropertyString? = null,
    val oauthProviderGraniteAuthorizationUrl: ConfigNodePropertyString? = null,
    val oauthProviderGraniteTokenUrl: ConfigNodePropertyString? = null,
    val oauthProviderGraniteProfileUrl: ConfigNodePropertyString? = null,
    val oauthProviderGraniteExtendedDetailsUrls: ConfigNodePropertyString? = null
)
