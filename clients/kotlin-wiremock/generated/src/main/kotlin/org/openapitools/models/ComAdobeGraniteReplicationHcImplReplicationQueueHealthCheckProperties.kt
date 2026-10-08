@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties(
    @field:JsonProperty("number.of.retries.allowed")
    val numberOfRetriesAllowed: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("hc.tags")
    val hcTags: ConfigNodePropertyArray? = null,

)
