package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties(
    val cqWcmMsmActionExcludednodetypes: ConfigNodePropertyArray? = null,
    val cqWcmMsmActionExcludedparagraphitems: ConfigNodePropertyArray? = null,
    val cqWcmMsmActionExcludedprops: ConfigNodePropertyArray? = null,
    val cqWcmMsmImplActionReferencesupdatePropUpdateNested: ConfigNodePropertyBoolean? = null
)
