@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties(
    @field:JsonProperty("path")
    val path: ConfigNodePropertyString? = null,

    @field:JsonProperty("service.ranking")
    val serviceRanking: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("jaas.controlFlag")
    val jaasControlFlag: ConfigNodePropertyString? = null,

    @field:JsonProperty("jaas.realmName")
    val jaasRealmName: ConfigNodePropertyString? = null,

    @field:JsonProperty("jaas.ranking")
    val jaasRanking: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("headers")
    val headers: ConfigNodePropertyArray? = null,

    @field:JsonProperty("cookies")
    val cookies: ConfigNodePropertyArray? = null,

    @field:JsonProperty("parameters")
    val parameters: ConfigNodePropertyArray? = null,

    @field:JsonProperty("usermap")
    val usermap: ConfigNodePropertyArray? = null,

    @field:JsonProperty("format")
    val format: ConfigNodePropertyString? = null,

    @field:JsonProperty("trustedCredentialsAttribute")
    val trustedCredentialsAttribute: ConfigNodePropertyString? = null,

)
