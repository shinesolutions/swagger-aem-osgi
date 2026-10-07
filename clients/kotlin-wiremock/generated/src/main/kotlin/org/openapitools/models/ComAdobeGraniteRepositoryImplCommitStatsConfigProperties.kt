@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteRepositoryImplCommitStatsConfigProperties(
    @field:JsonProperty("enabled")
    val enabled: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("intervalSeconds")
    val intervalSeconds: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("commitsPerIntervalThreshold")
    val commitsPerIntervalThreshold: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("maxLocationLength")
    val maxLocationLength: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("maxDetailsShown")
    val maxDetailsShown: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("minDetailsPercentage")
    val minDetailsPercentage: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("threadMatchers")
    val threadMatchers: ConfigNodePropertyArray? = null,

    @field:JsonProperty("maxGreedyDepth")
    val maxGreedyDepth: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("greedyStackMatchers")
    val greedyStackMatchers: ConfigNodePropertyString? = null,

    @field:JsonProperty("stackFilters")
    val stackFilters: ConfigNodePropertyArray? = null,

    @field:JsonProperty("stackMatchers")
    val stackMatchers: ConfigNodePropertyArray? = null,

    @field:JsonProperty("stackCategorizers")
    val stackCategorizers: ConfigNodePropertyArray? = null,

    @field:JsonProperty("stackShorteners")
    val stackShorteners: ConfigNodePropertyArray? = null,

)
