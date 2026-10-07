@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqWorkflowImplEmailEMailNotificationServiceProperties(
    @field:JsonProperty("from.address")
    val fromAddress: ConfigNodePropertyString? = null,

    @field:JsonProperty("host.prefix")
    val hostPrefix: ConfigNodePropertyString? = null,

    @field:JsonProperty("notify.onabort")
    val notifyOnabort: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("notify.oncomplete")
    val notifyOncomplete: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("notify.oncontainercomplete")
    val notifyOncontainercomplete: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("notify.useronly")
    val notifyUseronly: ConfigNodePropertyBoolean? = null,

)
