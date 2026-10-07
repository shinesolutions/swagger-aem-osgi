package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqDamCoreImplExpiryNotificationJobImplProperties(
    val cqDamExpiryNotificationSchedulerIstimebased: ConfigNodePropertyBoolean? = null,
    val cqDamExpiryNotificationSchedulerTimebasedRule: ConfigNodePropertyString? = null,
    val cqDamExpiryNotificationSchedulerPeriodRule: ConfigNodePropertyInteger? = null,
    val sendEmail: ConfigNodePropertyBoolean? = null,
    val assetExpiredLimit: ConfigNodePropertyInteger? = null,
    val priorNotificationSeconds: ConfigNodePropertyInteger? = null,
    val cqDamExpiryNotificationUrlProtocol: ConfigNodePropertyString? = null
)
