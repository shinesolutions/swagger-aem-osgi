@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties(
    @field:JsonProperty("feature.name")
    val featureName: ConfigNodePropertyString? = null,

    @field:JsonProperty("feature.description")
    val featureDescription: ConfigNodePropertyString? = null,

    @field:JsonProperty("http.header.name")
    val httpHeaderName: ConfigNodePropertyString? = null,

    @field:JsonProperty("http.header.valuepattern")
    val httpHeaderValuepattern: ConfigNodePropertyString? = null,

)
