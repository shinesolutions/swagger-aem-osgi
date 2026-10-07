package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties(
    val cqDamS7damDamchangeeventlistenerEnabled: ConfigNodePropertyBoolean? = null
)
