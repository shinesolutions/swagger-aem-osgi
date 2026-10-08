@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties(
    @field:JsonProperty("enableScheduledPostsSearch")
    val enableScheduledPostsSearch: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("numberOfMinutes")
    val numberOfMinutes: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("maxSearchLimit")
    val maxSearchLimit: ConfigNodePropertyInteger? = null,

)
