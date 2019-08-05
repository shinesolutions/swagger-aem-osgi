package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param reportPeriodfetchPeriodattempts 
 * @param reportPeriodfetchPerioddelay 
 */
case class ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties(reportPeriodfetchPeriodattempts: Option[ConfigNodePropertyInteger],
                reportPeriodfetchPerioddelay: Option[ConfigNodePropertyInteger]
                )

object ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties {
    /**
     * Creates the codec for converting ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties] = deriveEncoder
}
