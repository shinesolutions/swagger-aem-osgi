package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties(
    val name: ConfigNodePropertyString? = null,
    val path: ConfigNodePropertyString? = null,
    val ignoredPathsPatterns: ConfigNodePropertyArray? = null,
    val serviceName: ConfigNodePropertyString? = null,
    val deep: ConfigNodePropertyBoolean? = null
)
