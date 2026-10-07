package org.openapitools.server.api.model

import org.openapitools.server.api.model.OrgApacheSlingCommonsMetricsInternalLogReporterProperties
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingCommonsMetricsInternalLogReporterInfo(
    val pid: kotlin.String? = null,
    val title: kotlin.String? = null,
    val description: kotlin.String? = null,
    val properties: OrgApacheSlingCommonsMetricsInternalLogReporterProperties? = null
)
