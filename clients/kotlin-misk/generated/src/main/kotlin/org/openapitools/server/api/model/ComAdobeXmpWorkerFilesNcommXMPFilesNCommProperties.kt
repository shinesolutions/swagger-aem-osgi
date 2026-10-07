package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties(
    val maxConnections: ConfigNodePropertyString? = null,
    val maxRequests: ConfigNodePropertyString? = null,
    val requestTimeout: ConfigNodePropertyString? = null,
    val logDir: ConfigNodePropertyString? = null
)
