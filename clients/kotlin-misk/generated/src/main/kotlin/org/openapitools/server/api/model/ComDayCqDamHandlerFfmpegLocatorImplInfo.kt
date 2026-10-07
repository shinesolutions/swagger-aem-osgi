package org.openapitools.server.api.model

import org.openapitools.server.api.model.ComDayCqDamHandlerFfmpegLocatorImplProperties
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqDamHandlerFfmpegLocatorImplInfo(
    val pid: kotlin.String? = null,
    val title: kotlin.String? = null,
    val description: kotlin.String? = null,
    val properties: ComDayCqDamHandlerFfmpegLocatorImplProperties? = null
)
