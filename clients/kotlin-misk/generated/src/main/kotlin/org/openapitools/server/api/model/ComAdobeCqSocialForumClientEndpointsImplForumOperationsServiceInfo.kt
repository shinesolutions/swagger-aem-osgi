package org.openapitools.server.api.model

import org.openapitools.server.api.model.ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo(
    val pid: kotlin.String? = null,
    val title: kotlin.String? = null,
    val description: kotlin.String? = null,
    val properties: ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties? = null
)
