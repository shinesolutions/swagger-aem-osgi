@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqDamCoreImplDamEventPurgeServiceProperties(
    @field:JsonProperty("scheduler.expression")
    val schedulerExpression: ConfigNodePropertyString? = null,

    @field:JsonProperty("maxSavedActivities")
    val maxSavedActivities: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("saveInterval")
    val saveInterval: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("enableActivityPurge")
    val enableActivityPurge: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("eventTypes")
    val eventTypes: ConfigNodePropertyDropDown? = null,

)
