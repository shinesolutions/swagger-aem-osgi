@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqDamCfmImplComponentComponentConfigImplProperties(
    @field:JsonProperty("dam.cfm.component.resourceType")
    val damCfmComponentResourceType: ConfigNodePropertyString? = null,

    @field:JsonProperty("dam.cfm.component.fileReferenceProp")
    val damCfmComponentFileReferenceProp: ConfigNodePropertyString? = null,

    @field:JsonProperty("dam.cfm.component.elementsProp")
    val damCfmComponentElementsProp: ConfigNodePropertyString? = null,

    @field:JsonProperty("dam.cfm.component.variationProp")
    val damCfmComponentVariationProp: ConfigNodePropertyString? = null,

)
