@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqDamCoreImplMissingMetadataNotificationJobProperties(
    @field:JsonProperty("cq.dam.missingmetadata.notification.scheduler.istimebased")
    val cqDamMissingmetadataNotificationSchedulerIstimebased: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("cq.dam.missingmetadata.notification.scheduler.timebased.rule")
    val cqDamMissingmetadataNotificationSchedulerTimebasedRule: ConfigNodePropertyString? = null,

    @field:JsonProperty("cq.dam.missingmetadata.notification.scheduler.period.rule")
    val cqDamMissingmetadataNotificationSchedulerPeriodRule: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cq.dam.missingmetadata.notification.recipient")
    val cqDamMissingmetadataNotificationRecipient: ConfigNodePropertyString? = null,

)
