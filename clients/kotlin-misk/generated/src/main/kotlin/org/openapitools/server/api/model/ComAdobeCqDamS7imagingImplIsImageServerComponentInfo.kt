package org.openapitools.server.api.model

import org.openapitools.server.api.model.ComAdobeCqDamS7imagingImplIsImageServerComponentProperties
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqDamS7imagingImplIsImageServerComponentInfo(
    val pid: kotlin.String? = null,
    val title: kotlin.String? = null,
    val description: kotlin.String? = null,
    val properties: ComAdobeCqDamS7imagingImplIsImageServerComponentProperties? = null
)
