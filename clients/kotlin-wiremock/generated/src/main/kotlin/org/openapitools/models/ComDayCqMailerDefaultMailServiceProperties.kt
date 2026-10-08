@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqMailerDefaultMailServiceProperties(
    @field:JsonProperty("smtp.host")
    val smtpHost: ConfigNodePropertyString? = null,

    @field:JsonProperty("smtp.port")
    val smtpPort: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("smtp.user")
    val smtpUser: ConfigNodePropertyString? = null,

    @field:JsonProperty("smtp.password")
    val smtpPassword: ConfigNodePropertyString? = null,

    @field:JsonProperty("from.address")
    val fromAddress: ConfigNodePropertyString? = null,

    @field:JsonProperty("smtp.ssl")
    val smtpSsl: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("smtp.starttls")
    val smtpStarttls: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("debug.email")
    val debugEmail: ConfigNodePropertyBoolean? = null,

)
