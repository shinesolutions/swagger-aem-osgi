@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheFelixSystemreadyImplServicesCheckProperties(
    @field:JsonProperty("services.list")
    val servicesList: ConfigNodePropertyArray? = null,

    @field:JsonProperty("type")
    val type: ConfigNodePropertyDropDown? = null,

)
