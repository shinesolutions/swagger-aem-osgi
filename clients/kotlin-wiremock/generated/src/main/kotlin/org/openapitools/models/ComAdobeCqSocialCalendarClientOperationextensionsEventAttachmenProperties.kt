@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties(
    @field:JsonProperty("attachmentTypeBlacklist")
    val attachmentTypeBlacklist: ConfigNodePropertyString? = null,

    @field:JsonProperty("extension.order")
    val extensionOrder: ConfigNodePropertyInteger? = null,

)
