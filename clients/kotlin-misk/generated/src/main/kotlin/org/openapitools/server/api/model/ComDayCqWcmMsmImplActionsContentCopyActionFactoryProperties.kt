package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyDropDown
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties(
    val cqWcmMsmActionExcludednodetypes: ConfigNodePropertyArray? = null,
    val cqWcmMsmActionExcludedparagraphitems: ConfigNodePropertyArray? = null,
    val cqWcmMsmActionExcludedprops: ConfigNodePropertyArray? = null,
    val contentcopyactionOrderStyle: ConfigNodePropertyDropDown? = null
)
