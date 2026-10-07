@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingEventJobsQueueConfigurationProperties(
    @field:JsonProperty("queue.name")
    val queueName: ConfigNodePropertyString? = null,

    @field:JsonProperty("queue.topics")
    val queueTopics: ConfigNodePropertyArray? = null,

    @field:JsonProperty("queue.type")
    val queueType: ConfigNodePropertyDropDown? = null,

    @field:JsonProperty("queue.priority")
    val queuePriority: ConfigNodePropertyDropDown? = null,

    @field:JsonProperty("queue.retries")
    val queueRetries: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("queue.retrydelay")
    val queueRetrydelay: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("queue.maxparallel")
    val queueMaxparallel: ConfigNodePropertyFloat? = null,

    @field:JsonProperty("queue.keepJobs")
    val queueKeepJobs: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("queue.preferRunOnCreationInstance")
    val queuePreferRunOnCreationInstance: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("queue.threadPoolSize")
    val queueThreadPoolSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("service.ranking")
    val serviceRanking: ConfigNodePropertyInteger? = null,

)
