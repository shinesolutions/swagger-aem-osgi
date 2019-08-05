package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties]
                )

object ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo {
    /**
     * Creates the codec for converting ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo] = deriveEncoder
}
