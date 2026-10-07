@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteFragsImplRandomFeatureProperties(
    @field:JsonProperty("feature.name")
    val featureName: ConfigNodePropertyString? = null,

    @field:JsonProperty("feature.description")
    val featureDescription: ConfigNodePropertyString? = null,

    @field:JsonProperty("active.percentage")
    val activePercentage: ConfigNodePropertyString? = null,

    @field:JsonProperty("cookie.name")
    val cookieName: ConfigNodePropertyString? = null,

    @field:JsonProperty("cookie.maxAge")
    val cookieMaxAge: ConfigNodePropertyInteger? = null,

)
