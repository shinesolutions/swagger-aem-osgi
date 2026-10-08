@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteWorkflowCoreWorkflowConfigProperties(
    @field:JsonProperty("cq.workflow.config.workflow.packages.root.path")
    val cqWorkflowConfigWorkflowPackagesRootPath: ConfigNodePropertyArray? = null,

    @field:JsonProperty("cq.workflow.config.workflow.process.legacy.mode")
    val cqWorkflowConfigWorkflowProcessLegacyMode: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("cq.workflow.config.allow.locking")
    val cqWorkflowConfigAllowLocking: ConfigNodePropertyBoolean? = null,

)
