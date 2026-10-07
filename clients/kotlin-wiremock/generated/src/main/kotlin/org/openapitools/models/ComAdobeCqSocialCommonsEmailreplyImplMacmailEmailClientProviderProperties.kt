@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties(
    @field:JsonProperty("priorityOrder")
    val priorityOrder: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("replyEmailPatterns")
    val replyEmailPatterns: ConfigNodePropertyArray? = null,

)
