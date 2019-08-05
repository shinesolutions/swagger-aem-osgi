package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties]
                )

object ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo {
    /**
     * Creates the codec for converting ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo] = deriveEncoder
}
