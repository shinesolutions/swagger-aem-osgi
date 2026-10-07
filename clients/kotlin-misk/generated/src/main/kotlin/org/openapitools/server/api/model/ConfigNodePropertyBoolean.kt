package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ConfigNodePropertyBoolean(
    /** property name */
    val name: kotlin.String? = null,
    /** True if optional */
    val optional: kotlin.Boolean? = null,
    /** True if property is set */
    val isSet: kotlin.Boolean? = null,
    /** Property type, 1&#x3D;String, 2&#x3D;Long, 3&#x3D;Integer, 7&#x3D;Float, 11&#x3D;Boolean, 12&#x3D;Secrets(String) */
    val type: kotlin.Int? = null,
    /** Property value */
    val `value`: kotlin.Boolean? = null,
    /** Property description */
    val description: kotlin.String? = null
)
