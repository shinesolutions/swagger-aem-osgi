@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingJcrRepoinitRepositoryInitializerProperties(
    @field:JsonProperty("references")
    val references: ConfigNodePropertyArray? = null,

    @field:JsonProperty("scripts")
    val scripts: ConfigNodePropertyArray? = null,

)
