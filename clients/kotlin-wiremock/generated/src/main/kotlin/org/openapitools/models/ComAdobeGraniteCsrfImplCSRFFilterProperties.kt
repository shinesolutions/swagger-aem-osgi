@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteCsrfImplCSRFFilterProperties(
    @field:JsonProperty("filter.methods")
    val filterMethods: ConfigNodePropertyArray? = null,

    @field:JsonProperty("filter.enable.safe.user.agents")
    val filterEnableSafeUserAgents: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("filter.safe.user.agents")
    val filterSafeUserAgents: ConfigNodePropertyArray? = null,

    @field:JsonProperty("filter.excluded.paths")
    val filterExcludedPaths: ConfigNodePropertyArray? = null,

)
