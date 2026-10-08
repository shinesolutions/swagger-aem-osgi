@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqDamS7imagingImplIsImageServerComponentProperties(
    @field:JsonProperty("TcpPort")
    val tcpPort: ConfigNodePropertyString? = null,

    @field:JsonProperty("AllowRemoteAccess")
    val allowRemoteAccess: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("MaxRenderRgnPixels")
    val maxRenderRgnPixels: ConfigNodePropertyString? = null,

    @field:JsonProperty("MaxMessageSize")
    val maxMessageSize: ConfigNodePropertyString? = null,

    @field:JsonProperty("RandomAccessUrlTimeout")
    val randomAccessUrlTimeout: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("WorkerThreads")
    val workerThreads: ConfigNodePropertyInteger? = null,

)
