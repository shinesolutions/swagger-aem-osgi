package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties(
    val name: ConfigNodePropertyString? = null,
    val locale: ConfigNodePropertyString? = null,
    val imsConfig: ConfigNodePropertyString? = null
)
