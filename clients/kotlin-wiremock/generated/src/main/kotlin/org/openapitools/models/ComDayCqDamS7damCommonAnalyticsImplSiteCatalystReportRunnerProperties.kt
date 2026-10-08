@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties(
    @field:JsonProperty("scheduler.expression")
    val schedulerExpression: ConfigNodePropertyString? = null,

    @field:JsonProperty("scheduler.concurrent")
    val schedulerConcurrent: ConfigNodePropertyBoolean? = null,

)
