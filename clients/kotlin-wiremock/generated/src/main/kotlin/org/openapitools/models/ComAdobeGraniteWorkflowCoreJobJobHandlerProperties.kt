@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteWorkflowCoreJobJobHandlerProperties(
    @field:JsonProperty("job.topics")
    val jobTopics: ConfigNodePropertyArray? = null,

    @field:JsonProperty("allow.self.process.termination")
    val allowSelfProcessTermination: ConfigNodePropertyBoolean? = null,

)
