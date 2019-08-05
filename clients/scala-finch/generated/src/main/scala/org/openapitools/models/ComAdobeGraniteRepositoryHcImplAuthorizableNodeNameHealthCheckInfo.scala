package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties]
                )

object ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo] = deriveEncoder
}
