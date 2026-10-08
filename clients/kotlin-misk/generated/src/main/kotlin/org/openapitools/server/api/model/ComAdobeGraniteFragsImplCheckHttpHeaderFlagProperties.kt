package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties(
    val featureName: ConfigNodePropertyString? = null,
    val featureDescription: ConfigNodePropertyString? = null,
    val httpHeaderName: ConfigNodePropertyString? = null,
    val httpHeaderValuepattern: ConfigNodePropertyString? = null
)
