package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyDropDown
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties(
    val osgiHttpWhiteboardContextSelect: ConfigNodePropertyString? = null,
    val osgiHttpWhiteboardListener: ConfigNodePropertyString? = null,
    val authSudoCookie: ConfigNodePropertyString? = null,
    val authSudoParameter: ConfigNodePropertyString? = null,
    val authAnnonymous: ConfigNodePropertyBoolean? = null,
    val slingAuthRequirements: ConfigNodePropertyArray? = null,
    val slingAuthAnonymousUser: ConfigNodePropertyString? = null,
    val slingAuthAnonymousPassword: ConfigNodePropertyString? = null,
    val authHttp: ConfigNodePropertyDropDown? = null,
    val authHttpRealm: ConfigNodePropertyString? = null,
    val authUriSuffix: ConfigNodePropertyArray? = null
)
