@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties(
    @field:JsonProperty("path")
    val path: ConfigNodePropertyString? = null,

    @field:JsonProperty("jaas.controlFlag")
    val jaasControlFlag: ConfigNodePropertyString? = null,

    @field:JsonProperty("jaas.realmName")
    val jaasRealmName: ConfigNodePropertyString? = null,

    @field:JsonProperty("jaas.ranking")
    val jaasRanking: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("oauth.offline.validation")
    val oauthOfflineValidation: ConfigNodePropertyBoolean? = null,

)
