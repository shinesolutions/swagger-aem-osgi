package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqProjectsPurgeSchedulerProperties(
    val scheduledpurgeName: ConfigNodePropertyString? = null,
    val scheduledpurgePurgeActive: ConfigNodePropertyBoolean? = null,
    val scheduledpurgeTemplates: ConfigNodePropertyArray? = null,
    val scheduledpurgePurgeGroups: ConfigNodePropertyBoolean? = null,
    val scheduledpurgePurgeAssets: ConfigNodePropertyBoolean? = null,
    val scheduledpurgeTerminateRunningWorkflows: ConfigNodePropertyBoolean? = null,
    val scheduledpurgeDaysold: ConfigNodePropertyInteger? = null,
    val scheduledpurgeSaveThreshold: ConfigNodePropertyInteger? = null
)
