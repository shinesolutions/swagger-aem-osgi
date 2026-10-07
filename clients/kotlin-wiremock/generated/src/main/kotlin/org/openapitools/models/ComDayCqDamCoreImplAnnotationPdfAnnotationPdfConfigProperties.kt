@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties(
    @field:JsonProperty("cq.dam.config.annotation.pdf.document.width")
    val cqDamConfigAnnotationPdfDocumentWidth: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cq.dam.config.annotation.pdf.document.height")
    val cqDamConfigAnnotationPdfDocumentHeight: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cq.dam.config.annotation.pdf.document.padding.horizontal")
    val cqDamConfigAnnotationPdfDocumentPaddingHorizontal: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cq.dam.config.annotation.pdf.document.padding.vertical")
    val cqDamConfigAnnotationPdfDocumentPaddingVertical: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cq.dam.config.annotation.pdf.font.size")
    val cqDamConfigAnnotationPdfFontSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cq.dam.config.annotation.pdf.font.color")
    val cqDamConfigAnnotationPdfFontColor: ConfigNodePropertyString? = null,

    @field:JsonProperty("cq.dam.config.annotation.pdf.font.family")
    val cqDamConfigAnnotationPdfFontFamily: ConfigNodePropertyString? = null,

    @field:JsonProperty("cq.dam.config.annotation.pdf.font.light")
    val cqDamConfigAnnotationPdfFontLight: ConfigNodePropertyString? = null,

    @field:JsonProperty("cq.dam.config.annotation.pdf.marginTextImage")
    val cqDamConfigAnnotationPdfMarginTextImage: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cq.dam.config.annotation.pdf.minImageHeight")
    val cqDamConfigAnnotationPdfMinImageHeight: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cq.dam.config.annotation.pdf.reviewStatus.width")
    val cqDamConfigAnnotationPdfReviewStatusWidth: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cq.dam.config.annotation.pdf.reviewStatus.color.approved")
    val cqDamConfigAnnotationPdfReviewStatusColorApproved: ConfigNodePropertyString? = null,

    @field:JsonProperty("cq.dam.config.annotation.pdf.reviewStatus.color.rejected")
    val cqDamConfigAnnotationPdfReviewStatusColorRejected: ConfigNodePropertyString? = null,

    @field:JsonProperty("cq.dam.config.annotation.pdf.reviewStatus.color.changesRequested")
    val cqDamConfigAnnotationPdfReviewStatusColorChangesRequested: ConfigNodePropertyString? = null,

    @field:JsonProperty("cq.dam.config.annotation.pdf.annotationMarker.width")
    val cqDamConfigAnnotationPdfAnnotationMarkerWidth: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cq.dam.config.annotation.pdf.asset.minheight")
    val cqDamConfigAnnotationPdfAssetMinheight: ConfigNodePropertyInteger? = null,

)
