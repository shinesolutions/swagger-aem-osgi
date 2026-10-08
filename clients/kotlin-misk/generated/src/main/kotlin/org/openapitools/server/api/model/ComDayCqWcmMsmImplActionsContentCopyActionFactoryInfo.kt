package org.openapitools.server.api.model

import org.openapitools.server.api.model.ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo(
    val pid: kotlin.String? = null,
    val title: kotlin.String? = null,
    val description: kotlin.String? = null,
    val properties: ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties? = null,
    val bundleLocation: kotlin.String? = null,
    val serviceLocation: kotlin.String? = null
)
