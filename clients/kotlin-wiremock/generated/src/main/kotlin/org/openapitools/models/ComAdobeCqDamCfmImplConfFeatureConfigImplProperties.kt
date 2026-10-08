@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqDamCfmImplConfFeatureConfigImplProperties(
    @field:JsonProperty("dam.cfm.resourceTypes")
    val damCfmResourceTypes: ConfigNodePropertyArray? = null,

    @field:JsonProperty("dam.cfm.referenceProperties")
    val damCfmReferenceProperties: ConfigNodePropertyArray? = null,

)
