@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties(
    @field:JsonProperty("aggregate.relationships")
    val aggregateRelationships: ConfigNodePropertyArray? = null,

    @field:JsonProperty("aggregate.descend.virtual")
    val aggregateDescendVirtual: ConfigNodePropertyBoolean? = null,

)
