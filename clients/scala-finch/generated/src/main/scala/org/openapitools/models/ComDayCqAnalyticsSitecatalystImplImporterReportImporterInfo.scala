package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties]
                )

object ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo {
    /**
     * Creates the codec for converting ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo] = deriveEncoder
}
