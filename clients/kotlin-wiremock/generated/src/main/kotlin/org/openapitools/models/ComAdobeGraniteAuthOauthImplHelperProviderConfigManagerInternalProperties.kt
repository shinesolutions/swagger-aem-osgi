@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties(
    @field:JsonProperty("oauth.cookie.login.timeout")
    val oauthCookieLoginTimeout: ConfigNodePropertyString? = null,

    @field:JsonProperty("oauth.cookie.max.age")
    val oauthCookieMaxAge: ConfigNodePropertyString? = null,

)
