package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties(
    val slingServletExtensions: ConfigNodePropertyString? = null,
    val slingServletPaths: ConfigNodePropertyString? = null,
    val slingServletMethods: ConfigNodePropertyString? = null
)
