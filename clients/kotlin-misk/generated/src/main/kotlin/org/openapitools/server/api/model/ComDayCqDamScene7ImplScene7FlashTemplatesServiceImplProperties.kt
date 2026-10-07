package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties(
    val scene7FlashTemplatesRti: ConfigNodePropertyString? = null,
    val scene7FlashTemplatesRsi: ConfigNodePropertyString? = null,
    val scene7FlashTemplatesRb: ConfigNodePropertyString? = null,
    val scene7FlashTemplatesRurl: ConfigNodePropertyString? = null,
    val scene7FlashTemplateUrlFormatParameter: ConfigNodePropertyString? = null
)
