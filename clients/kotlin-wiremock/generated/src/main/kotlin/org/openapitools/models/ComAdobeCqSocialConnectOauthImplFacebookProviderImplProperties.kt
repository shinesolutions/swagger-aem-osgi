@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties(
    @field:JsonProperty("oauth.provider.id")
    val oauthProviderId: ConfigNodePropertyString? = null,

    @field:JsonProperty("oauth.cloud.config.root")
    val oauthCloudConfigRoot: ConfigNodePropertyString? = null,

    @field:JsonProperty("provider.config.root")
    val providerConfigRoot: ConfigNodePropertyString? = null,

    @field:JsonProperty("provider.config.create.tags.enabled")
    val providerConfigCreateTagsEnabled: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("provider.config.user.folder")
    val providerConfigUserFolder: ConfigNodePropertyDropDown? = null,

    @field:JsonProperty("provider.config.facebook.fetch.fields")
    val providerConfigFacebookFetchFields: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("provider.config.facebook.fields")
    val providerConfigFacebookFields: ConfigNodePropertyArray? = null,

    @field:JsonProperty("provider.config.refresh.userdata.enabled")
    val providerConfigRefreshUserdataEnabled: ConfigNodePropertyBoolean? = null,

)
