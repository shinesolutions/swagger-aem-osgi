@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties(
    @field:JsonProperty("hc.tags")
    val hcTags: ConfigNodePropertyArray? = null,

    @field:JsonProperty("account.logins")
    val accountLogins: ConfigNodePropertyArray? = null,

    @field:JsonProperty("console.logins")
    val consoleLogins: ConfigNodePropertyArray? = null,

)
