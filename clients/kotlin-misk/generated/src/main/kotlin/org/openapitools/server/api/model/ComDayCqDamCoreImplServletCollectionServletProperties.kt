package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqDamCoreImplServletCollectionServletProperties(
    val cqDamBatchCollectionProperties: ConfigNodePropertyArray? = null,
    val cqDamBatchCollectionMaxcollections: ConfigNodePropertyInteger? = null
)
