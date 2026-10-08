package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
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
 * @param tokenExpiration 
 * @param tokenLength 
 * @param tokenRefresh 
 * @param tokenCleanupThreshold 
 * @param passwordHashAlgorithm 
 * @param passwordHashIterations 
 * @param passwordSaltSize 
 */
data class OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("tokenExpiration")
    @get:JsonProperty("tokenExpiration") val tokenExpiration: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("tokenLength")
    @get:JsonProperty("tokenLength") val tokenLength: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("tokenRefresh")
    @get:JsonProperty("tokenRefresh") val tokenRefresh: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("tokenCleanupThreshold")
    @get:JsonProperty("tokenCleanupThreshold") val tokenCleanupThreshold: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("passwordHashAlgorithm")
    @get:JsonProperty("passwordHashAlgorithm") val passwordHashAlgorithm: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("passwordHashIterations")
    @get:JsonProperty("passwordHashIterations") val passwordHashIterations: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("passwordSaltSize")
    @get:JsonProperty("passwordSaltSize") val passwordSaltSize: ConfigNodePropertyInteger? = null
) {

}

