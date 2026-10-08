@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties(
    @field:JsonProperty("extension.order")
    val extensionOrder: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("flush.forumontopic")
    val flushForumontopic: ConfigNodePropertyBoolean? = null,

)
