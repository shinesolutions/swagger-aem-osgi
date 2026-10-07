package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties(
    val path: ConfigNodePropertyString? = null,
    val serviceRanking: ConfigNodePropertyInteger? = null,
    val jaasControlFlag: ConfigNodePropertyString? = null,
    val jaasRealmName: ConfigNodePropertyString? = null,
    val jaasRanking: ConfigNodePropertyInteger? = null,
    val headers: ConfigNodePropertyArray? = null,
    val cookies: ConfigNodePropertyArray? = null,
    val parameters: ConfigNodePropertyArray? = null,
    val usermap: ConfigNodePropertyArray? = null,
    val format: ConfigNodePropertyString? = null,
    val trustedCredentialsAttribute: ConfigNodePropertyString? = null
)
