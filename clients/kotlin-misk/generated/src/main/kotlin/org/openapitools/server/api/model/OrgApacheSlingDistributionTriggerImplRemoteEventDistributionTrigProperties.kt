package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties(
    val name: ConfigNodePropertyString? = null,
    val endpoint: ConfigNodePropertyString? = null,
    val transportSecretProviderTarget: ConfigNodePropertyString? = null
)
