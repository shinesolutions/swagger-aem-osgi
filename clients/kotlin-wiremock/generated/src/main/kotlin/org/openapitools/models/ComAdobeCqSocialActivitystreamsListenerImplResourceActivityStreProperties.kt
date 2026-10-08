@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties(
    @field:JsonProperty("streamPath")
    val streamPath: ConfigNodePropertyString? = null,

    @field:JsonProperty("streamName")
    val streamName: ConfigNodePropertyString? = null,

)
