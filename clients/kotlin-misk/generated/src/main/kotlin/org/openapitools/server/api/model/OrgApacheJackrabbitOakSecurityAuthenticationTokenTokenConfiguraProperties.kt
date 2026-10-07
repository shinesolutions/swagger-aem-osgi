package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties(
    val tokenExpiration: ConfigNodePropertyString? = null,
    val tokenLength: ConfigNodePropertyString? = null,
    val tokenRefresh: ConfigNodePropertyBoolean? = null,
    val tokenCleanupThreshold: ConfigNodePropertyInteger? = null,
    val passwordHashAlgorithm: ConfigNodePropertyString? = null,
    val passwordHashIterations: ConfigNodePropertyInteger? = null,
    val passwordSaltSize: ConfigNodePropertyInteger? = null
)
