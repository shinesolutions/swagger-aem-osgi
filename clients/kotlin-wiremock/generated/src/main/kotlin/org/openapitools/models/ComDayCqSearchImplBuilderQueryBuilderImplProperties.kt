@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqSearchImplBuilderQueryBuilderImplProperties(
    @field:JsonProperty("excerpt.properties")
    val excerptProperties: ConfigNodePropertyArray? = null,

    @field:JsonProperty("cache.max.entries")
    val cacheMaxEntries: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cache.entry.lifetime")
    val cacheEntryLifetime: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("xpath.union")
    val xpathUnion: ConfigNodePropertyBoolean? = null,

)
