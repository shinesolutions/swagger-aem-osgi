@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties(
    @field:JsonProperty("name")
    val name: ConfigNodePropertyString? = null,

    @field:JsonProperty("endpoint")
    val endpoint: ConfigNodePropertyString? = null,

    @field:JsonProperty("transportSecretProvider.target")
    val transportSecretProviderTarget: ConfigNodePropertyString? = null,

)
