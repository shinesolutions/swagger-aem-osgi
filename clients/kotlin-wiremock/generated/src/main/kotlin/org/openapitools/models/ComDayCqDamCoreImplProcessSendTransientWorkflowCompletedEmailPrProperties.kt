@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties(
    @field:JsonProperty("process.label")
    val processLabel: ConfigNodePropertyString? = null,

    @field:JsonProperty("Notify on Complete")
    val notifyOnComplete: ConfigNodePropertyBoolean? = null,

)
