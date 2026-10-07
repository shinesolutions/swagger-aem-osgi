@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqDamCoreImplReportsReportPurgeServiceProperties(
    @field:JsonProperty("scheduler.expression")
    val schedulerExpression: ConfigNodePropertyString? = null,

    @field:JsonProperty("maxSavedReports")
    val maxSavedReports: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("timeDuration")
    val timeDuration: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("enableReportPurge")
    val enableReportPurge: ConfigNodePropertyBoolean? = null,

)
