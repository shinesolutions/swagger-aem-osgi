package org.openapitools.server.api.model

import org.openapitools.server.api.model.OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo(
    val pid: kotlin.String? = null,
    val title: kotlin.String? = null,
    val description: kotlin.String? = null,
    val properties: OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties? = null
)
