@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties(
    @field:JsonProperty("extensions")
    val extensions: ConfigNodePropertyArray? = null,

    @field:JsonProperty("minDurationMs")
    val minDurationMs: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("maxDurationMs")
    val maxDurationMs: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("compactLogFormat")
    val compactLogFormat: ConfigNodePropertyBoolean? = null,

)
