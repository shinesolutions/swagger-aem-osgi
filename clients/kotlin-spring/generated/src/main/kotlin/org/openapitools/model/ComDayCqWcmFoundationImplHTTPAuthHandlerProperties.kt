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
 * @param path 
 * @param authHttpNologin 
 * @param authHttpRealm 
 * @param authDefaultLoginpage 
 * @param authCredForm 
 * @param authCredUtf8 
 */
data class ComDayCqWcmFoundationImplHTTPAuthHandlerProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("path")
    @get:JsonProperty("path") val path: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("auth.http.nologin")
    @get:JsonProperty("auth.http.nologin") val authHttpNologin: ConfigNodePropertyBoolean? = null,

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
    @param:JsonProperty("auth.default.loginpage")
    @get:JsonProperty("auth.default.loginpage") val authDefaultLoginpage: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("auth.cred.form")
    @get:JsonProperty("auth.cred.form") val authCredForm: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("auth.cred.utf8")
    @get:JsonProperty("auth.cred.utf8") val authCredUtf8: ConfigNodePropertyArray? = null
) {

}

