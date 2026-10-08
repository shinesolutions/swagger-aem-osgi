package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * @param labels Drop Down label
 * @param propertyValues Drown Down value
 */
data class ConfigNodePropertyDropDownType(

    @field:Valid
    @Schema(description = "Drop Down label")
    @param:JsonProperty("labels")
    @get:JsonProperty("labels") val labels: kotlin.Any? = null,

    @field:Valid
    @Schema(description = "Drown Down value")
    @param:JsonProperty("values")
    @get:JsonProperty("values") val propertyValues: kotlin.Any? = null
) {

}

