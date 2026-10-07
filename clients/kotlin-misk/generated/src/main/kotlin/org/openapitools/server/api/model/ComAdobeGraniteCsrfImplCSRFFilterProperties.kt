package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeGraniteCsrfImplCSRFFilterProperties(
    val filterMethods: ConfigNodePropertyArray? = null,
    val filterEnableSafeUserAgents: ConfigNodePropertyBoolean? = null,
    val filterSafeUserAgents: ConfigNodePropertyArray? = null,
    val filterExcludedPaths: ConfigNodePropertyArray? = null
)
