package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ConfigNodePropertyArray
import org.openapitools.model.ConfigNodePropertyString
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param cqContentsyncPathrewritertransformerMappingLinks 
 * @param cqContentsyncPathrewritertransformerMappingClientlibs 
 * @param cqContentsyncPathrewritertransformerMappingImages 
 * @param cqContentsyncPathrewritertransformerAttributePattern 
 * @param cqContentsyncPathrewritertransformerClientlibraryPattern 
 * @param cqContentsyncPathrewritertransformerClientlibraryReplace 
 */
data class ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.contentsync.pathrewritertransformer.mapping.links")
    @get:JsonProperty("cq.contentsync.pathrewritertransformer.mapping.links") val cqContentsyncPathrewritertransformerMappingLinks: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.contentsync.pathrewritertransformer.mapping.clientlibs")
    @get:JsonProperty("cq.contentsync.pathrewritertransformer.mapping.clientlibs") val cqContentsyncPathrewritertransformerMappingClientlibs: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.contentsync.pathrewritertransformer.mapping.images")
    @get:JsonProperty("cq.contentsync.pathrewritertransformer.mapping.images") val cqContentsyncPathrewritertransformerMappingImages: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.contentsync.pathrewritertransformer.attribute.pattern")
    @get:JsonProperty("cq.contentsync.pathrewritertransformer.attribute.pattern") val cqContentsyncPathrewritertransformerAttributePattern: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.contentsync.pathrewritertransformer.clientlibrary.pattern")
    @get:JsonProperty("cq.contentsync.pathrewritertransformer.clientlibrary.pattern") val cqContentsyncPathrewritertransformerClientlibraryPattern: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.contentsync.pathrewritertransformer.clientlibrary.replace")
    @get:JsonProperty("cq.contentsync.pathrewritertransformer.clientlibrary.replace") val cqContentsyncPathrewritertransformerClientlibraryReplace: ConfigNodePropertyString? = null
) {

}

