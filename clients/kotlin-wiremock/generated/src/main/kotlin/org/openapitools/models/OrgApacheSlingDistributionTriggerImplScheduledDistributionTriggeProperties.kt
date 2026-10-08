@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties(
    @field:JsonProperty("name")
    val name: ConfigNodePropertyString? = null,

    @field:JsonProperty("path")
    val path: ConfigNodePropertyString? = null,

    @field:JsonProperty("seconds")
    val seconds: ConfigNodePropertyString? = null,

    @field:JsonProperty("serviceName")
    val serviceName: ConfigNodePropertyString? = null,

)
