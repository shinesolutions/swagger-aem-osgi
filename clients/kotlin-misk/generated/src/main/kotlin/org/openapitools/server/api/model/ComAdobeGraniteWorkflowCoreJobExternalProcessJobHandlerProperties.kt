package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyInteger
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties(
    val defaultTimeout: ConfigNodePropertyInteger? = null,
    val maxTimeout: ConfigNodePropertyInteger? = null,
    val defaultPeriod: ConfigNodePropertyInteger? = null
)
