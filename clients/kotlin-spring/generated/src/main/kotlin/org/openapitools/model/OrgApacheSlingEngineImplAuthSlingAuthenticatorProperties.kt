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
 * @param osgiHttpWhiteboardContextSelect 
 * @param osgiHttpWhiteboardListener 
 * @param authSudoCookie 
 * @param authSudoParameter 
 * @param authAnnonymous 
 * @param slingAuthRequirements 
 * @param slingAuthAnonymousUser 
 * @param slingAuthAnonymousPassword 
 * @param authHttp 
 * @param authHttpRealm 
 * @param authUriSuffix 
 */
data class OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("osgi.http.whiteboard.context.select")
    @get:JsonProperty("osgi.http.whiteboard.context.select") val osgiHttpWhiteboardContextSelect: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("osgi.http.whiteboard.listener")
    @get:JsonProperty("osgi.http.whiteboard.listener") val osgiHttpWhiteboardListener: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("auth.sudo.cookie")
    @get:JsonProperty("auth.sudo.cookie") val authSudoCookie: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("auth.sudo.parameter")
    @get:JsonProperty("auth.sudo.parameter") val authSudoParameter: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("auth.annonymous")
    @get:JsonProperty("auth.annonymous") val authAnnonymous: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("sling.auth.requirements")
    @get:JsonProperty("sling.auth.requirements") val slingAuthRequirements: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("sling.auth.anonymous.user")
    @get:JsonProperty("sling.auth.anonymous.user") val slingAuthAnonymousUser: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("sling.auth.anonymous.password")
    @get:JsonProperty("sling.auth.anonymous.password") val slingAuthAnonymousPassword: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("auth.http")
    @get:JsonProperty("auth.http") val authHttp: ConfigNodePropertyDropDown? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("auth.http.realm")
    @get:JsonProperty("auth.http.realm") val authHttpRealm: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("auth.uri.suffix")
    @get:JsonProperty("auth.uri.suffix") val authUriSuffix: ConfigNodePropertyArray? = null
) {

}

