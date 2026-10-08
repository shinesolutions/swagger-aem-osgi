package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyInteger
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeOctopusNcommBootstrapProperties(
    val maxConnections: ConfigNodePropertyInteger? = null,
    val maxRequests: ConfigNodePropertyInteger? = null,
    val requestTimeout: ConfigNodePropertyInteger? = null,
    val requestRetries: ConfigNodePropertyInteger? = null,
    val launchTimeout: ConfigNodePropertyInteger? = null
)
