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
 * @param componentPeriodresourceType 
 */
case class ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties(servicePeriodranking: Option[ConfigNodePropertyInteger],
                tagpattern: Option[ConfigNodePropertyString],
                componentPeriodresourceType: Option[ConfigNodePropertyString]
                )

object ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties {
    /**
     * Creates the codec for converting ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties] = deriveEncoder
}
