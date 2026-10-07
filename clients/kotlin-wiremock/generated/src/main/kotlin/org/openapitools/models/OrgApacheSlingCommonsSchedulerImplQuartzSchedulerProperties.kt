@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties(
    @field:JsonProperty("poolName")
    val poolName: ConfigNodePropertyString? = null,

    @field:JsonProperty("allowedPoolNames")
    val allowedPoolNames: ConfigNodePropertyArray? = null,

    @field:JsonProperty("scheduler.useleaderforsingle")
    val schedulerUseleaderforsingle: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("metrics.filters")
    val metricsFilters: ConfigNodePropertyArray? = null,

    @field:JsonProperty("slowThresholdMillis")
    val slowThresholdMillis: ConfigNodePropertyInteger? = null,

)
