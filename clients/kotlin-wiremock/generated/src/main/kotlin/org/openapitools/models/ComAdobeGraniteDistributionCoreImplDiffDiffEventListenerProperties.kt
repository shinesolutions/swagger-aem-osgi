@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties(
    @field:JsonProperty("diffPath")
    val diffPath: ConfigNodePropertyString? = null,

    @field:JsonProperty("serviceName")
    val serviceName: ConfigNodePropertyString? = null,

    @field:JsonProperty("serviceUser.target")
    val serviceUserTarget: ConfigNodePropertyString? = null,

)
