package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties(
  cqDamConfigAnnotationPdfDocumentWidth: Option[ConfigNodePropertyInteger],
  cqDamConfigAnnotationPdfDocumentHeight: Option[ConfigNodePropertyInteger],
  cqDamConfigAnnotationPdfDocumentPaddingHorizontal: Option[ConfigNodePropertyInteger],
  cqDamConfigAnnotationPdfDocumentPaddingVertical: Option[ConfigNodePropertyInteger],
  cqDamConfigAnnotationPdfFontSize: Option[ConfigNodePropertyInteger],
  cqDamConfigAnnotationPdfFontColor: Option[ConfigNodePropertyString],
  cqDamConfigAnnotationPdfFontFamily: Option[ConfigNodePropertyString],
  cqDamConfigAnnotationPdfFontLight: Option[ConfigNodePropertyString],
  cqDamConfigAnnotationPdfMarginTextImage: Option[ConfigNodePropertyInteger],
  cqDamConfigAnnotationPdfMinImageHeight: Option[ConfigNodePropertyInteger],
  cqDamConfigAnnotationPdfReviewStatusWidth: Option[ConfigNodePropertyInteger],
  cqDamConfigAnnotationPdfReviewStatusColorApproved: Option[ConfigNodePropertyString],
  cqDamConfigAnnotationPdfReviewStatusColorRejected: Option[ConfigNodePropertyString],
  cqDamConfigAnnotationPdfReviewStatusColorChangesRequested: Option[ConfigNodePropertyString],
  cqDamConfigAnnotationPdfAnnotationMarkerWidth: Option[ConfigNodePropertyInteger],
  cqDamConfigAnnotationPdfAssetMinheight: Option[ConfigNodePropertyInteger]
)

object ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties {
  implicit lazy val comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigPropertiesJsonFormat: Format[ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties] = Json.format[ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties]
}

