@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties(
    @field:JsonProperty("provider.roots")
    val providerRoots: ConfigNodePropertyString? = null,

    @field:JsonProperty("kind")
    val kind: ConfigNodePropertyString? = null,

)
