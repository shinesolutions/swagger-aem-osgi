package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
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
 * @param oauthProviderId 
 * @param oauthProviderGraniteAuthorizationUrl 
 * @param oauthProviderGraniteTokenUrl 
 * @param oauthProviderGraniteProfileUrl 
 * @param oauthProviderGraniteExtendedDetailsUrls 
 */
data class ComAdobeGraniteAuthOauthImplGraniteProviderProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("oauth.provider.id")
    @get:JsonProperty("oauth.provider.id") val oauthProviderId: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("oauth.provider.granite.authorization.url")
    @get:JsonProperty("oauth.provider.granite.authorization.url") val oauthProviderGraniteAuthorizationUrl: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("oauth.provider.granite.token.url")
    @get:JsonProperty("oauth.provider.granite.token.url") val oauthProviderGraniteTokenUrl: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("oauth.provider.granite.profile.url")
    @get:JsonProperty("oauth.provider.granite.profile.url") val oauthProviderGraniteProfileUrl: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("oauth.provider.granite.extended.details.urls")
    @get:JsonProperty("oauth.provider.granite.extended.details.urls") val oauthProviderGraniteExtendedDetailsUrls: ConfigNodePropertyString? = null
) {

}

