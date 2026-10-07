package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeGraniteCompatrouterImplRoutingConfigProperties(
    val id: ConfigNodePropertyString? = null,
    val compatPath: ConfigNodePropertyString? = null,
    val newPath: ConfigNodePropertyString? = null
)
