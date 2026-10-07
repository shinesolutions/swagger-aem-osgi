@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteAuthOauthAccesstokenProviderProperties(
    @field:JsonProperty("name")
    val name: ConfigNodePropertyString? = null,

    @field:JsonProperty("auth.token.provider.title")
    val authTokenProviderTitle: ConfigNodePropertyString? = null,

    @field:JsonProperty("auth.token.provider.default.claims")
    val authTokenProviderDefaultClaims: ConfigNodePropertyArray? = null,

    @field:JsonProperty("auth.token.provider.endpoint")
    val authTokenProviderEndpoint: ConfigNodePropertyString? = null,

    @field:JsonProperty("auth.access.token.request")
    val authAccessTokenRequest: ConfigNodePropertyString? = null,

    @field:JsonProperty("auth.token.provider.keypair.alias")
    val authTokenProviderKeypairAlias: ConfigNodePropertyString? = null,

    @field:JsonProperty("auth.token.provider.conn.timeout")
    val authTokenProviderConnTimeout: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("auth.token.provider.so.timeout")
    val authTokenProviderSoTimeout: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("auth.token.provider.client.id")
    val authTokenProviderClientId: ConfigNodePropertyString? = null,

    @field:JsonProperty("auth.token.provider.scope")
    val authTokenProviderScope: ConfigNodePropertyString? = null,

    @field:JsonProperty("auth.token.provider.reuse.access.token")
    val authTokenProviderReuseAccessToken: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("auth.token.provider.relaxed.ssl")
    val authTokenProviderRelaxedSsl: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("token.request.customizer.type")
    val tokenRequestCustomizerType: ConfigNodePropertyString? = null,

    @field:JsonProperty("auth.token.validator.type")
    val authTokenValidatorType: ConfigNodePropertyString? = null,

)
