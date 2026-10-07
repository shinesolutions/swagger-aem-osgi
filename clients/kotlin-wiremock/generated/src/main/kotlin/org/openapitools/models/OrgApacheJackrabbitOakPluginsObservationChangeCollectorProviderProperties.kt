@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties(
    @field:JsonProperty("maxItems")
    val maxItems: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("maxPathDepth")
    val maxPathDepth: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("enabled")
    val enabled: ConfigNodePropertyBoolean? = null,

)
