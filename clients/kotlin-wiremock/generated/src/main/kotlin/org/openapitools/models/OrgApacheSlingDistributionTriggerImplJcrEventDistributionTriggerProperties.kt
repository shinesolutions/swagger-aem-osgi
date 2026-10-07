@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties(
    @field:JsonProperty("name")
    val name: ConfigNodePropertyString? = null,

    @field:JsonProperty("path")
    val path: ConfigNodePropertyString? = null,

    @field:JsonProperty("ignoredPathsPatterns")
    val ignoredPathsPatterns: ConfigNodePropertyArray? = null,

    @field:JsonProperty("serviceName")
    val serviceName: ConfigNodePropertyString? = null,

    @field:JsonProperty("deep")
    val deep: ConfigNodePropertyBoolean? = null,

)
