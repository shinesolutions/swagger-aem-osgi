package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
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
 * @param syncTranslationStateSchedulingFormat 
 * @param schedulingRepeatTranslationSchedulingFormat 
 * @param syncTranslationStateLockTimeoutInMinutes 
 * @param exportFormat 
 */
data class ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("syncTranslationState.schedulingFormat")
    @get:JsonProperty("syncTranslationState.schedulingFormat") val syncTranslationStateSchedulingFormat: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("schedulingRepeatTranslation.schedulingFormat")
    @get:JsonProperty("schedulingRepeatTranslation.schedulingFormat") val schedulingRepeatTranslationSchedulingFormat: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("syncTranslationState.lockTimeoutInMinutes")
    @get:JsonProperty("syncTranslationState.lockTimeoutInMinutes") val syncTranslationStateLockTimeoutInMinutes: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("export.format")
    @get:JsonProperty("export.format") val exportFormat: ConfigNodePropertyDropDown? = null
) {

}

