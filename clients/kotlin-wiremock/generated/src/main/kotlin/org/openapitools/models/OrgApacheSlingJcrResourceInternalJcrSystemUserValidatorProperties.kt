@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties(
    @field:JsonProperty("allow.only.system.user")
    val allowOnlySystemUser: ConfigNodePropertyBoolean? = null,

)
