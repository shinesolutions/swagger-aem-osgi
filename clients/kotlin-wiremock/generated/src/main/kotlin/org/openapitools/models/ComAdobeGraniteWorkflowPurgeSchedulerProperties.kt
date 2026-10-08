@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteWorkflowPurgeSchedulerProperties(
    @field:JsonProperty("scheduledpurge.name")
    val scheduledpurgeName: ConfigNodePropertyString? = null,

    @field:JsonProperty("scheduledpurge.workflowStatus")
    val scheduledpurgeWorkflowStatus: ConfigNodePropertyDropDown? = null,

    @field:JsonProperty("scheduledpurge.modelIds")
    val scheduledpurgeModelIds: ConfigNodePropertyArray? = null,

    @field:JsonProperty("scheduledpurge.daysold")
    val scheduledpurgeDaysold: ConfigNodePropertyInteger? = null,

)
