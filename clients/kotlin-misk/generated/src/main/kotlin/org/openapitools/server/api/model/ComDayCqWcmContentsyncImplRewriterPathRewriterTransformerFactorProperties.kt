package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties(
    val cqContentsyncPathrewritertransformerMappingLinks: ConfigNodePropertyArray? = null,
    val cqContentsyncPathrewritertransformerMappingClientlibs: ConfigNodePropertyArray? = null,
    val cqContentsyncPathrewritertransformerMappingImages: ConfigNodePropertyArray? = null,
    val cqContentsyncPathrewritertransformerAttributePattern: ConfigNodePropertyString? = null,
    val cqContentsyncPathrewritertransformerClientlibraryPattern: ConfigNodePropertyString? = null,
    val cqContentsyncPathrewritertransformerClientlibraryReplace: ConfigNodePropertyString? = null
)
