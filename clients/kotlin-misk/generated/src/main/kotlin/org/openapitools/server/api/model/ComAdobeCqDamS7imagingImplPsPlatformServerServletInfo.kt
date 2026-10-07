package org.openapitools.server.api.model

import org.openapitools.server.api.model.ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo(
    val pid: kotlin.String? = null,
    val title: kotlin.String? = null,
    val description: kotlin.String? = null,
    val properties: ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties? = null
)
