package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqWcmFoundationImplHTTPAuthHandlerProperties(
    val path: ConfigNodePropertyString? = null,
    val authHttpNologin: ConfigNodePropertyBoolean? = null,
    val authHttpRealm: ConfigNodePropertyString? = null,
    val authDefaultLoginpage: ConfigNodePropertyString? = null,
    val authCredForm: ConfigNodePropertyArray? = null,
    val authCredUtf8: ConfigNodePropertyArray? = null
)
