package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param cqPerioddamPeriodconfigPeriodannotationPeriodpdfPerioddocumentPeriodwidth 
 * @param cqPerioddamPeriodconfigPeriodannotationPeriodpdfPerioddocumentPeriodheight 
 * @param cqPerioddamPeriodconfigPeriodannotationPeriodpdfPerioddocumentPeriodpaddingPeriodhorizontal 
 * @param cqPerioddamPeriodconfigPeriodannotationPeriodpdfPerioddocumentPeriodpaddingPeriodvertical 
 * @param cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodfontPeriodsize 
 * @param cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodfontPeriodcolor 
 * @param cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodfontPeriodfamily 
 * @param cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodfontPeriodlight 
 * @param cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodmarginTextImage 
 * @param cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodminImageHeight 
 * @param cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodreviewStatusPeriodwidth 
 * @param cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodreviewStatusPeriodcolorPeriodapproved 
 * @param cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodreviewStatusPeriodcolorPeriodrejected 
 * @param cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodreviewStatusPeriodcolorPeriodchangesRequested 
 * @param cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodannotationMarkerPeriodwidth 
 * @param cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodassetPeriodminheight 
 */
case class ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties(cqPerioddamPeriodconfigPeriodannotationPeriodpdfPerioddocumentPeriodwidth: Option[ConfigNodePropertyInteger],
                cqPerioddamPeriodconfigPeriodannotationPeriodpdfPerioddocumentPeriodheight: Option[ConfigNodePropertyInteger],
                cqPerioddamPeriodconfigPeriodannotationPeriodpdfPerioddocumentPeriodpaddingPeriodhorizontal: Option[ConfigNodePropertyInteger],
                cqPerioddamPeriodconfigPeriodannotationPeriodpdfPerioddocumentPeriodpaddingPeriodvertical: Option[ConfigNodePropertyInteger],
                cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodfontPeriodsize: Option[ConfigNodePropertyInteger],
                cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodfontPeriodcolor: Option[ConfigNodePropertyString],
                cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodfontPeriodfamily: Option[ConfigNodePropertyString],
                cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodfontPeriodlight: Option[ConfigNodePropertyString],
                cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodmarginTextImage: Option[ConfigNodePropertyInteger],
                cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodminImageHeight: Option[ConfigNodePropertyInteger],
                cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodreviewStatusPeriodwidth: Option[ConfigNodePropertyInteger],
                cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodreviewStatusPeriodcolorPeriodapproved: Option[ConfigNodePropertyString],
                cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodreviewStatusPeriodcolorPeriodrejected: Option[ConfigNodePropertyString],
                cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodreviewStatusPeriodcolorPeriodchangesRequested: Option[ConfigNodePropertyString],
                cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodannotationMarkerPeriodwidth: Option[ConfigNodePropertyInteger],
                cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodassetPeriodminheight: Option[ConfigNodePropertyInteger]
                )

object ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties] = deriveEncoder
}
