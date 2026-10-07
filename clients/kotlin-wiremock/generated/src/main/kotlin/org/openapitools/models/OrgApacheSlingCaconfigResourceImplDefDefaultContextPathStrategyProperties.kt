@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties(
    @field:JsonProperty("enabled")
    val enabled: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("configRefResourceNames")
    val configRefResourceNames: ConfigNodePropertyArray? = null,

    @field:JsonProperty("configRefPropertyNames")
    val configRefPropertyNames: ConfigNodePropertyArray? = null,

    @field:JsonProperty("service.ranking")
    val serviceRanking: ConfigNodePropertyInteger? = null,

)
