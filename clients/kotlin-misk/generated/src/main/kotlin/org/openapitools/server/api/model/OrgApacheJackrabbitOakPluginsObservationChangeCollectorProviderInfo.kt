package org.openapitools.server.api.model

import org.openapitools.server.api.model.OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo(
    val pid: kotlin.String? = null,
    val title: kotlin.String? = null,
    val description: kotlin.String? = null,
    val properties: OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties? = null,
    val bundleLocation: kotlin.String? = null,
    val serviceLocation: kotlin.String? = null
)
