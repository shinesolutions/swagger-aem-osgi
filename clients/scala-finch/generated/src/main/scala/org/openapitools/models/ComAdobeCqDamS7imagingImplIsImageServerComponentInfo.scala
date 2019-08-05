package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqDamS7imagingImplIsImageServerComponentProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqDamS7imagingImplIsImageServerComponentInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqDamS7imagingImplIsImageServerComponentProperties]
                )

object ComAdobeCqDamS7imagingImplIsImageServerComponentInfo {
    /**
     * Creates the codec for converting ComAdobeCqDamS7imagingImplIsImageServerComponentInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqDamS7imagingImplIsImageServerComponentInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqDamS7imagingImplIsImageServerComponentInfo] = deriveEncoder
}
