@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties(
    @field:JsonProperty("cq.wcm.msm.action.excludednodetypes")
    val cqWcmMsmActionExcludednodetypes: ConfigNodePropertyArray? = null,

    @field:JsonProperty("cq.wcm.msm.action.excludedparagraphitems")
    val cqWcmMsmActionExcludedparagraphitems: ConfigNodePropertyArray? = null,

    @field:JsonProperty("cq.wcm.msm.action.excludedprops")
    val cqWcmMsmActionExcludedprops: ConfigNodePropertyArray? = null,

    @field:JsonProperty("cq.wcm.msm.impl.actions.pagemove.prop_referenceUpdate")
    val cqWcmMsmImplActionsPagemovePropReferenceUpdate: ConfigNodePropertyBoolean? = null,

)
