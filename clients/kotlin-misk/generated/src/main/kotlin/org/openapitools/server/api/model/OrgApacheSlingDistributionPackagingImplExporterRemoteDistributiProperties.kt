package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties(
    val name: ConfigNodePropertyString? = null,
    val endpoints: ConfigNodePropertyArray? = null,
    val pullItems: ConfigNodePropertyInteger? = null,
    val packageBuilderTarget: ConfigNodePropertyString? = null,
    val transportSecretProviderTarget: ConfigNodePropertyString? = null
)
