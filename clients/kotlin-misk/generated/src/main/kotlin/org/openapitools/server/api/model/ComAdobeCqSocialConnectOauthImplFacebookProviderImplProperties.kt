package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyDropDown
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties(
    val oauthProviderId: ConfigNodePropertyString? = null,
    val oauthCloudConfigRoot: ConfigNodePropertyString? = null,
    val providerConfigRoot: ConfigNodePropertyString? = null,
    val providerConfigCreateTagsEnabled: ConfigNodePropertyBoolean? = null,
    val providerConfigUserFolder: ConfigNodePropertyDropDown? = null,
    val providerConfigFacebookFetchFields: ConfigNodePropertyBoolean? = null,
    val providerConfigFacebookFields: ConfigNodePropertyArray? = null,
    val providerConfigRefreshUserdataEnabled: ConfigNodePropertyBoolean? = null
)
