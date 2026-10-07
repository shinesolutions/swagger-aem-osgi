@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties(
    @field:JsonProperty("description")
    val description: ConfigNodePropertyString? = null,

    @field:JsonProperty("overrides")
    val overrides: ConfigNodePropertyArray? = null,

    @field:JsonProperty("enabled")
    val enabled: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("service.ranking")
    val serviceRanking: ConfigNodePropertyInteger? = null,

)
