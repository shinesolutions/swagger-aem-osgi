@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties(
    @field:JsonProperty("event.topics")
    val eventTopics: ConfigNodePropertyString? = null,

    @field:JsonProperty("event.filter")
    val eventFilter: ConfigNodePropertyString? = null,

    @field:JsonProperty("verbs")
    val verbs: ConfigNodePropertyArray? = null,

)
