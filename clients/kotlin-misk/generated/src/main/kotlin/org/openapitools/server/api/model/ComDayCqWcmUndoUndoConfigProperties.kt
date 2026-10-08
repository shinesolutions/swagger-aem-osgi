package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqWcmUndoUndoConfigProperties(
    val cqWcmUndoEnabled: ConfigNodePropertyBoolean? = null,
    val cqWcmUndoPath: ConfigNodePropertyString? = null,
    val cqWcmUndoValidity: ConfigNodePropertyInteger? = null,
    val cqWcmUndoSteps: ConfigNodePropertyInteger? = null,
    val cqWcmUndoPersistence: ConfigNodePropertyString? = null,
    val cqWcmUndoPersistenceMode: ConfigNodePropertyBoolean? = null,
    val cqWcmUndoMarkermode: ConfigNodePropertyString? = null,
    val cqWcmUndoWhitelist: ConfigNodePropertyArray? = null,
    val cqWcmUndoBlacklist: ConfigNodePropertyArray? = null
)
