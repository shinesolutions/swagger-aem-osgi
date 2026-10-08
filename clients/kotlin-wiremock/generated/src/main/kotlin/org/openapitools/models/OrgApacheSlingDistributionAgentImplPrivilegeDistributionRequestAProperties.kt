@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties(
    @field:JsonProperty("name")
    val name: ConfigNodePropertyString? = null,

    @field:JsonProperty("jcrPrivilege")
    val jcrPrivilege: ConfigNodePropertyString? = null,

)
