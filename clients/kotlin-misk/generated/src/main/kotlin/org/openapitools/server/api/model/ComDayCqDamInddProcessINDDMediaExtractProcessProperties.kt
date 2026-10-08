package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqDamInddProcessINDDMediaExtractProcessProperties(
    val processLabel: ConfigNodePropertyString? = null,
    val cqDamInddPagesRegex: ConfigNodePropertyString? = null,
    val idsJobDecoupled: ConfigNodePropertyBoolean? = null,
    val idsJobWorkflowModel: ConfigNodePropertyString? = null
)
