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
 * @param providerConfigUserFolder 
 * @param providerConfigTwitterEnableParams 
 * @param providerConfigTwitterParams 
 * @param providerConfigRefreshUserdataEnabled 
 */
data class ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties(

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
    @param:JsonProperty("provider.config.user.folder")
    @get:JsonProperty("provider.config.user.folder") val providerConfigUserFolder: ConfigNodePropertyDropDown? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("provider.config.twitter.enable.params")
    @get:JsonProperty("provider.config.twitter.enable.params") val providerConfigTwitterEnableParams: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("provider.config.twitter.params")
    @get:JsonProperty("provider.config.twitter.params") val providerConfigTwitterParams: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("provider.config.refresh.userdata.enabled")
    @get:JsonProperty("provider.config.refresh.userdata.enabled") val providerConfigRefreshUserdataEnabled: ConfigNodePropertyBoolean? = null
) {

}

