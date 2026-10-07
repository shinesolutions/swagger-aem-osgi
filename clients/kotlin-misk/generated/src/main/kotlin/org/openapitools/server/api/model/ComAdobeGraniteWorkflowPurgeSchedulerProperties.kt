package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyDropDown
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeGraniteWorkflowPurgeSchedulerProperties(
    val scheduledpurgeName: ConfigNodePropertyString? = null,
    val scheduledpurgeWorkflowStatus: ConfigNodePropertyDropDown? = null,
    val scheduledpurgeModelIds: ConfigNodePropertyArray? = null,
    val scheduledpurgeDaysold: ConfigNodePropertyInteger? = null
)
