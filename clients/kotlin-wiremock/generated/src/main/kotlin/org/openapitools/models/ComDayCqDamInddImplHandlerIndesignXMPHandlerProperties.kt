@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties(
    @field:JsonProperty("process.label")
    val processLabel: ConfigNodePropertyString? = null,

    @field:JsonProperty("extract.pages")
    val extractPages: ConfigNodePropertyBoolean? = null,

)
