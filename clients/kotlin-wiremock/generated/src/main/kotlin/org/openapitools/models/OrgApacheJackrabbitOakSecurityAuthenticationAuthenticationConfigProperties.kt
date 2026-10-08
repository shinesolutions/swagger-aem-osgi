@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties(
    @field:JsonProperty("org.apache.jackrabbit.oak.authentication.appName")
    val orgApacheJackrabbitOakAuthenticationAppName: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.jackrabbit.oak.authentication.configSpiName")
    val orgApacheJackrabbitOakAuthenticationConfigSpiName: ConfigNodePropertyString? = null,

)
