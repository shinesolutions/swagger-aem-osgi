package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeGraniteInfocollectorInfoCollectorProperties(
    val graniteInfocollectorIncludeThreadDumps: ConfigNodePropertyBoolean? = null,
    val graniteInfocollectorIncludeHeapDump: ConfigNodePropertyBoolean? = null
)
