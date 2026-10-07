package org.openapitools.server.api.model

import org.openapitools.server.api.model.ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo(
    val pid: kotlin.String? = null,
    val title: kotlin.String? = null,
    val description: kotlin.String? = null,
    val properties: ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties? = null,
    val bundleLocation: kotlin.String? = null,
    val serviceLocation: kotlin.String? = null
)
