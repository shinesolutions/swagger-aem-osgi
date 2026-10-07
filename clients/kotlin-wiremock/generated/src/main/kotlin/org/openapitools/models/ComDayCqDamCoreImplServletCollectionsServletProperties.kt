@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqDamCoreImplServletCollectionsServletProperties(
    @field:JsonProperty("cq.dam.batch.collections.properties")
    val cqDamBatchCollectionsProperties: ConfigNodePropertyArray? = null,

    @field:JsonProperty("cq.dam.batch.collections.limit")
    val cqDamBatchCollectionsLimit: ConfigNodePropertyInteger? = null,

)
