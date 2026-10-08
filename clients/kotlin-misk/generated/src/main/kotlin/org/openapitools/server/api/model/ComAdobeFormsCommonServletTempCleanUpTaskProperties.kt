package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeFormsCommonServletTempCleanUpTaskProperties(
    val schedulerExpression: ConfigNodePropertyString? = null,
    val durationForTemporaryStorage: ConfigNodePropertyString? = null,
    val durationForAnonymousStorage: ConfigNodePropertyString? = null
)
