package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeGraniteAuthOauthAccesstokenProviderProperties(
    val name: ConfigNodePropertyString? = null,
    val authTokenProviderTitle: ConfigNodePropertyString? = null,
    val authTokenProviderDefaultClaims: ConfigNodePropertyArray? = null,
    val authTokenProviderEndpoint: ConfigNodePropertyString? = null,
    val authAccessTokenRequest: ConfigNodePropertyString? = null,
    val authTokenProviderKeypairAlias: ConfigNodePropertyString? = null,
    val authTokenProviderConnTimeout: ConfigNodePropertyInteger? = null,
    val authTokenProviderSoTimeout: ConfigNodePropertyInteger? = null,
    val authTokenProviderClientId: ConfigNodePropertyString? = null,
    val authTokenProviderScope: ConfigNodePropertyString? = null,
    val authTokenProviderReuseAccessToken: ConfigNodePropertyBoolean? = null,
    val authTokenProviderRelaxedSsl: ConfigNodePropertyBoolean? = null,
    val tokenRequestCustomizerType: ConfigNodePropertyString? = null,
    val authTokenValidatorType: ConfigNodePropertyString? = null
)
