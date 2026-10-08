package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ConfigNodePropertyDropDownType(
    /** Drop Down label */
    val labels: kotlin.Any? = null,
    /** Drown Down value */
    val propertyValues: kotlin.Any? = null
)
