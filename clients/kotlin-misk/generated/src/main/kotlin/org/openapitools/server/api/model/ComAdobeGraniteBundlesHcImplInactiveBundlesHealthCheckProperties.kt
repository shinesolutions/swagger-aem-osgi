package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties(
    val hcTags: ConfigNodePropertyArray? = null,
    val ignoredBundles: ConfigNodePropertyArray? = null
)
