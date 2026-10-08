package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqSearchImplBuilderQueryBuilderImplProperties(
    val excerptProperties: ConfigNodePropertyArray? = null,
    val cacheMaxEntries: ConfigNodePropertyInteger? = null,
    val cacheEntryLifetime: ConfigNodePropertyInteger? = null,
    val xpathUnion: ConfigNodePropertyBoolean? = null
)
