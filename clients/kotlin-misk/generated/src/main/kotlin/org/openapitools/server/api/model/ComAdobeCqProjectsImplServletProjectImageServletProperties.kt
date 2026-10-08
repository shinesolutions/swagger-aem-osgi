package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqProjectsImplServletProjectImageServletProperties(
    val imageQuality: ConfigNodePropertyString? = null,
    val imageSupportedResolutions: ConfigNodePropertyString? = null
)
