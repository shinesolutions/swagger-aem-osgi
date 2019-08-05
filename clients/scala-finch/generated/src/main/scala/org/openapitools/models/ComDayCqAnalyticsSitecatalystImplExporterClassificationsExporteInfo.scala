package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties]
                )

object ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo {
    /**
     * Creates the codec for converting ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo] = deriveEncoder
}
