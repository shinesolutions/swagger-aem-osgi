package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqProjectsPurgeSchedulerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqProjectsPurgeSchedulerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqProjectsPurgeSchedulerProperties]
                )

object ComAdobeCqProjectsPurgeSchedulerInfo {
    /**
     * Creates the codec for converting ComAdobeCqProjectsPurgeSchedulerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqProjectsPurgeSchedulerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqProjectsPurgeSchedulerInfo] = deriveEncoder
}
