@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties(
    @field:JsonProperty("providerName")
    val providerName: ConfigNodePropertyString? = null,

    @field:JsonProperty("forward.requests")
    val forwardRequests: ConfigNodePropertyBoolean? = null,

)
