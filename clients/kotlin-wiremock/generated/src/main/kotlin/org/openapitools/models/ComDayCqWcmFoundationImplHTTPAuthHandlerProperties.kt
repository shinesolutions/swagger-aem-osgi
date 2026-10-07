@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqWcmFoundationImplHTTPAuthHandlerProperties(
    @field:JsonProperty("path")
    val path: ConfigNodePropertyString? = null,

    @field:JsonProperty("auth.http.nologin")
    val authHttpNologin: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("auth.http.realm")
    val authHttpRealm: ConfigNodePropertyString? = null,

    @field:JsonProperty("auth.default.loginpage")
    val authDefaultLoginpage: ConfigNodePropertyString? = null,

    @field:JsonProperty("auth.cred.form")
    val authCredForm: ConfigNodePropertyArray? = null,

    @field:JsonProperty("auth.cred.utf8")
    val authCredUtf8: ConfigNodePropertyArray? = null,

)
