@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties(
    @field:JsonProperty("redirect.enabled")
    val redirectEnabled: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("redirect.stats.enabled")
    val redirectStatsEnabled: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("redirect.extensions")
    val redirectExtensions: ConfigNodePropertyArray? = null,

    @field:JsonProperty("redirect.paths")
    val redirectPaths: ConfigNodePropertyArray? = null,

)
