package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties]
                )

object ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagInfo {
    /**
     * Creates the codec for converting ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagInfo] = deriveEncoder
}
