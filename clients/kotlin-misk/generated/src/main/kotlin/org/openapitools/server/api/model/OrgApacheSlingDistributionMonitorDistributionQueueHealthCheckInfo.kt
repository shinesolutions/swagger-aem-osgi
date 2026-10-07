package org.openapitools.server.api.model

import org.openapitools.server.api.model.OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo(
    val pid: kotlin.String? = null,
    val title: kotlin.String? = null,
    val description: kotlin.String? = null,
    val properties: OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties? = null
)
