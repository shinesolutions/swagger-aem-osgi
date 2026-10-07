package org.openapitools.server.api.model

import org.openapitools.server.api.model.OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo(
    val pid: kotlin.String? = null,
    val title: kotlin.String? = null,
    val description: kotlin.String? = null,
    val properties: OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties? = null,
    val bundleLocation: kotlin.String? = null,
    val serviceLocation: kotlin.String? = null
)
