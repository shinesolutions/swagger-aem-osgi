package org.openapitools.server.api.model

import org.openapitools.server.api.model.ComDayCqDamCoreImplServletAssetXMPSearchServletProperties
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqDamCoreImplServletAssetXMPSearchServletInfo(
    val pid: kotlin.String? = null,
    val title: kotlin.String? = null,
    val description: kotlin.String? = null,
    val properties: ComDayCqDamCoreImplServletAssetXMPSearchServletProperties? = null
)
