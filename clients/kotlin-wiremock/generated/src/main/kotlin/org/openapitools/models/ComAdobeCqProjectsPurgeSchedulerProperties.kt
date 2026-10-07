@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqProjectsPurgeSchedulerProperties(
    @field:JsonProperty("scheduledpurge.name")
    val scheduledpurgeName: ConfigNodePropertyString? = null,

    @field:JsonProperty("scheduledpurge.purgeActive")
    val scheduledpurgePurgeActive: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("scheduledpurge.templates")
    val scheduledpurgeTemplates: ConfigNodePropertyArray? = null,

    @field:JsonProperty("scheduledpurge.purgeGroups")
    val scheduledpurgePurgeGroups: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("scheduledpurge.purgeAssets")
    val scheduledpurgePurgeAssets: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("scheduledpurge.terminateRunningWorkflows")
    val scheduledpurgeTerminateRunningWorkflows: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("scheduledpurge.daysold")
    val scheduledpurgeDaysold: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("scheduledpurge.saveThreshold")
    val scheduledpurgeSaveThreshold: ConfigNodePropertyInteger? = null,

)
