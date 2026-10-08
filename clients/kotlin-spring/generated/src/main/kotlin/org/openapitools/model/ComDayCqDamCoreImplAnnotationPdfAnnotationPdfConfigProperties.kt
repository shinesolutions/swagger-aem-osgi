package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ConfigNodePropertyInteger
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
 * @param cqDamConfigAnnotationPdfDocumentWidth 
 * @param cqDamConfigAnnotationPdfDocumentHeight 
 * @param cqDamConfigAnnotationPdfDocumentPaddingHorizontal 
 * @param cqDamConfigAnnotationPdfDocumentPaddingVertical 
 * @param cqDamConfigAnnotationPdfFontSize 
 * @param cqDamConfigAnnotationPdfFontColor 
 * @param cqDamConfigAnnotationPdfFontFamily 
 * @param cqDamConfigAnnotationPdfFontLight 
 * @param cqDamConfigAnnotationPdfMarginTextImage 
 * @param cqDamConfigAnnotationPdfMinImageHeight 
 * @param cqDamConfigAnnotationPdfReviewStatusWidth 
 * @param cqDamConfigAnnotationPdfReviewStatusColorApproved 
 * @param cqDamConfigAnnotationPdfReviewStatusColorRejected 
 * @param cqDamConfigAnnotationPdfReviewStatusColorChangesRequested 
 * @param cqDamConfigAnnotationPdfAnnotationMarkerWidth 
 * @param cqDamConfigAnnotationPdfAssetMinheight 
 */
data class ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.dam.config.annotation.pdf.document.width")
    @get:JsonProperty("cq.dam.config.annotation.pdf.document.width") val cqDamConfigAnnotationPdfDocumentWidth: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.dam.config.annotation.pdf.document.height")
    @get:JsonProperty("cq.dam.config.annotation.pdf.document.height") val cqDamConfigAnnotationPdfDocumentHeight: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.dam.config.annotation.pdf.document.padding.horizontal")
    @get:JsonProperty("cq.dam.config.annotation.pdf.document.padding.horizontal") val cqDamConfigAnnotationPdfDocumentPaddingHorizontal: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.dam.config.annotation.pdf.document.padding.vertical")
    @get:JsonProperty("cq.dam.config.annotation.pdf.document.padding.vertical") val cqDamConfigAnnotationPdfDocumentPaddingVertical: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.dam.config.annotation.pdf.font.size")
    @get:JsonProperty("cq.dam.config.annotation.pdf.font.size") val cqDamConfigAnnotationPdfFontSize: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.dam.config.annotation.pdf.font.color")
    @get:JsonProperty("cq.dam.config.annotation.pdf.font.color") val cqDamConfigAnnotationPdfFontColor: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.dam.config.annotation.pdf.font.family")
    @get:JsonProperty("cq.dam.config.annotation.pdf.font.family") val cqDamConfigAnnotationPdfFontFamily: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.dam.config.annotation.pdf.font.light")
    @get:JsonProperty("cq.dam.config.annotation.pdf.font.light") val cqDamConfigAnnotationPdfFontLight: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.dam.config.annotation.pdf.marginTextImage")
    @get:JsonProperty("cq.dam.config.annotation.pdf.marginTextImage") val cqDamConfigAnnotationPdfMarginTextImage: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.dam.config.annotation.pdf.minImageHeight")
    @get:JsonProperty("cq.dam.config.annotation.pdf.minImageHeight") val cqDamConfigAnnotationPdfMinImageHeight: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.dam.config.annotation.pdf.reviewStatus.width")
    @get:JsonProperty("cq.dam.config.annotation.pdf.reviewStatus.width") val cqDamConfigAnnotationPdfReviewStatusWidth: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.dam.config.annotation.pdf.reviewStatus.color.approved")
    @get:JsonProperty("cq.dam.config.annotation.pdf.reviewStatus.color.approved") val cqDamConfigAnnotationPdfReviewStatusColorApproved: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.dam.config.annotation.pdf.reviewStatus.color.rejected")
    @get:JsonProperty("cq.dam.config.annotation.pdf.reviewStatus.color.rejected") val cqDamConfigAnnotationPdfReviewStatusColorRejected: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.dam.config.annotation.pdf.reviewStatus.color.changesRequested")
    @get:JsonProperty("cq.dam.config.annotation.pdf.reviewStatus.color.changesRequested") val cqDamConfigAnnotationPdfReviewStatusColorChangesRequested: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.dam.config.annotation.pdf.annotationMarker.width")
    @get:JsonProperty("cq.dam.config.annotation.pdf.annotationMarker.width") val cqDamConfigAnnotationPdfAnnotationMarkerWidth: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.dam.config.annotation.pdf.asset.minheight")
    @get:JsonProperty("cq.dam.config.annotation.pdf.asset.minheight") val cqDamConfigAnnotationPdfAssetMinheight: ConfigNodePropertyInteger? = null
) {

}

