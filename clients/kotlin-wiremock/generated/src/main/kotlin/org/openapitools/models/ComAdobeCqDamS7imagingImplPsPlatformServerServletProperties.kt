@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties(
    @field:JsonProperty("cache.enable")
    val cacheEnable: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("cache.rootPaths")
    val cacheRootPaths: ConfigNodePropertyArray? = null,

    @field:JsonProperty("cache.maxSize")
    val cacheMaxSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cache.maxEntries")
    val cacheMaxEntries: ConfigNodePropertyInteger? = null,

)
