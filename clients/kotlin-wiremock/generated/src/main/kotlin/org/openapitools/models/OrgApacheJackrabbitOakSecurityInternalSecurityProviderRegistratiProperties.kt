@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties(
    @field:JsonProperty("requiredServicePids")
    val requiredServicePids: ConfigNodePropertyArray? = null,

    @field:JsonProperty("authorizationCompositionType")
    val authorizationCompositionType: ConfigNodePropertyDropDown? = null,

)
