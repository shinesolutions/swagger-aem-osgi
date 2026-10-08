package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties(
    val providerRoots: ConfigNodePropertyString? = null,
    val kind: ConfigNodePropertyString? = null
)
