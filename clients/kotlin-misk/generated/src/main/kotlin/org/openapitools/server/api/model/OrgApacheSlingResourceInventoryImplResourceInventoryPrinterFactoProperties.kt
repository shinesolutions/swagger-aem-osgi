package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties(
    val felixInventoryPrinterName: ConfigNodePropertyString? = null,
    val felixInventoryPrinterTitle: ConfigNodePropertyString? = null,
    val path: ConfigNodePropertyString? = null
)
