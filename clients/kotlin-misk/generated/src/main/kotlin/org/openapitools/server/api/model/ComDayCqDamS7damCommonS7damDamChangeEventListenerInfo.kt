package org.openapitools.server.api.model

import org.openapitools.server.api.model.ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo(
    val pid: kotlin.String? = null,
    val title: kotlin.String? = null,
    val description: kotlin.String? = null,
    val properties: ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties? = null
)
