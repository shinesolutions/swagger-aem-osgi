package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ConfigNodePropertyArray
import org.openapitools.model.ConfigNodePropertyBoolean
import org.openapitools.model.ConfigNodePropertyDropDown
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
 * @param oauthCloudConfigRoot 
 * @param providerConfigRoot 
 * @param providerConfigCreateTagsEnabled 
 * @param providerConfigUserFolder 
 * @param providerConfigFacebookFetchFields 
 * @param providerConfigFacebookFields 
 * @param providerConfigRefreshUserdataEnabled 
 */
data class ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties(

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
    @param:JsonProperty("oauth.cloud.config.root")
    @get:JsonProperty("oauth.cloud.config.root") val oauthCloudConfigRoot: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("provider.config.root")
    @get:JsonProperty("provider.config.root") val providerConfigRoot: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("provider.config.create.tags.enabled")
    @get:JsonProperty("provider.config.create.tags.enabled") val providerConfigCreateTagsEnabled: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("provider.config.user.folder")
    @get:JsonProperty("provider.config.user.folder") val providerConfigUserFolder: ConfigNodePropertyDropDown? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("provider.config.facebook.fetch.fields")
    @get:JsonProperty("provider.config.facebook.fetch.fields") val providerConfigFacebookFetchFields: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("provider.config.facebook.fields")
    @get:JsonProperty("provider.config.facebook.fields") val providerConfigFacebookFields: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("provider.config.refresh.userdata.enabled")
    @get:JsonProperty("provider.config.refresh.userdata.enabled") val providerConfigRefreshUserdataEnabled: ConfigNodePropertyBoolean? = null
) {

}

