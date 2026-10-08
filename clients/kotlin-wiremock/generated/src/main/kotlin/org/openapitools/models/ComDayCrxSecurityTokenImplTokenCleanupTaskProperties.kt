@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCrxSecurityTokenImplTokenCleanupTaskProperties(
    @field:JsonProperty("enable.token.cleanup.task")
    val enableTokenCleanupTask: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("scheduler.expression")
    val schedulerExpression: ConfigNodePropertyString? = null,

    @field:JsonProperty("batch.size")
    val batchSize: ConfigNodePropertyInteger? = null,

)
