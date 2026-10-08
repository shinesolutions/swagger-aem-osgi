@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqReplicationImplReverseReplicatorProperties(
    @field:JsonProperty("scheduler.period")
    val schedulerPeriod: ConfigNodePropertyInteger? = null,

)
