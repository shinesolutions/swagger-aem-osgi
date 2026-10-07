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
 * @param cqDamExpiryNotificationSchedulerIstimebased 
 * @param cqDamExpiryNotificationSchedulerTimebasedRule 
 * @param cqDamExpiryNotificationSchedulerPeriodRule 
 * @param sendEmail 
 * @param assetExpiredLimit 
 * @param priorNotificationSeconds 
 * @param cqDamExpiryNotificationUrlProtocol 
 */
data class ComDayCqDamCoreImplExpiryNotificationJobImplProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.dam.expiry.notification.scheduler.istimebased")
    @get:JsonProperty("cq.dam.expiry.notification.scheduler.istimebased") val cqDamExpiryNotificationSchedulerIstimebased: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.dam.expiry.notification.scheduler.timebased.rule")
    @get:JsonProperty("cq.dam.expiry.notification.scheduler.timebased.rule") val cqDamExpiryNotificationSchedulerTimebasedRule: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.dam.expiry.notification.scheduler.period.rule")
    @get:JsonProperty("cq.dam.expiry.notification.scheduler.period.rule") val cqDamExpiryNotificationSchedulerPeriodRule: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("send_email")
    @get:JsonProperty("send_email") val sendEmail: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("asset_expired_limit")
    @get:JsonProperty("asset_expired_limit") val assetExpiredLimit: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("prior_notification_seconds")
    @get:JsonProperty("prior_notification_seconds") val priorNotificationSeconds: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.dam.expiry.notification.url.protocol")
    @get:JsonProperty("cq.dam.expiry.notification.url.protocol") val cqDamExpiryNotificationUrlProtocol: ConfigNodePropertyString? = null
) {

}

