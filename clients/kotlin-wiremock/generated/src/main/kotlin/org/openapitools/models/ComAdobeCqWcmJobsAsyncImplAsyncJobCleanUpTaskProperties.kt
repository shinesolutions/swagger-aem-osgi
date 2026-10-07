@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties(
    @field:JsonProperty("scheduler.expression")
    val schedulerExpression: ConfigNodePropertyString? = null,

    @field:JsonProperty("job.purge.threshold")
    val jobPurgeThreshold: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("job.purge.max.jobs")
    val jobPurgeMaxJobs: ConfigNodePropertyInteger? = null,

)
