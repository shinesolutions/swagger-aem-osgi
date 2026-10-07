package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties(
    val processLabel: ConfigNodePropertyString? = null,
    val notifyOnComplete: ConfigNodePropertyBoolean? = null
)
