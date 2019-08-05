package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param requestPeriodlogPeriodoutput 
 */
case class ComDayCqReportingImplRLogAnalyzerProperties(requestPeriodlogPeriodoutput: Option[ConfigNodePropertyString]
                )

object ComDayCqReportingImplRLogAnalyzerProperties {
    /**
     * Creates the codec for converting ComDayCqReportingImplRLogAnalyzerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqReportingImplRLogAnalyzerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqReportingImplRLogAnalyzerProperties] = deriveEncoder
}
