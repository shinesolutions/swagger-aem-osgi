package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqScreensImplScreensChannelPostProcessorProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqScreensImplScreensChannelPostProcessorInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqScreensImplScreensChannelPostProcessorProperties]
                )

object ComAdobeCqScreensImplScreensChannelPostProcessorInfo {
    /**
     * Creates the codec for converting ComAdobeCqScreensImplScreensChannelPostProcessorInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqScreensImplScreensChannelPostProcessorInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqScreensImplScreensChannelPostProcessorInfo] = deriveEncoder
}
