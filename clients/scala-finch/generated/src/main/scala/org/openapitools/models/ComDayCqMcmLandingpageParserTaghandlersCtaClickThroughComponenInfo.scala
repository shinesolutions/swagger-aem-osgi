package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties]
                )

object ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo {
    /**
     * Creates the codec for converting ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo] = deriveEncoder
}
