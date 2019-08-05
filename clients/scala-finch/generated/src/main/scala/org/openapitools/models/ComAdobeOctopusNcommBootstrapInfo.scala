package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeOctopusNcommBootstrapProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeOctopusNcommBootstrapInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeOctopusNcommBootstrapProperties]
                )

object ComAdobeOctopusNcommBootstrapInfo {
    /**
     * Creates the codec for converting ComAdobeOctopusNcommBootstrapInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeOctopusNcommBootstrapInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeOctopusNcommBootstrapInfo] = deriveEncoder
}
