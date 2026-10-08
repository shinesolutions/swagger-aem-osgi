@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingModelsImplModelAdapterFactoryProperties(
    @field:JsonProperty("osgi.http.whiteboard.listener")
    val osgiHttpWhiteboardListener: ConfigNodePropertyString? = null,

    @field:JsonProperty("osgi.http.whiteboard.context.select")
    val osgiHttpWhiteboardContextSelect: ConfigNodePropertyString? = null,

    @field:JsonProperty("max.recursion.depth")
    val maxRecursionDepth: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cleanup.job.period")
    val cleanupJobPeriod: ConfigNodePropertyInteger? = null,

)
