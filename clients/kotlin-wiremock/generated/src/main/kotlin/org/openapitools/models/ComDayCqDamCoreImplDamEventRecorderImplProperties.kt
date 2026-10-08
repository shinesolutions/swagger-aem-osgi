@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqDamCoreImplDamEventRecorderImplProperties(
    @field:JsonProperty("event.filter")
    val eventFilter: ConfigNodePropertyString? = null,

    @field:JsonProperty("event.queue.length")
    val eventQueueLength: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("eventrecorder.enabled")
    val eventrecorderEnabled: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("eventrecorder.blacklist")
    val eventrecorderBlacklist: ConfigNodePropertyArray? = null,

    @field:JsonProperty("eventrecorder.eventtypes")
    val eventrecorderEventtypes: ConfigNodePropertyDropDown? = null,

)
