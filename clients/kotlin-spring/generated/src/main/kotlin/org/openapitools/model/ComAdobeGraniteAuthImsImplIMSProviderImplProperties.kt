package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ConfigNodePropertyArray
import org.openapitools.model.ConfigNodePropertyBoolean
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
 * @param oauthProviderImsAuthorizationUrl 
 * @param oauthProviderImsTokenUrl 
 * @param oauthProviderImsProfileUrl 
 * @param oauthProviderImsExtendedDetailsUrls 
 * @param oauthProviderImsValidateTokenUrl 
 * @param oauthProviderImsSessionProperty 
 * @param oauthProviderImsServiceTokenClientId 
 * @param oauthProviderImsServiceTokenClientSecret 
 * @param oauthProviderImsServiceToken 
 * @param imsOrgRef 
 * @param imsGroupMapping 
 * @param oauthProviderImsOnlyLicenseGroup 
 */
data class ComAdobeGraniteAuthImsImplIMSProviderImplProperties(

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
    @param:JsonProperty("oauth.provider.ims.authorization.url")
    @get:JsonProperty("oauth.provider.ims.authorization.url") val oauthProviderImsAuthorizationUrl: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("oauth.provider.ims.token.url")
    @get:JsonProperty("oauth.provider.ims.token.url") val oauthProviderImsTokenUrl: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("oauth.provider.ims.profile.url")
    @get:JsonProperty("oauth.provider.ims.profile.url") val oauthProviderImsProfileUrl: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("oauth.provider.ims.extended.details.urls")
    @get:JsonProperty("oauth.provider.ims.extended.details.urls") val oauthProviderImsExtendedDetailsUrls: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("oauth.provider.ims.validate.token.url")
    @get:JsonProperty("oauth.provider.ims.validate.token.url") val oauthProviderImsValidateTokenUrl: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("oauth.provider.ims.session.property")
    @get:JsonProperty("oauth.provider.ims.session.property") val oauthProviderImsSessionProperty: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("oauth.provider.ims.service.token.client.id")
    @get:JsonProperty("oauth.provider.ims.service.token.client.id") val oauthProviderImsServiceTokenClientId: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("oauth.provider.ims.service.token.client.secret")
    @get:JsonProperty("oauth.provider.ims.service.token.client.secret") val oauthProviderImsServiceTokenClientSecret: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("oauth.provider.ims.service.token")
    @get:JsonProperty("oauth.provider.ims.service.token") val oauthProviderImsServiceToken: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ims.org.ref")
    @get:JsonProperty("ims.org.ref") val imsOrgRef: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ims.group.mapping")
    @get:JsonProperty("ims.group.mapping") val imsGroupMapping: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("oauth.provider.ims.only.license.group")
    @get:JsonProperty("oauth.provider.ims.only.license.group") val oauthProviderImsOnlyLicenseGroup: ConfigNodePropertyBoolean? = null
) {

}

