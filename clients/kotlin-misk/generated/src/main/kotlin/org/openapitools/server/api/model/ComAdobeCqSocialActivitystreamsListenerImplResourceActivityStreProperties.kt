package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties(
    val streamPath: ConfigNodePropertyString? = null,
    val streamName: ConfigNodePropertyString? = null
)
