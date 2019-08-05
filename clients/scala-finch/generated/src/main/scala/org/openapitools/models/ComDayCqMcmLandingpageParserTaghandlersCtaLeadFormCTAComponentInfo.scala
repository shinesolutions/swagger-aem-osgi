package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties]
                )

object ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo {
    /**
     * Creates the codec for converting ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo] = deriveEncoder
}
