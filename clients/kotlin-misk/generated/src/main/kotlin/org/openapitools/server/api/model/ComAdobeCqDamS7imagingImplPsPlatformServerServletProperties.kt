package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties(
    val cacheEnable: ConfigNodePropertyBoolean? = null,
    val cacheRootPaths: ConfigNodePropertyArray? = null,
    val cacheMaxSize: ConfigNodePropertyInteger? = null,
    val cacheMaxEntries: ConfigNodePropertyInteger? = null
)
