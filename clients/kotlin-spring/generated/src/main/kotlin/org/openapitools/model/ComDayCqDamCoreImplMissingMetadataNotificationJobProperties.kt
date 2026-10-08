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
 * @param cqDamMissingmetadataNotificationSchedulerIstimebased 
 * @param cqDamMissingmetadataNotificationSchedulerTimebasedRule 
 * @param cqDamMissingmetadataNotificationSchedulerPeriodRule 
 * @param cqDamMissingmetadataNotificationRecipient 
 */
data class ComDayCqDamCoreImplMissingMetadataNotificationJobProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.dam.missingmetadata.notification.scheduler.istimebased")
    @get:JsonProperty("cq.dam.missingmetadata.notification.scheduler.istimebased") val cqDamMissingmetadataNotificationSchedulerIstimebased: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.dam.missingmetadata.notification.scheduler.timebased.rule")
    @get:JsonProperty("cq.dam.missingmetadata.notification.scheduler.timebased.rule") val cqDamMissingmetadataNotificationSchedulerTimebasedRule: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.dam.missingmetadata.notification.scheduler.period.rule")
    @get:JsonProperty("cq.dam.missingmetadata.notification.scheduler.period.rule") val cqDamMissingmetadataNotificationSchedulerPeriodRule: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.dam.missingmetadata.notification.recipient")
    @get:JsonProperty("cq.dam.missingmetadata.notification.recipient") val cqDamMissingmetadataNotificationRecipient: ConfigNodePropertyString? = null
) {

}

