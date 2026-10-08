package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeGraniteMonitoringImplScriptConfigImplProperties(
    val scriptFilename: ConfigNodePropertyString? = null,
    val scriptDisplay: ConfigNodePropertyString? = null,
    val scriptPath: ConfigNodePropertyString? = null,
    val scriptPlatform: ConfigNodePropertyArray? = null,
    val interval: ConfigNodePropertyInteger? = null,
    val jmxdomain: ConfigNodePropertyString? = null
)
