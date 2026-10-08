package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties(
    val slingServletSelectors: ConfigNodePropertyArray? = null,
    val slingServletExtensions: ConfigNodePropertyString? = null
)
