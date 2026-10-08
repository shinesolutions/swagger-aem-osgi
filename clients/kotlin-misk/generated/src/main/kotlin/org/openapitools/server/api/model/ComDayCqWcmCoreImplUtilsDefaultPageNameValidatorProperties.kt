package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties(
    val nonValidChars: ConfigNodePropertyString? = null
)
