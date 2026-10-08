@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties(
    @field:JsonProperty("large.index.critical.threshold")
    val largeIndexCriticalThreshold: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("large.index.warn.threshold")
    val largeIndexWarnThreshold: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("hc.tags")
    val hcTags: ConfigNodePropertyArray? = null,

)
