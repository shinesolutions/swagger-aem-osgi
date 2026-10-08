package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties(
    val cqWcmMsmActionExcludednodetypes: ConfigNodePropertyArray? = null,
    val cqWcmMsmActionExcludedparagraphitems: ConfigNodePropertyArray? = null,
    val cqWcmMsmActionExcludedprops: ConfigNodePropertyArray? = null
)
