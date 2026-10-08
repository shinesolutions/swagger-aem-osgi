package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties(
    val ranking: ConfigNodePropertyInteger? = null,
    val enable: ConfigNodePropertyBoolean? = null
)
