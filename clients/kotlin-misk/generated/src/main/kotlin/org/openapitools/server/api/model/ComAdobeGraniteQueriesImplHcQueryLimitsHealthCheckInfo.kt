package org.openapitools.server.api.model

import org.openapitools.server.api.model.ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo(
    val pid: kotlin.String? = null,
    val title: kotlin.String? = null,
    val description: kotlin.String? = null,
    val properties: ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties? = null
)
