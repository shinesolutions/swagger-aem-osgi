@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties(
    @field:JsonProperty("cq.contentsync.pathrewritertransformer.mapping.links")
    val cqContentsyncPathrewritertransformerMappingLinks: ConfigNodePropertyArray? = null,

    @field:JsonProperty("cq.contentsync.pathrewritertransformer.mapping.clientlibs")
    val cqContentsyncPathrewritertransformerMappingClientlibs: ConfigNodePropertyArray? = null,

    @field:JsonProperty("cq.contentsync.pathrewritertransformer.mapping.images")
    val cqContentsyncPathrewritertransformerMappingImages: ConfigNodePropertyArray? = null,

    @field:JsonProperty("cq.contentsync.pathrewritertransformer.attribute.pattern")
    val cqContentsyncPathrewritertransformerAttributePattern: ConfigNodePropertyString? = null,

    @field:JsonProperty("cq.contentsync.pathrewritertransformer.clientlibrary.pattern")
    val cqContentsyncPathrewritertransformerClientlibraryPattern: ConfigNodePropertyString? = null,

    @field:JsonProperty("cq.contentsync.pathrewritertransformer.clientlibrary.replace")
    val cqContentsyncPathrewritertransformerClientlibraryReplace: ConfigNodePropertyString? = null,

)
