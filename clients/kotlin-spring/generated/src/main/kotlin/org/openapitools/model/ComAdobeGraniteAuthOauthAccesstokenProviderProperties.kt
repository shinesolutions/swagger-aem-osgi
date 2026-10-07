package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ConfigNodePropertyArray
import org.openapitools.model.ConfigNodePropertyBoolean
import org.openapitools.model.ConfigNodePropertyInteger
import org.openapitools.model.ConfigNodePropertyString
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param name 
 * @param authTokenProviderTitle 
 * @param authTokenProviderDefaultClaims 
 * @param authTokenProviderEndpoint 
 * @param authAccessTokenRequest 
 * @param authTokenProviderKeypairAlias 
 * @param authTokenProviderConnTimeout 
 * @param authTokenProviderSoTimeout 
 * @param authTokenProviderClientId 
 * @param authTokenProviderScope 
 * @param authTokenProviderReuseAccessToken 
 * @param authTokenProviderRelaxedSsl 
 * @param tokenRequestCustomizerType 
 * @param authTokenValidatorType 
 */
data class ComAdobeGraniteAuthOauthAccesstokenProviderProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("name")
    @get:JsonProperty("name") val name: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("auth.token.provider.title")
    @get:JsonProperty("auth.token.provider.title") val authTokenProviderTitle: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("auth.token.provider.default.claims")
    @get:JsonProperty("auth.token.provider.default.claims") val authTokenProviderDefaultClaims: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("auth.token.provider.endpoint")
    @get:JsonProperty("auth.token.provider.endpoint") val authTokenProviderEndpoint: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("auth.access.token.request")
    @get:JsonProperty("auth.access.token.request") val authAccessTokenRequest: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("auth.token.provider.keypair.alias")
    @get:JsonProperty("auth.token.provider.keypair.alias") val authTokenProviderKeypairAlias: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("auth.token.provider.conn.timeout")
    @get:JsonProperty("auth.token.provider.conn.timeout") val authTokenProviderConnTimeout: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("auth.token.provider.so.timeout")
    @get:JsonProperty("auth.token.provider.so.timeout") val authTokenProviderSoTimeout: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("auth.token.provider.client.id")
    @get:JsonProperty("auth.token.provider.client.id") val authTokenProviderClientId: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("auth.token.provider.scope")
    @get:JsonProperty("auth.token.provider.scope") val authTokenProviderScope: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("auth.token.provider.reuse.access.token")
    @get:JsonProperty("auth.token.provider.reuse.access.token") val authTokenProviderReuseAccessToken: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("auth.token.provider.relaxed.ssl")
    @get:JsonProperty("auth.token.provider.relaxed.ssl") val authTokenProviderRelaxedSsl: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("token.request.customizer.type")
    @get:JsonProperty("token.request.customizer.type") val tokenRequestCustomizerType: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("auth.token.validator.type")
    @get:JsonProperty("auth.token.validator.type") val authTokenValidatorType: ConfigNodePropertyString? = null
) {

}

