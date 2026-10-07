@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties(
    @field:JsonProperty("replyEmailPatterns")
    val replyEmailPatterns: ConfigNodePropertyArray? = null,

    @field:JsonProperty("priorityOrder")
    val priorityOrder: ConfigNodePropertyInteger? = null,

)
