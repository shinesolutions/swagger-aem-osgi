@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties(
    @field:JsonProperty("enabledActions")
    val enabledActions: ConfigNodePropertyDropDown? = null,

    @field:JsonProperty("userPrivilegeNames")
    val userPrivilegeNames: ConfigNodePropertyArray? = null,

    @field:JsonProperty("groupPrivilegeNames")
    val groupPrivilegeNames: ConfigNodePropertyArray? = null,

    @field:JsonProperty("constraint")
    val constraint: ConfigNodePropertyString? = null,

)
