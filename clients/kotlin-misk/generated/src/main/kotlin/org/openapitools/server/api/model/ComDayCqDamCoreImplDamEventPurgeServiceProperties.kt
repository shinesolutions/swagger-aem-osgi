package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyDropDown
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqDamCoreImplDamEventPurgeServiceProperties(
    val schedulerExpression: ConfigNodePropertyString? = null,
    val maxSavedActivities: ConfigNodePropertyInteger? = null,
    val saveInterval: ConfigNodePropertyInteger? = null,
    val enableActivityPurge: ConfigNodePropertyBoolean? = null,
    val eventTypes: ConfigNodePropertyDropDown? = null
)
