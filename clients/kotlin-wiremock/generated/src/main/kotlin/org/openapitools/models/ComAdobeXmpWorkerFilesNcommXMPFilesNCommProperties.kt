@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties(
    @field:JsonProperty("maxConnections")
    val maxConnections: ConfigNodePropertyString? = null,

    @field:JsonProperty("maxRequests")
    val maxRequests: ConfigNodePropertyString? = null,

    @field:JsonProperty("requestTimeout")
    val requestTimeout: ConfigNodePropertyString? = null,

    @field:JsonProperty("logDir")
    val logDir: ConfigNodePropertyString? = null,

)
