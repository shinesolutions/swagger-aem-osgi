package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties]
                )

object ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfo {
    /**
     * Creates the codec for converting ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfo] = deriveEncoder
}
