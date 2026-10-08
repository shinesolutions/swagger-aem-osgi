package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties(
    val xmpFilterApplyWhitelist: ConfigNodePropertyBoolean? = null,
    val xmpFilterWhitelist: ConfigNodePropertyArray? = null,
    val xmpFilterApplyBlacklist: ConfigNodePropertyBoolean? = null,
    val xmpFilterBlacklist: ConfigNodePropertyArray? = null
)
