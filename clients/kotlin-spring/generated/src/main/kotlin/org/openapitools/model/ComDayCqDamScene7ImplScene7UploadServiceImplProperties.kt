package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ConfigNodePropertyInteger
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
 * @param cqDamScene7UploadserviceActivejobtimeoutLabel 
 * @param cqDamScene7UploadserviceConnectionmaxperrouteLabel 
 */
data class ComDayCqDamScene7ImplScene7UploadServiceImplProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.dam.scene7.uploadservice.activejobtimeout.label")
    @get:JsonProperty("cq.dam.scene7.uploadservice.activejobtimeout.label") val cqDamScene7UploadserviceActivejobtimeoutLabel: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.dam.scene7.uploadservice.connectionmaxperroute.label")
    @get:JsonProperty("cq.dam.scene7.uploadservice.connectionmaxperroute.label") val cqDamScene7UploadserviceConnectionmaxperrouteLabel: ConfigNodePropertyInteger? = null
) {

}

