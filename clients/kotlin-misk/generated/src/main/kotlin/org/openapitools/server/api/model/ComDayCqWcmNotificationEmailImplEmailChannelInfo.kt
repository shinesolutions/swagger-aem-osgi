package org.openapitools.server.api.model

import org.openapitools.server.api.model.ComDayCqWcmNotificationEmailImplEmailChannelProperties
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqWcmNotificationEmailImplEmailChannelInfo(
    val pid: kotlin.String? = null,
    val title: kotlin.String? = null,
    val description: kotlin.String? = null,
    val properties: ComDayCqWcmNotificationEmailImplEmailChannelProperties? = null
)
