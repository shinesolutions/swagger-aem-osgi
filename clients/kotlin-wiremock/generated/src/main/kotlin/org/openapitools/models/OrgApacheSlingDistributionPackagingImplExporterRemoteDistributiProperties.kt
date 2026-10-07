@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties(
    @field:JsonProperty("name")
    val name: ConfigNodePropertyString? = null,

    @field:JsonProperty("endpoints")
    val endpoints: ConfigNodePropertyArray? = null,

    @field:JsonProperty("pull.items")
    val pullItems: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("packageBuilder.target")
    val packageBuilderTarget: ConfigNodePropertyString? = null,

    @field:JsonProperty("transportSecretProvider.target")
    val transportSecretProviderTarget: ConfigNodePropertyString? = null,

)
