@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqDamCoreImplExpiryNotificationJobImplProperties(
    @field:JsonProperty("cq.dam.expiry.notification.scheduler.istimebased")
    val cqDamExpiryNotificationSchedulerIstimebased: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("cq.dam.expiry.notification.scheduler.timebased.rule")
    val cqDamExpiryNotificationSchedulerTimebasedRule: ConfigNodePropertyString? = null,

    @field:JsonProperty("cq.dam.expiry.notification.scheduler.period.rule")
    val cqDamExpiryNotificationSchedulerPeriodRule: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("send_email")
    val sendEmail: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("asset_expired_limit")
    val assetExpiredLimit: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("prior_notification_seconds")
    val priorNotificationSeconds: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cq.dam.expiry.notification.url.protocol")
    val cqDamExpiryNotificationUrlProtocol: ConfigNodePropertyString? = null,

)
