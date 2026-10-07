package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyInteger
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties(
    val timeoutInMs: ConfigNodePropertyInteger? = null,
    val longRunningFutureThresholdForCriticalMs: ConfigNodePropertyInteger? = null,
    val resultCacheTtlInMs: ConfigNodePropertyInteger? = null
)
