@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqSocialNotificationsImplMentionsRouterProperties(
    @field:JsonProperty("event.topics")
    val eventTopics: ConfigNodePropertyString? = null,

    @field:JsonProperty("event.filter")
    val eventFilter: ConfigNodePropertyString? = null,

)
