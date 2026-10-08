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
 * @param oauthConfigId 
 * @param oauthClientId 
 * @param oauthClientSecret 
 * @param oauthScope 
 * @param oauthConfigProviderId 
 * @param oauthCreateUsers 
 * @param oauthUseridProperty 
 * @param forceStrictUsernameMatching 
 * @param oauthEncodeUserids 
 * @param oauthHashUserids 
 * @param oauthCallBackUrl 
 * @param oauthAccessTokenPersist 
 * @param oauthAccessTokenPersistCookie 
 * @param oauthCsrfStateProtection 
 * @param oauthRedirectRequestParams 
 * @param oauthConfigSiblingsAllow 
 */
data class ComAdobeGraniteAuthOauthProviderProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("oauth.config.id")
    @get:JsonProperty("oauth.config.id") val oauthConfigId: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("oauth.client.id")
    @get:JsonProperty("oauth.client.id") val oauthClientId: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("oauth.client.secret")
    @get:JsonProperty("oauth.client.secret") val oauthClientSecret: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("oauth.scope")
    @get:JsonProperty("oauth.scope") val oauthScope: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("oauth.config.provider.id")
    @get:JsonProperty("oauth.config.provider.id") val oauthConfigProviderId: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("oauth.create.users")
    @get:JsonProperty("oauth.create.users") val oauthCreateUsers: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("oauth.userid.property")
    @get:JsonProperty("oauth.userid.property") val oauthUseridProperty: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("force.strict.username.matching")
    @get:JsonProperty("force.strict.username.matching") val forceStrictUsernameMatching: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("oauth.encode.userids")
    @get:JsonProperty("oauth.encode.userids") val oauthEncodeUserids: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("oauth.hash.userids")
    @get:JsonProperty("oauth.hash.userids") val oauthHashUserids: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("oauth.callBackUrl")
    @get:JsonProperty("oauth.callBackUrl") val oauthCallBackUrl: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("oauth.access.token.persist")
    @get:JsonProperty("oauth.access.token.persist") val oauthAccessTokenPersist: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("oauth.access.token.persist.cookie")
    @get:JsonProperty("oauth.access.token.persist.cookie") val oauthAccessTokenPersistCookie: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("oauth.csrf.state.protection")
    @get:JsonProperty("oauth.csrf.state.protection") val oauthCsrfStateProtection: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("oauth.redirect.request.params")
    @get:JsonProperty("oauth.redirect.request.params") val oauthRedirectRequestParams: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("oauth.config.siblings.allow")
    @get:JsonProperty("oauth.config.siblings.allow") val oauthConfigSiblingsAllow: ConfigNodePropertyBoolean? = null
) {

}

