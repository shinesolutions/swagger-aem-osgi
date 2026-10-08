package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties(
    val extensions: ConfigNodePropertyArray? = null,
    val minDurationMs: ConfigNodePropertyInteger? = null,
    val maxDurationMs: ConfigNodePropertyInteger? = null,
    val compactLogFormat: ConfigNodePropertyBoolean? = null
)
