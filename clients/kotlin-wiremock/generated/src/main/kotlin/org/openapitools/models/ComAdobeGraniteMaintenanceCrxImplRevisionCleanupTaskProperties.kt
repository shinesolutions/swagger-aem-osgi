@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties(
    @field:JsonProperty("full.gc.days")
    val fullGcDays: ConfigNodePropertyArray? = null,

)
