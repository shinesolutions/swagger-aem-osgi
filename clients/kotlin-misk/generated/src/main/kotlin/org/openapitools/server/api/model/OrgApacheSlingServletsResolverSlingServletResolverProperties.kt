package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingServletsResolverSlingServletResolverProperties(
    val servletresolverServletRoot: ConfigNodePropertyString? = null,
    val servletresolverCacheSize: ConfigNodePropertyInteger? = null,
    val servletresolverPaths: ConfigNodePropertyArray? = null,
    val servletresolverDefaultExtensions: ConfigNodePropertyArray? = null
)
