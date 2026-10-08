package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeGraniteFragsImplRandomFeatureProperties(
    val featureName: ConfigNodePropertyString? = null,
    val featureDescription: ConfigNodePropertyString? = null,
    val activePercentage: ConfigNodePropertyString? = null,
    val cookieName: ConfigNodePropertyString? = null,
    val cookieMaxAge: ConfigNodePropertyInteger? = null
)
