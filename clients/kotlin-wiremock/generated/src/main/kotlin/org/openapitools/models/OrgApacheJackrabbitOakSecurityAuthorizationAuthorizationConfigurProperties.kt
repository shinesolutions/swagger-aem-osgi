@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties(
    @field:JsonProperty("permissionsJr2")
    val permissionsJr2: ConfigNodePropertyDropDown? = null,

    @field:JsonProperty("importBehavior")
    val importBehavior: ConfigNodePropertyDropDown? = null,

    @field:JsonProperty("readPaths")
    val readPaths: ConfigNodePropertyArray? = null,

    @field:JsonProperty("administrativePrincipals")
    val administrativePrincipals: ConfigNodePropertyArray? = null,

    @field:JsonProperty("configurationRanking")
    val configurationRanking: ConfigNodePropertyInteger? = null,

)
