package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqMailerDefaultMailServiceProperties(
    val smtpHost: ConfigNodePropertyString? = null,
    val smtpPort: ConfigNodePropertyInteger? = null,
    val smtpUser: ConfigNodePropertyString? = null,
    val smtpPassword: ConfigNodePropertyString? = null,
    val fromAddress: ConfigNodePropertyString? = null,
    val smtpSsl: ConfigNodePropertyBoolean? = null,
    val smtpStarttls: ConfigNodePropertyBoolean? = null,
    val debugEmail: ConfigNodePropertyBoolean? = null
)
