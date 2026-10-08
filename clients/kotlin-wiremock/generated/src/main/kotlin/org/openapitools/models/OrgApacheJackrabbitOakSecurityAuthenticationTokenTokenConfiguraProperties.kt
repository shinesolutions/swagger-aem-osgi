@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties(
    @field:JsonProperty("tokenExpiration")
    val tokenExpiration: ConfigNodePropertyString? = null,

    @field:JsonProperty("tokenLength")
    val tokenLength: ConfigNodePropertyString? = null,

    @field:JsonProperty("tokenRefresh")
    val tokenRefresh: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("tokenCleanupThreshold")
    val tokenCleanupThreshold: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("passwordHashAlgorithm")
    val passwordHashAlgorithm: ConfigNodePropertyString? = null,

    @field:JsonProperty("passwordHashIterations")
    val passwordHashIterations: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("passwordSaltSize")
    val passwordSaltSize: ConfigNodePropertyInteger? = null,

)
