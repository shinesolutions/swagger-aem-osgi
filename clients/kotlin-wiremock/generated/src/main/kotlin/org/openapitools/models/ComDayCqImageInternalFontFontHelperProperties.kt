@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqImageInternalFontFontHelperProperties(
    @field:JsonProperty("fontpath")
    val fontpath: ConfigNodePropertyArray? = null,

    @field:JsonProperty("oversamplingFactor")
    val oversamplingFactor: ConfigNodePropertyInteger? = null,

)
