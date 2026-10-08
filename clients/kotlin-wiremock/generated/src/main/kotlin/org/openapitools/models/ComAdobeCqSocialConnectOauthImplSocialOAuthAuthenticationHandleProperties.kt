@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties(
    @field:JsonProperty("path")
    val path: ConfigNodePropertyArray? = null,

    @field:JsonProperty("service.ranking")
    val serviceRanking: ConfigNodePropertyInteger? = null,

)
