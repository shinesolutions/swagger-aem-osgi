package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyDropDown
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties(
    val getCacheExpirationUnit: ConfigNodePropertyDropDown? = null,
    val getCacheExpirationValue: ConfigNodePropertyInteger? = null
)
