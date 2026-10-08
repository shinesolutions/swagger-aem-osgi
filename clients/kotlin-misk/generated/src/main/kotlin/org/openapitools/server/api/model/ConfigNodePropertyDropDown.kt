package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyDropDownType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ConfigNodePropertyDropDown(
    /** property name */
    val name: kotlin.String? = null,
    /** True if optional */
    val optional: kotlin.Boolean? = null,
    /** True if property is set */
    val isSet: kotlin.Boolean? = null,
    val type: ConfigNodePropertyDropDownType? = null,
    /** Property value */
    val `value`: kotlin.Any? = null,
    /** Property description */
    val description: kotlin.String? = null
)
