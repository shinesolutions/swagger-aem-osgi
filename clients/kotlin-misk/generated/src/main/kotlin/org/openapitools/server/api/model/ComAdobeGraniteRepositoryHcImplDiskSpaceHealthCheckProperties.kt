package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties(
    val hcTags: ConfigNodePropertyArray? = null,
    val diskSpaceWarnThreshold: ConfigNodePropertyInteger? = null,
    val diskSpaceErrorThreshold: ConfigNodePropertyInteger? = null
)
