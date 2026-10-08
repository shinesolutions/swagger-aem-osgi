@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties(
    @field:JsonProperty("enabled")
    val enabled: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("agentName")
    val agentName: ConfigNodePropertyString? = null,

    @field:JsonProperty("diffPath")
    val diffPath: ConfigNodePropertyString? = null,

    @field:JsonProperty("observedPath")
    val observedPath: ConfigNodePropertyString? = null,

    @field:JsonProperty("serviceName")
    val serviceName: ConfigNodePropertyString? = null,

    @field:JsonProperty("propertyNames")
    val propertyNames: ConfigNodePropertyString? = null,

    @field:JsonProperty("distributionDelay")
    val distributionDelay: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("serviceUser.target")
    val serviceUserTarget: ConfigNodePropertyString? = null,

)
