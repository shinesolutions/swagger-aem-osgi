@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties(
    @field:JsonProperty("notify.onupdate")
    val notifyOnupdate: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("notify.oncomplete")
    val notifyOncomplete: ConfigNodePropertyBoolean? = null,

)
