package org.openapitools.server.api.model

import org.openapitools.server.api.model.ComAdobeCqHcContentPackagesHealthCheckProperties
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqHcContentPackagesHealthCheckInfo(
    val pid: kotlin.String? = null,
    val title: kotlin.String? = null,
    val description: kotlin.String? = null,
    val properties: ComAdobeCqHcContentPackagesHealthCheckProperties? = null
)
