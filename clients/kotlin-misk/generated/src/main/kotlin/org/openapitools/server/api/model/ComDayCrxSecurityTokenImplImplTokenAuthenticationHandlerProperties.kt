package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyDropDown
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties(
    val path: ConfigNodePropertyString? = null,
    val tokenRequiredAttr: ConfigNodePropertyDropDown? = null,
    val tokenAlternateUrl: ConfigNodePropertyString? = null,
    val tokenEncapsulated: ConfigNodePropertyBoolean? = null,
    val skipTokenRefresh: ConfigNodePropertyArray? = null
)
