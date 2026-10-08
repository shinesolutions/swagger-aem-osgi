@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties(
    @field:JsonProperty("cugSupportedPaths")
    val cugSupportedPaths: ConfigNodePropertyArray? = null,

    @field:JsonProperty("cugEnabled")
    val cugEnabled: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("configurationRanking")
    val configurationRanking: ConfigNodePropertyInteger? = null,

)
