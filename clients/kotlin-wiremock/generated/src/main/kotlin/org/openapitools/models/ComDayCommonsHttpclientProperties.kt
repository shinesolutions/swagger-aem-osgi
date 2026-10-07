@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCommonsHttpclientProperties(
    @field:JsonProperty("proxy.enabled")
    val proxyEnabled: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("proxy.host")
    val proxyHost: ConfigNodePropertyString? = null,

    @field:JsonProperty("proxy.user")
    val proxyUser: ConfigNodePropertyString? = null,

    @field:JsonProperty("proxy.password")
    val proxyPassword: ConfigNodePropertyString? = null,

    @field:JsonProperty("proxy.ntlm.host")
    val proxyNtlmHost: ConfigNodePropertyString? = null,

    @field:JsonProperty("proxy.ntlm.domain")
    val proxyNtlmDomain: ConfigNodePropertyString? = null,

    @field:JsonProperty("proxy.exceptions")
    val proxyExceptions: ConfigNodePropertyArray? = null,

)
