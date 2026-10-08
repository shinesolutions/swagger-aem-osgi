@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties(
    @field:JsonProperty("hc.name")
    val hcName: ConfigNodePropertyString? = null,

    @field:JsonProperty("hc.tags")
    val hcTags: ConfigNodePropertyArray? = null,

    @field:JsonProperty("hc.mbean.name")
    val hcMbeanName: ConfigNodePropertyString? = null,

    @field:JsonProperty("numberOfRetriesAllowed")
    val numberOfRetriesAllowed: ConfigNodePropertyInteger? = null,

)
