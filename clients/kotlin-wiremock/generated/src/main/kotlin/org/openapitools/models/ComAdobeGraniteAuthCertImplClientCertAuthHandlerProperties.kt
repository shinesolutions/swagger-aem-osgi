@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties(
    @field:JsonProperty("path")
    val path: ConfigNodePropertyString? = null,

    @field:JsonProperty("service.ranking")
    val serviceRanking: ConfigNodePropertyInteger? = null,

)
