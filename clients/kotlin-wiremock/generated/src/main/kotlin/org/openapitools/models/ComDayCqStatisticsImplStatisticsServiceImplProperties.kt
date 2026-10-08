@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqStatisticsImplStatisticsServiceImplProperties(
    @field:JsonProperty("scheduler.period")
    val schedulerPeriod: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("scheduler.concurrent")
    val schedulerConcurrent: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("path")
    val path: ConfigNodePropertyString? = null,

    @field:JsonProperty("workspace")
    val workspace: ConfigNodePropertyString? = null,

    @field:JsonProperty("keywordsPath")
    val keywordsPath: ConfigNodePropertyString? = null,

    @field:JsonProperty("asyncEntries")
    val asyncEntries: ConfigNodePropertyBoolean? = null,

)
