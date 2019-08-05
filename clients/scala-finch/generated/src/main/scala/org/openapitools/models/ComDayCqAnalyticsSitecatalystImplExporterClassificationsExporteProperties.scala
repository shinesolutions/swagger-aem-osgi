package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param allowedPeriodpaths 
 * @param cqPeriodanalyticsPeriodsaintPeriodexporterPeriodpagesize 
 */
case class ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties(allowedPeriodpaths: Option[ConfigNodePropertyArray],
                cqPeriodanalyticsPeriodsaintPeriodexporterPeriodpagesize: Option[ConfigNodePropertyInteger]
                )

object ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties {
    /**
     * Creates the codec for converting ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties] = deriveEncoder
}
