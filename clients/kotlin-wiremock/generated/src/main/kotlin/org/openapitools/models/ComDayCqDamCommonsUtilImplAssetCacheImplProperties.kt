@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqDamCommonsUtilImplAssetCacheImplProperties(
    @field:JsonProperty("large.file.min")
    val largeFileMin: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cache.apply")
    val cacheApply: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("mime.types")
    val mimeTypes: ConfigNodePropertyArray? = null,

)
