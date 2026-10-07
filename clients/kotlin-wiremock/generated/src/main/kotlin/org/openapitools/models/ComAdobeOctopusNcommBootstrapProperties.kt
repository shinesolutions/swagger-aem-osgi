@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeOctopusNcommBootstrapProperties(
    @field:JsonProperty("maxConnections")
    val maxConnections: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("maxRequests")
    val maxRequests: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("requestTimeout")
    val requestTimeout: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("requestRetries")
    val requestRetries: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("launchTimeout")
    val launchTimeout: ConfigNodePropertyInteger? = null,

)
