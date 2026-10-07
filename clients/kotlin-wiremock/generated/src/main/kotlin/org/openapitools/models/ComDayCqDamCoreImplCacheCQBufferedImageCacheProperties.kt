@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties(
    @field:JsonProperty("cq.dam.image.cache.max.memory")
    val cqDamImageCacheMaxMemory: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cq.dam.image.cache.max.age")
    val cqDamImageCacheMaxAge: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cq.dam.image.cache.max.dimension")
    val cqDamImageCacheMaxDimension: ConfigNodePropertyString? = null,

)
