package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties(
    val codeupgradetasks: ConfigNodePropertyArray? = null,
    val codeupgradetaskfilters: ConfigNodePropertyArray? = null
)
