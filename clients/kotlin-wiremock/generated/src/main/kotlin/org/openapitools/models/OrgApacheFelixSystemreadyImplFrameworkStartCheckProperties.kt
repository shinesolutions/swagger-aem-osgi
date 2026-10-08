@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties(
    @field:JsonProperty("timeout")
    val timeout: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("target.start.level")
    val targetStartLevel: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("target.start.level.prop.name")
    val targetStartLevelPropName: ConfigNodePropertyString? = null,

    @field:JsonProperty("type")
    val type: ConfigNodePropertyDropDown? = null,

)
