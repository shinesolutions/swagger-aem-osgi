@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties(
    @field:JsonProperty("timeoutInMs")
    val timeoutInMs: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("longRunningFutureThresholdForCriticalMs")
    val longRunningFutureThresholdForCriticalMs: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("resultCacheTtlInMs")
    val resultCacheTtlInMs: ConfigNodePropertyInteger? = null,

)
