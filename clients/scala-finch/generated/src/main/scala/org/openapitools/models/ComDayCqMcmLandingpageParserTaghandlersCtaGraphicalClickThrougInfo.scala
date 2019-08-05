package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties]
                )

object ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo {
    /**
     * Creates the codec for converting ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo] = deriveEncoder
}
