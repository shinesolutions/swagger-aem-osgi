package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqDamS7imagingImplIsImageServerComponentProperties(
    val tcpPort: ConfigNodePropertyString? = null,
    val allowRemoteAccess: ConfigNodePropertyBoolean? = null,
    val maxRenderRgnPixels: ConfigNodePropertyString? = null,
    val maxMessageSize: ConfigNodePropertyString? = null,
    val randomAccessUrlTimeout: ConfigNodePropertyInteger? = null,
    val workerThreads: ConfigNodePropertyInteger? = null
)
