package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqPollingImporterImplManagedPollConfigImplProperties(
    val id: ConfigNodePropertyString? = null,
    val enabled: ConfigNodePropertyBoolean? = null,
    val reference: ConfigNodePropertyBoolean? = null,
    val interval: ConfigNodePropertyInteger? = null,
    val expression: ConfigNodePropertyString? = null,
    val source: ConfigNodePropertyString? = null,
    val target: ConfigNodePropertyString? = null,
    val login: ConfigNodePropertyString? = null,
    val password: ConfigNodePropertyString? = null
)
