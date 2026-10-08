package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties(
    val facebook: ConfigNodePropertyArray? = null,
    val twitter: ConfigNodePropertyArray? = null,
    val providerConfigUserFolder: ConfigNodePropertyString? = null
)
