@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteMonitoringImplScriptConfigImplProperties(
    @field:JsonProperty("script.filename")
    val scriptFilename: ConfigNodePropertyString? = null,

    @field:JsonProperty("script.display")
    val scriptDisplay: ConfigNodePropertyString? = null,

    @field:JsonProperty("script.path")
    val scriptPath: ConfigNodePropertyString? = null,

    @field:JsonProperty("script.platform")
    val scriptPlatform: ConfigNodePropertyArray? = null,

    @field:JsonProperty("interval")
    val interval: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("jmxdomain")
    val jmxdomain: ConfigNodePropertyString? = null,

)
