@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties(
    @field:JsonProperty("name")
    val name: ConfigNodePropertyString? = null,

    @field:JsonProperty("description")
    val description: ConfigNodePropertyString? = null,

    @field:JsonProperty("enabled")
    val enabled: ConfigNodePropertyBoolean? = null,

)
