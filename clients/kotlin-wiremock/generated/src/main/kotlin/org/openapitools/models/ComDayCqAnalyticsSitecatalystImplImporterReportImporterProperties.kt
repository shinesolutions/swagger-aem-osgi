@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties(
    @field:JsonProperty("report.fetch.attempts")
    val reportFetchAttempts: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("report.fetch.delay")
    val reportFetchDelay: ConfigNodePropertyInteger? = null,

)
