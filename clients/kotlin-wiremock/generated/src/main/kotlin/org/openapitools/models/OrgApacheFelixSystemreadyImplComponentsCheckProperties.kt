@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheFelixSystemreadyImplComponentsCheckProperties(
    @field:JsonProperty("components.list")
    val componentsList: ConfigNodePropertyArray? = null,

    @field:JsonProperty("type")
    val type: ConfigNodePropertyDropDown? = null,

)
