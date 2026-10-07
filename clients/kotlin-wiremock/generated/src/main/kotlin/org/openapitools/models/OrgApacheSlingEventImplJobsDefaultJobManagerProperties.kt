@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingEventImplJobsDefaultJobManagerProperties(
    @field:JsonProperty("queue.priority")
    val queuePriority: ConfigNodePropertyDropDown? = null,

    @field:JsonProperty("queue.retries")
    val queueRetries: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("queue.retrydelay")
    val queueRetrydelay: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("queue.maxparallel")
    val queueMaxparallel: ConfigNodePropertyInteger? = null,

)
