package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeGraniteContexthubImplContextHubImplProperties(
    val comAdobeGraniteContexthubSilentMode: ConfigNodePropertyBoolean? = null,
    val comAdobeGraniteContexthubShowUi: ConfigNodePropertyBoolean? = null
)
