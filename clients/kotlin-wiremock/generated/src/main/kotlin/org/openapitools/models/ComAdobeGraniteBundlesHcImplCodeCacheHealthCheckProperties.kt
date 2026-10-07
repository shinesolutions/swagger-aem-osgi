@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties(
    @field:JsonProperty("hc.tags")
    val hcTags: ConfigNodePropertyArray? = null,

    @field:JsonProperty("minimum.code.cache.size")
    val minimumCodeCacheSize: ConfigNodePropertyInteger? = null,

)
