@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties(
    @field:JsonProperty("codeupgradetasks")
    val codeupgradetasks: ConfigNodePropertyArray? = null,

    @field:JsonProperty("codeupgradetaskfilters")
    val codeupgradetaskfilters: ConfigNodePropertyArray? = null,

)
