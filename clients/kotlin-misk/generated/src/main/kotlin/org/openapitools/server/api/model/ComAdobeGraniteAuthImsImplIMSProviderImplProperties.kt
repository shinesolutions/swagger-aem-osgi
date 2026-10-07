package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeGraniteAuthImsImplIMSProviderImplProperties(
    val oauthProviderId: ConfigNodePropertyString? = null,
    val oauthProviderImsAuthorizationUrl: ConfigNodePropertyString? = null,
    val oauthProviderImsTokenUrl: ConfigNodePropertyString? = null,
    val oauthProviderImsProfileUrl: ConfigNodePropertyString? = null,
    val oauthProviderImsExtendedDetailsUrls: ConfigNodePropertyArray? = null,
    val oauthProviderImsValidateTokenUrl: ConfigNodePropertyString? = null,
    val oauthProviderImsSessionProperty: ConfigNodePropertyString? = null,
    val oauthProviderImsServiceTokenClientId: ConfigNodePropertyString? = null,
    val oauthProviderImsServiceTokenClientSecret: ConfigNodePropertyString? = null,
    val oauthProviderImsServiceToken: ConfigNodePropertyString? = null,
    val imsOrgRef: ConfigNodePropertyString? = null,
    val imsGroupMapping: ConfigNodePropertyArray? = null,
    val oauthProviderImsOnlyLicenseGroup: ConfigNodePropertyBoolean? = null
)
