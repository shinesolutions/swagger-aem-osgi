@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties(
    @field:JsonProperty("hc.tags")
    val hcTags: ConfigNodePropertyArray? = null,

    @field:JsonProperty("max.queued.jobs")
    val maxQueuedJobs: ConfigNodePropertyInteger? = null,

)
