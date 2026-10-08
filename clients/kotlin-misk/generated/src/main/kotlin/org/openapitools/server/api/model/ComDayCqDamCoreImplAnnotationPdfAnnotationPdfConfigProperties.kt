package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties(
    val cqDamConfigAnnotationPdfDocumentWidth: ConfigNodePropertyInteger? = null,
    val cqDamConfigAnnotationPdfDocumentHeight: ConfigNodePropertyInteger? = null,
    val cqDamConfigAnnotationPdfDocumentPaddingHorizontal: ConfigNodePropertyInteger? = null,
    val cqDamConfigAnnotationPdfDocumentPaddingVertical: ConfigNodePropertyInteger? = null,
    val cqDamConfigAnnotationPdfFontSize: ConfigNodePropertyInteger? = null,
    val cqDamConfigAnnotationPdfFontColor: ConfigNodePropertyString? = null,
    val cqDamConfigAnnotationPdfFontFamily: ConfigNodePropertyString? = null,
    val cqDamConfigAnnotationPdfFontLight: ConfigNodePropertyString? = null,
    val cqDamConfigAnnotationPdfMarginTextImage: ConfigNodePropertyInteger? = null,
    val cqDamConfigAnnotationPdfMinImageHeight: ConfigNodePropertyInteger? = null,
    val cqDamConfigAnnotationPdfReviewStatusWidth: ConfigNodePropertyInteger? = null,
    val cqDamConfigAnnotationPdfReviewStatusColorApproved: ConfigNodePropertyString? = null,
    val cqDamConfigAnnotationPdfReviewStatusColorRejected: ConfigNodePropertyString? = null,
    val cqDamConfigAnnotationPdfReviewStatusColorChangesRequested: ConfigNodePropertyString? = null,
    val cqDamConfigAnnotationPdfAnnotationMarkerWidth: ConfigNodePropertyInteger? = null,
    val cqDamConfigAnnotationPdfAssetMinheight: ConfigNodePropertyInteger? = null
)
