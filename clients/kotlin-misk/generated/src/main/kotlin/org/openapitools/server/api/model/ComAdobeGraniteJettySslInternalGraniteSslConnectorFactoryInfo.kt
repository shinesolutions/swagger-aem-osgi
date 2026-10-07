package org.openapitools.server.api.model

import org.openapitools.server.api.model.ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo(
    val pid: kotlin.String? = null,
    val title: kotlin.String? = null,
    val description: kotlin.String? = null,
    val properties: ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties? = null,
    val additionalProperties: kotlin.String? = null,
    val bundleLocation: kotlin.String? = null,
    val serviceLocation: kotlin.String? = null
)
