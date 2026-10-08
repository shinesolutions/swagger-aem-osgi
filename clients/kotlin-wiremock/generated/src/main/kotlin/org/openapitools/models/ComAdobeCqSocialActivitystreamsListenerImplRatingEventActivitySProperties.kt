@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties(
    @field:JsonProperty("ranking")
    val ranking: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("enable")
    val enable: ConfigNodePropertyBoolean? = null,

)
