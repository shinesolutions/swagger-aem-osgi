@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties(
    @field:JsonProperty("fieldWhitelist")
    val fieldWhitelist: ConfigNodePropertyArray? = null,

    @field:JsonProperty("attachmentTypeBlacklist")
    val attachmentTypeBlacklist: ConfigNodePropertyArray? = null,

)
