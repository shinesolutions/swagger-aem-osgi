package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ConfigNodePropertyDropDownType
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
 * @param name property name
 * @param optional True if optional
 * @param isSet True if property is set
 * @param type 
 * @param &#x60;value&#x60; Property value
 * @param description Property description
 */
data class ConfigNodePropertyDropDown(

    @Schema(description = "property name")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("name")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(description = "True if optional")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("optional")
    @get:JsonProperty("optional") val optional: kotlin.Boolean? = null,

    @Schema(description = "True if property is set")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("is_set")
    @get:JsonProperty("is_set") val isSet: kotlin.Boolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("type")
    @get:JsonProperty("type") val type: ConfigNodePropertyDropDownType? = null,

    @field:Valid
    @Schema(description = "Property value")
    @param:JsonProperty("value")
    @get:JsonProperty("value") val `value`: kotlin.Any? = null,

    @Schema(description = "Property description")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("description")
    @get:JsonProperty("description") val description: kotlin.String? = null
) {

}

