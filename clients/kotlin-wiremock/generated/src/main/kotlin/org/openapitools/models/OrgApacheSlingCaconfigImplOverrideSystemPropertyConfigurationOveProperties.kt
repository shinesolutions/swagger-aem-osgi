@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties(
    @field:JsonProperty("enabled")
    val enabled: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("service.ranking")
    val serviceRanking: ConfigNodePropertyInteger? = null,

)
