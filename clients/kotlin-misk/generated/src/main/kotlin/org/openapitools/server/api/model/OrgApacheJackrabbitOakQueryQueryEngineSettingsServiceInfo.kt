package org.openapitools.server.api.model

import org.openapitools.server.api.model.OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo(
    val pid: kotlin.String? = null,
    val title: kotlin.String? = null,
    val description: kotlin.String? = null,
    val properties: OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties? = null
)
