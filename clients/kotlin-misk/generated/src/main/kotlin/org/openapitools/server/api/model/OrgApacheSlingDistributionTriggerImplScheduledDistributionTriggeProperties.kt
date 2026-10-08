package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties(
    val name: ConfigNodePropertyString? = null,
    val path: ConfigNodePropertyString? = null,
    val seconds: ConfigNodePropertyString? = null,
    val serviceName: ConfigNodePropertyString? = null
)
