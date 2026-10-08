@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties(
    @field:JsonProperty("name")
    val name: ConfigNodePropertyString? = null,

    @field:JsonProperty("endpoints")
    val endpoints: ConfigNodePropertyArray? = null,

    @field:JsonProperty("transportSecretProvider.target")
    val transportSecretProviderTarget: ConfigNodePropertyString? = null,

)
