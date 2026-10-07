package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties(
    val largeIndexCriticalThreshold: ConfigNodePropertyInteger? = null,
    val largeIndexWarnThreshold: ConfigNodePropertyInteger? = null,
    val hcTags: ConfigNodePropertyArray? = null
)
