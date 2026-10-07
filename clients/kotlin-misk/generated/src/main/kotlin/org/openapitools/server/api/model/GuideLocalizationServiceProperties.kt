package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GuideLocalizationServiceProperties(
    val supportedLocales: ConfigNodePropertyArray? = null,
    val localizableProperties: ConfigNodePropertyArray? = null
)
