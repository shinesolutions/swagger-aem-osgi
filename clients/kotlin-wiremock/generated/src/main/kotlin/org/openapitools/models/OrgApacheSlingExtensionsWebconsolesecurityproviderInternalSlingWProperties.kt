@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties(
    @field:JsonProperty("users")
    val users: ConfigNodePropertyArray? = null,

    @field:JsonProperty("groups")
    val groups: ConfigNodePropertyArray? = null,

)
