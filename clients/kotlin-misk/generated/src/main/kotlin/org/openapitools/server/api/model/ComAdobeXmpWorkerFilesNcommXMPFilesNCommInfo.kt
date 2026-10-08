package org.openapitools.server.api.model

import org.openapitools.server.api.model.ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo(
    val pid: kotlin.String? = null,
    val title: kotlin.String? = null,
    val description: kotlin.String? = null,
    val properties: ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties? = null,
    val bundleLocation: kotlin.String? = null,
    val serviceLocation: kotlin.String? = null
)
