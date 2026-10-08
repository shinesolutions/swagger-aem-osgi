@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties(
    @field:JsonProperty("queryLimitInMemory")
    val queryLimitInMemory: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("queryLimitReads")
    val queryLimitReads: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("queryFailTraversal")
    val queryFailTraversal: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("fastQuerySize")
    val fastQuerySize: ConfigNodePropertyBoolean? = null,

)
