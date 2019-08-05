package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqHcContentPackagesHealthCheckProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqHcContentPackagesHealthCheckInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqHcContentPackagesHealthCheckProperties]
                )

object ComAdobeCqHcContentPackagesHealthCheckInfo {
    /**
     * Creates the codec for converting ComAdobeCqHcContentPackagesHealthCheckInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqHcContentPackagesHealthCheckInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqHcContentPackagesHealthCheckInfo] = deriveEncoder
}
