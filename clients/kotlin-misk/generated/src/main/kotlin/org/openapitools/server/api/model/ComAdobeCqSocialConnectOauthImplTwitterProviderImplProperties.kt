package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyDropDown
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties(
    val oauthProviderId: ConfigNodePropertyString? = null,
    val oauthCloudConfigRoot: ConfigNodePropertyString? = null,
    val providerConfigRoot: ConfigNodePropertyString? = null,
    val providerConfigUserFolder: ConfigNodePropertyDropDown? = null,
    val providerConfigTwitterEnableParams: ConfigNodePropertyBoolean? = null,
    val providerConfigTwitterParams: ConfigNodePropertyArray? = null,
    val providerConfigRefreshUserdataEnabled: ConfigNodePropertyBoolean? = null
)
