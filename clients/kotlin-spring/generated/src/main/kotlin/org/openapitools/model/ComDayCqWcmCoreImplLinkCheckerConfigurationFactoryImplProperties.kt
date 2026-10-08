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
 * @param linkExpiredPrefix 
 * @param linkExpiredRemove 
 * @param linkExpiredSuffix 
 * @param linkInvalidPrefix 
 * @param linkInvalidRemove 
 * @param linkInvalidSuffix 
 * @param linkPredatedPrefix 
 * @param linkPredatedRemove 
 * @param linkPredatedSuffix 
 * @param linkWcmmodes 
 */
data class ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("link.expired.prefix")
    @get:JsonProperty("link.expired.prefix") val linkExpiredPrefix: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("link.expired.remove")
    @get:JsonProperty("link.expired.remove") val linkExpiredRemove: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("link.expired.suffix")
    @get:JsonProperty("link.expired.suffix") val linkExpiredSuffix: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("link.invalid.prefix")
    @get:JsonProperty("link.invalid.prefix") val linkInvalidPrefix: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("link.invalid.remove")
    @get:JsonProperty("link.invalid.remove") val linkInvalidRemove: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("link.invalid.suffix")
    @get:JsonProperty("link.invalid.suffix") val linkInvalidSuffix: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("link.predated.prefix")
    @get:JsonProperty("link.predated.prefix") val linkPredatedPrefix: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("link.predated.remove")
    @get:JsonProperty("link.predated.remove") val linkPredatedRemove: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("link.predated.suffix")
    @get:JsonProperty("link.predated.suffix") val linkPredatedSuffix: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("link.wcmmodes")
    @get:JsonProperty("link.wcmmodes") val linkWcmmodes: ConfigNodePropertyArray? = null
) {

}

