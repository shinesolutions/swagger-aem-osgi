package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties(
    val queryLimitInMemory: ConfigNodePropertyInteger? = null,
    val queryLimitReads: ConfigNodePropertyInteger? = null,
    val queryFailTraversal: ConfigNodePropertyBoolean? = null,
    val fastQuerySize: ConfigNodePropertyBoolean? = null
)
