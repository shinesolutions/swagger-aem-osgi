@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheHttpProxyconfiguratorProperties(
    @field:JsonProperty("proxy.enabled")
    val proxyEnabled: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("proxy.host")
    val proxyHost: ConfigNodePropertyString? = null,

    @field:JsonProperty("proxy.port")
    val proxyPort: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("proxy.user")
    val proxyUser: ConfigNodePropertyString? = null,

    @field:JsonProperty("proxy.password")
    val proxyPassword: ConfigNodePropertyString? = null,

    @field:JsonProperty("proxy.exceptions")
    val proxyExceptions: ConfigNodePropertyArray? = null,

)
