package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param enableDataTriggeredContent 
 */
case class ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties(enableDataTriggeredContent: Option[ConfigNodePropertyBoolean]
                )

object ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties {
    /**
     * Creates the codec for converting ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties] = deriveEncoder
}
