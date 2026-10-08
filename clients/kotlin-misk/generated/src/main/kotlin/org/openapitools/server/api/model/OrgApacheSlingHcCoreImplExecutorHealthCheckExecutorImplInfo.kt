package org.openapitools.server.api.model

import org.openapitools.server.api.model.OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfo(
    val pid: kotlin.String? = null,
    val title: kotlin.String? = null,
    val description: kotlin.String? = null,
    val properties: OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties? = null
)
