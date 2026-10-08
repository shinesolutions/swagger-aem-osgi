package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyDropDown
import org.openapitools.server.api.model.ConfigNodePropertyFloat
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingEventJobsQueueConfigurationProperties(
    val queueName: ConfigNodePropertyString? = null,
    val queueTopics: ConfigNodePropertyArray? = null,
    val queueType: ConfigNodePropertyDropDown? = null,
    val queuePriority: ConfigNodePropertyDropDown? = null,
    val queueRetries: ConfigNodePropertyInteger? = null,
    val queueRetrydelay: ConfigNodePropertyInteger? = null,
    val queueMaxparallel: ConfigNodePropertyFloat? = null,
    val queueKeepJobs: ConfigNodePropertyBoolean? = null,
    val queuePreferRunOnCreationInstance: ConfigNodePropertyBoolean? = null,
    val queueThreadPoolSize: ConfigNodePropertyInteger? = null,
    val serviceRanking: ConfigNodePropertyInteger? = null
)
