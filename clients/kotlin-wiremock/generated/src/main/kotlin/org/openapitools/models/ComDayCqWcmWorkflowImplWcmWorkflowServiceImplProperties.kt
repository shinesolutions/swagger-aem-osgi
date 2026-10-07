@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties(
    @field:JsonProperty("event.filter")
    val eventFilter: ConfigNodePropertyString? = null,

    @field:JsonProperty("minThreadPoolSize")
    val minThreadPoolSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("maxThreadPoolSize")
    val maxThreadPoolSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cq.wcm.workflow.terminate.on.activate")
    val cqWcmWorkflowTerminateOnActivate: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("cq.wcm.worklfow.terminate.exclusion.list")
    val cqWcmWorklfowTerminateExclusionList: ConfigNodePropertyArray? = null,

)
