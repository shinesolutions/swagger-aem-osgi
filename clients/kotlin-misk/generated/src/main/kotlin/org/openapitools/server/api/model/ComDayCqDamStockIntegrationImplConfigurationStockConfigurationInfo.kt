package org.openapitools.server.api.model

import org.openapitools.server.api.model.ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfo(
    val pid: kotlin.String? = null,
    val title: kotlin.String? = null,
    val description: kotlin.String? = null,
    val properties: ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties? = null
)
