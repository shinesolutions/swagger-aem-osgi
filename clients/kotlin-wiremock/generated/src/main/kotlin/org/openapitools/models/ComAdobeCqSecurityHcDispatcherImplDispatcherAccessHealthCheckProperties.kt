@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties(
    @field:JsonProperty("hc.tags")
    val hcTags: ConfigNodePropertyArray? = null,

    @field:JsonProperty("dispatcher.address")
    val dispatcherAddress: ConfigNodePropertyString? = null,

    @field:JsonProperty("dispatcher.filter.allowed")
    val dispatcherFilterAllowed: ConfigNodePropertyArray? = null,

    @field:JsonProperty("dispatcher.filter.blocked")
    val dispatcherFilterBlocked: ConfigNodePropertyArray? = null,

)
