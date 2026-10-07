package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ConfigNodePropertyArray
import org.openapitools.model.ConfigNodePropertyBoolean
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
 * @param formsFormparagraphpostprocessorEnabled 
 * @param formsFormparagraphpostprocessorFormresourcetypes 
 */
data class ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("forms.formparagraphpostprocessor.enabled")
    @get:JsonProperty("forms.formparagraphpostprocessor.enabled") val formsFormparagraphpostprocessorEnabled: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("forms.formparagraphpostprocessor.formresourcetypes")
    @get:JsonProperty("forms.formparagraphpostprocessor.formresourcetypes") val formsFormparagraphpostprocessorFormresourcetypes: ConfigNodePropertyArray? = null
) {

}

