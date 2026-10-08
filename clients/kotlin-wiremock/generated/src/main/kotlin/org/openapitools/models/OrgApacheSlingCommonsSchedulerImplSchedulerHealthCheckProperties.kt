@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties(
    @field:JsonProperty("max.quartzJob.duration.acceptable")
    val maxQuartzJobDurationAcceptable: ConfigNodePropertyInteger? = null,

)
