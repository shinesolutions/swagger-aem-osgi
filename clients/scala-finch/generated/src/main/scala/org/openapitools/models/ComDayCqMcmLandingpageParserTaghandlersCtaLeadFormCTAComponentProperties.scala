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
 * @param servicePeriodranking 
 * @param tagpattern 
 */
case class ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties(servicePeriodranking: Option[ConfigNodePropertyInteger],
                tagpattern: Option[ConfigNodePropertyString]
                )

object ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties {
    /**
     * Creates the codec for converting ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties] = deriveEncoder
}
