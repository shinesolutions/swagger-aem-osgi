package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqAuthImplLoginSelectorHandlerProperties(
    val path: ConfigNodePropertyString? = null,
    val serviceRanking: ConfigNodePropertyInteger? = null,
    val authLoginselectorMappings: ConfigNodePropertyArray? = null,
    val authLoginselectorChangepwMappings: ConfigNodePropertyArray? = null,
    val authLoginselectorDefaultloginpage: ConfigNodePropertyString? = null,
    val authLoginselectorDefaultchangepwpage: ConfigNodePropertyString? = null,
    val authLoginselectorHandle: ConfigNodePropertyArray? = null,
    val authLoginselectorHandleAllExtensions: ConfigNodePropertyBoolean? = null
)
