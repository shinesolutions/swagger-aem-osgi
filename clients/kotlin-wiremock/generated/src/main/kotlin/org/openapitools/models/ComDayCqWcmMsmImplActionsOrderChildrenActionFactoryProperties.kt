@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties(
    @field:JsonProperty("cq.wcm.msm.action.excludednodetypes")
    val cqWcmMsmActionExcludednodetypes: ConfigNodePropertyArray? = null,

    @field:JsonProperty("cq.wcm.msm.action.excludedparagraphitems")
    val cqWcmMsmActionExcludedparagraphitems: ConfigNodePropertyArray? = null,

    @field:JsonProperty("cq.wcm.msm.action.excludedprops")
    val cqWcmMsmActionExcludedprops: ConfigNodePropertyArray? = null,

)
