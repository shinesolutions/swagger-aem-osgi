@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties(
    @field:JsonProperty("oauth.provider.id")
    val oauthProviderId: ConfigNodePropertyString? = null,

    @field:JsonProperty("oauth.cloud.config.root")
    val oauthCloudConfigRoot: ConfigNodePropertyString? = null,

    @field:JsonProperty("provider.config.root")
    val providerConfigRoot: ConfigNodePropertyString? = null,

    @field:JsonProperty("provider.config.user.folder")
    val providerConfigUserFolder: ConfigNodePropertyDropDown? = null,

    @field:JsonProperty("provider.config.twitter.enable.params")
    val providerConfigTwitterEnableParams: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("provider.config.twitter.params")
    val providerConfigTwitterParams: ConfigNodePropertyArray? = null,

    @field:JsonProperty("provider.config.refresh.userdata.enabled")
    val providerConfigRefreshUserdataEnabled: ConfigNodePropertyBoolean? = null,

)
