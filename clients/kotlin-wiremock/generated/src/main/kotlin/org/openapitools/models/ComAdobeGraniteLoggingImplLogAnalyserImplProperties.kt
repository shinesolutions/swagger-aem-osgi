@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteLoggingImplLogAnalyserImplProperties(
    @field:JsonProperty("messages.queue.size")
    val messagesQueueSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("logger.config")
    val loggerConfig: ConfigNodePropertyArray? = null,

    @field:JsonProperty("messages.size")
    val messagesSize: ConfigNodePropertyInteger? = null,

)
