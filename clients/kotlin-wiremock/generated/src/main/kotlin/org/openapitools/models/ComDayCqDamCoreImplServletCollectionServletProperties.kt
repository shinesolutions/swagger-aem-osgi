@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqDamCoreImplServletCollectionServletProperties(
    @field:JsonProperty("cq.dam.batch.collection.properties")
    val cqDamBatchCollectionProperties: ConfigNodePropertyArray? = null,

    @field:JsonProperty("cq.dam.batch.collection.maxcollections")
    val cqDamBatchCollectionMaxcollections: ConfigNodePropertyInteger? = null,

)
