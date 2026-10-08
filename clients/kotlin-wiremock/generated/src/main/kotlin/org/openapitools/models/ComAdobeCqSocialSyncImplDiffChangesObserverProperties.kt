@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqSocialSyncImplDiffChangesObserverProperties(
    @field:JsonProperty("enabled")
    val enabled: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("agentName")
    val agentName: ConfigNodePropertyString? = null,

    @field:JsonProperty("diffPath")
    val diffPath: ConfigNodePropertyString? = null,

    @field:JsonProperty("propertyNames")
    val propertyNames: ConfigNodePropertyString? = null,

)
