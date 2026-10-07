@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties(
    @field:JsonProperty("offloading.transporter")
    val offloadingTransporter: ConfigNodePropertyString? = null,

    @field:JsonProperty("offloading.cleanup.payload")
    val offloadingCleanupPayload: ConfigNodePropertyBoolean? = null,

)
