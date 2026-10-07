package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties(
    val filepattern: ConfigNodePropertyString? = null,
    val buildPageNodes: ConfigNodePropertyBoolean? = null,
    val buildClientLibs: ConfigNodePropertyBoolean? = null,
    val buildCanvasComponent: ConfigNodePropertyBoolean? = null
)
