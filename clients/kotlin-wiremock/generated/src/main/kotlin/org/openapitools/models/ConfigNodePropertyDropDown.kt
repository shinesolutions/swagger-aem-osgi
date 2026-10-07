@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ConfigNodePropertyDropDown(
    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("optional")
    val optional: kotlin.Boolean? = null,

    @field:JsonProperty("is_set")
    val isSet: kotlin.Boolean? = null,

    @field:JsonProperty("type")
    val type: ConfigNodePropertyDropDownType? = null,

    @field:JsonProperty("value")
    val `value`: kotlin.Any? = null,

    @field:JsonProperty("description")
    val description: kotlin.String? = null,

)
