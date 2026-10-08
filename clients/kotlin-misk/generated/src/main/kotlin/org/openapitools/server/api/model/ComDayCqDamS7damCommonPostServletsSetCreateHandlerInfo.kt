package org.openapitools.server.api.model

import org.openapitools.server.api.model.ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo(
    val pid: kotlin.String? = null,
    val title: kotlin.String? = null,
    val description: kotlin.String? = null,
    val properties: ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties? = null
)
