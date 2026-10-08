package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqHcContentPackagesHealthCheckProperties(
    val hcName: ConfigNodePropertyString? = null,
    val hcTags: ConfigNodePropertyArray? = null,
    val hcMbeanName: ConfigNodePropertyString? = null,
    val packageNames: ConfigNodePropertyArray? = null
)
