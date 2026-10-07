@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqDamCoreImplServletBatchMetadataServletProperties(
    @field:JsonProperty("cq.dam.batch.metadata.asset.default")
    val cqDamBatchMetadataAssetDefault: ConfigNodePropertyArray? = null,

    @field:JsonProperty("cq.dam.batch.metadata.collection.default")
    val cqDamBatchMetadataCollectionDefault: ConfigNodePropertyArray? = null,

    @field:JsonProperty("cq.dam.batch.metadata.maxresources")
    val cqDamBatchMetadataMaxresources: ConfigNodePropertyInteger? = null,

)
