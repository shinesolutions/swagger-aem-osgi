package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties(
    val path: ConfigNodePropertyString? = null,
    val jaasControlFlag: ConfigNodePropertyString? = null,
    val jaasRealmName: ConfigNodePropertyString? = null,
    val jaasRanking: ConfigNodePropertyInteger? = null,
    val oauthOfflineValidation: ConfigNodePropertyBoolean? = null
)
