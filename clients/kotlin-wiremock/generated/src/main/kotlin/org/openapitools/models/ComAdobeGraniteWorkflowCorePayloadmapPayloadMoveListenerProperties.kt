@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties(
    @field:JsonProperty("payload.move.white.list")
    val payloadMoveWhiteList: ConfigNodePropertyArray? = null,

    @field:JsonProperty("payload.move.handle.from.workflow.process")
    val payloadMoveHandleFromWorkflowProcess: ConfigNodePropertyBoolean? = null,

)
