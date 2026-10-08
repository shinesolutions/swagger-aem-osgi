@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties(
    @field:JsonProperty("filepattern")
    val filepattern: ConfigNodePropertyString? = null,

    @field:JsonProperty("build.page.nodes")
    val buildPageNodes: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("build.client.libs")
    val buildClientLibs: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("build.canvas.component")
    val buildCanvasComponent: ConfigNodePropertyBoolean? = null,

)
