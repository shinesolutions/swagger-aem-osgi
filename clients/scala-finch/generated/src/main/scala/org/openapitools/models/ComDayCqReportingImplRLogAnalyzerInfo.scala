package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqReportingImplRLogAnalyzerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqReportingImplRLogAnalyzerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqReportingImplRLogAnalyzerProperties]
                )

object ComDayCqReportingImplRLogAnalyzerInfo {
    /**
     * Creates the codec for converting ComDayCqReportingImplRLogAnalyzerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqReportingImplRLogAnalyzerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqReportingImplRLogAnalyzerInfo] = deriveEncoder
}
