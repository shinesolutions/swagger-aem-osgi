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
 * @param path 
 * @param serviceRanking 
 * @param authLoginselectorMappings 
 * @param authLoginselectorChangepwMappings 
 * @param authLoginselectorDefaultloginpage 
 * @param authLoginselectorDefaultchangepwpage 
 * @param authLoginselectorHandle 
 * @param authLoginselectorHandleAllExtensions 
 */
data class ComDayCqAuthImplLoginSelectorHandlerProperties(

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
    @param:JsonProperty("service.ranking")
    @get:JsonProperty("service.ranking") val serviceRanking: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("auth.loginselector.mappings")
    @get:JsonProperty("auth.loginselector.mappings") val authLoginselectorMappings: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("auth.loginselector.changepw.mappings")
    @get:JsonProperty("auth.loginselector.changepw.mappings") val authLoginselectorChangepwMappings: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("auth.loginselector.defaultloginpage")
    @get:JsonProperty("auth.loginselector.defaultloginpage") val authLoginselectorDefaultloginpage: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("auth.loginselector.defaultchangepwpage")
    @get:JsonProperty("auth.loginselector.defaultchangepwpage") val authLoginselectorDefaultchangepwpage: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("auth.loginselector.handle")
    @get:JsonProperty("auth.loginselector.handle") val authLoginselectorHandle: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("auth.loginselector.handle.all.extensions")
    @get:JsonProperty("auth.loginselector.handle.all.extensions") val authLoginselectorHandleAllExtensions: ConfigNodePropertyBoolean? = null
) {

}

