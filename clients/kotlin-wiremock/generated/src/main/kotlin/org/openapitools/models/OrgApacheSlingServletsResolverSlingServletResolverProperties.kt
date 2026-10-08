@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingServletsResolverSlingServletResolverProperties(
    @field:JsonProperty("servletresolver.servletRoot")
    val servletresolverServletRoot: ConfigNodePropertyString? = null,

    @field:JsonProperty("servletresolver.cacheSize")
    val servletresolverCacheSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("servletresolver.paths")
    val servletresolverPaths: ConfigNodePropertyArray? = null,

    @field:JsonProperty("servletresolver.defaultExtensions")
    val servletresolverDefaultExtensions: ConfigNodePropertyArray? = null,

)
