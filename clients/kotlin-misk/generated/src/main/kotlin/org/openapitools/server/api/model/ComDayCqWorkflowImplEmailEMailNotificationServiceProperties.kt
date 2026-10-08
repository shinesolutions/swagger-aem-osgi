package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqWorkflowImplEmailEMailNotificationServiceProperties(
    val fromAddress: ConfigNodePropertyString? = null,
    val hostPrefix: ConfigNodePropertyString? = null,
    val notifyOnabort: ConfigNodePropertyBoolean? = null,
    val notifyOncomplete: ConfigNodePropertyBoolean? = null,
    val notifyOncontainercomplete: ConfigNodePropertyBoolean? = null,
    val notifyUseronly: ConfigNodePropertyBoolean? = null
)
