package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param queryBatchSize 
 */
case class ComDayCqDamCoreImplReportsReportExportServiceProperties(queryBatchSize: Option[ConfigNodePropertyInteger]
                )

object ComDayCqDamCoreImplReportsReportExportServiceProperties {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplReportsReportExportServiceProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplReportsReportExportServiceProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplReportsReportExportServiceProperties] = deriveEncoder
}
