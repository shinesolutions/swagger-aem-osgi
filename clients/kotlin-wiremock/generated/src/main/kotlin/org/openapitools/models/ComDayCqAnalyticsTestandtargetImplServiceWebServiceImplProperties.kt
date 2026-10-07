@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties(
    @field:JsonProperty("endpointUri")
    val endpointUri: ConfigNodePropertyString? = null,

    @field:JsonProperty("connectionTimeout")
    val connectionTimeout: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("socketTimeout")
    val socketTimeout: ConfigNodePropertyInteger? = null,

)
