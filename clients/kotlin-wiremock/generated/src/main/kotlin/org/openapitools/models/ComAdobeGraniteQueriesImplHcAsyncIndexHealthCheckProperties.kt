@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties(
    @field:JsonProperty("indexing.critical.threshold")
    val indexingCriticalThreshold: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("indexing.warn.threshold")
    val indexingWarnThreshold: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("hc.tags")
    val hcTags: ConfigNodePropertyArray? = null,

)
