@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties(
    @field:JsonProperty("name")
    val name: ConfigNodePropertyString? = null,

    @field:JsonProperty("serviceName")
    val serviceName: ConfigNodePropertyString? = null,

    @field:JsonProperty("userId")
    val userId: ConfigNodePropertyString? = null,

    @field:JsonProperty("accessTokenProvider.target")
    val accessTokenProviderTarget: ConfigNodePropertyString? = null,

)
