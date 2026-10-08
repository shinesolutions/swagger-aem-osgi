@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties(
    @field:JsonProperty("felix.inventory.printer.name")
    val felixInventoryPrinterName: ConfigNodePropertyString? = null,

    @field:JsonProperty("felix.inventory.printer.title")
    val felixInventoryPrinterTitle: ConfigNodePropertyString? = null,

    @field:JsonProperty("path")
    val path: ConfigNodePropertyString? = null,

)
