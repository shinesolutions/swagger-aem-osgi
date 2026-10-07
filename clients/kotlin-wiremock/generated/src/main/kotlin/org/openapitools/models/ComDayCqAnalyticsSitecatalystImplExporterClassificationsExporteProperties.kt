@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties(
    @field:JsonProperty("allowed.paths")
    val allowedPaths: ConfigNodePropertyArray? = null,

    @field:JsonProperty("cq.analytics.saint.exporter.pagesize")
    val cqAnalyticsSaintExporterPagesize: ConfigNodePropertyInteger? = null,

)
