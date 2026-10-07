@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteAuthImsImplIMSProviderImplProperties(
    @field:JsonProperty("oauth.provider.id")
    val oauthProviderId: ConfigNodePropertyString? = null,

    @field:JsonProperty("oauth.provider.ims.authorization.url")
    val oauthProviderImsAuthorizationUrl: ConfigNodePropertyString? = null,

    @field:JsonProperty("oauth.provider.ims.token.url")
    val oauthProviderImsTokenUrl: ConfigNodePropertyString? = null,

    @field:JsonProperty("oauth.provider.ims.profile.url")
    val oauthProviderImsProfileUrl: ConfigNodePropertyString? = null,

    @field:JsonProperty("oauth.provider.ims.extended.details.urls")
    val oauthProviderImsExtendedDetailsUrls: ConfigNodePropertyArray? = null,

    @field:JsonProperty("oauth.provider.ims.validate.token.url")
    val oauthProviderImsValidateTokenUrl: ConfigNodePropertyString? = null,

    @field:JsonProperty("oauth.provider.ims.session.property")
    val oauthProviderImsSessionProperty: ConfigNodePropertyString? = null,

    @field:JsonProperty("oauth.provider.ims.service.token.client.id")
    val oauthProviderImsServiceTokenClientId: ConfigNodePropertyString? = null,

    @field:JsonProperty("oauth.provider.ims.service.token.client.secret")
    val oauthProviderImsServiceTokenClientSecret: ConfigNodePropertyString? = null,

    @field:JsonProperty("oauth.provider.ims.service.token")
    val oauthProviderImsServiceToken: ConfigNodePropertyString? = null,

    @field:JsonProperty("ims.org.ref")
    val imsOrgRef: ConfigNodePropertyString? = null,

    @field:JsonProperty("ims.group.mapping")
    val imsGroupMapping: ConfigNodePropertyArray? = null,

    @field:JsonProperty("oauth.provider.ims.only.license.group")
    val oauthProviderImsOnlyLicenseGroup: ConfigNodePropertyBoolean? = null,

)
