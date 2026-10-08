package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCommonsHttpclientProperties(
    val proxyEnabled: ConfigNodePropertyBoolean? = null,
    val proxyHost: ConfigNodePropertyString? = null,
    val proxyUser: ConfigNodePropertyString? = null,
    val proxyPassword: ConfigNodePropertyString? = null,
    val proxyNtlmHost: ConfigNodePropertyString? = null,
    val proxyNtlmDomain: ConfigNodePropertyString? = null,
    val proxyExceptions: ConfigNodePropertyArray? = null
)
