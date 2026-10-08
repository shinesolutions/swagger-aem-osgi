@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties(
    @field:JsonProperty("minThreadPoolSize")
    val minThreadPoolSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("maxThreadPoolSize")
    val maxThreadPoolSize: ConfigNodePropertyInteger? = null,

)
