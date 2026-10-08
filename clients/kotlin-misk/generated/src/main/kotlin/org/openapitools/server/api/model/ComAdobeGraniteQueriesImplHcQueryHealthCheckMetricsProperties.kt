package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyInteger
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties(
    val getPeriod: ConfigNodePropertyInteger? = null
)
