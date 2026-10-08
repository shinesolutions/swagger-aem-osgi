package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyDropDown
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingEventImplJobsDefaultJobManagerProperties(
    val queuePriority: ConfigNodePropertyDropDown? = null,
    val queueRetries: ConfigNodePropertyInteger? = null,
    val queueRetrydelay: ConfigNodePropertyInteger? = null,
    val queueMaxparallel: ConfigNodePropertyInteger? = null
)
