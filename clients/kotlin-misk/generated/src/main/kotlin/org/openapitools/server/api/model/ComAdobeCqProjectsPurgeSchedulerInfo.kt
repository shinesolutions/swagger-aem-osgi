package org.openapitools.server.api.model

import org.openapitools.server.api.model.ComAdobeCqProjectsPurgeSchedulerProperties
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqProjectsPurgeSchedulerInfo(
    val pid: kotlin.String? = null,
    val title: kotlin.String? = null,
    val description: kotlin.String? = null,
    val properties: ComAdobeCqProjectsPurgeSchedulerProperties? = null
)
