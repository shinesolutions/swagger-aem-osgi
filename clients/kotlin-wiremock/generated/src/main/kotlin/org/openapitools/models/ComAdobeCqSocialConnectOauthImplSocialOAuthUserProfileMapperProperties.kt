@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties(
    @field:JsonProperty("facebook")
    val facebook: ConfigNodePropertyArray? = null,

    @field:JsonProperty("twitter")
    val twitter: ConfigNodePropertyArray? = null,

    @field:JsonProperty("provider.config.user.folder")
    val providerConfigUserFolder: ConfigNodePropertyString? = null,

)
