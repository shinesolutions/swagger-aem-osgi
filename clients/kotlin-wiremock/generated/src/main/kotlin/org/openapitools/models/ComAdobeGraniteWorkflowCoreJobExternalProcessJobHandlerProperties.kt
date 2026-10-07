@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties(
    @field:JsonProperty("default.timeout")
    val defaultTimeout: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("max.timeout")
    val maxTimeout: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("default.period")
    val defaultPeriod: ConfigNodePropertyInteger? = null,

)
