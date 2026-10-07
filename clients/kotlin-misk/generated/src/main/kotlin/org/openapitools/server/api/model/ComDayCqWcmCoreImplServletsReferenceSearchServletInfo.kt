package org.openapitools.server.api.model

import org.openapitools.server.api.model.ComDayCqWcmCoreImplServletsReferenceSearchServletProperties
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqWcmCoreImplServletsReferenceSearchServletInfo(
    val pid: kotlin.String? = null,
    val title: kotlin.String? = null,
    val description: kotlin.String? = null,
    val properties: ComDayCqWcmCoreImplServletsReferenceSearchServletProperties? = null
)
