package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties]
                )

object ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo {
    /**
     * Creates the codec for converting ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo] = deriveEncoder
}
