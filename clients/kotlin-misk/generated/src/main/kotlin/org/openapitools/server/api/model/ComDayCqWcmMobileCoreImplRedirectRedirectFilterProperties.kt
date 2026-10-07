package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties(
    val redirectEnabled: ConfigNodePropertyBoolean? = null,
    val redirectStatsEnabled: ConfigNodePropertyBoolean? = null,
    val redirectExtensions: ConfigNodePropertyArray? = null,
    val redirectPaths: ConfigNodePropertyArray? = null
)
