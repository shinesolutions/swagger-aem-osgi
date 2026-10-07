package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeGraniteRepositoryImplCommitStatsConfigProperties(
    val enabled: ConfigNodePropertyBoolean? = null,
    val intervalSeconds: ConfigNodePropertyInteger? = null,
    val commitsPerIntervalThreshold: ConfigNodePropertyInteger? = null,
    val maxLocationLength: ConfigNodePropertyInteger? = null,
    val maxDetailsShown: ConfigNodePropertyInteger? = null,
    val minDetailsPercentage: ConfigNodePropertyInteger? = null,
    val threadMatchers: ConfigNodePropertyArray? = null,
    val maxGreedyDepth: ConfigNodePropertyInteger? = null,
    val greedyStackMatchers: ConfigNodePropertyString? = null,
    val stackFilters: ConfigNodePropertyArray? = null,
    val stackMatchers: ConfigNodePropertyArray? = null,
    val stackCategorizers: ConfigNodePropertyArray? = null,
    val stackShorteners: ConfigNodePropertyArray? = null
)
