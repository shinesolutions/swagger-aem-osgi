@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqDamInddProcessINDDMediaExtractProcessProperties(
    @field:JsonProperty("process.label")
    val processLabel: ConfigNodePropertyString? = null,

    @field:JsonProperty("cq.dam.indd.pages.regex")
    val cqDamInddPagesRegex: ConfigNodePropertyString? = null,

    @field:JsonProperty("ids.job.decoupled")
    val idsJobDecoupled: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("ids.job.workflow.model")
    val idsJobWorkflowModel: ConfigNodePropertyString? = null,

)
