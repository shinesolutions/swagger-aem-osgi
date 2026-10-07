@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqDamCoreImplEventDamEventAuditListenerProperties(
    @field:JsonProperty("event.filter")
    val eventFilter: ConfigNodePropertyString? = null,

    @field:JsonProperty("enabled")
    val enabled: ConfigNodePropertyBoolean? = null,

)
