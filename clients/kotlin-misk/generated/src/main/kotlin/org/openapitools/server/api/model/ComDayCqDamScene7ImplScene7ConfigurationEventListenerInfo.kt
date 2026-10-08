package org.openapitools.server.api.model

import org.openapitools.server.api.model.ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo(
    val pid: kotlin.String? = null,
    val title: kotlin.String? = null,
    val description: kotlin.String? = null,
    val properties: ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties? = null,
    val bundleLocation: kotlin.String? = null,
    val serviceLocation: kotlin.String? = null
)
