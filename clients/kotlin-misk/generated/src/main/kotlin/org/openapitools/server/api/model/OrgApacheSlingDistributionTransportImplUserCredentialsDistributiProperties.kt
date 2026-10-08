package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties(
    val name: ConfigNodePropertyString? = null,
    val username: ConfigNodePropertyString? = null,
    val password: ConfigNodePropertyString? = null
)
